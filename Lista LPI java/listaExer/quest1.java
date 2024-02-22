import java.util.Scanner;
/*1-     Um aluno realizou três provas de uma disciplina. Considerando o critério abaixo,
faça um programa que mostre a média e se ele foi aprovado ou reprovado.*/
    public class quest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner be = new Scanner(System.in);
        System.out.print("Digite suas três notas.\n");
        System.out.print("n1:  ");
            float n1 = be.nextFloat();
        System.out.print("n2:  ");
            float n2 = be.nextFloat();
        System.out.print("n3:  ");
            float n3 = be.nextFloat();

        float media=(n1+n2+n3)/3;
        if(media>=7){
            System.out.println("VOCE FOI APROVADO!!!");
        }
        if(media<7){
            System.out.println("Voce foi para recuperacao.");
            System.out.print("Informe sua nota da recuperação.\n ");
            System.out.print("nota rec: ");

            float nR = be.nextFloat();

            if( ((media+ nR)/2) < 5){
                System.out.println("Voce reprovou.");
            }
            else{ System.out.println("***Voce aprovou***");
            }
        }



    }

}
