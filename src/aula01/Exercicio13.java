package aula01;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();
        final double PERCENTAGEM_DISTRIBUIDOR = 0.28;
        final double IMPOSTOS = 0.45;

        double custoConsumidorFinal = custoFabrica + (custoFabrica * PERCENTAGEM_DISTRIBUIDOR) + (custoFabrica * IMPOSTOS);

        System.out.printf("O custo para o consumidor final é R$%.2f", custoConsumidorFinal);
    }
}
