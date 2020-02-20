/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import conexao.DataSource;
import dao.UsuarioDao;

/**
 *
 * @author Romildo A. Lima jr.
 */
public class TesteUsuario {
    
    public static void main(String args[]){
        
        DataSource dataSource = new DataSource();
        
        UsuarioDao novo = new UsuarioDao(dataSource);
        
        //novo.salvarUsuario("Sheila Maria","123.456.789-10","sheila","maria");
        
       // novo.logarUsuario("sheila", "sheila");
        
        //novo.excluirUsuario("sheila");
        
        //novo.alterarUsuario("sheila", "sheila", "789.456.123-99", "Sheila Maria");
        
        //novo.listarUsuario();
        novo.buscarUsuario("756.493.734-34");
    }
}
