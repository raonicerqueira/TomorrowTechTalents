package ProgramacaoOrientadaAObjetosII.Calculadora;

import java.util.Scanner;

public class ColetarInformacoes {
    Scanner scanner = new Scanner(System.in);
    protected double n1, n2, resultado;

    protected void coletarAsEntradas() {
        System.out.println("Por favor, informe o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Por favor, informe o segundo número: ");
        n2 = scanner.nextDouble();
    }
}
