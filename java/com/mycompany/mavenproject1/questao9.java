
package com.mycompany.mavenproject1;

import java.util.Scanner;
        
public class questao9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];        

        System.out.println("Digite as idades de 10 pessoas:");
        for (int i = 0; i < idades.length; i++) {
            System.out.print("Idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        } 
        int maiorIdade = idades[0];
        int menorIdade = idades[0];
        int somaIdades = 0;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
            }
            somaIdades += idades[i];  
        }

        double mediaIdades = (double) somaIdades / idades.length;
       
        System.out.println("\nA maior idade é: " + maiorIdade);
        System.out.println("A menor idade é: " + menorIdade);
        System.out.println("A média das idades é: " + mediaIdades);
    }
}    

