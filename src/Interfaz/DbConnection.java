/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import java.sql.*;

/**
 *
 * @author leang
 */
public class DbConnection {
    Connection con = null;
    
    public static Connection ConnectionDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:RoyalTicket_db.db");
            System.out.println("Connection Succeeded");
            return con;
        }catch(Exception e){
            System.out.println("Connection Failed "+e);
            return null;
        }
    }
}
