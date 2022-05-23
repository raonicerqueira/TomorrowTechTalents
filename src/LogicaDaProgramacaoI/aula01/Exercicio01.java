package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor insira uma temperatura em Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();
        double conversaoCelsiusParaKelvin = temperaturaCelsius + 273.15;
        double conversaoCelsiusParaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        double conversaoCelsiusParaRankine = (temperaturaCelsius * 1.8) + 32 + 459.67;
        double conversaoCelsiusParaReaumur = temperaturaCelsius * 0.8;

        System.out.println("\nA temperatura informada em Celsius equivale à " + conversaoCelsiusParaKelvin + " Kelvin");
        System.out.println("A temperatura informada em Celsius equivale à " + conversaoCelsiusParaFahrenheit + " Fahrenheit");
        System.out.println("A temperatura informada em Celsius equivale à " + conversaoCelsiusParaRankine + " Rankine");
        System.out.println("A temperatura informada em Celsius equivale à " + conversaoCelsiusParaReaumur + " Réaumur");
    }
}
