package aula01;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Empréstimo");
        System.out.print("Informe o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();
        System.out.print("Informe a quantidade de parcelas: ");
        int qteParcelas = scanner.nextInt();
        final double JUROS = 0.02;

        double valorFinalDevido = valorEmprestimo * (Math.pow((1 + JUROS), qteParcelas));

        System.out.printf("O valor a ser pago será de: %.2f Reais", valorFinalDevido);


    }
}
