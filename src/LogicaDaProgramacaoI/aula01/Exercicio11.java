package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor total da venda: ");
        double valorTotalVenda = scanner.nextDouble();
        double valorPrestacoes = valorTotalVenda / 5;

        System.out.printf("Você precisará pagar 5x de R$%.2f", valorPrestacoes);
    }
}
