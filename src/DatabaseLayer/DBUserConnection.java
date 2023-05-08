/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Code.Registeration;
import java.sql.ResultSet;

/**
 *
 * @author RKM
 */
public class DBUserConnection {
    
     public void regCostomer(Registeration reg)
 {
     DBConnection con = new DBConnection();
     String sql = "INSERT INTO cr (IDNumber,Name,PhoneNumber,Email,Gender,Address)VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement prep = con.ConnectDB().prepareStatement(sql);

            prep.setString(1, reg.getIdnumber()); 
            prep.setString(2,reg.getName());
            prep.setInt(3, reg.getPhoneno());
            prep.setString(4, reg.getEmail());
            prep.setString(5, reg.getGender());
            prep.setString(6, reg.getAddress());
            

            int a = prep.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());

        }
      
      }
       public void AddStaff(Registeration reg){
       DBConnection con = new DBConnection();
        String sql = "INSERT INTO staff(IDNumber,Name,PhoneNumber,Email,Gender,Address,Position)" + "values(?,?,?,?,?,?,?)";
      try{PreparedStatement prep = con.ConnectDB().prepareStatement(sql);

            prep.setString(1, reg.getIdnumber()); 
            prep.setString(2,reg.getName());
            prep.setInt(3, reg.getPhoneno());
            prep.setString(4, reg.getEmail());
            prep.setString(5, reg.getGender());
            prep.setString(6, reg.getAddress());
            prep.setString(7, reg.getPosition());
            //prep.setBytes(6, );

            int a = prep.executeUpdate();
      }
      catch(SQLException ex){
      Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }
}

