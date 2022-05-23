package LogicaDaProgramacaoI.aula04;

//Crie um método que recebe uma matriz bidimensional double e retorna o maior valor da matriz

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {
        Random gerador = new Random();
        double[][] matrizBidimensional = new double[5][2];

        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                matrizBidimensional[i][j] = gerador.nextDouble(100);
            }
        }
        double maiorValor = matrizBidimensional[0][0];

        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                if (matrizBidimensional[i][j] > maiorValor){
                    maiorValor = matrizBidimensional[i][j];
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maiorValor);
    }
}