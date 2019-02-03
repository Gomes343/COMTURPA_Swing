
package Control;

import Model.ProcessoAdministrativo;
import java.io.IOException;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadBD implements Runnable{

    DAOBD dao = new DAOBD();
    ResultSet rs;
    int a = 10;
    ProcessoAdministrativo[] pa = new ProcessoAdministrativo[a];
    
    
    
    public ThreadBD() throws IOException{
        
    }
   
    
    
    public void run(){

            String entry = null;

            while(true){

                    try {
                        
                        rs = dao.consultar();
                        ResultSetMetaData rsmd = rs.getMetaData();
                        int columnsNumber = rsmd.getColumnCount();
                        
                        
                        while(rs.next()){
                            for (int i = 1; i <= columnsNumber; i++) {
                                if (i > 1) System.out.print(",  ");
                                    String columnValue = rs.getString(i);
                                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                            }
                            System.out.print("\n");
                        }
                        
                        
                        
                        
                    }catch (Exception e){
                        System.out.println(e);
                    }
                }
            }
            
    }
   
      
    
    


