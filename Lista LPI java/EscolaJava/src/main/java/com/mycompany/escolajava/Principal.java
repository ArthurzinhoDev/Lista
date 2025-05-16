
package com.mycompany.escolajava;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a matrícula do aluno: ");
        String matricula = scanner.nextLine();
        
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota do trabalho: ");
        double trabalho = scanner.nextDouble();

        Aluno aluno = new Aluno(matricula, nome, nota1, nota2, trabalho);

        double media = aluno.media();
        boolean aprovado = aluno.aprovacao();

        System.out.println("\nAluno: " + aluno.getNome());
        System.out.printf("Média final: %.2f\n", media);
        System.out.println("Aprovado: " + (aprovado ? "SIM" : "NÃO"));

        scanner.close();
    }
}
