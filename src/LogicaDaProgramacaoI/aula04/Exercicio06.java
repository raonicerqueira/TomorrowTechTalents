package LogicaDaProgramacaoI.aula04;

//Escreva um programa que leia um vetor de 13 elementos inteiros, que é o Gabarito de um teste da loteria
// esportiva, contendo os valores 1(coluna 1), 2 (coluna 2) e 3 (coluna 3). Leia, a seguir, para cada apostador,
// o número do seu cartão e um vetor de Respostas de 13 posições. Verifique para cada apostador o números de
// acertos, comparando o vetor de Gabarito com o vetor de Respostas. Escreva o número do apostador e o número
// de acertos. Se o apostador tiver 13 acertos, mostrar a mensagem "Ganhador".

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] gabarito = new int[13];
        int[][] apostas = new int[3][13];
        int[][] contadorDeAcertos = new int[3][1];

        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = random.nextInt(10);
        }

        for (int i = 0; i < apostas.length; i++) {
            for (int j = 0; j < apostas[i].length; j++) {
                System.out.print("Jogador nº" + (i+1) + " insira o " + (j+1) +"º número para aposta: ");
                apostas[i][j] = scanner.nextInt();
                while (apostas[i][j] <= 10){

                }
            }
        }

        for (int i = 0; i < apostas.length; i++) {
            for (int j = 0; j < apostas[i].length; j++) {
                for (int x = 0; x < gabarito.length; x++) {
                    if (gabarito[x] == apostas[i][j]) {
                        contadorDeAcertos[i][0]++;
                    }
                }
            }
            if (contadorDeAcertos[i][0] == 13) {
                System.out.println("O jogador nº " + i + " acertou 13 e é um ganhador");
            } else {
                System.out.println("O jogador nº " + i + " acertou " + contadorDeAcertos[i][0] + " vezes");
            }
        }
    }
}
