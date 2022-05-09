package aula06;

//Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a
//        ser pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
//        tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam
//        R$ 25,00. Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em
//        2 situações:
//        comprar apenas latas de 18 litros;
//        comprar apenas galões de 3,6 litros;


import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da área a ser pintada (em m²): ");
        double area = scanner.nextDouble();
        double numeroLatas = ((area / 6) / 18);
        if (numeroLatas % 1 != 0) {
            numeroLatas++;
        }
        double valorLatas = numeroLatas * 80;


        double numeroGaloes = ((area / 6) / 3.6);
        if (numeroLatas % 1 != 0) {
            numeroLatas++;
        }
        double valorGaloes = numeroLatas * 25;

        System.out.print("Será necessário comprar somente " + (int) numeroLatas + " latas de tinta");
        System.out.printf(" e o valor total será R$%.2f\n", valorLatas);

        System.out.print("Será necessário comprar somente " + (int) numeroGaloes + " galões de tinta");
        System.out.printf(" e o valor total será R$%.2f", valorGaloes);
    }
}
