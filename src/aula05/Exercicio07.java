package aula05;

//TODO

//Uma loja utiliza o código V para transação à vista e P para transação a prazo. Faça um programa que receba
//        código e valor de 15 transações usando laços de repetição. Calcule e mostre:
//        O valor total das compras à vista
//        O valor total das compras a prazo.
//        O valor total das compras efetuadas
//        O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tipoTransacao[] = new char[15];
        double valorTransacao[] = new double[15];

        for (int i = 0; i < tipoTransacao.length; i++) {
            System.out.println("V para tramsação à vista");
            System.out.println("P para tramsação à prazo");
            System.out.print("Digite a opção desejada: ");
            char opcao = scanner.nextLine().toUpperCase().charAt(0);
            switch (opcao) {
                case 'V', 'P':
                    tipoTransacao[i] = opcao;

                    System.out.println("Informe o valor da transação: ");
                    valorTransacao[i] = scanner.nextDouble();
                    break;
                default:
                    System.out.println("Tipo de transação não existente");
            }
        }
    }
}
