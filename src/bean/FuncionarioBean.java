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
public class FuncionarioBean {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String funcao;
    private double salario;
    
    public FuncionarioBean(){
        
    }
    public FuncionarioBean(int codigo, String nome, String cpf, String funcao, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf= cpf;
        this.funcao = funcao;
        this.salario = salario;
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
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    public String getFuncao(){
        return funcao;
    }
    public void setSalario(double salariio){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}
