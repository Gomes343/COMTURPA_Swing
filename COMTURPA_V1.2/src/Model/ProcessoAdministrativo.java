package Model;

import java.util.Date;

public class ProcessoAdministrativo {
    
    private String data;
    private String numero;
    private String criador;
    private String objeto;
    private String status;
    private String observacao;

    public ProcessoAdministrativo(){
        
    }
    public ProcessoAdministrativo(String data, String numero, String criador, String objeto, String status, String observacao) {
        this.data = data;
        this.numero = numero;
        this.criador = criador;
        this.objeto = objeto;
        this.status = status;
        this.observacao = observacao;
    }

    @Override
    public String toString(){
        System.out.println("Processo Administrativo\n"
                + "Data = "+data+"\n"
                + "Numero = "+numero+"\n"
                + "Criador = "+criador+"\n"
                + "Objeto = "+objeto+"\n"
                + "Status = "+status+"\n"
                + "Observação = "+observacao+"\n");
        return null;
        
    };
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }



}
