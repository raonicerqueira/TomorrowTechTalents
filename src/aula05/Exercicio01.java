package aula05;

//Calcular a quantidade de dinheiro gasta por um fumante.
//        Dados: o número de anos que ele fuma, o nº de cigarros fumados por dia e o preço de uma carteira com 20
//        cigarros.

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, informe a quantos anos você fuma: ");
        int anos = scanner.nextInt();

        System.out.print("Informe o número de cigarros fumados por dia: ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Informe quanto custa uma carteira de cigarros: ");
        double preçoCarteiraCigarros = scanner.nextDouble();

        double precoFinal = (((anos * 365) * cigarrosPorDia) * preçoCarteiraCigarros)/20;

        System.out.printf("Você já gastou R$%.2f fumando", precoFinal);
    }
}
