package LogicaDaProgramacaoI.aula04;

//Crie um método que recebe uma matriz de inteiros e retorna a soma de todos os elementos da matriz.

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] matrizBidimensional = new int[5][2];
        int somatorioMatriz = 0;

        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                matrizBidimensional[i][j] = gerador.nextInt(100);
                somatorioMatriz += matrizBidimensional[i][j];
            }
        }
        System.out.println("A soma de todos os elementos da matriz é: " + somatorioMatriz);
    }
}


