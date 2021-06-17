/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdbms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */

// this class is responsible for database connection...

public class MySQLconnect {
    Connection con;
    public Connection getConn(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:XXXX/databasename?characterEncoding=latin1", "username", "password");
        
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error in JDBC  connection "+ e);
        }
    return con;    
    }
}
