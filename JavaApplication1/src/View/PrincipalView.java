/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.DAOPA;
import Control.PAController;
import Control.ThreadBD;
import Model.ProcessoAdministrativo;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.text.BadLocationException;


/**
 *
 * @author Oscar
 */
public class PrincipalView extends javax.swing.JFrame {
        boolean clicked = false;
        ThreadBD thread;
        DAOPA dao;
        PAController pac;
        ProcessoAdministrativo[] pa;
        int total;
       
    
    public PrincipalView() throws IOException, SQLException {
        dao = new DAOPA();
        pac = new PAController();
        total = pac.QtNoBD();        
        pa = new ProcessoAdministrativo[200];
        
        


        
        initComponents();
        
        
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
   @Override
   protected Void doInBackground() throws Exception {
    // Simulate doing something useful.
       
                        for(int i = 1; i <= total; i++)
                                pa[i-1] = pac.ConsultaPorID(i);
                        
                        for(int i = 0; i < total ; i++)
                            TextArea.append(pa[i].getNumero()+"\n");
       
       while(true){
                int verificar = pac.QtNoBD();
                    if(total == verificar){
                    }else{
                        total = verificar;
                        TextArea.setText("");
                        for(int i = 1; i <= total; i++)
                                pa[i-1] = pac.ConsultaPorID(i);
                        
                        for(int i = 0; i < total ; i++)
                            TextArea.append(pa[i].getNumero()+"\n");
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
        Aviso = new javax.swing.JLabel();

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

        jButton1.setText("CRIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
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
                LimparSelecao(evt);
            }
        });

        Aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Aviso.setText(" ");

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
                            .addComponent(jLabel5)))
                    .addComponent(Aviso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(12, 12, 12)
                .addComponent(Aviso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(LimparSelecao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparSelecao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparSelecao
                      FieldData.setText("");
                      FieldNumero.setText("");
                      FieldCriador.setText("");
                      FieldObjeto.setText("");
                      FieldStatus.setText("");
                      FieldObs.setText("");
                      FieldUnlock();
                      clicked = false;
                      Aviso.setText("");
    }//GEN-LAST:event_LimparSelecao

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
                      clicked = true;
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
        
        if(FieldCriador.getText().isEmpty() || FieldData.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        if(FieldObjeto.getText().isEmpty() || FieldData.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        if(FieldStatus.getText().isEmpty() || FieldData.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        if(FieldObs.getText().isEmpty() || FieldData.getText() == ""){
            Aviso.setText("Favor preencher todos os Campos!");
            LimparSelecaoExcetoData();
        }
        }else{
            ProcessoAdministrativo criar = new ProcessoAdministrativo();
            criar.setData(FieldData.getText());
            criar.setNumero(FieldNumero.getText());
            criar.setCriador(FieldCriador.getText());
            criar.setObjeto(FieldObjeto.getText());
            criar.setStatus(FieldStatus.getText());
            criar.setObservacao(FieldObs.getText());
            DAOPA dao = new DAOPA();
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
    private static javax.swing.JLabel Aviso;
    private javax.swing.JTextField FieldCriador;
    private javax.swing.JTextField FieldData;
    private javax.swing.JTextField FieldNumero;
    private javax.swing.JTextField FieldObjeto;
    private javax.swing.JTextArea FieldObs;
    private javax.swing.JTextField FieldStatus;
    private javax.swing.JButton LimparSelecao;
    public static javax.swing.JTextArea TextArea;
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
