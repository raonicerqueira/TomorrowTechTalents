package LogicaDaProgramacaoI.aula03;

//Escreva um programa que gera um número inteiro aleatório entre 1 e 10 e peça que o usuário informe o número
//        correto, você deve dar dicas caso o palpite esteja errado, informando se o número correto é maior ou
//        menor do que o informado,  caso ele erre três vezes o programa se encerra e imprime uma mensagem
//        informando que ele perdeu.


import java.util.Random;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Informe o número correto: ");
            int numeroInformado = scanner.nextInt();


            if (numeroInformado == numeroAleatorio) {
                System.out.println("Você acertou! Parabéns!!");
                break;
            } else if (numeroInformado < numeroAleatorio) {
                System.out.println("O numero correto é maior que o número informado, tente novamente\n");
                tentativas++;
            } else {
                System.out.println("O número correto é menor que o número informado, tente novamente\n");
                tentativas++;
            }
        }
        if (tentativas == 3) {
            System.out.println("Você tentou três vezes e não acertou! :(");
        }
    }
}
