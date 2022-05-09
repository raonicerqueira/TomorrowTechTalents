package aula04;

//Crie um método que recebe uma matriz bidimensional inteira e um inteiro que indica uma de suas linhas,
// e retorna a média dos valores daquela linha


import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int linhaMatriz = 4, somatorio = 0;
        int[][] matriz = new int[linhaMatriz][5];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.print("indique uma das linhas da matriz que você deseja obter a média: ");
        int linha = scanner.nextInt();

        if (linha >= 0 && linha < linhaMatriz) {
            for (int i = 0; i < matriz[linhaMatriz-1].length; i++){
                somatorio += matriz[linhaMatriz-1][i];
            }
        }

        System.out.println("O somatório dos valores da linha da matriz selecionada é " + somatorio);
    }
}


