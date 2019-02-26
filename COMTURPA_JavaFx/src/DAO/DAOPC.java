package DAO;

import Conexão.Conexao;
import Model.ProcessoAdministrativo;
import Model.ProcessoCompras;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOPC {

    private Conexao conexao;
    
    public ProcessoAdministrativo pa;
    
    public DAOPC(){
        conexao = new Conexao();
        conexao.configurar();
    }
    
    
    public boolean inserir(ProcessoCompras pc){
        
        //criar a SQL com variaveis
        String sql = "INSERT INTO ProcessoCompras(numero,data,numerocontrato,objeto,interessado,valor,prazo,situacao)"
                   + "values('"+ pc.getNumero() +"','"+pc.getData()+"','"+pc.getNumerocontrato()+"','"+pc.getObjeto()+"','"+pc.getInteressado()+"','"+pc.getValor()+"','"+pc.getPrazo()+"','"+pc.getSituacao()+"')";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    
    public boolean atualizarNumero(String numeronovo,String numeroantigo){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET numero = '"+numeronovo+"' where numero = '"+numeroantigo+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    
    public boolean atualizarData (String data, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET data = '"+data+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    
     
    public boolean atualizarNumeroContrato (String numerocontrato, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET numerocontrato = '"+numerocontrato+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
     
    public boolean atualizarObjeto (String objeto, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET objeto = '"+objeto+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    
     
    public boolean atualizarInteressado (String interessado, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET data = '"+interessado+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    
     
    public boolean atualizarValor (String valor, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET valor = '"+valor+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    
 
    public boolean atualizarPrazo (String prazo, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET prazo = '"+prazo+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    
     
    public boolean atualizarSituacao (String situacao, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE ProcessoCompras SET situacao = '"+situacao+"' where numero = '"+numero+"'";
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
        
    }
    
    

}