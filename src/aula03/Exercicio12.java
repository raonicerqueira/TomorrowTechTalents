package aula03;

//Escreva um programa que leia e valide as seguintes informações:
//        Nome: maior que 3 caracteres;
//        Idade: entre 0 e 150
//        Salário: maior que 0
//        Sexo: ‘f’ ou ‘m’
//        Estado civil: ‘s’, ‘c’, ‘v’, ‘d’


import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();
        while (nome.length() <= 3) {
            System.out.print("Seu nome precisa ter mais que 3 caracteres, insira um nome válido: ");
            nome = scanner.nextLine();
        }
        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.print("Insira uma idade válida: ");
            idade = scanner.nextInt();
        }
        System.out.print("Insira seu salário: ");
        double salario = scanner.nextDouble();
        while (salario <= 0) {
            System.out.print("Insira um salário válido: ");
            salario = scanner.nextDouble();
        }
        System.out.print("Insira seu sexo: ");
        String sexo = scanner.nextLine();
        scanner.nextLine();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.print("Insira uma opção válida, 'm' para masculino ou 'f' para feminino: ");
            sexo = scanner.nextLine();
        }
        System.out.print("Insira seu estado civil: ");
        String estadoCivil = scanner.nextLine();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")){
            System.out.print("Insira um estado civil válido: 's' para solteiro(a), 'c' para casado(a), 'v' para viuvo(a) ou 'd' para divorciado(a): ");
            estadoCivil = scanner.nextLine();
        }

    }
}
