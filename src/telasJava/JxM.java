/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telasJava;

import java.util.Random;

/**
 *
 * @author ADM
 */
public class JxM extends javax.swing.JFrame {
    int numero, menorN, maiorN, P1, P2;
    String resultado;
    boolean acertou;
    public JxM() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtJogador1 = new javax.swing.JTextField();
        btnConfirmar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAResultado = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPontos1 = new javax.swing.JLabel();
        lblPontos2 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTIniciar.setText("Iniciar");
        BTIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTIniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Jogardor 1");

        txtJogador1.setEnabled(false);

        btnConfirmar1.setBackground(new java.awt.Color(0, 204, 204));
        btnConfirmar1.setText("Jogar");
        btnConfirmar1.setEnabled(false);
        btnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar1ActionPerformed(evt);
            }
        });

        TAResultado.setColumns(20);
        TAResultado.setRows(5);
        TAResultado.setEnabled(false);
        jScrollPane1.setViewportView(TAResultado);

        jLabel2.setText("Maquina");

        jLabel3.setText("Pontos:");

        jLabel4.setText("Jogardor 1");

        jLabel5.setText("Maquina");

        lblPontos1.setBackground(new java.awt.Color(0, 255, 255));
        lblPontos1.setText("0");

        lblPontos2.setBackground(new java.awt.Color(255, 0, 0));
        lblPontos2.setText("0");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConfirmar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtJogador1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(lblPontos1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPontos2)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnVoltar)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVoltar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BTIniciar)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJogador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmar1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPontos1)
                                    .addComponent(lblPontos2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTIniciarActionPerformed
        Random randomico = new Random();
        numero = randomico.nextInt(21);
        acertou = false;
        menorN = 0;
        maiorN = 21;
        txtJogador1.setEnabled(true);
        btnConfirmar1.setEnabled(true);
        BTIniciar.setEnabled(false);
        resultado = "";
        TAResultado.setText("");
        lblPontos1.setText(""+menorN);
        lblPontos2.setText(""+maiorN);
        
    }//GEN-LAST:event_BTIniciarActionPerformed

    private void btnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar1ActionPerformed
        int resposta = Integer.parseInt(txtJogador1.getText());
        if(resposta == numero){
            resultado += "Acertou o numero: "+numero+"\n";
            acertou = true;
            P1++;
            btnConfirmar1.setEnabled(false);
            txtJogador1.setEnabled(false);
            BTIniciar.setEnabled(true);
            lblPontos1.setText(""+ P1);
            txtJogador1.setText("");
            
        }else if(resposta > numero){
            resultado += "Numero menor que : "+resposta+"\n";
            if(resposta < maiorN){
                maiorN = resposta;
            }
        }else{
            resultado += "Numero maior que : "+resposta+"\n";
            if(resposta > menorN){
                menorN = resposta;
            }
        }
        
        if(acertou == false){
            btnConfirmar1.setEnabled(false);
            txtJogador1.setEnabled(false);
            txtJogador1.setText("");
            lblPontos1.setText(""+menorN);
            lblPontos2.setText(""+maiorN);
            TAResultado.setText(resultado);
            ComputadorJoga();
        }
        
        
    }//GEN-LAST:event_btnConfirmar1ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial volta = new TelaInicial();
        volta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
    
    
    
    
    
    public void ComputadorJoga(){
        Random randomico = new Random();
        int resposta;
        do{
            resposta = randomico.nextInt(maiorN - menorN + 1) + menorN;
        }while(resposta <= menorN && resposta >= maiorN);
        
        if(resposta == numero){
            resultado += "Acertou o número: "+numero+"\n";
            acertou = true;
            P2++;
            btnConfirmar1.setEnabled(false);
            txtJogador1.setEnabled(false);
            BTIniciar.setEnabled(true);
            lblPontos2.setText(""+ P2);
            
        }else if(resposta > numero){
            resultado += "Numero menor que : "+resposta+"\n";
            if(resposta < maiorN){
                maiorN = resposta;
            }
        }else{
            resultado += "Numero maior que : "+resposta+"\n";
            if(resposta > menorN){
                menorN = resposta;
            }
        }
        TAResultado.setText(resultado);
        lblPontos1.setText(""+menorN);
        lblPontos2.setText(""+maiorN);
        txtJogador1.setEnabled(true);
        btnConfirmar1.setEnabled(true);
        txtJogador1.requestFocus();
    }
 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JxM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTIniciar;
    private javax.swing.JTextArea TAResultado;
    private javax.swing.JButton btnConfirmar1;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPontos1;
    private javax.swing.JLabel lblPontos2;
    private javax.swing.JTextField txtJogador1;
    // End of variables declaration//GEN-END:variables
}
