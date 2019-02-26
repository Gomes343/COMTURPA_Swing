package DAO;

import Conexão.Conexao;
import java.sql.ResultSet;


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