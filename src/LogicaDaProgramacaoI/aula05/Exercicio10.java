package LogicaDaProgramacaoI.aula05;

//Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação
//        ao filme:
//
//        3 - ótimo,
//        2 - bom,
//        1 - regular
//
//        Faça um programa que receba a idade e a opinião de 5 espectadores e que calcule e mostre:
//
//
//        A média das idades das pessoas que responderam ótimo;
//        A quantidade de pessoas que respondeu regular;
//        A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados.


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] opcao = new int[5];
        int[] idade = new int[5];
        double somatorioIdadeOpcaoOtimo = 0;
        int contadorOpcaoRegular = 0, contadorOpcaoBom = 0, contadorOpcaoOtimo = 0;

        for (int i = 0; i < opcao.length; i++) {
            System.out.println("         " + (i + 1) + "ª Espectador");
            System.out.print("Qual sua opinião em relação ao filme:\n" +
                    "        1 - Regular,\n" +
                    "        2 - Bom,\n" +
                    "        3 - Ótimo\n");
            System.out.print("Escolha uma das três opções: ");
            opcao[i] = scanner.nextInt();
            System.out.print("Informe a sua idade: ");
            idade[i] = scanner.nextInt();
            if (opcao[i] == 3) {
                somatorioIdadeOpcaoOtimo += idade[i];
                contadorOpcaoOtimo++;
            } else if (opcao[i] == 2) {
                contadorOpcaoRegular++;
            } else {
                contadorOpcaoBom++;
            }
        }

        System.out.println("A média das idades das pessoas que responderam ótimo é" + (somatorioIdadeOpcaoOtimo/contadorOpcaoOtimo));
        System.out.println("A quantidade de pessoas que respondeu regular foi" + contadorOpcaoRegular);
        System.out.println("A percentagem de pessoas que respondeu “bom” entre todos os espectadores analisados é " + ((contadorOpcaoBom/opcao.length)*100));


    }
}
