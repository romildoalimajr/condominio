/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class InquilinoBean {
    private int codigo;
    private String nome;
    private String documento;
    private String salaAndar;
    private String dataInicio;
    private String dataFinal;
    private int diaPag;
    private double valor;
    
    public InquilinoBean(){
        
    }
    public InquilinoBean(int codigo, String nome, String documento, String salaAndar,
            String dataInicio, String dataFinal, int diaPag, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.documento = documento;
        this.salaAndar = salaAndar;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.diaPag = diaPag;
        this.valor = valor;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDocumento(String documento){
        this.documento = documento;
    }
    public String getDocumento(){
        return documento;
    }
    public void setSalaAndar(String salaAndar){
        this.salaAndar = salaAndar;
    }
    public String getSalaAndar(){
        return salaAndar;
    }
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    public String getDataInicio(){
        return dataInicio;
    }
    public void setDataFinal(String dataFinal){
        this.dataFinal = dataFinal;
    }
    public String getDataFinal(){
        return dataFinal;
    }
    public void setDiaPag(int diaPag){
        this.diaPag = diaPag;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
}
