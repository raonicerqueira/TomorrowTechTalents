package LogicaDaProgramacaoI.aula04;

//Escreva um algoritmo que permita a leitura dos nomes de 10 pessoas e armazenar os nomes lidos em um vetor.
//        Após isto, o algoritmo deve permitir a leitura de mais 1 nome qualquer de pessoa e depois escrever
//        a mensagem ACHEI, se o nome estiver entre os 10 nomes lidos anteriormente (guardados no vetor), ou
//        NÃO ACHEI caso contrário

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[10], ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto", "sexto", "setimo", "oitavo", "nono", "décimo"};
        String nomeProcurado = "";
        int contador = 0;

        System.out.println("Informe o nome de dez pessoas para que seja armazenado, depois informe o nome que deseja procurar no armazenamento");
        for (int i = 0; i < nome.length; i++) {
            System.out.print("Informe o " + ordem[i] + " nome para ser armazenado: ");
            nome[i] = scanner.nextLine();
        }
        System.out.print("informe o nome a ser procurado: ");
        nomeProcurado = scanner.nextLine();

        for (int i = 0; i < nome.length; i++) {
            if (nomeProcurado.equals(nome[i])) {
                contador++;
            }
        }
        if (contador != 0) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
    }
}
