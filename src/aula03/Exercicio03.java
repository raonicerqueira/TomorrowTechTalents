package aula03;

//Escreva um programa que conte de 1 até 100 e a cada múltiplo de 10 exiba uma mensagem: “Múltiplo de 10”.

public class Exercicio03 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 100){
            if (n % 10 == 0) {
                System.out.println("Múltiplo de 10");
                n++;
            } else {
                System.out.println(n);
                n++;
            }

        }
    }
}
