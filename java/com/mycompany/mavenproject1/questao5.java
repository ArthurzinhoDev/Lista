/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        double[] salarios = new double[5];
        
        for(int i=0; i<salarios.length;i++){
            System.out.print("Salario "+(i+1)+": ");
                salarios[i] = scanner.nextDouble();
        }
        
        System.out.print("Digite o percentual de reajuste em %: ");
            float reajuste = scanner.nextFloat();
        
        for(int i=0; i < salarios.length; i++){
            salarios[i] += salarios[i]*(reajuste/100);
            System.out.printf("Salário %d: R$ %.2f%n", (i + 1), salarios[i]);
        }
    }
}
