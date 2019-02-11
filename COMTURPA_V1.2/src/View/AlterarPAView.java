package View;

import Control.DAOPA;
import Model.ProcessoAdministrativo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AlterarPAView extends javax.swing.JFrame {
    public static ProcessoAdministrativo pa;
    public static PAView paview;
    public static DAOPA dao;
    
    public static boolean CcheckData = false;
    public static boolean CcheckNumero = false;
    public static boolean CcheckCriador = false;
    public static boolean CcheckObjeto = false;
    public static boolean CcheckStatus = false;
    public static boolean CcheckObs = false;

    
        public AlterarPAView(ProcessoAdministrativo pa,PAView paview) {
            initComponents();
            this.pa = pa;
            FieldNumero.setText(pa.getData());
            FieldNumero.setEditable(false);
            FieldData.setText(pa.getNumero());
            FieldData.setEditable(false);
            FieldCriador.setText(pa.getCriador());
            FieldCriador.setEditable(false);
            FieldObjeto.setText(pa.getObjeto());
            FieldObjeto.setEditable(false);
            FieldStatus.setText(pa.getStatus());
            FieldStatus.setEditable(false);
            FieldObservacao.setText(pa.getObservacao());
            FieldObservacao.setEditable(false);

            this.paview = paview;
            dao = new DAOPA();
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FieldData = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FieldCriador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FieldObjeto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FieldStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FieldObservacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CheckData = new javax.swing.JCheckBox();
        CheckNumero = new javax.swing.JCheckBox();
        CheckCriador = new javax.swing.JCheckBox();
        CheckObjeto = new javax.swing.JCheckBox();
        CheckStatus = new javax.swing.JCheckBox();
        CheckObs = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        ButtonAlterar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FieldData.setToolTipText("");

        jLabel2.setText("Data");

        jLabel1.setText("Numero");

        jLabel3.setText("Criador");

        jLabel4.setText("Objeto");

        jLabel5.setText("Status");

        jLabel8.setText("Obs");

        CheckData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckDataActionPerformed(evt);
            }
        });

        CheckNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNumeroActionPerformed(evt);
            }
        });

        CheckCriador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckCriadorActionPerformed(evt);
            }
        });

        CheckObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckObjetoActionPerformed(evt);
            }
        });

        CheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckStatusActionPerformed(evt);
            }
        });

        CheckObs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckObsActionPerformed(evt);
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
                            .addComponent(CheckData)
                            .addComponent(CheckNumero)
                            .addComponent(CheckCriador)
                            .addComponent(CheckObjeto)
                            .addComponent(CheckStatus)
                            .addComponent(CheckObs))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldObjeto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(FieldCriador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(FieldNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldObservacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(FieldStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                            .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonAlterar)
                        .addGap(32, 32, 32)))
                .addContainerGap(50, Short.MAX_VALUE))
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
                                            .addComponent(CheckData)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addComponent(CheckNumero))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FieldCriador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(CheckCriador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FieldObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(CheckObjeto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(CheckStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FieldObservacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(CheckObs))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonAlterar)
                    .addComponent(ButtonVoltar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
        
        
        if(CcheckNumero == true){
            dao.atualizarNumero(FieldNumero.getText(), pa.getNumero());
            pa.setNumero(FieldNumero.getText());
        }    
        
        if(CcheckData == true)
            dao.atualizarData(FieldData.getText(), pa.getNumero());
        
        if(CcheckCriador == true)
            dao.atualizarCriador(FieldCriador.getText(), pa.getNumero());
        
        if(CcheckObjeto == true)
            dao.atualizarObjeto(FieldObjeto.getText(), pa.getNumero());
                
        if(CcheckStatus == true)
            dao.atualizarStatus(FieldStatus.getText(), pa.getNumero());
        
        if(CcheckObs == true)
            dao.atualizarObservacao(FieldObservacao.getText(), pa.getNumero());
        
       this.setVisible(false);
        paview.setEnabled(true);
        paview.toFront();
        
        try {
            paview.AtualizarInfo();
        } catch (SQLException ex) {
            Logger.getLogger(AlterarPAView.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        
        this.setVisible(false);

        paview.toFront();
        paview.setEnabled(true);
        
        try {
            paview.AtualizarInfo();
        } catch (SQLException ex) {
            Logger.getLogger(AlterarPAView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void CheckDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckDataActionPerformed
        FieldData.setEditable(true);
        CcheckNumero = true;
    }//GEN-LAST:event_CheckDataActionPerformed

    private void CheckNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNumeroActionPerformed
        FieldNumero.setEditable(true);
        CcheckData = true;
    }//GEN-LAST:event_CheckNumeroActionPerformed

    private void CheckCriadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckCriadorActionPerformed
        FieldCriador.setEditable(true);
        CcheckCriador = true;
    }//GEN-LAST:event_CheckCriadorActionPerformed

    private void CheckObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckObjetoActionPerformed
        FieldObjeto.setEditable(true);
        CcheckObjeto = true;
    }//GEN-LAST:event_CheckObjetoActionPerformed

    private void CheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckStatusActionPerformed
        FieldStatus.setEditable(true);
        CcheckStatus = true;
    }//GEN-LAST:event_CheckStatusActionPerformed

    private void CheckObsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckObsActionPerformed
        FieldObservacao.setEditable(true);
        CcheckObs = true;
    }//GEN-LAST:event_CheckObsActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarPAView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarPAView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarPAView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarPAView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarPAView(pa,paview).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JCheckBox CheckCriador;
    private javax.swing.JCheckBox CheckData;
    private javax.swing.JCheckBox CheckNumero;
    private javax.swing.JCheckBox CheckObjeto;
    private javax.swing.JCheckBox CheckObs;
    private javax.swing.JCheckBox CheckStatus;
    private javax.swing.JTextField FieldCriador;
    private javax.swing.JTextField FieldData;
    private javax.swing.JTextField FieldNumero;
    private javax.swing.JTextField FieldObjeto;
    private javax.swing.JTextField FieldObservacao;
    private javax.swing.JTextField FieldStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
