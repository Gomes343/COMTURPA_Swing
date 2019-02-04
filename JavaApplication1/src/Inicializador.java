
import Control.DAOPA;
import Control.PAController;
import Control.ThreadBD;
import Model.ProcessoAdministrativo;
import java.io.IOException;
import java.sql.SQLException;

public class Inicializador {
    
    
    public static void main(String[]args) throws IOException, SQLException{
        
        ProcessoAdministrativo pa = new ProcessoAdministrativo();
        
        pa.setData("2019-2-4 16:34:49");
        pa.setCriador("Gabriel Mariano Ballio");
        pa.setNumero("003/2019");
        pa.setObjeto("Alguma viadagem de comprar");
        pa.setStatus("concluido");
        pa.setObservacao("blablabla");
        
        DAOPA dao = new DAOPA();
        dao.inserir(pa);
        
        System.out.println("oiii");
        
        
        
    }
        
}
