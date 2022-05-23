package LogicaDaProgramacaoI.aula04;

//Escreva um código Java que leia 10 valores double do teclado e armazene-os em uma matriz de dimensões 2x5

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] numeros = new double[2][5];
        String[][] ordem = {{"primeiro", "segundo", "terceiro", "quarto", "quinto"}, {"sexto", "sétimo", "oitavo", "nono", "décimo"}};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print("Informe o " + ordem[i][j] + " número: ");
//                System.out.print("Insira o " + (j + 1) +"º número do " + (i + 1) + "º grupo, do tipo double: ");
                numeros[i][j] = scanner.nextDouble();
            }
        }
    }
}
