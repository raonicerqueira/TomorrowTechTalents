package LogicaDaProgramacaoI.aula06;

//Faça um programa que carregue uma lista com os modelos de cinco carros (exemplo de modelos: FUSCA, GOL,
//        VECTRA etc). Carregue uma outra lista com o consumo desses carros, isto é, quantos quilômetros cada
//        um desses carros faz com um litro de combustível. Calcule e mostre:
//        O modelo do carro mais econômico;
//        Quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma distância de
//        1000 quilômetros e quanto isto custará, considerando um que a gasolina custe R$ 7,25 o litro.
//        Abaixo segue uma tela de exemplo. A disposição das informações deve ser o mais próxima possível ao
//        exemplo. Os dados são fictícios e podem mudar a cada execução do programa.

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] modeloCarro = {"FUSCA", "GOL", "VECTRA", "SANDERO", "COROLLA"};
        double[] autonomiaCarro = {5.3, 8.4, 4.6, 9.2, 6.9};
        double[] litrosMilQuilometros = new double[5];
        final double precoGasolina = 7.25;
        String carroMaisEconomico = "";
        double maiorAutonomiaCarro = 0;

        for (int i = 0; i < modeloCarro.length; i++) {
            if (maiorAutonomiaCarro < autonomiaCarro[i]) {
                maiorAutonomiaCarro = autonomiaCarro[i];
                carroMaisEconomico = modeloCarro[i];
            }

            litrosMilQuilometros[i] = (1000 / autonomiaCarro[i]);

        }

        System.out.println("Comparativo de Consumo de Combustível\n");

        for (int i = 0; i < modeloCarro.length; i++) {
            System.out.println("Veiculo " + (i + 1) + "\n" +
                    "Nome: " + modeloCarro[i].toLowerCase() + "\n" +
                    "Km por litro: " + autonomiaCarro[i]);
        }

        System.out.println("\nRelatório Final");

        for (int i = 0; i < modeloCarro.length; i++) {
            System.out.printf("%d - %s      -   %.2f -  %.2f litros - R$ %.2f\n", (i + 1), modeloCarro[i].toLowerCase(), autonomiaCarro[i], litrosMilQuilometros[i], (litrosMilQuilometros[i] * precoGasolina));
        }

        System.out.println("\nO menor consumo é o do " + carroMaisEconomico.toLowerCase());
    }
}
