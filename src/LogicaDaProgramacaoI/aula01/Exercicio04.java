package LogicaDaProgramacaoI.aula01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Me diga quantos anos você tem e eu te direi quantos dias você já viveu!");
        System.out.print("Informe uma idade: ");
        int idade = scanner.nextInt();

        int idadeEmDias = (idade*365);

        System.out.println("Olha que legal, você já viveu aproximadamente" + idadeEmDias + " dias! Continue assim!");
    }
}
