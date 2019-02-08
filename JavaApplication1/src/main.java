
import Control.DAOBD;
import Control.DAOPA;
import Control.PAController;
import Model.ProcessoAdministrativo;
import View.PrincipalView;
import static View.PrincipalView.TextArea;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;


public class main {
    public static void main(String[]args) throws IOException, SQLException{
        System.out.println("RAMIFICAÇÃO COMTURPA_V1.2");
        
        
        try{
        PrincipalView pv = new PrincipalView();
        pv.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
