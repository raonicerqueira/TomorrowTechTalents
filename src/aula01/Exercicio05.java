package aula01;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        System.out.println("Calculador de reajuste de salário");
        Scanner scanner = new Scanner(System.in);
        final double REAJUSTE = 0.07;
        System.out.print("Por favor insira seu salário atual: ");
        double salarioAtual = scanner.nextDouble();
        double valorDoReajuste = salarioAtual * REAJUSTE;
        double salarioReajustado = salarioAtual + valorDoReajuste;

        System.out.printf("Pronto seu salário foi reajustado!\nO valor inicial era de R$%.2f, teve um reajuste no valor de R$%.2f, e após o reajuste é R$%.2f", salarioAtual, valorDoReajuste, salarioReajustado);
    }
}
