package LogicaDaProgramacaoI.aula04;

//Um posto está vendendo combustíveis com a seguinte tabela de descontos:
//
//        Álcool
//        até 20 litros, desconto de 3% por litro
//        acima de 20 litros, desconto de 5% por litro
//
//        Gasolina
//        até 20 litros, desconto de 4% por litro
//        acima de 20 litros, desconto de 6% por litro
//
//        Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
//        seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se
//        que o preço do litro da gasolina é R$ 7,59 e o preço do litro do álcool é R$ 5,20.

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        final double precoGasolina = 7.59, precoAlcool = 5.20;
        double precoCalculado = 0;
        char tipoCombustivel = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        do {
            System.out.print("(A) - Álcool\n" +
                    "(G) - Gasolina\n" +
                    "Informe qual o tipo de combustível vendido: ");
            tipoCombustivel = scanner.next().toUpperCase().charAt(0);
        } while (tipoCombustivel != 'A' && tipoCombustivel != 'G');

        if (tipoCombustivel == 'A') {
            if (litrosVendidos <= 20) {
                precoCalculado = (litrosVendidos * (precoAlcool * 0.97));
            }
            else {
                precoCalculado = (litrosVendidos * (precoAlcool * 0.95));
            }
        }
        else {
            if (litrosVendidos <= 20) {
                precoCalculado = (litrosVendidos * (precoGasolina * 0.96));
            }
            else {
                precoCalculado = (litrosVendidos * (precoGasolina * 0.94));
            }
        }

        System.out.printf("O valor a ser pago é R$%.2f", precoCalculado);
    }
}
