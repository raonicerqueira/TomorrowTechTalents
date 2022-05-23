package LogicaDaProgramacaoI.aula03;

//Faça um programa que leia um número inteiro diferente de zero e mostre uma mensagem indicando se este número é
// positivo ou negativo. Pare a execução do programa quando o usuário requisitar (O programa deve parar quando o
// usuário escolher 0).


import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;

        while (numero != 0) {
            System.out.print("Digite um número positivo ou negativo: ");
            numero = scanner.nextInt();
            if (numero == 0){
                break;
            }
            if (numero > 0) {
                System.out.println("Este número é positivo!");
                numero = 1;
            } else {
                System.out.println("Este número é negativo!");
                numero = 1;
            }

        }
    }
}
