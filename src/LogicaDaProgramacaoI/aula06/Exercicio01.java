package LogicaDaProgramacaoI.aula06;

//Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos de
// cada atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo a média dos três
// valores restantes. Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo
// atleta em seus saltos e depois informe a média dos saltos conforme a descrição acima informada (retirar
// o melhor e o pior salto e depois calcular a média). Faça uso de uma lista para armazenar os saltos. Os
// saltos são informados na ordem da execução, portanto não são ordenados.
//
//        O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve ser
//        conforme o exemplo abaixo:
//
//        Atleta: João da Silva
//
//        Primeiro Salto: 6.5 m
//        Segundo Salto: 6.1 m
//        Terceiro Salto: 6.2 m
//        Quarto Salto: 5.4 m
//        Quinto Salto: 5.3 m
//
//        Melhor salto: 6.5 m
//        Pior salto: 5.3 m
//
//        Média dos demais saltos: 5.9 m
//
//
//        Resultado final:
//        Rodrigo Curvêllo: 5.9 m


import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String atleta = "";
        double[] saltos = new double[5];
        double melhorSalto = 0, piorSalto = 0, somaSaltos = 0;
        String[] ordem = {"primeiro", "segundo", "terceiro", "quarto", "quinto"};

        while (true) {
            System.out.print("Informe o nome do Atleta: ");
            atleta = scanner.nextLine();

//        if (atleta.isEmpty()){
//            System.out.println("Finalizando a aplicação");
//            break;
//        }

            for (int i = 0; i < ordem.length; i++) {
                System.out.print("Infome a distancia do " + ordem[i] + " salto (em metros): ");
                saltos[i] = scanner.nextDouble();
                somaSaltos += saltos[i];

                if (melhorSalto < saltos[i]) {
                    melhorSalto = saltos[i];
                }

                if (i == 0) {
                    piorSalto = saltos[i];
                }

                if (piorSalto > saltos[i]) {
                    piorSalto = saltos[i];
                }
            }
            System.out.println("Atleta: " + atleta);
            for (int i = 0; i < saltos.length; i++) {
                System.out.println(ordem[i] + " salto: " + saltos[i] + "m");
            }
            System.out.println("melhor salto: " + melhorSalto + "m");
            System.out.println("pior salto: " + piorSalto + "m");
            System.out.printf("média dos demais saltos: %.2f m\n\n", ((somaSaltos - piorSalto - melhorSalto) / 3));
            scanner.nextLine();
        }

    }
}
