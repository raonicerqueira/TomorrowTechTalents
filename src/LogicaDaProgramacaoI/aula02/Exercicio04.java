package LogicaDaProgramacaoI.aula02;

//Um hotel quer fazer um levantamento das praias da cidade para uma
//        programação turística. Sabendo-se que cada praia tem um nome e uma
//        distância (em Km) do hotel, escreva um programa que forneça os
//        seguintes dados:
//
//        - O nome da praia mais distante.
//        - Quantas praias estão a mais de 10km e a menos de 15km.
//        - A distância média das praias.
//
//// Para cada praia deverá ser informado seu nome e a distância em Km
//        do hotel.
//
//        Você deve receber 5 praias;
//        Você deve armazenar o nome das 5 praias em um array;


import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] praias = new String[5];
        double[] distanciaHotel = new double[5];
        String[] ordem = {"primeira", "segunda", "terceira", "quarta", "quinta"};
        String praiaMaisDistante = "";
        double distancia = 0, distanciaMedia = 0;
        int contadorDistancia = 0;

        for (int i = 0; i < ordem.length; i++){
            System.out.printf("Informe o nome da %s praia: ", ordem[i]);
            praias[i] = scanner.nextLine();

            System.out.printf("informe a distancia (em KM) da %s praia até o hotel: ", ordem[i]);
            distanciaHotel[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        for (int i = 0; i < praias.length; i++){
            if(distancia <= distanciaHotel[i]){
                distancia = distanciaHotel[i];
                praiaMaisDistante = praias[i];
            }
            if (distanciaHotel[i] > 10 && distanciaHotel[i]<15){
                contadorDistancia++;
            }
            distanciaMedia += distanciaHotel[i];
        }

        System.out.println("A praia mais distante é: " + praiaMaisDistante);
        System.out.println("Existem " +contadorDistancia+ " praias que estão a mais de 10km e a menos de 15km de distancia do hotel");
        System.out.println("A distancia média das praias é: " + (distanciaMedia/ praias.length) + " KMs");

    }
}
