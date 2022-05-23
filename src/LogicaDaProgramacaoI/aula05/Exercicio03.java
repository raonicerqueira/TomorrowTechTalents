package LogicaDaProgramacaoI.aula05;

//Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//        “Telefonou para a vítima? “
//        “Esteve no local do crime?”
//        “Mora perto da vítima? “
//        “Devia para a vítima? “
//        “Já trabalhou com a vítima? “
//        Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
//        entre 3 e 4 como “Cúmplice” e 5 como “Assassino”. Caso contrário, ela será classificada como “Inocente”.


import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"};
        String resposta = "";
        int suspeita = 0;

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            resposta = scanner.nextLine().toUpperCase();
            if (resposta.charAt(0) == 'S') {
                suspeita++;
            }
        }
        switch (suspeita) {
            case 2 -> System.out.println("\nEssa pessoa é suspeita");
            case 3, 4 -> System.out.println("\nEssa pessoa parece ser um cúmplice");
            case 5 -> System.out.println("\nEssa pessoa é culpada!");
            default -> System.out.println("\nEssa pessoa é inocente");
        }
    }
}
