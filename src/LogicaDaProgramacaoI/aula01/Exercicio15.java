package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de cavalos comprados: ");
        int cavalosComprados = scanner.nextInt();
        int quantidadeFerraduras = cavalosComprados * 4;

        System.out.println("Serão necessárias " + quantidadeFerraduras + " ferraduras para equipar todos os cavalos comprados");
    }
}
