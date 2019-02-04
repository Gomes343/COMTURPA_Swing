
package Control;

import Model.ProcessoAdministrativo;
import java.awt.TextArea;import java.io.IOException;
import static java.lang.Thread.sleep;

import java.sql.SQLException;

import javax.swing.JTextArea;


public class ThreadBD implements Runnable{

        JTextArea ta;
        PAController pac = new PAController();
        int totalatual;        
        ProcessoAdministrativo[] pa;
                
        
    public ThreadBD(JTextArea TextArea) throws IOException, SQLException{
        this.pa = new ProcessoAdministrativo[200];
        this.totalatual = pac.QtNoBD();
        this.ta = TextArea;
        
    }
 
        @Override
    public void run(){

            String entry = null;

     

                    
                    try {
                        ta.setText("  ");
                        for(int i = 1; i <= totalatual; i++)
                            pa[i-1] = pac.ConsultaPorID(i);
                        
                        for(int i = 0; i < totalatual ; i++)
                            ta.append(pa[i].getNumero()+"\n");
         
    
                            sleep(2000);
                    }catch (Exception e){
                        System.out.println(e);
                    }

                
            }
            
    }
   
      
    
    


