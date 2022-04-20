package aula01;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Informe o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("A soma dos dois números informados é: " + (n1 + n2));
        System.out.println("A subtração dos dois números informados é: " + (n1 - n2));
        System.out.println("A multiplicação dos dois números informados é: " + (n1 * n2));
        System.out.println("A divisão dos dois números informados é: " + (n1 / n2));
    }
}
