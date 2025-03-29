/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        //criação vetores de 10 posições (10salarios)       
        float[] valores = new float[10];
        
        System.out.print("----Digite 10 valores----\n ");
        
        for(int i=0; i<10; i++){
        //imprime 10x para ele digitar os numeros
        System.out.print("Digite"+(i+1)+": ");
            valores[i]= scanner.nextFloat();
        }
        //decremento, comeca do maior para o menor
                // (.length) retorna o tamanho do vetor
        for(int i=valores.length-1; i>=0; i--){
            System.out.print("\n"+ valores[i]);
        }
    }
}
