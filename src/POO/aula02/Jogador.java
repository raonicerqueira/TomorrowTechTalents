package POO.aula02;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Jogador {
    int id;
    String nome;
    String apelido;
    Date dataNascimento;
    int numero;
    String posicao;
    int qualidade;
    int cartoesAmarelos;
    int cartaoVermelho;
    int qtdTreinamento;
    Boolean partidaIniciada;
    Boolean suspenso = false;

    public Jogador() {
    }

    public Jogador
            (int id,
             String nome,
             String apelido,
             Date dataNascimento,
             int numero,
             String posicao,
             int qualidade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
    }

    String retornarDataComoString() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd-MM-yyyy");
        return DateFor.format(dataNascimento);
    }

    @Override
    public String toString() {
        String retorno = "";
        String condicao = "";
        if (!suspenso) {
            condicao = "PODE JOGAR";
        } else {
            condicao = "NÃO PODE JOGAR";
        }
        System.out.println(this.posicao + ": " + this.id + " - " + this.nome + " (" + this.apelido + ") - " + retornarDataComoString() + " CONDIÇÃO: " + (verificarCondicaoDeJogo() ? "PODE JOGAR": "NÃO PODE JOGAR"));
        return retorno;
    }

    boolean verificarCondicaoDeJogo() {
        this.suspenso = this.cartoesAmarelos >= 3 || cartaoVermelho > 0;
        return !this.suspenso;
    }

    void aplicarCartaoAmarelo(int quantidade) {
        this.cartoesAmarelos += quantidade;
        // suspenso = this.cartoesAmarelos >= 3 ? suspenso : false;
        verificarCondicaoDeJogo();
    }

    void aplicarCartaoVermelho() {
        cartaoVermelho++;
        // suspenso = true;
        verificarCondicaoDeJogo();
    }

    void cumprirSuspencao() {
        cartoesAmarelos = 0;
        cartaoVermelho = 0;
        suspenso = false;
    }

    void sofrerLesao() {
        Random random = new Random();
        int probabilidade = random.nextInt(1, 101);
        if (probabilidade <= 5) {
            qualidade -= ((int) (qualidade * 0.15));
        } else if (probabilidade <= 10) {
            qualidade -= ((int) (qualidade * 0.10));
        } else if (probabilidade <= 15) {
            qualidade -= ((int) (qualidade * 0.05));
        } else if (probabilidade <= 30) {
            qualidade -= 2;
        } else {
            qualidade -= 1;
        }

        if (qualidade >= 0) {
            qualidade = 0;
        }
    }

    void executarTreinamento() {
        if (qtdTreinamento == 0 && !partidaIniciada) {
            Random random = new Random();
            int numeroAleatorio = random.nextInt(1, 4);
            qualidade += numeroAleatorio;
            qtdTreinamento++;
        }
        System.out.println("O treinamento só poderá ser executado antes de cada partida");
    }
}
