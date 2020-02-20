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
public class InquilinoDao {
    private DataSource dataSource;
    
    public InquilinoDao(DataSource dataSource){
        this.dataSource = dataSource;
    }
    public void salvarInquilino(String nome, String documento, String salaAndar, 
            String dataInicio, String dataFinal, int diaPag, double valor){
        
        String sql = ("INSERT INTO inquilino (nome, documento, salaAndar, dataInicio,"
                + "dataFinal, diaPag, valor) VALUES(?,?,?,?,?,?,?);");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, documento);
            pstm.setString(3, salaAndar);
            pstm.setString(4, dataInicio);
            pstm.setString(5, dataFinal);
            pstm.setInt(6, diaPag);
            pstm.setDouble(7, valor);
            
            int rs = pstm.executeUpdate();
            
            if (rs > 0){
                pstm.close();
                System.out.println("Inquilino Cadastrado com Sucesso!...");
            }else{
                pstm.close();
                System.out.println("Inquilino não Cadastrado!...");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no Banco!..."+ ex);
        }
        finally{
            dataSource.closeDataSource();
        }
    }
    public boolean excluirInquilino(String documento){
        boolean excluir = false;
        
        String sql = ("SELECT * FROM inquilino WHERE documento=?;");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, documento);
            
            int rs = pstm.executeUpdate();
            
            if (rs!=0){
                pstm.close();
                excluir = true;
                System.out.println("Inquilino Excluído!...");
            }else{
                pstm.close();
                excluir = false;
                System.out.println("Inquilino não encontrado!...");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no Banco!... "+ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        return excluir;
    }
    public boolean alterarInquilino(String documento, String nome, String salaAndar,
            String dataInicio, String dataFinal, int diaPag, double valor){
        boolean alterar = false;
        
        String sql = ("UPDATE inquilino SET nome=?, salaAndar=?, dataInicio=?, "
                + "dataFinal=?, diaPag=?, valor=? WHERE cpf=?");
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, nome);
            pstm.setString(2, salaAndar);
            pstm.setString(3, dataInicio);
            pstm.setString(4, dataFinal);
            pstm.setInt(5, diaPag);
            pstm.setDouble(6, valor);
            
            int rs = pstm.executeUpdate();
            
            if (rs > 0){
                pstm.close();
                alterar = true;
                System.out.println("Alterado com Sucesso!...");
            }else{
                pstm.close();
                alterar = false;
                System.out.println("Inquilino não Localizado!...");
            }
        } catch (SQLException ex) {
            System.err.println("Erro no banco!..."+ ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        return alterar;
    }
    public void listarInquilino(){
        List<String> lista = new ArrayList();
        String sql = ("SELECT * FROM inquilino;");
        int coluna = 1;
        
        ResultSet rs;
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()){
                lista.add(rs.getString(1)+"; "+rs.getString(2)+"; "+rs.getString(3)+"; "+
                        rs.getString(4)+"; "+rs.getString(5)+";"+rs.getString(6)+"; "+
                        rs.getString(7)+"; "+rs.getString(8));
            }
        } catch (SQLException ex) {
            System.err.println("Erro no banco!..." + ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        for (String str : lista){
            System.out.println(str);
        }
    }
    public void buscarInquilino(String documento){
        List<String> busca = new ArrayList();
        
        String sql = ("SELECT * FROM inquilino WHERE documento = ?;");
        
        int coluna = 1;
        
        ResultSet rs;
        
        try {
            PreparedStatement pstm = dataSource.getConnection().prepareStatement(sql);
            
            pstm.setString(1, documento);
            
            rs = pstm.executeQuery();
            
            while(rs.next()){
                busca.add(rs.getString(1)+"; "+rs.getString(2)+"; "+rs.getString(3)+"; "+
                        rs.getString(4)+"; "+rs.getString(5)+";"+rs.getString(6)+"; "+
                        rs.getString(7)+"; "+rs.getString(8));
            }
        } catch (SQLException ex) {
            System.err.println("Erro no banco!..."+ex);
        }
        finally{
            dataSource.closeDataSource();
        }
        for(String str : busca){
            System.out.println(str);
        }
    }
}
