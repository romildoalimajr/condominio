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

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class UsuarioDao {
    
    private DataSource dataSource;
    
    public UsuarioDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public void salvarUsuario(String nome, String cpf, String login, String senha){
        
        String sql = ("INSERT INTO usuario (nome, cpf, login, senha)"
                + "VALUES (?,?,?,?);");
        
        PreparedStatement pstm;
        try {
            pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, cpf);
            pstm.setString(3, login);
            pstm.setString(4, senha);
            
            int rs = pstm.executeUpdate();
            
            if (rs > 0){
                System.out.println("Usuário Cadastrado com Sucesso!...");
            }else{
                System.out.println("Usuário não Cadastrado!...");
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao Cadastrar no Banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
    }
    public boolean logarUsuario(String login, String senha){
        
        boolean logar = false;
        
        String sql = ("SELECT * FROM usuario WHERE login=? AND senha=?");
        
        PreparedStatement pstm;
        
        try {
            pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, login);
            pstm.setString(2, senha);
            
            ResultSet rs;
            
            rs = pstm.executeQuery();
            
            if(rs.next()){
                logar = true;
                pstm.close();
                System.out.println("Usuário Logado com Sucesso!...");
            }else{
               logar = false;
               pstm.close();
               System.out.println("Login e/ou Senha Inválido!...");
            }
            
        } catch (SQLException ex) {
            System.err.println("Erro ao Logar Usuário no Banco!...");
        }
        finally{
            dataSource.closeDataSource();
        }
     return logar;   
    }
    public boolean excluirUsuario(String login){
        boolean excluir = false;
        
        String sql = ("DELETE FROM usuario WHERE login=?;");
        
        PreparedStatement pstm;
        
        try {
            pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1,login);
            
            int rs = pstm.executeUpdate();
            
            if(rs!=0){
                excluir = true;
                pstm.close();
                System.out.println("Usuário Excluído com Sucesso!...");
            }else{
                excluir = false;
                pstm.close();
                System.out.println("Usuário não Excluído!...");
            }
        } catch (SQLException ex) {
            System.err.println("Não foi possível excluir do banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
    return excluir;
    }
    public boolean alterarUsuario(String login, String senha, String cpf, String nome){
        boolean alterar = false;
        
        String sql = ("UPDATE usuario SET login=?, senha=?, cpf=? WHERE nome=?;");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, login);
            pstm.setString(2, senha);
            pstm.setString(3, cpf);
            pstm.setString(4, nome);
            
            int rs = pstm.executeUpdate();
            
            if (rs > 0){
                alterar = true;
                pstm.close();
                System.out.println("Dados Alterados!...");
            }else{
                alterar = false;
                pstm.close();
                System.out.println("Nada foi Alterado!...");
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao Alterar no Banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        return alterar;
    }
    public void listarUsuario(){
        List<String> dados = new ArrayList();
        
        String sql = ("SELECT * FROM usuario");
        
        int coluna = 1;
        
        ResultSet rs; 
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                dados.add(rs.getString(1)+"; "+rs.getString(2)+"; "+rs.getString(3)+"; "
                        +rs.getString(4)+"; "+rs.getString(5)+";");
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao puxar do banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        
        for (String str : dados){
            System.out.println(str);
        }
    }
    public void buscarUsuario(String cpf){
        List<String> dados = new ArrayList();
        
        String sql = ("SELECT * FROM usuario WHERE cpf=?");
        
        int coluna = 1;
        
        ResultSet rs; 
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, cpf);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                dados.add(rs.getString(1)+"; "+rs.getString(2)+"; "+rs.getString(3)+"; "
                        +rs.getString(4)+"; "+rs.getString(5)+";");
                
            }
        } catch (SQLException ex) {
            System.err.println("Erro ao puxar do banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        
        for (String str : dados){
            System.out.println(str);
        }
    }
}
