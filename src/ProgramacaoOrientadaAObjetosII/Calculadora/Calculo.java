package ProgramacaoOrientadaAObjetosII.Calculadora;

import java.util.Scanner;

public interface Calculo {
    Scanner scanner = new Scanner(System.in);
    void calcular();
    void mostrarResultado(double n1, double n2, double resultado);
}
