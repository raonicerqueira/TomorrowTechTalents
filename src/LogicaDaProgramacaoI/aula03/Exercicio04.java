package LogicaDaProgramacaoI.aula03;

//Escreva um programa que receba 5 números inteiros, armazene-os em um array, e imprima na tela os valores
// em ordem decrescente.


import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosInteiros = new int[5];
        String[] ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};
        int menorNumero = numerosInteiros[0], numeroAnterior = 0;

        for (int i = 0; i < ordem.length; i++) {
            System.out.print("Informe o " + ordem[i] + " número: ");
            numerosInteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numerosInteiros.length; i++) {
            if (numerosInteiros[i] < menorNumero) {
                menorNumero = numerosInteiros[i];
                System.out.println(numerosInteiros[i]);
            }
        }
    }
}
