/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;
import java.awt.event.*;
import java.awt.*;
import java.sql.SQLException;
import javax.swing.* ;
/**
 *
 * @author user
 */
public class AddLibrarian extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton b1,b2;
    JPanel p1,p2;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField pw1;
    Font f1,f2;
    
    AddLibrarian()
    {
        super("Add Librarian");
        setLocation(450,400);
        setSize(650,400);
        
        f1=new Font("Arial",Font.BOLD,25);
        f2=new Font("Arial",Font.BOLD,20);
        
        l1=new JLabel("Add Librarian");
        l2=new JLabel("Name");
        l3=new JLabel("Password");
        l4=new JLabel("Email");
        l5=new JLabel("Contact");
        l6=new JLabel("Address");
        l7=new JLabel("City");
        
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
       
        pw1=new JPasswordField();
        
        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        l7.setFont(f2);
        
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        
        pw1.setFont(f2);
        
        b1=new JButton("Add Librarian");
        b2=new JButton("Cancel");
        
        b1.setFont(f2);
        b2.setFont(f2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10));
        p1.add(l1);
        p1.setBackground(Color.BLUE);
        l1.setForeground(Color.WHITE);
        l1.setHorizontalAlignment(JLabel.CENTER);
                
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(7,2,10,10));
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(pw1);
        p2.add(l4);
        p2.add(t2);
        p2.add(l5);
        p2.add(t3);
        p2.add(l6);
        p2.add(t4);
        p2.add(l7);
        p2.add(t5);
        p2.add(b1);
        p2.add(b2);
        
        setLayout(new BorderLayout(10,10));
        add(p1,"North");
        add(p2,"Center");
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //int id=t6.getText();
        String name=t1.getText();
        String password=pw1.getText();
        String email=t2.getText();
        String contact=t3.getText();
        String add=t4.getText();
        String city=t5.getText();
        
        if(e.getSource()==b1)
        {
             try{
                 ConnectionClass obj=new ConnectionClass();
                 String id = null;
                 String q="insert into library1(Name,Password,Email,Contact,Address,City) values('"+password+"','"+email+"','"+id+"','"+contact+"','"+add+"','"+city+"')";
                 
                 
                 int aa=obj.stmt.executeUpdate(q);
                 if(aa==1)
                 {
                     JOptionPane.showMessageDialog(null, "your data successfully inserted");
                     this.setVisible(false);
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(null, "please! Fill all details carefully");
                 this.setVisible(true);
                 }
             }
             catch(HeadlessException | SQLException ee)
             {
                  ee.getStackTrace();
             }
        }
        if(e.getSource()==b2)
        {
            this.setVisible(false);
        }
    }

    /**
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String args[]) throws SQLException
    {
        new AddLibrarian().setVisible(true);
    }
}
