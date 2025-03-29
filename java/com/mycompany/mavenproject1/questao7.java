package com.mycompany.mavenproject1;

import java.util.Scanner;

public class questao7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
            
     
        System.out.print("Quantas pessoas deseja cadastrar? ");
            int quantidade = scanner.nextInt();
        
        String[] nomes = new String[quantidade];
        String[] telefones = new String[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                nomes[i] = scanner.next();
            System.out.print("Digite o telefone de " + nomes[i] + ": ");
                telefones[i] = scanner.next();
            System.out.print("-------------------------------------\n");
        }

        System.out.print("\nDigite o nome que deseja buscar: ");
            String nomeBusca = scanner.next();

        boolean encontrado = false;
        
        for (int i = 0; i < quantidade; i++) {
            
            //.equalsIgnoreCase CHECA IDENPENDETE SE MAIUSCULO OU MINUSCULO.
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Telefone de " + nomeBusca + ": " + telefones[i]);
                    encontrado = true;
                    break;
            }
        }

        if (!encontrado) {
            System.out.println("Nome não encontrado na agenda.");
        }
    }
}


