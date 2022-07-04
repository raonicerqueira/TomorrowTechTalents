package TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.negocio;

import TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.dominio.DataDoJogo;
import TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.dominio.Jogo;
import TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.dominio.PosicaoTabela;
import TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.dominio.Resultado;
import TecnicasDeProgramacaoI.CampeonatoBrasileiroStreams.dominio.Time;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Brasileirao {

    private Map<Integer, List<Jogo>> brasileirao;
    private List<Jogo> jogos;
    private Predicate<Jogo> filtro;

    public Brasileirao(Path arquivo, Predicate<Jogo> filtro) throws IOException {
        this.jogos = lerArquivo(arquivo);
        this.filtro = filtro;
        this.brasileirao = jogos.stream()
                .filter(filtro) //TODO: filtrar por ano
                .collect(Collectors.groupingBy(
                        Jogo::rodada,
                        Collectors.mapping(Function.identity(), Collectors.toList())));

    }

    public Map<Jogo, Double> mediaGolsPorJogo() {
        return jogos.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.averagingInt(jogo -> jogo.visitantePlacar() + jogo.visitantePlacar()
                        )));
    }

    public IntSummaryStatistics estatisticasPorJogo() {
        return jogos.stream()
                .mapToInt(jogo -> jogo.visitantePlacar() + jogo.mandantePlacar())
                .summaryStatistics();
    }

    public List<Jogo> todosOsJogos() {
        return this.brasileirao
                .values()
                .stream()
                .flatMap(List::stream).
                collect(Collectors.toList());
    }

    public Long totalVitoriasEmCasa() {
        return jogos.stream()
                .filter(jogo -> jogo.mandantePlacar() > jogo.visitantePlacar())
                .count();
    }

    public Long totalVitoriasForaDeCasa() {
        return jogos.stream()
                .filter(jogo -> jogo.visitantePlacar() > jogo.mandantePlacar())
                .count();
    }

    public Long totalEmpates() {
        return jogos.stream()
                .filter(jogo -> Objects.equals(jogo.mandantePlacar(), jogo.visitantePlacar()))
                .count();
    }

    public Long totalJogosComMenosDe3Gols() {
        return jogos.stream()
                .map(jogo -> jogo.visitantePlacar() + jogo.mandantePlacar())
                .filter(gols -> gols < 3)
                .count();
    }

    public Long totalJogosCom3OuMaisGols() {
        return jogos.stream()
                .map(jogo -> jogo.mandantePlacar() + jogo.visitantePlacar())
                .filter(gols -> gols >= 3)
                .count();
    }

    public Map<Resultado, Long> todosOsPlacares() {
        return null;
    }

    public Map.Entry<Resultado, Long> placarMaisRepetido() {
        return null;
    }

    public Map.Entry<Resultado, Long> placarMenosRepetido() {
        return null;
    }

    private List<Time> todosOsTimes() {
        List<Time> mandantes = todosOsJogos()
                .stream()
                .map(Jogo::mandante)
                .toList();

        List<Time> visitantes = todosOsJogos()
                .stream()
                .map(Jogo::visitante)
                .toList();

        return null;
    }

    /**
     * todos os jogos que cada time foi mandante
     *
     * @return Map<Time, List < Jogo>>
     */
    private Map<Time, List<Jogo>> todosOsJogosPorTimeComoMandantes() {
        return null;
    }

    /**
     * todos os jogos que cada time foi visitante
     *
     * @return Map<Time, List < Jogo>>
     */
    private Map<Time, List<Jogo>> todosOsJogosPorTimeComoVisitante() {
        return null;
    }

    public Map<Time, List<Jogo>> todosOsJogosPorTime() {
        return null;
    }

    public Map<Time, Map<Boolean, List<Jogo>>> jogosParticionadosPorMandanteTrueVisitanteFalse() {
        return null;
    }

    public Set<PosicaoTabela> tabela() {
        return null;
    }

    public List<Jogo> lerArquivo(Path file) throws IOException {
        List<Jogo> listaDeJogos = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(file)) {
                Jogo jogo = transformaLinhaemJogo(line);
                listaDeJogos.add(jogo);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return listaDeJogos;
    }

    private DayOfWeek getDayOfWeek(String dia) {
        return Map.of(
                "Segunda-feira", DayOfWeek.MONDAY,
                "Terça-feira", DayOfWeek.TUESDAY,
                "Quarta-feira", DayOfWeek.WEDNESDAY,
                "Quinta-feira", DayOfWeek.THURSDAY,
                "Sexta-feira", DayOfWeek.FRIDAY,
                "Sábado", DayOfWeek.SATURDAY,
                "Domingo", DayOfWeek.SUNDAY
        ).get(dia);
    }

    // METODOS EXTRA

    private Jogo transformaLinhaemJogo(String linhacompleta) {
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeformater = DateTimeFormatter.ofPattern("HHhmm");
        linhacompleta = linhacompleta.replace(":", "h");
        String[] completeLine = linhacompleta.split(";");
        int rodada = Integer.parseInt(completeLine[0]);
        DataDoJogo data = new DataDoJogo(LocalDate.parse(completeLine[1], dateformatter), LocalTime.parse(completeLine[2], timeformater), getDayOfWeek(completeLine[3]));
        Time timeMandante = new Time(completeLine[4]);
        Time timeVisitante = new Time(completeLine[5]);
        Time timeVencedor = new Time(completeLine[6]);
        String arena = completeLine[7];
        int mandantePlacar = Integer.parseInt(completeLine[8]);
        int visitantePlacar = Integer.parseInt(completeLine[9]);
        String estadoMandante = completeLine[10];
        String estadoVisitante = completeLine[11];
        String estadoVencedor = completeLine[12];

        return new Jogo(rodada, data, timeMandante, timeVisitante, timeVencedor, arena, mandantePlacar, visitantePlacar, estadoMandante, estadoVisitante, estadoVencedor);
    }

    private Map<Integer, Integer> totalGolsPorRodada() {
        return null;
    }

    private Map<Time, Integer> totalDeGolsPorTime() {
        return null;
    }

    private Map<Integer, Double> mediaDeGolsPorRodada() {
        return null;
    }


}
