package LogicaDaProgramacaoI.aula04;

//Escreva um código para armazenar 10 valores aleatórios até o número 100 do tipo double em um array;


import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random gerador = new Random();
        double numerosAleatorios[] = new double[10];
        for (int i = 0; i < numerosAleatorios.length; i++){
            numerosAleatorios[i] = gerador.nextDouble(100);
            System.out.println(numerosAleatorios[i]);
        }
    }
}
