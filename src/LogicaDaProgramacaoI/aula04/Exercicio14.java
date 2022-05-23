package LogicaDaProgramacaoI.aula04;

//Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades dos homens serão
//        sempre diferentes entre si, bem como as das mulheres).
//
//        Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das idades
//        do homem mais novo com a mulher mais velha.

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int homemMaisVelho = 0, homemMaisNovo = 0, mulherMaisVelha = 0, mulherMaisNova = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Insira uma idade para homem: ");
            if (i == 0) {
                do {
                    homemMaisNovo = scanner.nextInt();
                } while (homemMaisNovo <= 0);
            } else {
                do {
                    homemMaisVelho = scanner.nextInt();
                } while (homemMaisNovo <= 0);

            }
            if (homemMaisNovo > homemMaisVelho) {
                int temp = homemMaisNovo;
                homemMaisNovo = homemMaisVelho;
                homemMaisVelho = temp;
            }
        }
    }
}
