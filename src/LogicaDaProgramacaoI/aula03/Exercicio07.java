package LogicaDaProgramacaoI.aula03;

//Escreva um programa que recebe um número inteiro maior que zero e calcula o seu valor fatorial.
//
//        Exemplo: Entrada usuário: 6, saída do programa: 720
//        Explicação: 6 x 5 x 4 x 3 x 2 x 1 = 720


import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;
        System.out.print("Informe um número e te informarei o seu valor fatorial: ");

        for (int numero = scanner.nextInt(); numero >= 1; numero--){
            fatorial *= numero;
        }
        System.out.println(fatorial);
    }
}
