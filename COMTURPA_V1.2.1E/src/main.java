
import View.InicioView;
import View.PAView;
import java.io.IOException;
import java.sql.SQLException;

public class main {
    public static void main(String[]args) throws IOException, SQLException{
        System.out.println("RAMIFICAÇÃO COMTURPA_V1.2.1");
        
        
        try{
        InicioView iv = new InicioView();
        iv.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
