/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romildo A. Lima jr.
 */
public class FuncionarioDao {
    
    private DataSource dataSource;
    
    public FuncionarioDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public void salvarFuncionario(String nome, String cpf, String funcao, double salario){
        
        String sql = ("INSERT INTO funcionario (nome, cpf, funcao, salario) VALUES (?,?,?,?)");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, cpf);
            pstm.setString(3, funcao);
            pstm.setDouble(4, salario);
            
            int rs = pstm.executeUpdate();
            
            if (rs > 0){
                System.out.println("Funcionário Cadastrado com Sucesso!...0");
                JOptionPane.showMessageDialog(null, "Funcionário Cadastrado com Sucesso!...");
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao Cadastrar...");
                System.out.println("Funcionário não Cadastrado!...");
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro ao cadastrar no banco!..."+ex);
        }
        finally{
            dataSource.closeDataSource();
        }
    }
    public boolean excluirFuncionario(String cpf){
        
        boolean excluir = false;
        
        String sql = ("DELETE FROM funcionario WHERE cpf=?;");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, cpf);
            
            int rs = pstm.executeUpdate();
            
            if (rs!=0){
                excluir = true;
                pstm.close();
                System.out.println("Funcionário Excluído com Sucesso!...");
            }else{
                excluir = false;
                pstm.close();
                System.out.println("Funcionário não excluído!...");
            }
        } catch (SQLException ex) {
            System.err.println("Impossível excluir!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        
        return excluir;
    }
    public boolean alterarFuncionario(String cpf, String nome, String funcao, double salario){
        
        boolean alterar = false;
        
        String sql = ("UPDATE funcionario SET nome=?,funcao=?,salario=? WHERE cpf=?");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, funcao);
            pstm.setDouble(3, salario);
            pstm.setString(4, cpf);
            
            int rs = pstm.executeUpdate();
            
            if(rs > 0){
                alterar = true;
                pstm.close();
                System.out.println("Alterado com Sucesso!...");
            }else{
                alterar = false;
                pstm.close();
                System.out.println("Nada Alterado!...");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        
        return alterar; 
    }
    public void listarfuncionarios(){
        List<String> dados = new ArrayList();
        
        String sql = ("SELECT * FROM funcionario");
        
        int coluna = 1;
        
        ResultSet rs;
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                dados.add(rs.getString(1)+"; "+rs.getString(2)+"; "+rs.getString(3)+"; "
                        +rs.getString(4)+"; "+rs.getString(5)+";");
            }
        } catch (SQLException ex) {
            System.err.println("Erro Geral!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        for (String str : dados){
            System.out.println(str);
        }
    }
    public void buscarFuncionario(String cpf){
        List<String> busca = new ArrayList();
        
        String sql = ("SELECT * FROM funcionario WHERE cpf=?;");
        
        int coluna = 1;
        
        ResultSet rs;
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, cpf);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                busca.add(rs.getString(1)+"; "+rs.getString(2)+"; "+rs.getString(3)+"; "
                        +rs.getString(4)+"; "+rs.getString(5)+";");
            }
        } catch (SQLException ex) {
            System.err.println("Erro na busca!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        for (String str : busca){
            System.out.println(str);
        }        
    }
}
