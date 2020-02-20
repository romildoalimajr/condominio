/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import conexao.DataSource;
import dao.FuncionarioDao;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class TesteFuncionario {
    public static void main(String args[]){
        
        DataSource dataSource = new DataSource();
        
        FuncionarioDao novo = new FuncionarioDao(dataSource);
        
        //novo.salvarFuncionario("Tetrano de Tal", "456.123.789-99", "Zelador", 998.50);
        novo.listarfuncionarios();
    }
}
