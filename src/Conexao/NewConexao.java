
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class NewConexao {
  private static final String USER = "sa";
  private static final String PASS = "12345678";
  //private static String urlcon ="jdbc:sqlserver://localhost\\ACER:1433;databaseName=TotemJava";  //COMPUTADOR FABIO 
  private static String urlcon ="jdbc:sqlserver://localhost\\DEV:1433;databaseName=TotemJava";  //VM CIJUN Prefeitura
    
    
    public static Connection getConnection() {
        try {
         
            return DriverManager.getConnection(urlcon, USER, PASS);
            
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    
    }

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                
                con.close();
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(NewConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(NewConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

    

