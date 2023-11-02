/*
  Coding of Admin Login Page
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
public class Admin extends JFrame implements ActionListener {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField pw1;
    JButton b1,b2;
    JPanel p1,p2; 
    Font f1,f2; 
    
    Admin()
    {
        super("Admin Login Page");
        setLocation(550,350);
        setSize(500,200);
        
        f1=new Font("Arial",Font.BOLD,25);
        f2=new Font("Arial",Font.BOLD,20);
        
        l1=new JLabel("Admin Login");
        l2=new JLabel("Name");
        l3=new JLabel("Password");
        
        b1=new JButton("Login");
        b2=new JButton("Cancel");
        
        b1.addActionListener(this);
        b2.addActionListener(this);

        t1=new JTextField();
        pw1=new JPasswordField();
        
         l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        b1.setFont(f2);
        b2.setFont(f2);
        
        t1.setFont(f2);
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(Color.WHITE );
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        p1.setBackground(Color.BLUE);
        
         p2=new JPanel();
        p2.setLayout(new GridLayout(3,2,10,10));
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(pw1);
        p2.add(b1);
        p2.add(b2);
        
       setLayout(new BorderLayout(10,10));
       add(p1,"North");
       //add(p2,"West");
       add(p2,"Center");

    }
    @Override
     public void actionPerformed(ActionEvent e)
    {
        String name=t1.getText();
        String password=pw1.getText();
      if(e.getSource()==b1)
      {
          try{
                ConnectionClass obj=new ConnectionClass();    
                String s="select * from admin where username='"+name+"' and password='"+password+"'"; 
                ResultSet rs=obj.stmt.executeQuery(s);
                if(rs.next())
                {
                    System.out.print("Admin section");
                    new AdminSection().setVisible(true);
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "your name and password is wrong ");
                    this.setVisible(false);
                    this.setVisible(true); 
                }
          }
          catch(Exception ee)
          {
              ee.printStackTrace();
          }
      }
      if(e.getSource()==b2)
      {
         this.setVisible(false);
      }
    }
    public static void main(String args[]) throws NullPointerException
    {
        new Index().setVisible(true);
    }
}
