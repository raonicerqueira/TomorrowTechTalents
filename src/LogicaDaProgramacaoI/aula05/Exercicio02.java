package LogicaDaProgramacaoI.aula05;

//Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do imposto de
//        Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS
//        corresponde a 11% do salário bruto, mas não é descontado (é a empresa que deposita.)

//O salário líquido corresponde ao salário bruto menos os descontos O programa deverá pedir ao usuário o valor
// da sua hora e a quantidade de horas trabalhadas no mês.
//
//        a. Desconto do IR;
//        b. Salário Bruto até R$900,00 (inclusive) – Isento;
//        c. Salário Bruto de R$ 1500, 00 (inclusive) – desconto de 5%;
//        d. Salário bruto até R$ 2500,00 (Inclusive) – desconto de 10%;
//        e. Salário bruto acima de 2500 – Desconto de 20%.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor, em reais, da sua hora de trabalho: ");
        double valorHoraTrabalho = scanner.nextDouble();

        System.out.println("Informe quantas horas você trabalhou no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHoraTrabalho * horasTrabalhadas;
        double fgts = salarioBruto * 0.11;
        double impostoDeRenda = 0;
        double descontoSindicato = (salarioBruto * 0.03);

        if (salarioBruto > 900 && salarioBruto <= 1500) {
            impostoDeRenda = (salarioBruto * 0.05);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            impostoDeRenda = (salarioBruto * 0.10);
        } else {
            impostoDeRenda = (salarioBruto * 0.20);
        }

        System.out.printf("Salário bruto: R$%.2f\n", salarioBruto);
        System.out.printf("FGTS: R$%.2f\n", fgts);
        System.out.printf("Desconto para o Sindicato: R$%.2f \n", descontoSindicato);
        System.out.printf("Imposto de renda: R$%.2f \n", impostoDeRenda);
        System.out.printf("Salário Liquido: R$%.2f", (salarioBruto - impostoDeRenda - descontoSindicato));
    }
}
