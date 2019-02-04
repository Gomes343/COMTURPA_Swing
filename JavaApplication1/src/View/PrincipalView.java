/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DAOPA;
import Control.PAController;
import Model.ProcessoAdministrativo;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;


/**
 *
 * @author Oscar
 */
public class PrincipalView extends javax.swing.JFrame {

    
        DAOPA dao;
        PAController pac;
        ProcessoAdministrativo[] pa;
        int total;
                
    
    public PrincipalView() throws IOException, SQLException {
        dao = new DAOPA();
        pac = new PAController();
        total = pac.QtNoBD();        
        pa = new ProcessoAdministrativo[200];
        
        for(int i = 1; i <= total; i++)
            pa[i-1] = pac.ConsultaPorID(i);
        
        
        initComponents();
        
        for(int i = 0; i < total ; i++)
            TextArea.append(pa[i].getNumero()+"\n");
         
        
    TextArea.setEditable(false);
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        FieldData = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        FieldNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FieldCriador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FieldObjeto = new javax.swing.JTextField();
        FieldStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FieldObs = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        LimparSelecao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TextArea);

        jButton1.setText("CRIAR");

        jLabel1.setText("Data da Criação");

        FieldNumero.setToolTipText("");

        jLabel2.setText("Número");

        jLabel3.setText("Criado por");

        jLabel4.setText("Objeto");

        jLabel5.setText("Status");

        FieldObs.setColumns(20);
        FieldObs.setRows(5);
        jScrollPane2.setViewportView(FieldObs);

        jLabel6.setText("Observações:");

        LimparSelecao.setText("LIMPAR SELEÇÃO");
        LimparSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparSelecaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LimparSelecao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldData)
                            .addComponent(FieldNumero)
                            .addComponent(FieldCriador)
                            .addComponent(FieldObjeto)
                            .addComponent(FieldStatus))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldCriador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(LimparSelecao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparSelecaoActionPerformed
                      FieldData.setText("");
                      FieldNumero.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
    }//GEN-LAST:event_LimparSelecaoActionPerformed

    private void FieldLock(){
        FieldData.setEditable(false);
        FieldNumero.setEditable(false);
        FieldCriador.setEditable(false);
        FieldObjeto.setEditable(false);
        FieldStatus.setEditable(false);
        FieldObs.setEditable(false);
    }
    
    private void FieldUnlock(){
        FieldData.setEditable(true);
        FieldNumero.setEditable(true);
        FieldCriador.setEditable(true);
        FieldObjeto.setEditable(true);
        FieldStatus.setEditable(true);
        FieldObs.setEditable(true);        
    }
    
    private void TextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseClicked
        boolean finded = false;
        int line;
        try {
           
            line = TextArea.getLineOfOffset( TextArea.getCaretPosition() );
            int start = TextArea.getLineStartOffset( line );
            int end = TextArea.getLineEndOffset( line );
            String text = TextArea.getDocument().getText(start, end - start);
            
                  
                for(int i = 0; i < total ; i++){
                    if(text.startsWith(pa[i].getNumero())){
                      FieldData.setText(pa[i].getData());
                      FieldNumero.setText(pa[i].getNumero());
                      FieldCriador.setText(pa[i].getCriador());
                      FieldObjeto.setText(pa[i].getObjeto());
                      FieldStatus.setText(pa[i].getStatus());
                      FieldObs.setText(pa[i].getObservacao());
                      finded = true;
                      FieldLock();
                    }
                }
                
                if(finded == false){
                      FieldData.setText("");
                      FieldNumero.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
                }
                
        
        } catch (BadLocationException ex) {
            Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }//GEN-LAST:event_TextAreaMouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PrincipalView().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldCriador;
    private javax.swing.JTextField FieldData;
    private javax.swing.JTextField FieldNumero;
    private javax.swing.JTextField FieldObjeto;
    private javax.swing.JTextArea FieldObs;
    private javax.swing.JTextField FieldStatus;
    private javax.swing.JButton LimparSelecao;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
