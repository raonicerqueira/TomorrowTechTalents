package aula01;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double JUROS_POUPANCA = 0.07;
        System.out.println("Descubra seu rendimento após um mês");
        System.out.print("Informe o valor depositado: ");
        double valorDepositado = scanner.nextDouble();
        double valorFinal = valorDepositado + (valorDepositado * JUROS_POUPANCA);
        System.out.println("O valor do seu deposito mais o rendimento após um mês totaliza R$" + valorFinal);
    }
}
