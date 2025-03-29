/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
 
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Dig um numero: ");
        int num = scanner.nextInt();
    if(num<0){
        System.out.print("Digite um numero maior que zero.");
        }
    else{
        int contador = 0;
        
            if(num==0){
                contador =1;
                System.out.print(contador+" Digito.");
            }else{
                while(num>0){
                    num /=10;
                    contador++;
                }
            }
        System.out.print(contador+" digitos.");
        }
    }
}
