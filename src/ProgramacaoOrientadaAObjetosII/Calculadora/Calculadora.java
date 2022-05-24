package ProgramacaoOrientadaAObjetosII.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);

            Soma soma = new Soma();
            Subtracao Subtracao = new Subtracao();
            Multiplicacao multiplicacao = new Multiplicacao();
            Divisao divisao = new Divisao();

            System.out.println("=========CALCULADORA=========");
            System.out.println("1. Soma\n" +
                    "2. Subtração\n" +
                    "3. Multiplicação\n" +
                    "4. Divisão\n\n" +
                    "Olá! Qual operação você deseja fazer?");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> soma.calcular();
                case 2 -> Subtracao.calcular();
                case 3 -> multiplicacao.calcular();
                case 4 -> divisao.calcular();
                default -> System.out.println("Opção inválida, por favor digite uma opção válida");
            }
        }
    }
}
