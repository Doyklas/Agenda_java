/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CT Desenvolvimento
 */
public class ModuloConexao {
     //Método responsavel por estabelacer a conexão com o Banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        // A linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        
        // Armazenando informação referente ao BAnco
        String url = "jdbc:mysql://localhost:3307/agenda";
        
        String user = "root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            return null;
        }
    }
}
