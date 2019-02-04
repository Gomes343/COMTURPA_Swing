
import Control.PAController;
import Control.ThreadBD;
import Model.ProcessoAdministrativo;
import java.io.IOException;
import java.sql.SQLException;

public class Inicializador {
    
    
    public static void main(String[]args) throws IOException, SQLException{
        
        ProcessoAdministrativo pa = new ProcessoAdministrativo();
        PAController pac = new PAController();
        
        pa = pac.ConsultaPorID(1);
        
        pa.toString();
        
        
        
        System.out.println("oiii");
        
        
        
    }
        
}
