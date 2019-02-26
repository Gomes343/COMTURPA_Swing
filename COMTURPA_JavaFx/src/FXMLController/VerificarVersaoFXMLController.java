package FXMLController;

import DAO.DAOVerificarVersao;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXProgressBar;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Thread.sleep;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JFileChooser;

public class VerificarVersaoFXMLController implements Initializable {

    //Stage tt = (Stage) new Stage().getScene().getWindow();
    
    @FXML
    private Label LabelProgramaExecutado;

    @FXML
    private Label LabelVersaoPrograma;

    @FXML
    private JFXProgressBar ProgressBarr;

    @FXML
    private JFXButton ButtonNewVersion;

    @FXML
    public Label LabelNewVersion;

    @FXML
    private Label LabelSameVersion;

    private final String programa = "COMTURPA";
    private final String versao = "1.2.1";
    public boolean same;
    
    private String versaonova = "";
    private String linkdownload = "";
    @FXML
    private Button fechador;


    public VerificarVersaoFXMLController(){
        
    }
       @Override
    public void initialize(URL url, ResourceBundle rb) {
        fechador.setVisible(false);
        LabelProgramaExecutado.setText(programa);
        LabelVersaoPrograma.setText(versao);
        

        ButtonNewVersion.setVisible(false);
        LabelNewVersion.setVisible(false);
        LabelSameVersion.setVisible(false);
 
            DAOVerificarVersao dao = new DAOVerificarVersao();
            ResultSet rs = dao.consultarVersão();
            
            try{
            rs.last();

                if(rs.getString(2).equals(programa)){
                        if(rs.getString(3).equals(versao)){
                            same = true;
                            try {
                                AbrirPrograma();
                            } catch (IOException ex) {
                                Logger.getLogger(VerificarVersaoFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(VerificarVersaoFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                            }
            
                        }else{
                            linkdownload = rs.getString(4);
                            versaonova = rs.getString(3);
                            same = false;
                            NaoAbrirPrograma();
                        }
                }
            
            }catch(Exception e){
                System.out.println(e);
            }
            

       
    }
        
    public void NaoAbrirPrograma(){
                Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    sleep(4000);
                    ButtonNewVersion.setVisible(true);
                    LabelNewVersion.setVisible(true);
                    ProgressBarr.setVisible(false);
                    sleep(1000);
                      
                } catch (InterruptedException e) {
                    Logger.getLogger(VerificarVersaoFXMLController.class.getName()).log(Level.SEVERE, null, e);
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
            
                
                
                
            }
        });
        new Thread(sleeper).start();
        
    }
    
    
    
    
    public void AbrirPrograma() throws IOException, InterruptedException{
        
        
                Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    sleep(2000);
                    ProgressBarr.setVisible(false);
                    LabelSameVersion.setVisible(true);
                    System.out.println("ee  ");
                    sleep(2000);
                      
                } catch (InterruptedException e) {
                    Logger.getLogger(VerificarVersaoFXMLController.class.getName()).log(Level.SEVERE, null, e);
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
                /*
                 * Dentro disto é possível realizar alguns códigos como se estivesse no raiz
                 * Sendo que dentro de um "DoInBackground" é considerado algo fora do main atual
                 * Então oque eu fazia lá não funcionava, porém, dentro deste método é possível
                 * Aqui você pode chamar outra tela e fazer coisas mais raizes
                 *
                 */
                System.out.println("eee");
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("/FXMLView/ComprasFXML.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(VerificarVersaoFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }

                Stage stage = new Stage();
                Scene scene = new Scene(root, 531, 484);
                stage.setScene(scene);
                stage.show();    
                
                
                fechador.getScene().getWindow().hide();
            }
        });
        new Thread(sleeper).start();
        
    }

    
    
    
        @FXML
    void BaixarAction(ActionEvent event) throws IOException {
      
	
    HttpURLConnection url = null;
    InputStream inStream = null;
    FileOutputStream fileOutputStream = null;

    try {
        
        JFileChooser salvandoArquivo = new JFileChooser();
        salvandoArquivo.setSelectedFile(new File("C:\\COMTURPA "+versaonova+".exe"));
        salvandoArquivo.showSaveDialog(null);

	int resultado = salvandoArquivo.showSaveDialog(null);

        // conecta ao local host para realizar o download do arquivo
        url = (HttpURLConnection) new URL(linkdownload).openConnection(); 
        url.setDoInput(true); // configura a conexao para aceitar o recebimento de dados
        url.connect(); // efetiva a conexao ao localhost

        inStream = url.getInputStream();
        fileOutputStream  = new FileOutputStream(salvandoArquivo.getSelectedFile().getPath()); // abre um fluxo para gravar os dados no disco

        byte[] buffer = new byte[4096];
        int bytesLidos = 0;

        while ((bytesLidos = inStream.read(buffer, 0, buffer.length)) > 0) {
            fileOutputStream.write(buffer, 0, bytesLidos);
            fileOutputStream.flush();
        }

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        if (url != null)
            url.disconnect();
        if (inStream != null)
            inStream.close();
        if (fileOutputStream != null)
            fileOutputStream.close();
    }
        
    }


}
    


