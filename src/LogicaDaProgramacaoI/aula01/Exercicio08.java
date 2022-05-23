package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saiba o consumo médio do seu carro");
        System.out.print("Informe a distãncia (em KM) total percorrida: ");
        double distanciaPercorrida = scanner.nextDouble();
        System.out.print("Informe o total de combustível gasto: ");
        double combustivelGasto = scanner.nextDouble();

        double consumoMedio = distanciaPercorrida / combustivelGasto;

        System.out.println("O consumo médio do seu automóvel é: " + consumoMedio + " KM/L");
    }
}
