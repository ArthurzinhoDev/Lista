

import java.util.Scanner;
/*2-     Uma livraria está fazendo uma promoção para pagamento à vista em que o comprador
        pode escolher entre dois critérios de desconto:*/
public class quest2 {
    public quest2() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantidade de livros a comprar: ");
        int qntdlivros = scanner.nextInt();
        Double a = 0.25 * (double)qntdlivros + 7.5;
        Double b = 0.5 * (double)qntdlivros + 2.5;
        String melhorOp = a < b ? "Criterio A" : "Criterio B";
        System.out.println("O melhro criterio de compra é o " + melhorOp + ".");
    }
}


