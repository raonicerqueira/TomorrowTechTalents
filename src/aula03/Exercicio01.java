package aula03;

//Escreva um programa que leia quatro notas escolares de um aluno e apresenta uma mensagem informando se o aluno foi
// aprovado caso apresente o valor da média escolar maior ou igual a 7. Caso contrário, apresente uma mensagem
// informando que ele está de recuperação.


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ordem = {"primeira", "segunda", "terceira", "quarta"};
        double notas = 0;
        for (int i = 0; i < 4; i++){
            System.out.print("Informe a " + ordem[i] + " nota: ");
            notas += scanner.nextDouble();
        }
        double media = notas / 4;

        if (media >= 7){
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
