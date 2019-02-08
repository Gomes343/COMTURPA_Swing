package Model;

import java.util.Date;

public class ProcessoCompras {
    
    private String numero;
    private String data;
    private String numerocontrato;
    private String objeto;
    private String interessado;
    private String valor;
    private String prazo;
    private String situacao;
    private String Obs;
    
    public ProcessoCompras() {
    }

    
    public ProcessoCompras(String numero, String data, String numerocontrato, String objeto, String interessado, String valor, String prazo, String situacao) {
        this.numero = numero;
        this.data = data;
        this.numerocontrato = numerocontrato;
        this.objeto = objeto;
        this.interessado = interessado;
        this.valor = valor;
        this.prazo = prazo;
        this.situacao = situacao;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String Obs) {
        this.Obs = Obs;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumerocontrato() {
        return numerocontrato;
    }

    public void setNumerocontrato(String numerocontrato) {
        this.numerocontrato = numerocontrato;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getInteressado() {
        return interessado;
    }

    public void setInteressado(String interessado) {
        this.interessado = interessado;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

   

}
