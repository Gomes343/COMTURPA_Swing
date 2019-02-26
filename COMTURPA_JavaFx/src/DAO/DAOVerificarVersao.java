package DAO;

import Conexão.Conexao;
import java.sql.ResultSet;

public class DAOVerificarVersao {

    private Conexao conexao;

    public DAOVerificarVersao(){
        conexao = new Conexao();
        conexao.configurar();
    }
  
     public ResultSet consultarVersão(){
        
        String sql = "SET foreign_key_checks = 0";
        
        conexao.conectar();
        
        sql = "SELECT * FROM `Versionamento` where NomePrograma = 'COMTURPA'";
        
        conexao.conectar();

        ResultSet st = conexao.pegarResultadoSQL(sql);
        
        return st;  
        
        
    }
   
    
}