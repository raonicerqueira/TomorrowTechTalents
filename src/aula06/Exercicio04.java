package aula06;

//Foi feita uma estatística em cinco cidades brasileiras para coletar dados sobre acidentes de trânsito. Foram
// obtidos os seguintes dados:
//        Código da cidade;
//        Número de veículos de passeio (em 2021);
//        Número de acidentes de trânsito com vítimas (em 2021).
//
//        Deseja-se saber:
//        Qual o maior e menor índice de acidentes de trânsito e a que cidade pertence;
//        Qual a média de veículos nas cinco cidades juntas;
//        Qual a média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio.


import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] codCidade = new int[5];
        int[] numeroVeiculosPasseio = new int[5];
        int[] numeroAcidentesVitimas = new int[5];
        int menorNumeroAcidentesVitimas = 0, maiorNumeroAcidentesVitimas = 0, somatorioVeiculos = 0, somatorioAcidentes = 0,
                menorPosicao = 0, maiorPosicao = 0, contadorMediaAcidentes = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o código da cidade: ");
            codCidade[i] = scanner.nextInt();
            System.out.print("Informe o número de veículos de passeio (em 2021): ");
            numeroVeiculosPasseio[i] = scanner.nextInt();
            somatorioVeiculos += numeroVeiculosPasseio[i];
            System.out.print("Informe o número de acidentes de trânsito com vítimas (em 2021): ");
            numeroAcidentesVitimas[i] = scanner.nextInt();

            if (i == 0) {
                menorNumeroAcidentesVitimas = numeroAcidentesVitimas[i];
            }
            if (maiorNumeroAcidentesVitimas < numeroAcidentesVitimas[i]) {
                maiorNumeroAcidentesVitimas = numeroAcidentesVitimas[i];
                maiorPosicao = i;
            }
            if (menorNumeroAcidentesVitimas > numeroAcidentesVitimas[i]) {
                menorNumeroAcidentesVitimas = numeroAcidentesVitimas[i];
                menorPosicao = i;
            }
            if (numeroVeiculosPasseio[i] < 2000) {
                somatorioAcidentes += numeroAcidentesVitimas[i];
                contadorMediaAcidentes++;
            }
        }

        System.out.println("A cidade de codigo " + codCidade[maiorPosicao] + " detém o maior índice de acidentes de trânsito com" + maiorNumeroAcidentesVitimas + " acidentes");
        System.out.println("A cidade de codigo " + codCidade[menorPosicao] + " detém o menor índice de acidentes de trânsito com" + menorNumeroAcidentesVitimas + " acidentes");
        System.out.println("A média de veículos nas cinco cidades juntas é " + (somatorioVeiculos/5));
        System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio " + (somatorioVeiculos/contadorMediaAcidentes));
    }
}
