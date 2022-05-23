package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        System.out.println("Conversor de Moedas");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor em Reais: ");
        double valorEmReais = scanner.nextDouble();
        double conversaoReaisEmDolar = valorEmReais * 4.70;
        double conversaoReaisEmEuro = valorEmReais * 5.11;
        double conversaoReaisEmLibra = valorEmReais * 6.13;

        System.out.printf("O valor informado corresponde à %.2f Dólares", conversaoReaisEmDolar);
        System.out.printf("\nO valor informado corresponde à %.2f Euros", conversaoReaisEmEuro);
        System.out.printf("\nO valor informado corresponde à %.2f Libras", conversaoReaisEmLibra);

    }
}
