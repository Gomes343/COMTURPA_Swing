/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Control.DAOPC;
import Control.PCController;
import Model.ProcessoCompras;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;
import javax.swing.text.BadLocationException;


/**
 *
 * @author Oscar
 */
public class ComprasView extends javax.swing.JFrame {
        boolean clicked = false;
        DAOPC dao;
        PCController pcc;
        ProcessoCompras[] pc;
        int total;
       
    
    public ComprasView() throws IOException, SQLException {
        dao = new DAOPC();
        pcc = new PCController();
        total = pcc.QtNoBD();        
        pc = new ProcessoCompras[200];
 
        
        initComponents();
        
        
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
   @Override
   protected Void doInBackground() throws Exception {
    // Simulate doing something useful.
       
                        for(int i = 1; i <= total; i++)
                                pc[i-1] = pcc.ConsultaPorID(i);
                        
                        for(int i = 0; i < total ; i++)
                            TextArea.append(pc[i].getNumero()+"\n");
       
       while(true){
                int verificar = pcc.QtNoBD();
                    if(total == verificar){
                    }else{
                        total = verificar;
                        TextArea.setText("");
                        for(int i = 1; i <= total; i++)
                                pc[i-1] = pcc.ConsultaPorID(i);
                        
                        for(int i = 0; i < total ; i++)
                            TextArea.append(pc[i].getNumero()+"\n");
                    }    
            Thread.sleep(500);
       }}
  };
  worker.execute();
  
  
        
        
        
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
        ButtonCriar = new javax.swing.JButton();
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
        ButtonLimparSelecao = new javax.swing.JButton();
        Aviso = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FieldValor = new javax.swing.JTextField();
        FieldStatus2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FieldStatus3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        TextArea.setRows(5);
        TextArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAreaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TextArea);

        ButtonCriar.setText("CRIAR");
        ButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCriar(evt);
            }
        });

        jLabel1.setText("Data da Criação");

        FieldNumero.setToolTipText("");
        FieldNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldNumeroFocusLost(evt);
            }
        });

        jLabel2.setText("Número");

        jLabel3.setText("nº do Contrato");

        jLabel4.setText("Objeto");

        jLabel5.setText("Interessado");

        FieldObs.setColumns(20);
        FieldObs.setRows(5);
        jScrollPane2.setViewportView(FieldObs);

        jLabel6.setText("Observações:");

        ButtonLimparSelecao.setText("LIMPAR SELEÇÃO");
        ButtonLimparSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparSelecao(evt);
            }
        });

        Aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviso.setText(" ");

        jButton2.setText("VOLTAR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PROCESSO DE COMPRAS");

        jLabel8.setText("Valor");

        FieldValor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldValorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FieldValorFocusLost(evt);
            }
        });

        jLabel9.setText("Prazo");

        jLabel10.setText("Situação");

        ButtonAlterar.setText("ALTERAR");
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarButtonCriar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonLimparSelecao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonCriar))
                            .addComponent(Aviso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FieldStatus3)
                                    .addComponent(FieldStatus2)
                                    .addComponent(FieldValor)
                                    .addComponent(FieldStatus, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldNumero)
                                    .addComponent(FieldCriador)
                                    .addComponent(FieldData)
                                    .addComponent(FieldObjeto, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldCriador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(Aviso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCriar)
                            .addComponent(ButtonLimparSelecao)
                            .addComponent(ButtonAlterar))
                        .addContainerGap())
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLimparSelecao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparSelecao
                      FieldNumero.setText("");              
                      FieldData.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldValor.setText("");
                      FieldStatus2.setText("");
                      FieldStatus3.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
                      clicked = false;
                      Aviso.setText("");
    }//GEN-LAST:event_ButtonLimparSelecao

    private void LimparSelecao(){
                      FieldData.setText("");
                      FieldNumero.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
                      clicked = false;
                      Aviso.setText("");
    }
    
    private void LimparSelecaoExcetoData(){
                      FieldNumero.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
    }
   
    private void FieldLock(){
        FieldNumero.setEditable(false);
        FieldData.setEditable(false);
        FieldCriador.setEditable(false);
        FieldObjeto.setEditable(false);
        FieldStatus.setEditable(false);
        FieldValor.setEditable(false);
        FieldStatus2.setEditable(false);
        FieldStatus3.setEditable(false);
        FieldObs.setEditable(false);
    }
    
    private void FieldUnlock(){
        FieldNumero.setEditable(true);
        FieldData.setEditable(true);
        FieldCriador.setEditable(true);
        FieldObjeto.setEditable(true);
        FieldStatus.setEditable(true);
        FieldValor.setEditable(true);
        FieldStatus2.setEditable(true);
        FieldStatus3.setEditable(true);
        FieldObs.setEditable(true);    
    }
    
    private void TextAreaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextAreaMouseClicked
        
        boolean Encontrou = false;
        int line;
        try {
           
            line = TextArea.getLineOfOffset( TextArea.getCaretPosition() );
            int start = TextArea.getLineStartOffset( line );
            int end = TextArea.getLineEndOffset( line );
            String text = TextArea.getDocument().getText(start, end - start);
            
                  
                for(int i = 0; i < total ; i++){
                    if(text.startsWith(pc[i].getNumero())){
                      FieldNumero.setText(pc[i].getNumero());
                      FieldData.setText(pc[i].getData());
                      FieldCriador.setText(pc[i].getNumerocontrato());
                      FieldObjeto.setText(pc[i].getObjeto());
                      FieldStatus.setText(pc[i].getInteressado());
                      FieldValor.setText(pc[i].getValor());
                      FieldStatus2.setText(pc[i].getPrazo());
                      FieldStatus3.setText(pc[i].getSituacao());
                      FieldObs.setText(pc[i].getObs());
                      Encontrou = true;
                      clicked = true;
                      FieldLock();
                    }
                }
                
                if(Encontrou == false){
                      FieldNumero.setText("");
                      FieldData.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldValor.setText("");
                      FieldStatus2.setText("");
                      FieldStatus3.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
                }
                
        
        } catch (BadLocationException ex) {
            Logger.getLogger(ComprasView.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        
    }//GEN-LAST:event_TextAreaMouseClicked

    private void SetDataAtual(){
        
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
            int ano = calendar.get(Calendar.YEAR);
            int mes = calendar.get(Calendar.MONTH); // O mês vai de 0 a 11.
            mes++;
            String m = String.valueOf(mes);
            int semana = calendar.get(Calendar.WEEK_OF_MONTH);
            int dia = calendar.get(Calendar.DAY_OF_MONTH);
            int hora = calendar.get(Calendar.HOUR_OF_DAY);
            int minuto = calendar.get(Calendar.MINUTE);
            int segundo = calendar.get(Calendar.SECOND);
            String dataf = (ano+"-"+mes+"-"+dia+" "+hora+":"+minuto+":"+segundo);
            
            FieldData.setText(dataf);
            
    }
    
    private void ButtonCriar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCriar

        if(clicked == true){
            Aviso.setText("Limpe a Seleção antes de criar!");
        }else{
        SetDataAtual();
                
        if(FieldNumero.getText().isEmpty() || FieldData.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        
        if(FieldCriador.getText().isEmpty() || FieldObjeto.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        if(FieldStatus.getText().isEmpty() || FieldValor.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        if(FieldStatus2.getText().isEmpty() || FieldStatus3.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        }else{
            ProcessoCompras criar = new ProcessoCompras();
            criar.setNumero(FieldNumero.getText());
            criar.setData(FieldData.getText());
            criar.setNumerocontrato(FieldCriador.getText());
            criar.setObjeto(FieldObjeto.getText());
            criar.setInteressado(FieldStatus.getText());
            criar.setValor(FieldValor.getText());
            criar.setPrazo(FieldStatus2.getText());
            criar.setSituacao(FieldStatus3.getText());
            DAOPC dao = new DAOPC();
            if(dao.inserir(criar)){
                Aviso.setText("Inserido com Sucesso!"); 
                LimparSelecao();
            }else
                Aviso.setText("Ocorreu erro no banco de dados");
            
        }
        
        }

    }//GEN-LAST:event_ButtonCriar

    private void FieldNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldNumeroFocusLost
        String a = "";
        a = FieldNumero.getText();  
        if(!a.endsWith("/2019")){
            a = a.concat("/2019");
            FieldNumero.setText(a);
        }
    }//GEN-LAST:event_FieldNumeroFocusLost

   
    
    
    private void ButtonAlterarButtonCriar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarButtonCriar

    }//GEN-LAST:event_ButtonAlterarButtonCriar

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

    private void FieldValorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldValorFocusGained
        if(FieldValor.getText().isEmpty()){
            
        }else
            FieldValor.selectAll();
        
        
        
    }//GEN-LAST:event_FieldValorFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, SQLException {
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
            java.util.logging.Logger.getLogger(ComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComprasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
           
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ComprasView().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ComprasView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ComprasView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel Aviso;
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonCriar;
    private javax.swing.JButton ButtonLimparSelecao;
    private javax.swing.JTextField FieldCriador;
    private javax.swing.JTextField FieldData;
    private javax.swing.JTextField FieldNumero;
    private javax.swing.JTextField FieldObjeto;
    private javax.swing.JTextArea FieldObs;
    private javax.swing.JTextField FieldStatus;
    private javax.swing.JTextField FieldStatus2;
    private javax.swing.JTextField FieldStatus3;
    private javax.swing.JTextField FieldValor;
    public static javax.swing.JTextArea TextArea;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
