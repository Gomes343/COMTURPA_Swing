package Control;

import Model.ProcessoAdministrativo;
import Model.ProcessoCompras;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PCController {
        DAOBD dao = new DAOBD();
        
    
    public int QtNoBD() throws SQLException{
        int size = 0;
        ResultSet rs;
        rs = dao.consultarProcessoCompras();
                        
                        while(rs.next()){
                            size++;
                        }

        return size;
    }
    
    public ProcessoCompras ConsultaPorID(int id) throws SQLException{
        ResultSet rs;
        ProcessoCompras consultado = new ProcessoCompras();
        rs = dao.consultarProcessoCompras();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        
                        while(rs.next()){
                            int i = 1;
                            String columnValue = rs.getString(1);
                            int comparar = Integer.parseInt(columnValue);                                
                                    if(comparar == id){
                                        consultado.setNumero(rs.getString(2));
                                        String data = rs.getString(3);
                                        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
                                        //Date da = (Date) formatter.parse("2018-09-09 09:05:00");
                                        consultado.setData(data);
                                        consultado.setNumerocontrato(rs.getString(4));
                                        consultado.setObjeto(rs.getString(5));
                                        consultado.setInteressado(rs.getString(6));
                                        consultado.setValor(rs.getString(7));
                                        consultado.setPrazo(rs.getString(8));
                                        consultado.setSituacao(rs.getString(9));
                                                
                                    }
                            }
            return consultado;
}




}
