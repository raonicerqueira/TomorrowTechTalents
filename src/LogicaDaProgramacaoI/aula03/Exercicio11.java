package LogicaDaProgramacaoI.aula03;

//Escreva um programa que receba dois números inteiros e imprima os números inteiros que estão no intervalo
//        compreendido entre eles.


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Insira o segundo número: ");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero < segundoNumero) {
            for (int i = (primeiroNumero + 1); i < segundoNumero; i++) {
                System.out.println(i);
            }
        } else if (primeiroNumero == segundoNumero) {
            System.out.println("Os números são iguais");
        } else {
            for (int i = (segundoNumero + 1); i < primeiroNumero; i++) {
                System.out.println(i);
            }
        }
    }
}

