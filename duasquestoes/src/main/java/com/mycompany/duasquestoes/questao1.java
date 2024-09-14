package com.mycompany.duasquestoes;

import javax.swing.JOptionPane;

public class questao1 {
    public static void main(String[] args) {
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos nomes deseja cadastrar:"));
        String nomes[] = new String[quant];

        for (int i = 0; i < quant; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa: " + (i + 1) + ": ");
        }

        while (true) {
            int posicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a posição do nome que deseja consultar:  (-1 = sair)"));

            if (posicao == -1) {
                break;
            } else if (posicao >= 1 && posicao <= quant) {
                JOptionPane.showMessageDialog(null, "Nome cadastrado na posição " + posicao + " é " + nomes[posicao - 1]);
            } else {
                JOptionPane.showMessageDialog(null, "Posição inválida");
            }
        }
    }
}