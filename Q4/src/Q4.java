import java.util.Scanner;

/*4-     Escreva um programa que determine o número de dígitos de um valor inteiro maior ou
                igual a 0.*/

public class Q4{
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Um número inteiro qualquer maior ou igual a zero: ");
        int num = scanner.nextInt();

        if( num < 0){
            System.out.println("Número inválido.\n");
            return;
        }
        int quant = String.valueOf(num).length();
        System.out.println("A quantidade de digitos é "+ quant);
    }
}