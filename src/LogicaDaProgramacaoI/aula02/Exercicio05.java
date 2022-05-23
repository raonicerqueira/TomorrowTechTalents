package LogicaDaProgramacaoI.aula02;

//Escreva um programa para calcular a quantidade de litros de combustível necessária para se fazer uma
// viagem, sabendo-se que o carro faz 12 Km com um litro. Deverão ser fornecidos o tempo gasto na viagem
// e a velocidade média.
//
//        utilizar as seguintes fórmulas:
//        distância = tempo x velocidade
//        litros usados = distância / 12


import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tempo gasto (em horas) na viagem: ");
        double horasGastas = scanner.nextDouble();
        System.out.print("Informe a velocidade média que foi utilizada na viagem: ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = horasGastas * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.printf("A quantidade de combustível usado na viagem informada é aproximadamente %.2f litros ", litrosUsados);
    }
}
