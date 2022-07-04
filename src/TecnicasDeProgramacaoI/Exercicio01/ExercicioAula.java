package TecnicasDeProgramacaoI.Exercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExercicioAula {
    public static void main(String[] args) {
        List<Aluno> alunosTurmaA = new ArrayList<>();

        alunosTurmaA.add(new Aluno("Raoni", 10d, 30, Genero.MASCULINO));
        alunosTurmaA.add(new Aluno("Alice", 7d, 29, Genero.FEMININO));
        alunosTurmaA.add(new Aluno("Thalita", 9d, 31, Genero.FEMININO));
        alunosTurmaA.add(new Aluno("Paulo", 4d, 25, Genero.MASCULINO));
        alunosTurmaA.add(new Aluno("Bruno", 4d, 25, Genero.MASCULINO));
        alunosTurmaA.add(new Aluno("Claudio", 6d, 28, Genero.MASCULINO));
        alunosTurmaA.add(new Aluno("Carla", 9d, 33, Genero.FEMININO));
        alunosTurmaA.add(new Aluno("Lara", 8d, 25, Genero.FEMININO));

        Map<Integer, Long> collect = alunosTurmaA
                .stream()
                .filter(aluno -> aluno.nota() > 5)
                .collect(Collectors.groupingBy(aluno -> aluno.nome().length(), Collectors.counting()));

        System.out.println(collect);
    }
}
