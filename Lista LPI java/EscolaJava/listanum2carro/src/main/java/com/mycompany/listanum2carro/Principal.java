package com.mycompany.listanum2carro;

import java.util.Scanner;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados do carro ao usuário
        System.out.println("Cadastro de Carro");
        System.out.println("-----------------");
        
        System.out.print("Digite a marca do carro: ");
        String marca = scanner.nextLine();
        
        System.out.print("Digite o modelo do carro: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Digite a cor do carro: ");
        String cor = scanner.nextLine();
        
        System.out.print("Digite o ano do carro: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Criar objeto Carro
        Carro meuCarro = new Carro(modelo, cor, ano, marca);

        // Menu interativo
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Acelerar (+5 km/h)");
            System.out.println("2 - Reduzir velocidade (-5 km/h)");
            System.out.println("3 - Frear completamente");
            System.out.println("4 - Exibir informações do carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    meuCarro.acelera(1);
                    System.out.println("Acelerando! Velocidade atual: " + meuCarro.getVelocidade() + " km/h");
                    break;
                case 2:
                    meuCarro.acelera(-1);
                    System.out.println("Reduzindo velocidade! Velocidade atual: " + meuCarro.getVelocidade() + " km/h");
                    break;
                case 3:
                    meuCarro.freia();
                    System.out.println("Freando! O carro parou completamente.");
                    break;
                case 4:
                    System.out.println("\n" + meuCarro.exibirInfo());
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}