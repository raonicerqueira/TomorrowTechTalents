package LogicaDaProgramacaoI.aula04;

// Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a
//         entrada das seguintes informações:
//         a quantidade de produtos que irá cadastrar
//         para cada produto:
//         o nome do produto
//         o número total de mercadorias no estoque;
//         o valor unitário da mercadoria.
//         Imprimir o valor total em estoque e a média de valor das mercadorias.


import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int qtdCadastro = 0, somatorioMercadorias = 0;
        double somatorioValorMercadorias = 0;
        double valor = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Informe a quantidade de produtos que será cadastrado: ");
            qtdCadastro = scanner.nextInt();
            scanner.nextLine();
        } while (qtdCadastro <= 0);

        String[][] mercadorias = new String[qtdCadastro][3];

        for (int i = 0; i < mercadorias.length; i++) {

            do {
                System.out.print("Informe o nome do produto: ");
                mercadorias[i][0] = scanner.nextLine();
            } while (mercadorias[i][0] == null);

            do {
                System.out.print("Informe a quantidade em estoque desse produto: ");
                mercadorias[i][1] = scanner.nextLine();
            } while (Integer.parseInt(mercadorias[i][1]) <= 0);

            do {
                System.out.print("Informe o valor unitário desse produto: ");
                mercadorias[i][2] = scanner.nextLine();
                valor = Double.parseDouble(mercadorias[i][2].replaceAll(",","."));
            } while (valor <= 0);

            somatorioMercadorias += Integer.parseInt(mercadorias[i][1]);
            somatorioValorMercadorias += (Double.parseDouble(mercadorias[i][2].replaceAll(",",".")) * Integer.parseInt(mercadorias[i][1]));
        }



        System.out.printf("Foram cadastradas %d mercadorias que totalizam o valor de R$%.2f", somatorioMercadorias, somatorioValorMercadorias);
    }
}
