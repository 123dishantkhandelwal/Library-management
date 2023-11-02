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
public class DeleteLibrarian extends JFrame implements ActionListener{
    String x[]={"Id","Name","Email","Contact","Address","City"};
    JButton b1;
    String y[][]=new String[20][7];
    int i=0,j=0;
    JTable t;
    Font f,f1;
    JTextField t1;
    JPanel p1;
    JLabel l1;
    
    DeleteLibrarian()
    {
        super("Delete Librerian");
        setLocation(1,1);
        setSize(1000,400);
        f=new Font("Arial",Font.BOLD,15);
         
        try{
         ConnectionClass obj=new ConnectionClass();
        String q="Select * from Library1";
        ResultSet rs=obj.stmt.executeQuery(q);
        while(rs.next())
      {
          y[i][j++]=rs.getString("Lid");
          y[i][j++]=rs.getString("Name");
          y[i][j++]=rs.getString("Email");
          y[i][j++]=rs.getString("Contact");
          y[i][j++]=rs.getString("Address");
          y[i][j++]=rs.getString("City");
          i++;
          j=0;
      }
        t=new JTable(y,x);
        t.setFont(f);
      }
      catch(Exception e)
      {
          
      }
      JScrollPane sp=new JScrollPane(t);
      
      l1=new JLabel("Details Librarian");
      t1=new JTextField();
      b1=new JButton("Delete");
      b1.addActionListener(this);
      l1.setFont(f);
      t1.setFont(f);
      b1.setFont(f);
      
      p1=new JPanel();
      p1.setLayout(new GridLayout(1,3,10,10));
      p1.add(l1);
      p1.add(t1);
      p1.add(b1);
      setLayout(new BorderLayout(10,10));
     // add(sp,"Center");
      
      add(p1,"South");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            int id=Integer.parseInt(t1.getText());
            try
            {
                ConnectionClass obj=new ConnectionClass();

                String q;
                q = "delete from library1 where Lid='"+id+"'";
                int res=obj.stmt.executeUpdate(q);
                if(res==1)
                {
                    JOptionPane.showMessageDialog(null,"your data Deleted Successful");
                    this.setVisible(false);
                    new DeleteLibrarian().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Your data did not successflly deleted");
                }   
            }
            catch(HeadlessException | SQLException ee)
            {
                ee.getStackTrace();
            }
        }
    }
    public static void main(String args[])
    {
        new DeleteLibrarian().setVisible(true);
    }
    
}
