/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jframe2uni;

import javax.swing.JOptionPane;

    
public class tela extends javax.swing.JFrame {
    
    String cadastro[][] = new String[10][3];
    int i = 0, x = 0;
    
    String erros = "Por favor, preencha todos os campos.";
    
    public tela() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(298,540);
       
        
    }

  public void imprimirCad(){
      
            // Monta a mensagem a ser exibida
            String mensagem = String.format(
                    "Nome: %s \n" +
                    "Cidade: %s \n" +
                    "Estado: %s " +
                    "\n"                    
                    ,campoNome.getText(), campoCidade.getText(),campoEstado.getText());
            
            // Exibe os dados em uma caixa de diálogo
            JOptionPane.showMessageDialog(this, mensagem,"Dados do Cadastrado.\n",  JOptionPane.INFORMATION_MESSAGE);
    }
      public void mensagem_erro(String msg){
         JOptionPane.showMessageDialog(this, msg, "ALERTA!" , JOptionPane.ERROR_MESSAGE);
            erros = "Por favor, preencha todos os campos:";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoCidade = new javax.swing.JTextField();
        campoEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        imprimir = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("____________________");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("____________________");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));

        campoNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 110, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("____________________");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, 20));

        campoCidade.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        campoCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(campoCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, 30));

        campoEstado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        campoEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(campoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 110, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\João Guilherme\\Downloads\\WhatsApp Image 2024-09-27 at 09.42.06.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 520));

        imprimir.setText("IMPRIMIR");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        getContentPane().add(imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 90, 30));

        salvar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });
        getContentPane().add(salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 90, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCidadeActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
            String nome = campoNome.getText();
            String cidade = campoCidade.getText();
            String estado = campoEstado.getText();
       
            
    if( nome.isEmpty() || cidade.isEmpty() || estado.isEmpty()){
        
            
        if(nome.isEmpty()){ 
            erros = erros.concat("\n - Nome do Aluno.");
        }
        if(cidade.isEmpty()){ 
            erros = erros.concat("\n - Cidade.");
        }
        if (estado.isEmpty()){
            erros = erros.concat("\n - Estado.");
        }
                     
    }
    if (!(nome.isEmpty()) && !(cidade.isEmpty()) && !(estado.isEmpty())){
        JOptionPane.showMessageDialog(null, " O CADASTRO FOI CONCUÍDO COM SUCESSO.", "CONCLUIDO" , JOptionPane.INFORMATION_MESSAGE);
            cadastro[i][x] = campoNome.getText();
            x++;
            cadastro[i][x] = campoCidade.getText();
            x++;
            cadastro[i][x] = campoEstado.getText();
            x = 0;
            i++;
            campoNome.setText(null);
            campoCidade.setText(null);
            campoEstado.setText(null);
    }
    else {
        mensagem_erro(erros);
    }
    
       
    }//GEN-LAST:event_salvarActionPerformed

    private void campoEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEstadoActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
            String nome = campoNome.getText();
            String cidade = campoCidade.getText();
            String estado = campoEstado.getText();
            
    if (!(nome.isEmpty()) && !(cidade.isEmpty()) && !(estado.isEmpty())){
        imprimirCad();
    }
    else {
        mensagem_erro(erros);
        }    
    String todos_cadastros = "";
        for (int a = 0; a < i; a++) {
           todos_cadastros += "Nome: " + cadastro[a][0] + "\nCidade: " + cadastro[a][1] + "\nEstado: " + cadastro[a][2] + "\n\n";
        }
        JOptionPane.showMessageDialog(null, todos_cadastros);           
    
    }//GEN-LAST:event_imprimirActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCidade;
    private javax.swing.JTextField campoEstado;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
