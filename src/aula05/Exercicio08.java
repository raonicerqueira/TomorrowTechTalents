package aula05;

//Faça um programa que receba a idade e o peso de sete pessoas. Calcule e mostre:
//        A quantidade de pessoas com mais de 90 quilos;
//        A média das idades das sete pessoas;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[7];
        double[] peso = new double[7];
        int contadorSobrepeso = 0;
        double somatorioidade = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.print("Informe a idade: ");
            idade[i] = scanner.nextInt();
            somatorioidade += idade[i];
            System.out.print("Informe o peso: ");
            peso[i] = scanner.nextDouble();

            if (peso[i] > 90) {
                contadorSobrepeso++;
            }
        }
        System.out.println("Foram informadas " + contadorSobrepeso + " pessoas com peso acima de 90Kg");
        System.out.printf("A média das idades das pessoas informadas é %.2f", (somatorioidade / idade.length));
    }
}
