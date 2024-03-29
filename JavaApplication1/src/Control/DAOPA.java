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
    /*
    public boolean atualizarData(int id, String data){
        //criar a SQL com variaveis
        String sql = "UPDATE Cidadao SET nome = '"+nome+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarNumero(int id, String numero){
        //criar a SQL com variaveis
        String sql = "UPDATE Cidadao SET cpf = '"+cpf+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarCriador(int id, String dono){
        //criar a SQL com variaveis
        String sql = "UPDATE Cidadao SET regiao = '"+regiao+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarObjeto(int id, String objeto){
        //criar a SQL com variaveis
        String sql = "UPDATE Cidadao SET nascimento = '"+nascimento+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean atualizarAssunto(int id, int assunto){
        //criar a SQL com variaveis
        String sql = "UPDATE Cidadao SET PaisID = '"+PaisID+"' where id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
        
    }
    
    public boolean apagar(int id){
        
        String sql = "SET foreign_key_checks = 0";
        
        conexao.conectar();
        
        sql = "DELETE FROM Cidadao WHERE id = "+id;
        
        //conectar com BD
        conexao.conectar();

        //enviar SQL para banco de dados
        boolean b = conexao.executarComandosSQL(sql);
        
        //retornar erro ou ok 
        return b;     
            
    }
*/

}