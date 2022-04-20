package aula02;

//Leia 4 (quatro) números calcule o quadrado para cada um (n²) some todos e exiba o resultado

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ordem = {"primeiro", "segundo", "terceiro", "quarto"};
        double somaNumerosQuadrados = 0;
        for (int i = 0; i < 4; i++){
            System.out.print("Informe o " + ordem[i] + " número: ");
            somaNumerosQuadrados += Math.pow(scanner.nextDouble(), 2);
        }

        System.out.println("A soma dos quadrados dos números informados é: " + somaNumerosQuadrados);

    }
}
