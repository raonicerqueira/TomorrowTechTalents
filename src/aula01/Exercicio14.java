package aula01;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA DA ÁREA DO RAIO DO CÍRCULO");
        System.out.print("\nInforme o valor do raio (em metros) do círculo que você deseja calcular a área: ");
        double raioCirculo = scanner.nextDouble();
        double areaRaio = Math.PI * Math.pow(raioCirculo, 2);
        System.out.println("A área do circulo informado é: " + areaRaio + "m²");
    }
}
