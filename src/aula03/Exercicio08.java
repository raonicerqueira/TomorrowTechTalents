package aula03;

//Escreva um programa que leia 10 valores inteiros e positivos e encontre o maior valor, o menor valor
//e calcule a média dos números lidos e exiba essas informações.

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ordem[] = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "sétimo", "oitavo", "nono", "décimo"};
        int numeros[] = new int[10];
        int maiorValor = 0, somatorio = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + ordem[i] + " número: ");
            numeros[i] = scanner.nextInt();
            somatorio += numeros[i];
        }
        int menorValor = numeros[0];

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < menorValor) {
                menorValor = numeros[i];
            }
            if (numeros[i] > maiorValor) {
                maiorValor = numeros[i];
            }
        }

        System.out.println("O maior valor informado é: " + maiorValor);
        System.out.println("O menor valor inforado é: " + menorValor);
        System.out.println("A média dos números informados é: " + (double) (somatorio / numeros.length));
    }
}
