package View;

import Control.DAOPC;
import Model.ProcessoCompras;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlterarComprasView extends javax.swing.JFrame {
    public static ProcessoCompras pc;
    public static ComprasView cv;
    public static DAOPC dao;
    
    public static boolean CcheckNumero = false;
    public static boolean CcheckData = false;
    public static boolean CcheckNumeroContrato = false;
    public static boolean CcheckObjeto = false;
    public static boolean CcheckInteressado = false;
    public static boolean CcheckValor = false;
    public static boolean CcheckPrazo = false;
    public static boolean CcheckSituacao = false;
    
        public AlterarComprasView(ProcessoCompras pc,ComprasView cv) {
            initComponents();
            this.pc = pc;
            FieldNumero.setText(pc.getNumero());
            FieldNumero.setEditable(false);
            FieldData.setText(pc.getData());
            FieldData.setEditable(false);
            FieldNumeroContrato.setText(pc.getNumerocontrato());
            FieldNumeroContrato.setEditable(false);
            FieldObjeto.setText(pc.getObjeto());
            FieldObjeto.setEditable(false);
            FieldInteressado.setText(pc.getInteressado());
            FieldInteressado.setEditable(false);
            FieldValor.setText(pc.getValor());
            FieldValor.setEditable(false);
            FieldPrazo.setText(pc.getPrazo());
            FieldPrazo.setEditable(false);
            FieldSituacao.setText(pc.getSituacao());
            FieldSituacao.setEditable(false);
            this.cv = cv;
            dao = new DAOPC();
        }

    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FieldNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FieldNumeroContrato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldObjeto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldInteressado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldValor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FieldPrazo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FieldSituacao = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CheckNumero = new javax.swing.JCheckBox();
        CheckData = new javax.swing.JCheckBox();
        CheckNumeroContrato = new javax.swing.JCheckBox();
        CheckObjeto = new javax.swing.JCheckBox();
        CheckInteressado = new javax.swing.JCheckBox();
        CheckValor = new javax.swing.JCheckBox();
        CheckPrazo = new javax.swing.JCheckBox();
        CheckSituacao = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ButtonAlterar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FieldNumero.setToolTipText("");

        jLabel2.setText("Número");

        jLabel1.setText("Data da Criação");

        jLabel3.setText("nº do Contrato");

        jLabel4.setText("Objeto");

        jLabel5.setText("Interessado");

        FieldValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldValorFocusLost(evt);
            }
        });

        jLabel8.setText("Valor");

        jLabel9.setText("Prazo");

        jLabel10.setText("Situação");

        CheckNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNumeroActionPerformed(evt);
            }
        });

        CheckData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDataActionPerformed(evt);
            }
        });

        CheckNumeroContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNumeroContratoActionPerformed(evt);
            }
        });

        CheckObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckObjetoActionPerformed(evt);
            }
        });

        CheckInteressado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckInteressadoActionPerformed(evt);
            }
        });

        CheckValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckValorActionPerformed(evt);
            }
        });

        CheckPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPrazoActionPerformed(evt);
            }
        });

        CheckSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSituacaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ALTERAR - PROCESSO COMPRAS");

        ButtonAlterar.setText("ALTERAR");
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });

        ButtonVoltar.setText("VOLTAR");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckNumero)
                            .addComponent(CheckData)
                            .addComponent(CheckNumeroContrato)
                            .addComponent(CheckObjeto)
                            .addComponent(CheckInteressado)
                            .addComponent(CheckValor)
                            .addComponent(CheckPrazo)
                            .addComponent(CheckSituacao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldObjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(FieldNumeroContrato, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FieldData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldSituacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(FieldPrazo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(FieldValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(FieldInteressado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                            .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAlterar)
                        .addGap(36, 36, 36)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CheckNumero)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addComponent(CheckData))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FieldNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(CheckNumeroContrato))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(CheckObjeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldInteressado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(CheckInteressado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(CheckValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(CheckPrazo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(CheckSituacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAlterar)
                    .addComponent(ButtonVoltar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldValorFocusGained
        if(FieldValor.getText().isEmpty()){

        }else
        FieldValor.selectAll();

    }//GEN-LAST:event_FieldValorFocusGained

    private void FieldValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldValorFocusLost
        // TODO add your handling code here:
        String a = "";
        a = FieldValor.getText();

        if(a.contains(",")){
            a = a.replace(",", ".");
        }

        if(FieldValor.getText().contains("R$")){

        }else{
            Double b = Double.parseDouble(a);
            BigDecimal v = BigDecimal.valueOf(b);

            NumberFormat nf = NumberFormat.getCurrencyInstance();

            String formatado = nf.format(v);

            FieldValor.setText(formatado);

        }

    }//GEN-LAST:event_FieldValorFocusLost

    
    
    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
        
        
        if(CcheckNumero == true){
            dao.atualizarNumero(FieldNumero.getText(), pc.getNumero());
            pc.setNumero(FieldNumero.getText());
        }    
        
        if(CcheckData == true)
            dao.atualizarData(FieldData.getText(), pc.getNumero());
        
        if(CcheckNumeroContrato == true)
            dao.atualizarNumeroContrato(FieldNumeroContrato.getText(), pc.getNumero());
        
        if(CcheckObjeto == true)
            dao.atualizarObjeto(FieldObjeto.getText(), pc.getNumero());
                
        if(CcheckInteressado == true)
            dao.atualizarInteressado(FieldInteressado.getText(), pc.getNumero());
        
        if(CcheckValor == true)
            dao.atualizarValor(FieldValor.getText(), pc.getNumero());
        
        if(CcheckPrazo == true)
            dao.atualizarPrazo(FieldPrazo.getText(), pc.getNumero());

        if(CcheckSituacao == true)
            dao.atualizarSituacao(FieldSituacao.getText(), pc.getNumero());
        
        
       this.setVisible(false);
        cv.setEnabled(true);
        cv.toFront();
        try {
            cv.AtualizarInfo();
        } catch (SQLException ex) {
            Logger.getLogger(AlterarComprasView.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        
        this.setVisible(false);
        cv.setEnabled(true);
        cv.toFront();
        try {
            cv.AtualizarInfo();
        } catch (SQLException ex) {
            Logger.getLogger(AlterarComprasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void CheckNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNumeroActionPerformed
        FieldNumero.setEditable(true);
        CcheckNumero = true;
    }//GEN-LAST:event_CheckNumeroActionPerformed

    private void CheckDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDataActionPerformed
        FieldData.setEditable(true);
        CcheckData = true;
    }//GEN-LAST:event_CheckDataActionPerformed

    private void CheckNumeroContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNumeroContratoActionPerformed
        FieldNumeroContrato.setEditable(true);
        CcheckNumeroContrato = true;
    }//GEN-LAST:event_CheckNumeroContratoActionPerformed

    private void CheckObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckObjetoActionPerformed
        FieldObjeto.setEditable(true);
        CcheckObjeto = true;
    }//GEN-LAST:event_CheckObjetoActionPerformed

    private void CheckInteressadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckInteressadoActionPerformed
        FieldInteressado.setEditable(true);
        CcheckInteressado = true;
    }//GEN-LAST:event_CheckInteressadoActionPerformed

    private void CheckValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckValorActionPerformed
        FieldValor.setEditable(true);
        CcheckValor = true;
    }//GEN-LAST:event_CheckValorActionPerformed

    private void CheckPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPrazoActionPerformed
        FieldPrazo.setEditable(true);
        CcheckPrazo = true;
    }//GEN-LAST:event_CheckPrazoActionPerformed

    private void CheckSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSituacaoActionPerformed
        FieldSituacao.setEditable(true);
        CcheckSituacao = true;
    }//GEN-LAST:event_CheckSituacaoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AlterarComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarComprasView(pc,cv).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JCheckBox CheckData;
    private javax.swing.JCheckBox CheckInteressado;
    private javax.swing.JCheckBox CheckNumero;
    private javax.swing.JCheckBox CheckNumeroContrato;
    private javax.swing.JCheckBox CheckObjeto;
    private javax.swing.JCheckBox CheckPrazo;
    private javax.swing.JCheckBox CheckSituacao;
    private javax.swing.JCheckBox CheckValor;
    private javax.swing.JTextField FieldData;
    private javax.swing.JTextField FieldInteressado;
    private javax.swing.JTextField FieldNumero;
    private javax.swing.JTextField FieldNumeroContrato;
    private javax.swing.JTextField FieldObjeto;
    private javax.swing.JTextField FieldPrazo;
    private javax.swing.JTextField FieldSituacao;
    private javax.swing.JTextField FieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
