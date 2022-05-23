package LogicaDaProgramacaoI.aula04;

//A prefeitura de uma cidade deseja fazer uma pesquisa entre seus habitantes. Faça um algoritmos para coletar
// dados sobre o salário e número de filhos de cada habitante e após as leituras, escrever:
//        Média de salário da população
//        Média do número de filhos
//        Maior salário dos habitantes
//        Percentual de pessoas com salário menor que R$ 150,00
//
//
//        Obs: O final da leitura dos dados se dará com a entrada de um “salário negativo”.


import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de habitantes: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o número de filhos: ");
        int numeroFilhos = scanner.nextInt();

    }
}
