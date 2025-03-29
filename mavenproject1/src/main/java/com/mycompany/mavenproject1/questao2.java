/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;
import java.util.Scanner;


public class questao2 {
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Dig qunaitdade de livros: ");
        int livros = scanner.nextInt();
        
    double criterioA = (livros *0.25)+7.5;
    double criterioB = (livros*0.5) + 2.5;
    
    if(criterioA > criterioB){
        System.out.print("A melhor opção é a o B R$"+ criterioB );
    }
    else if(criterioA < criterioB){
        System.out.print("A melhor opção é o A R$"+ criterioA );
    }else{
        System.out.print("As duas opçoes são de iguais.");
    }
        
    }
}
