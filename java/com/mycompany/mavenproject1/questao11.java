
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class questao11 {
    
    public static void calcularDados(int[] salarios, int[] numFilhos) {
        int totalEntrevistados = salarios.length;
        double somaSalarios = 0;
        double somaFilhos = 0;
        int maiorSalario = salarios[0];
        int pessoasSalarioBaixo = 0;
        
        for (int i = 0; i < totalEntrevistados; i++) {
            somaSalarios += salarios[i];
            somaFilhos += numFilhos[i];
            
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
            
            if (salarios[i] <= 550) {
                pessoasSalarioBaixo++;
            }
        }
        
        double mediaSalarios = somaSalarios / totalEntrevistados;
        double mediaFilhos = somaFilhos / totalEntrevistados;
        double percentualSalarioBaixo = (double) pessoasSalarioBaixo / totalEntrevistados * 100;
        
        System.out.println("\nMedia de salarios: R$ " + mediaSalarios);
        System.out.println("Media do numero de filhos: " + mediaFilhos);
        System.out.println("Maior salario: R$ " + maiorSalario);
        System.out.println("Percentual de pessoas com salario ate R$550,00: " + percentualSalarioBaixo + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de entrevistados: ");
        int quantidade = scanner.nextInt();
        
        int[] salarios = new int[quantidade];
        int[] numFilhos = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("\nDigite o salario do entrevistado " + (i + 1) + ": R$ ");
            salarios[i] = scanner.nextInt();
            System.out.print("Digite o numero de filhos do entrevistado " + (i + 1) + ": ");
            numFilhos[i] = scanner.nextInt();
        }      
        calcularDados(salarios, numFilhos);
    }
}

