/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author RKM
 */
public class DBConnection {
    
    
    public  Connection ConnectDB(){
    Connection con =null;
       try{
          
      Class.forName("com.mysql.jdbc.Driver");  //loading the driver
               
          
            //Establishing a Connection                               / /URL //Port No://DB Name//UID//Password
          con = DriverManager.getConnection("jdbc:mysql://localhost:3308/compo", "root", "");
        
        
        } catch (Exception e) {
            
             JOptionPane.showMessageDialog(null, e);
           
        }
    return con;
        
    }
}
