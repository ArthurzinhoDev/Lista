

import java.util.Scanner;

public class Q2 {
    public Q2() {
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