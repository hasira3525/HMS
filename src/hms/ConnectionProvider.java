/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hasira Methnuka
 */
public class ConnectionProvider {
    public static Connection getCon(){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/plant?useSSL=false","root","");
        return con;
      }
      catch(Exception e){
       return null;}
    }
}
