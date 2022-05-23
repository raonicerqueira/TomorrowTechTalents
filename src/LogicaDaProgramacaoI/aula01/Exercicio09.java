package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[3];
        System.out.print("Informe o nome do(a) aluno(a): ");
        String nomeAluno = scanner.nextLine();
        System.out.print("Informe a primeira nota desse(a) aluno(a) (" + nomeAluno + "): ");
        notas[0] = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        notas[1] = scanner.nextDouble();
        System.out.print("Informe a terceira nota: ");
        notas[2] = scanner.nextDouble();

        System.out.println("A média do(a) aluno(a) informado(a) (" + nomeAluno + ") é: " + ((notas[0] + notas[1] + notas[2]) / 3));


    }
}
