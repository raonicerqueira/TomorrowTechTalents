package aula05;

//TODO

//Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
//        (1) – inserir um contato
//        (2) – Remover um contato

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] codigoPessoa = new String[10], telefone = new String[10], idade = new String[10];
        int escolha = 0, contatoNaoEncontrado = 0;
        String codigoRemoverPessoa = "";
        while (true) {
            while (escolha != 1 && escolha != 2) {
                System.out.println("Digite 1 para inserir um contato || Digite 2 para remover um contato");
                escolha = scanner.nextInt();
                scanner.nextLine();
            }

            if (escolha == 1) {
                for (int i = 0; i < codigoPessoa.length; i++) {
                    if (codigoPessoa[i] == null) {
                        System.out.print("Informe o código da pessoa: ");
                        codigoPessoa[i] = scanner.nextLine();
                        System.out.print("Informe o número do telefone dessa pessoa: ");
                        telefone[i] = scanner.nextLine();
                        System.out.print("Informe a idade dessa pessoa: ");
                        idade[i] = scanner.nextLine();
                        escolha = 0;
                        break;
                    } else {
                        System.out.println("Todos os campos da agenda estão preenchidos, favor remover algum contato");
                        escolha = 0;
                    }
                }
            } else {
                System.out.println("Informe o código da pessoa que deseja remover: ");
                codigoRemoverPessoa = scanner.nextLine();
                for (int i = 0; i < codigoPessoa.length; i++) {
                    if (codigoRemoverPessoa.equals(codigoPessoa[i])) {
                        codigoPessoa[i] = null;
                        telefone[i] = null;
                        idade[i] = null;
                        System.out.println("contato de código " + codigoRemoverPessoa + " removido com sucesso!");
                        escolha = 0;
                    } else {
                        contatoNaoEncontrado++;
                    }
                }
                escolha = 0;
                if (contatoNaoEncontrado == codigoPessoa.length) {
                    System.out.println("O contato de código " + codigoRemoverPessoa + " não foi encontrado nos registros da agenda");
                    contatoNaoEncontrado = 0;
                    escolha = 0;
                }
            }
        }
    }
}

