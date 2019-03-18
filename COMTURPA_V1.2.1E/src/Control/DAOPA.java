package Control;

import Conexão.Conexao;
import Model.ProcessoAdministrativo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPA {

    private Conexao conexao;
    
    public ProcessoAdministrativo pa;
    
    public DAOPA(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(ProcessoAdministrativo pa){
        
        //criar a SQL com variaveis
        String sql = "insert into ProcessoAdministrativo(Data,Numero,Criador,Objeto,Status,Observacao)"
                   + "values('"+ pa.getData() +"','"+pa.getNumero()+"','"+pa.getCriador()+"','"+pa.getObjeto()+"','"+pa.getStatus()+"','"+pa.getObservacao()+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   
    public boolean atualizarData(String data, String numero){
        //criar a SQL com variaveis
    String sql = "UPDATE ProcessoAdministrativo SET Data = '"+data+"' where Numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   

    public boolean atualizarNumero(String numeronovo, String numerovelho){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoAdministrativo SET Numero = '"+numeronovo+"' where Numero = '"+numerovelho+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   

    public boolean atualizarCriador(String criador, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoAdministrativo SET Criador = '"+criador+"' where Numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   

    public boolean atualizarObjeto(String objeto, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoAdministrativo SET Objeto = '"+objeto+"' where Numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   

    public boolean atualizarStatus(String status, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoAdministrativo SET Status = '"+status+"' where Numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   

    public boolean atualizarObservacao(String obs, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoAdministrativo SET Observacao = '"+obs+"' where Numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
   
    
}