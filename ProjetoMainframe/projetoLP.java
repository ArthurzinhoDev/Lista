
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class projetoLP extends javax.swing.JFrame {
    
    
    String erros = "Por favor, preencha todos os campos:";
    String nomeR = null;
    boolean campo_responsavel = false;
    int select_serie = 0;
    
    
    public projetoLP() {
        initComponents();
        Calendar c = Calendar.getInstance();
        //Data/Hora, Ano, Mês, Dia atual
        setTitle("CADASTRO");
        setSize(580, 345);
        setLocationRelativeTo(null);
        setResizable(false);
        
        NomeRespo.setVisible(false);
        textoR.setVisible(false);
    }
    public void mensagem_erro(String msg){
         JOptionPane.showMessageDialog(this, msg, "ALERTA!" , JOptionPane.ERROR_MESSAGE);
            erros = "Por favor, preencha todos os campos:";
    }
    public void mensagem_concluido(){
            JOptionPane.showMessageDialog(null, " O CADASTRO FOI CONCUÍDO COM SUCESSO.", "CONCLUIDO" , JOptionPane.INFORMATION_MESSAGE);
            
            String nome_responsavel = "";
            if(campo_responsavel){
                nome_responsavel = "Nome do Responsável: " + textoR.getText();
            }else{
                nome_responsavel = "";
            }
            // Monta a mensagem a ser exibida
            String mensagem = String.format(
                    "Nome do Aluno: %s \n" +
                    "Data de Nascimento: %s \n" +
                    "Curso: %s \n" +
                    "Serie: %dº ano" +
                    "\n%s"                    
                    ,nomeAluno.getText(), dataNas.getText(),nomeCurso.getText(),select_serie,nome_responsavel);
            
            // Exibe os dados em uma caixa de diálogo
            JOptionPane.showMessageDialog(this, mensagem, "Dados do Aluno", JOptionPane.INFORMATION_MESSAGE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        labelAluno = new javax.swing.JLabel();
        labelCURSO = new javax.swing.JLabel();
        labelDATA = new javax.swing.JLabel();
        nomeAluno = new javax.swing.JTextField();
        nomeCurso = new javax.swing.JTextField();
        botaoCad = new javax.swing.JButton();
        NomeRespo = new javax.swing.JLabel();
        textoR = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dataNas = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoCad1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        labelAluno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelAluno.setForeground(new java.awt.Color(255, 255, 255));
        labelAluno.setText("Nome do aluno:");
        getContentPane().add(labelAluno);
        labelAluno.setBounds(60, 80, 98, 20);

        labelCURSO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCURSO.setForeground(new java.awt.Color(255, 255, 255));
        labelCURSO.setText("Curso:");
        getContentPane().add(labelCURSO);
        labelCURSO.setBounds(120, 160, 40, 20);

        labelDATA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDATA.setForeground(new java.awt.Color(255, 255, 255));
        labelDATA.setText(" Data de nascimento:");
        getContentPane().add(labelDATA);
        labelDATA.setBounds(30, 120, 130, 20);

        nomeAluno.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nomeAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeAlunoActionPerformed(evt);
            }
        });
        nomeAluno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeAlunoKeyPressed(evt);
            }
        });
        getContentPane().add(nomeAluno);
        nomeAluno.setBounds(170, 80, 190, 20);

        nomeCurso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCursoActionPerformed(evt);
            }
        });
        nomeCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeCursoKeyPressed(evt);
            }
        });
        getContentPane().add(nomeCurso);
        nomeCurso.setBounds(170, 160, 130, 20);

        botaoCad.setBackground(new java.awt.Color(204, 204, 204));
        botaoCad.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        botaoCad.setText("CONCLUIR");
        botaoCad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        botaoCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCad);
        botaoCad.setBounds(440, 270, 100, 30);

        NomeRespo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NomeRespo.setForeground(new java.awt.Color(255, 255, 255));
        NomeRespo.setText("Nome do Responsável:");
        getContentPane().add(NomeRespo);
        NomeRespo.setBounds(20, 240, 140, 20);

        textoR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textoR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoRActionPerformed(evt);
            }
        });
        textoR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoRKeyPressed(evt);
            }
        });
        getContentPane().add(textoR);
        textoR.setBounds(170, 240, 190, 20);

        jLabel2.setFont(new java.awt.Font("Siemens Slab SC Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CADASTRO DO ALUNO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 20, 230, 30);

        dataNas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        try {
            dataNas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataNas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dataNas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataNasMouseClicked(evt);
            }
        });
        dataNas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNasActionPerformed(evt);
            }
        });
        dataNas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dataNasKeyPressed(evt);
            }
        });
        getContentPane().add(dataNas);
        dataNas.setBounds(170, 120, 70, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 10, 0, 50);

        jLabel3.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("IFAR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 10, 120, 20);

        botaoCad1.setBackground(new java.awt.Color(204, 204, 204));
        botaoCad1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        botaoCad1.setText("SAIR");
        botaoCad1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        botaoCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCad1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCad1);
        botaoCad1.setBounds(310, 270, 100, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\João Guilherme\\Documents\\ARTHUR\\logoProjeto.jpg")); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 67, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Série:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 190, 40, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("1º Ano");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(170, 190, 70, 20);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("2º Ano");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(170, 210, 70, 20);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("3º Ano");
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton3MouseClicked(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(240, 190, 90, 20);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("4º Ano");
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton4MouseClicked(evt);
            }
        });
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(240, 210, 80, 20);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\João Guilherme\\Documents\\ARTHUR\\front-end-ou-back-end-entenda-as-diferencas-e-descubra-o-seu-perfil.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 311);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCursoActionPerformed
 
    }//GEN-LAST:event_nomeCursoActionPerformed
    private void textoRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoRActionPerformed
        
        
    }//GEN-LAST:event_textoRActionPerformed
    @SuppressWarnings("empty-statement")
    private void botaoCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadActionPerformed
            
            String serie = null;
            String nomeA = nomeAluno.getText();
            String nomeDoR = textoR.getText();
            String NomeCurso = nomeCurso.getText();
            String datinha = dataNas.getText();
            int IDADE = formatarData.formatar(datinha);
            boolean conf_resp = false;       
            
                
            
            
            if(jRadioButton1.isSelected()){
                serie = jRadioButton1.getText();
            }
            
            if(jRadioButton2.isSelected()){
                serie = jRadioButton2.getText();
            }
            
            if(jRadioButton3.isSelected()){
                serie = jRadioButton3.getText(); 
            }
            if(jRadioButton4.isSelected()){
                serie = jRadioButton4.getText();
            }
            
            //AQUI ELE INVALIDA UM CAMPO VAZIO 
            
    if( nomeA.isEmpty() || NomeCurso.isEmpty() || nomeDoR.isEmpty() ||  (select_serie == 0)){
        
            
        if(nomeA.isEmpty()){ 
            erros = erros.concat("\n - Nome do Aluno.");
        }
        if(NomeCurso.isEmpty()){ 
            erros = erros.concat("\n - Curso.");
        }
        if (nomeDoR.isEmpty() && campo_responsavel){
            erros = erros.concat("\n - Nome do Responsavel.");
            conf_resp = true;
            
        }else{conf_resp = false;}
        if(select_serie == 0){
            erros = erros.concat("\n - Série.");
        }
                     
    }
    if (!(nomeA.isEmpty()) && !(NomeCurso.isEmpty()) && !conf_resp && select_serie != 0 ){
        mensagem_concluido();
    }
    else {
        mensagem_erro(erros);
    }
    }//GEN-LAST:event_botaoCadActionPerformed

    private void nomeAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeAlunoActionPerformed
          
    }//GEN-LAST:event_nomeAlunoActionPerformed

    private void dataNasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNasActionPerformed
        int IDADE = formatarData.formatar(dataNas.getText());
        
        
        if( IDADE < 18 ){
            NomeRespo.setVisible(true);
            textoR.setVisible(true);
            campo_responsavel = true;
            
            //CRITÉRIO SE ELE FOR VAZIO PARA FORÇA-LO A POR O CAMPO
            
        }else{
            campo_responsavel = false;
        }
    }//GEN-LAST:event_dataNasActionPerformed

    private void nomeAlunoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeAlunoKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           dataNas.requestFocus();
           }
    }//GEN-LAST:event_nomeAlunoKeyPressed

    private void dataNasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataNasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           nomeCurso.requestFocus();
       }
    }//GEN-LAST:event_dataNasKeyPressed

    private void nomeCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeCursoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           textoR.requestFocus();
       }
    }//GEN-LAST:event_nomeCursoKeyPressed

    private void textoRKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoRKeyPressed
        
          
    }//GEN-LAST:event_textoRKeyPressed

    private void botaoCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCad1ActionPerformed
            System.exit(0);
    }//GEN-LAST:event_botaoCad1ActionPerformed

    private void dataNasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataNasMouseClicked
        
    }//GEN-LAST:event_dataNasMouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
         
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
          
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MouseClicked
        
    }//GEN-LAST:event_jRadioButton3MouseClicked

    private void jRadioButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MouseClicked
         
    }//GEN-LAST:event_jRadioButton4MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        select_serie = 1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        select_serie = 2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        select_serie = 3;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        select_serie = 4;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    public static void main(String args[]) {
       
       
        java.awt.EventQueue.invokeLater(() -> {
            new projetoLP().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeRespo;
    private javax.swing.JButton botaoCad;
    private javax.swing.JButton botaoCad1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField dataNas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel labelAluno;
    private javax.swing.JLabel labelCURSO;
    private javax.swing.JLabel labelDATA;
    private javax.swing.JTextField nomeAluno;
    private javax.swing.JTextField nomeCurso;
    private javax.swing.JTextField textoR;
    // End of variables declaration//GEN-END:variables
}