package Control;

import Conexão.Conexao;
import Model.ProcessoAdministrativo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOBD {

    private Conexao conexao;
    
    
    public DAOBD(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    
    public ResultSet consultarProcessoCompras(){
        
        String sql = "SET foreign_key_checks = 0";
        
        conexao.conectar();
        
        sql = "SELECT * FROM `ProcessoCompras`";
        
        conexao.conectar();

        ResultSet st = conexao.pegarResultadoSQL(sql);
        
        return st;  
        
        
    }
    
    
    public ResultSet consultarProcessoAdministrativo(){
        
        String sql = "SET foreign_key_checks = 0";
        
        conexao.conectar();
        
        sql = "SELECT * FROM `ProcessoAdministrativo`";
        
        conexao.conectar();

        ResultSet st = conexao.pegarResultadoSQL(sql);
        
        return st;  
            
    }


}