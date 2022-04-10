/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import java.beans.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBCONNECTION {

    static Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
       
        
        
    public static Connection ConnectDb(){
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
conn=DriverManager.getConnection("jdbc:ucanaccess://SignupDetails.accdb"); 
return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
   
    
}
