/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class questao10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 5 && idade <= 7) {
            System.out.print("Infantil A");
        } else if (idade >= 8 && idade <= 10) {
            System.out.print("Infantil B");
        } else if (idade >= 11 && idade <= 13) {
            System.out.print("jUVENIL A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.print("Juvenil B");
        } else if (idade >= 18) {
            System.out.print("Adulto");
        } else {
            System.out.print("Voce digitou uma idade invalida.");
        }
    }
}
