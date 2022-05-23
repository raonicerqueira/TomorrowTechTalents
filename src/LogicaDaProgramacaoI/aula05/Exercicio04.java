package LogicaDaProgramacaoI.aula05;

//Leia a velocidade máxima permitida em uma avenida e a velocidade com que o motorista estava dirigindo nela e
//calcule a multa que uma pessoa vai receber, sabendo que são pagos:
//        a) 50 reais se o motorista estiver ultrapassar em até 10km/h a velocidade permitida (ex.: velocidade
//        máxima: 50km/h; motorista a 60km/h ou a 56km/h);
//        b) 100 reais, se o motorista ultrapassar de 11 a 30 km/h a velocidade permitida.
//        c) 200 reais, se estiver acima de 31km/h da velocidade permitida.

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe qual a velocidade máxima permitida na avenida: ");
        int velocidadeMaxima = scanner.nextInt();
        System.out.print("Informe qual a velocidade detectada na avenida: ");
        int velocidadeDetectada = scanner.nextInt();

        if ((velocidadeDetectada - velocidadeMaxima) > 0 && (velocidadeDetectada - velocidadeMaxima) <= 10) {
            System.out.println("O motorista deverá pagar R$50");
        } else if ((velocidadeDetectada - velocidadeMaxima) > 10 && (velocidadeDetectada - velocidadeMaxima) <= 30) {
            System.out.println("O motorista deverá pagar R$100");
        } else {
            System.out.println("O motorista deverá pagar R$200");
        }
    }
}
