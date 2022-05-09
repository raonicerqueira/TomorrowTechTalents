package aula06;

//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
// pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é
// vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta
// a serem compradas e o preço total.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da área a ser pintada (em m²): ");
        double area = scanner.nextDouble();
        double numeroLatas = ((area / 3) / 18), valorLatas = numeroLatas * 80;
        if (numeroLatas % 1 != 0) {
            numeroLatas++;
        }

        System.out.print("Será necessário comprar " + (int) numeroLatas + " latas de tinta");
        System.out.printf(" e o valor total será R$%.2f", valorLatas);

    }
}
