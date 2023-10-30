/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;
import java.sql.*;
import javax.swing.JOptionPane;

public class DB_Connector {
    
    public static Connection con;
    public static Statement st;
    
    static{
        try{
        con=DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/expense_database"+"?useSSL=false","root", "write your own password");
            st=con.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
