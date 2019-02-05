
import View.PrincipalView;
import java.io.IOException;
import java.sql.SQLException;


public class main {
    public static void main(String[]args) throws IOException, SQLException{
        try{
        PrincipalView pv = new PrincipalView();
        pv.setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        
        
    }
}
