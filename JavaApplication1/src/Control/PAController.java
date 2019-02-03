package Control;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PAController {
        DAOBD dao = new DAOBD();
        
        
        
    
    public int QtNoBD() throws SQLException{
        int size = 0;
        ResultSet rs;
        rs = dao.consultar();
        
                        ResultSetMetaData rsmd = rs.getMetaData();
                        int columnsNumber = rsmd.getColumnCount();
                        
                        
                        while(rs.next()){
                            size++;
                        }
                        
        
        
        
        
        return size;
    }
}
