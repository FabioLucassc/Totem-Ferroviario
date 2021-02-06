/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author fcolaco
 */
public class Conexao {
    
    private String hostname;
    private int    port;
    private String database;
    private String username;
    private String password;
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   // private String urlcon ="jdbc:sqlserver://localhost\\ACER:1433;databaseName=TotemJava";  //COMPUTADOR FABIO 
    private String urlcon ="jdbc:sqlserver://localhost\\DEV:1433;databaseName=TotemJava";  //VM CIJUN Prefeitura
    private Connection connection;
    
    public Conexao(){
        try{
            //jdbc:sqlserver://localhost\DEV:1433;databaseName=TotemJava (COMPUTADOR FABIO)
            hostname = "localhost\\DEV";
            port     = 1433;
            database = "TotemJava";
            username = "sa";
            password = "12345678";
            
          //  String url = "jdbc:sqlserver://"+hostname+":"+port+";databasename="+database;
           
            
            connection = DriverManager.getConnection(urlcon,username,password);
            Component parentComponent = null;
            
            JOptionPane.showMessageDialog(parentComponent, "TESTE: CONECTADO");
            
            
        }
        catch(SQLException ex){
            System.err.println("ERRO na Conexao "+ex.getMessage());
        }
        catch(Exception ex){
            System.err.println("Erro geral "+ex.getMessage());
        }
    }}
    
    
    