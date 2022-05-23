package LogicaDaProgramacaoI.aula06;

//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
//        utilizando as seguintes fórmulas:
//        Para homens: (72.7*h) - 58
//        Para mulheres: (62.1*h) - 44.7

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        double altura = scanner.nextDouble();
        double pesoIdealHomens = ((72.7*altura) - 58);
        double pesoIdealMulheres = ((62.1*altura) - 44.7);

        System.out.printf("O peso ideal para homens que tem a altura informada é %.2f Kgs\n", pesoIdealHomens);
        System.out.printf("O peso ideal para mulheres que tem a altura informada é %.2f Kgs", pesoIdealMulheres);

    }
}
