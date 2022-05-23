package LogicaDaProgramacaoI.aula03;

//Escreva um programa que exiba quantas pessoas possuem mais de 18 anos. O algoritmo deverá ler a idade de
//10 pessoas.


import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ordem[] = {"primeira", "segunda", "terceira", "quarta", "quinta", "sexta", "sétima", "oitava", "nona", "décima"};
//        int idade[] = new int[10];
        int idade = 0, contadorMaiorIdade = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a " + ordem[i] + " idade: ");
            idade = scanner.nextInt();
            if (idade <= 0){
                System.out.println("informe uma idade válida");
                i--;
            } else if (idade > 18) {
                contadorMaiorIdade++;
            }
        }

        System.out.println("Existem " + contadorMaiorIdade + " pessoas com mais de 18 anos");
    }
}

