/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Arthur
 */
import java.util.Scanner;
public class questao3 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro intervalo de tempo (horas, minutos, segundos): ");
        System.out.print("Horas: ");
            int horas1 = scanner.nextInt();
        System.out.print("Minutos: ");
            int minutos1 = scanner.nextInt();
        System.out.print("Segundos: ");
            int segundos1 = scanner.nextInt();

        System.out.println("Digite o segundo intervalo de tempo (horas, minutos, segundos): ");
        System.out.print("Horas: ");
            int horas2 = scanner.nextInt();
        System.out.print("Minutos: ");
            int minutos2 = scanner.nextInt();
        System.out.print("Segundos: ");
            int segundos2 = scanner.nextInt();

            int totalSegundos1 = horas1 * 3600 + minutos1 * 60 + segundos1;
            int totalSegundos2 = horas2 * 3600 + minutos2 * 60 + segundos2;

            int somaSegundos = totalSegundos1 + totalSegundos2;
            int somaHoras = somaSegundos / 3600;
        somaSegundos %= 3600;
            int somaMinutos = somaSegundos / 60;
        somaSegundos %= 60;

            int diferencaSegundos = Math.abs(totalSegundos1 - totalSegundos2);
            int difHoras = diferencaSegundos / 3600;
        diferencaSegundos %= 3600;
            int difMinutos = diferencaSegundos / 60;
        diferencaSegundos %= 60;

        System.out.println("\nSoma dos intervalos de tempo:");
        System.out.printf("%d horas, %d minutos, %d segundos\n", somaHoras, somaMinutos, somaSegundos);

        System.out.println("\nDiferença dos intervalos de tempo:");
        System.out.printf("%d horas, %d minutos, %d segundos\n", difHoras, difMinutos, diferencaSegundos);
        
        scanner.close();
    }
}

