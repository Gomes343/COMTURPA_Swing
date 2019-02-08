package Conexão;

public class Conexao extends ConexaoAbstract {

    public Conexao() {

    }

    @Override
    public void configurar() {
        this.port = PORT_MYSQL;
        this.className= CLASSNAME_MYSQL;
        this.setConexao(MYSQL, "gtcon073_central", "br28.hostgator.com.br");
        this.setLogin("gtcon073_murilo", "gomes343");        
    }

}