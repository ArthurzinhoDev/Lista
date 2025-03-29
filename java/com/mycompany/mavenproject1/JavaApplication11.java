package com.mycompany.mavenproject1;


import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dig n1: ");
            float n1 = scanner.nextFloat();
        System.out.print("Dig n2: ");
            float n2= scanner.nextFloat();
        System.out.print("Dig n3: ");
            float n3= scanner.nextFloat();
    if((n1+n2+n3)/3 >= 7){
        System.out.printf("APROVADO! Nota: "+ (n1+n2+n3)/3 );
    }
    else if((n1+n2+n3)/3 >= 0 && (n1+n2+n3)/3<7){
        System.out.print("----RECUPERACAOO---- ");
        System.out.print("\nDig a nota da recupera��o: ");
            float notaRec = scanner.nextFloat();
            
            if((notaRec+(n1+n2+n3)/3)/2 >= 5){
                System.out.print("Voce foi aprovado na recuperacao!!!!");
            }else{
                System.out.print("voce foi reprovado\nMedia foi "+ (notaRec+(n1+n2+n3)/3)/2 );} 
        }
    }
}
