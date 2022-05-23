package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora de Cavalos");
        System.out.print("Informe o peso em quilos da massa: ");
        double m = scanner.nextDouble();
        System.out.print("Informe a altura em metros do deslocamento: ");
        double h = scanner.nextDouble();
        System.out.print("Informe o tempo em segundos para o deslocamento: ");
        double t = scanner.nextDouble();

        double calculoCavalos = ((m * h)/ t) / 746.6999;

        System.out.println("A potência em cavalos necessária para a situação indicada é: "+calculoCavalos);

    }
}
