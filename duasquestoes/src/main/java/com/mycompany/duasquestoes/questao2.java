
package com.mycompany.duasquestoes;

import javax.swing.JOptionPane;


public class questao2 {
    public static void main(String[] args){
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas que deseja cadastrar: "));
        String[][] matriz = new String[quant][2];
        
        int j=0;
        for (int i = 0; i < quant; i++) {
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º nome: ");
            j++;
            matriz[i][j] = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º telefone: ");
            j = 0;
        }
        String nome = JOptionPane.showInputDialog("Digite um nome para consulta:");
        boolean achou = false;
        for (int i = 0; i< quant; i++) {
            if (matriz[i][0].equalsIgnoreCase(nome)) {
                JOptionPane.showMessageDialog(null, "Nome: " + matriz[i][0] + "\nTelefone: " + matriz[i][1]);
                achou = true;
                break;
            }
        }
        if (!achou) {
            JOptionPane.showMessageDialog(null, "O nome " + nome + " não foi encontrado!");
        }
    }
}