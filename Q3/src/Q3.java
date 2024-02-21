
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("\nDigite os seis números inteiros representando dois intervalos de tempo (horas, minutos e segundos).\nHoras:");
        int hora1 = scan.nextInt();
        System.out.print("Minutos:");
        int min1 = scan.nextInt();
        System.out.print("Segundos:");
        int s1 = scan.nextInt();


        System.out.print("\nSegundo intervalo de tempo (horas, minutos e segundos).\nHoras:");
        int hora2 = scan.nextInt();
        System.out.print("Minutos:");
        int min2 = scan.nextInt();
        System.out.print("Segundos:");
        int s2 = scan.nextInt();

        int somaH = hora1 + hora2;
        int somaM = min1 + min2;
        int somaS = s1 + s2;
        if(somaS>=60){
            somaS -=60;
            somaM++;
        }
        if(somaM>=60){
            somaM -=60;
            somaH++;
        }
        int difH = hora1 - hora2;
        int difM = min1 - min2;
        int difS = s1 - s2;

        if(difS<0){
            difS+=60;
            difM--;
        }
        if(difM<0){
            difM +=60;
            difH--;
        }
        System.out.print("A soma dos dois intervalos de tempo é "+somaH+"h:"+somaM+"min:"+somaS+"seg.");
        System.out.print("\nA diferenca dos dois intervalos de tempo é "+difH+"h:"+difM+"min:"+difS+"seg.");
    }
}