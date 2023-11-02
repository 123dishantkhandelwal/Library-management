/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;
import java.awt.event.*;
import java.awt.*;
import javax.swing.* ;
import java.sql.*;
/**
 *
 * @author user
 */
public class IssueBook extends JFrame implements ActionListener {
    
    String x[]={"Id","Book ID","BookNo","BookName","StudentId","StudentName","StudentContact","Date"};
    //JButton b1;
    String y[][]=new String[20][7];
    int i=0,j=0;
    JTable t;
    Font f,f1; 
    
    IssueBook(){
        
      super("Issue Book Information");
        
      setLocation(1,1);
      setSize(1000,400);
      
      f=new Font("Arial", Font.BOLD, 15);
      
//      try{
//         ConnectionClass obj=new ConnectionClass();
//        String q="Select * from Library1";
//        ResultSet rs=obj.stmt.executeQuery(q);
//        while(rs.next())
//      {
//          y[i][j++]=rs.getString("Lid");
//          y[i][j++]=rs.getString("Name");
//          y[i][j++]=rs.getString("Email");
//          y[i][j++]=rs.getString("Contact");
//          y[i][j++]=rs.getString("Address");
//          
//          i++;
//          j=0;
//      }
//        t=new JTable(y,x);
//        t.setFont(f);
//      }
//      catch(Exception e)
//      {
//          
//      }
//      JScrollPane sp=new JScrollPane(t);
//      add(sp);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String args[]) throws RuntimeException
    {
        new IssueBook().setVisible(true);
    }
    
}
