package Controller;

import DAO.DAOBD;
import Model.ProcessoAdministrativo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class PAController {
        DAOBD dao = new DAOBD();
        
        
        
    
    public int QtNoBD() throws SQLException{
        int size = 0;
        ResultSet rs;
        rs = dao.consultarProcessoAdministrativo();
                        
                        while(rs.next()){
                            size++;
                        }

        return size;
    }
    
    public ProcessoAdministrativo ConsultaPorID(int id) throws SQLException{
        ResultSet rs;
        ProcessoAdministrativo consultado = new ProcessoAdministrativo();
        rs = dao.consultarProcessoAdministrativo();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNumber = rsmd.getColumnCount();
        
                        while(rs.next()){
                            int i = 1;
                            String columnValue = rs.getString(1);
                            int comparar = Integer.parseInt(columnValue);                                
                                    if(comparar == id){
                                        String data = rs.getString(2);
                                        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
                                        //Date da = (Date) formatter.parse("2018-09-09 09:05:00");
                                        consultado.setData(data);
                                        consultado.setNumero(rs.getString(3));
                                        consultado.setCriador(rs.getString(4));
                                        consultado.setObjeto(rs.getString(5));
                                        consultado.setStatus(rs.getString(6));
                                        consultado.setObservacao(rs.getString(7));
                                    }
                            }
            return consultado;
}




}
