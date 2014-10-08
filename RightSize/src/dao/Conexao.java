/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author daniel.s.oliveira
 */
public class Conexao {

    public static Connection getConexao() {
        try {
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            
            String serverName = "localhost";
            String port = "1521";
            String mydatabase = "xe";    
            String url = "jdbc:oracle:thin:@" + serverName + ":" + port + ":" + mydatabase;
            String username = "gustavo";           
            String password = "gustavo";        
            Connection connection = DriverManager.getConnection(url, username, password);
            
            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
