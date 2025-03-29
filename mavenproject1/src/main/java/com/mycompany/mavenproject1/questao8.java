package com.mycompany.mavenproject1;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Quantos números cada conjunto terá? ");
            int quantidade = scanner.nextInt();
            int[] conjunto1 = new int[quantidade];
            int[] conjunto2 = new int[quantidade];        
        
        System.out.println("Digite os numeros do primeiro conjunto:");
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
                conjunto1[i] = scanner.nextInt();
        }       
        // lendo os números do segundo conjunto
        System.out.println("Digite os núumeros do segundo conjunto:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
                conjunto2[i] = scanner.nextInt();
        } 
        // encontrando a interseção 
        System.out.println("Numeros em comum entre os dois conjuntos:");
        boolean encontrou = false;
        
        for (int i = 0; i < quantidade; i++) {  // Percorre o primeiro conjunto     
            for (int j = 0; j < quantidade; j++){ // Percorre o segundo conjunto
                
                if (conjunto1[i] == conjunto2[j]){  // Se os números forem iguais
                    System.out.print(conjunto1[i] + " "); 
                    encontrou = true;  
                    break;                 
                }
            }
        }
          if (!encontrou) {
            System.out.println("Noo tem numeros em comum.");
        }
    }
}
