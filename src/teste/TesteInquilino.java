/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import bean.InquilinoBean;
import conexao.DataSource;
import dao.InquilinoDao;

/**
 *
 * @author Romildo A. Lima Jr.
 */
public class TesteInquilino {
    
    public static void main(String args[]){
        
        DataSource dataSource = new DataSource();
        InquilinoBean novo = new InquilinoBean();
        InquilinoDao dao = new InquilinoDao(dataSource);
        
        //dao.salvarInquilino("Flora Luiza", "987.654.321-14", "705 / 7º", 
          //      "10/11/2019", "10/11/2020", 10, 780.00);
        /*dao.salvarInquilino("Leandro Passos de Almeida", "041.528.275-64", "310 / 3º", 
                "20/11/2019", "20/11/2020", 20, 680.75);*/
//        dao.salvarInquilino("Bloco da Liberdade", "01.786.145/0001-12", "603 / 6º", 
//                "01/12/2019", "01/12/2020", 01, 750.00);
//        dao.salvarInquilino("Frejat Barao Vermelho", "17.974.671/0001-17", "405 / 4º", 
//                "17/11/2019", "17/11/2020", 17, 1000.00);
        dao.listarInquilino();
    }
    
    
}
