package FXMLController;

import Controller.PCController;
import DAO.DAOPC;
import Model.ProcessoCompras;
import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class ComprasController implements Initializable {

    @FXML
    private TextArea Area;

    @FXML
    private JFXButton BackButton;

    @FXML
    private JFXButton PrintButton;

    @FXML
    private TextField FieldNumero;

    @FXML
    private TextField FieldData;

    @FXML
    private TextField FieldNumeroContrato;

    @FXML
    private TextField FieldObjeto;

    @FXML
    private TextField FieldInteressado;

    @FXML
    private TextField FieldValor;

    @FXML
    private TextField FieldPrazo;

    @FXML
    private TextField FieldSituacao;

    @FXML
    private JFXButton LimparButton;

    @FXML
    private JFXButton AlterarButton;

    @FXML
    private JFXButton CriarButton;
    
        boolean clicked = false;
        DAOPC dao;
        PCController pcc;
        ProcessoCompras[] pc;
        int total;
    
        public ComprasController() throws SQLException{
                    dao = new DAOPC();
                    pcc = new PCController();
                    total = pcc.QtNoBD();        
                    pc = new ProcessoCompras[200];
 
            /*In a few words: The constructor is called first, then any 
            *@FXML annotated fields are populated, then initialize() is called. 
            *So the constructor does NOT have access to @FXML fields referring 
            *to components defined in the .fxml file, 
            *while initialize() does have access to them.
            */
        }

        
        
    @Override
    public void initialize(URL location, ResourceBundle resources) {


        Task<Void> exampleTask = new Task<Void>() { 
     @Override 
            protected Void call() throws Exception { 
                // Demais códigos... 
                
                
                        for(int i = 1; i <= total; i++)
                                try {
                                    pc[i-1] = pcc.ConsultaPorID(i);
                            } catch (SQLException ex) {
                                Logger.getLogger(ComprasController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        
                        for(int i = 0; i < total ; i++)
                            Area.appendText(pc[i].getNumero()+"\n");
       
       while(true){
                int verificar = 0;
                            try {
                                verificar = pcc.QtNoBD();
                            } catch (SQLException ex) {
                                Logger.getLogger(ComprasController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    if(total == verificar){
                    }else{
                        total = verificar;
                        Area.setText("");
                        for(int i = 1; i <= total; i++)
                                try {
                                    pc[i-1] = pcc.ConsultaPorID(i);
                            } catch (SQLException ex) {
                                Logger.getLogger(ComprasController.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        
                        for(int i = 0; i < total ; i++)
                            Area.appendText(pc[i].getNumero()+"\n");
                    }    
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(ComprasController.class.getName()).log(Level.SEVERE, null, ex);
                            }
       }
        
                
                
                
                
            } 
        }; 
        new Thread(exampleTask).start();
        
        
        
    }

        
    public void teste(){
        FieldNumero.setText("asdasdasas");
    }
}

