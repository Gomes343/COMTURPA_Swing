package Model;

import java.util.Date;

public class ProcessoAdministrativo {
    
    private Date data;
    private String numero;
    private String criador;
    private String objeto;
    private String status;
    private String observacao;

    public ProcessoAdministrativo(Date data, String numero, String criador, String objeto, String status, String observacao) {
        this.data = data;
        this.numero = numero;
        this.criador = criador;
        this.objeto = objeto;
        this.status = status;
        this.observacao = observacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
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
