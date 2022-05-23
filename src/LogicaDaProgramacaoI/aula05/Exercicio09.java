package LogicaDaProgramacaoI.aula05;

//Faça um programa que apresente o menu de opções a seguir:
//        Menu de opções:
//        1. Média aritmética
//        2. Média ponderada
//        Digite a opção desejada:
//        Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//        Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
//        Verifique a possibilidade de opção inválida, mostrando uma mensagem.

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Menu de opções:\n" +
                    "        1. Média aritmética\n" +
                    "        2. Média ponderada\n\n" +
                    "Digite a opção desejada: "
            );
            int opcao = scanner.nextInt(), nota1 = 0, nota2 = 0, nota3 = 0, peso1 = 0, peso2 = 0, peso3 = 0;
            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu calcular a média aritimética\n");
                    System.out.println("Informe a primeira nota: ");
                    nota1 = scanner.nextInt();
                    System.out.println("Informe a segunda nota: ");
                    nota2 = scanner.nextInt();
                    System.out.println("A média aritmética dos valores informados é " + ((nota1 + nota2)/2));
                    break;

                case 2:
                    System.out.println("Você escolheu calcular a média ponderada\n");
                    System.out.println("Informe a primeira nota: ");
                    nota1 = scanner.nextInt();
                    System.out.println("Informe o peso da primeira nota: ");
                    peso1 = scanner.nextInt();
                    System.out.println("Informe a segunda nota: ");
                    nota2 = scanner.nextInt();
                    System.out.println("Informe o peso da segunda nota: ");
                    peso2 = scanner.nextInt();
                    System.out.println("Informe a terceira nota: ");
                    nota3 = scanner.nextInt();
                    System.out.println("Informe o peso da terceira nota: ");
                    peso3 = scanner.nextInt();
                    System.out.println("A média ponderada dos valores informados é " + ((nota1 + nota2 + nota3)/(peso1 + peso2 + peso3)));
                    break;

                default:
                    System.out.println("Opção não válida, por favor escolha uma opção válida\n");
            }
        }
    }
}
