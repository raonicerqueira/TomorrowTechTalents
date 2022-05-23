package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o preço de custo do produto: ");
        double precoCustoProduto = scanner.nextDouble();
        System.out.print("Informe o percentual de margem de lucro do produto: ");
        double margemLucroProduto = (scanner.nextDouble() / 100);

        double valorFinalProduto = precoCustoProduto + (precoCustoProduto * margemLucroProduto);

        System.out.printf("O valor final de venda do produto informado é R$%.2f", valorFinalProduto);
    }
}
