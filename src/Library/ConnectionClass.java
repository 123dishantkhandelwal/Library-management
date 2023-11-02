/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Library;
//import java.beans.Statement;
import java.sql.*;
/**
 *
 * @author user
 */
public class ConnectionClass {
   Connection con;
   Statement stmt;
   ResultSet rs;
    ConnectionClass()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system123");
            stmt=con.createStatement();
            rs=stmt.executeQuery("select * from LIBRARY1");
//            while(rs.next())
//            {
//               System.out.println(rs.getInt(1)+" "+rs.getString(2));
//            }
            //con.close();
            
            //stm.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        new ConnectionClass();
    }
    
}
