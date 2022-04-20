package aula03;

//Escreva um programa que receba o peso e a altura de uma pessoa e calcule o seu IMC, o resultado irá
// dizer se a pessoa está: abaixo do peso (IMC inferior a 18,5), com peso normal (IMC entre 18,5 a 24,9),
// com excesso de peso (IMC entre 25,0 a 29,9) ou obesa (30 ou mais de IMC), informe cada um deles com uma
// mensagem.

//Use a fórmula: IMC = Peso / (Altura × Altura)


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu peso (em KG): ");
        double peso = scanner.nextDouble();
        System.out.print("Informe sua altura (em Metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso");
        } else if (peso >= 18.5 && peso <= 24.9){
            System.out.println("Você está com o peso normal");
        } else if (peso >= 25 && peso <= 29.9){
            System.out.println("Você está com excesso de peso");
        } else {
            System.out.println("Você está com obesidade");
        }

    }
}
