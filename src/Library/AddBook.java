/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class AddBook extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JButton b1,b2;
    JPanel p1,p2;
    JTextField t1,t2,t3,t4,t5;
    Font f1,f2; 
    
    AddBook()
    {
        super("Add Book");
        setLocation(300,400);
        setSize(550,400);
        
        f1=new Font("Arial",Font.BOLD,25);
        f2=new Font("Arial",Font.BOLD,20);
        
        l2=new JLabel("Book No");
        l3=new JLabel("Book Name");
        l4=new JLabel("Author");
        l5=new JLabel("Publisher");
        l6=new JLabel("Quantity");
       
        l1=new JLabel("Add Books");
        
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        t5=new JTextField();
        
        l1.setFont(f1);
        l2.setFont(f2);
        l3.setFont(f2);
        l4.setFont(f2);
        l5.setFont(f2);
        l6.setFont(f2);
        
        
        t1.setFont(f2);
        t2.setFont(f2);
        t3.setFont(f2);
        t4.setFont(f2);
        t5.setFont(f2);
        
        b1=new JButton("Add Book");
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
        p2.setLayout(new GridLayout(6,2,10,10));
        p2.add(l2);
        p2.add(t1);
        p2.add(l3);
        p2.add(t2);
        p2.add(l4);
        p2.add(t3);
        p2.add(l5);
        p2.add(t4);
        p2.add(l6);
        p2.add(t5);
        
        p2.add(b1);
        p2.add(b2);
        
        setLayout(new BorderLayout(10,10));
        add(p1,"North");
        add(p2,"Center");
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     String bookNo=t1.getText();
        String bookName=t2.getText();
        String author=t3.getText();
        String publisher=t4.getText();
        String quantity=t5.getText();
        
        
        if(e.getSource()==b1)
        {
     //        try{
       //          ConnectionClass obj=new ConnectionClass();
                 String id = null;
                 //String q="insert into library1(Name,Password,Email,Contact,Address,City) values('"+password+"','"+email+"','"+id+"','"+contact+"','"+add+"','"+city+"')";
                 
                 
                 //int aa=obj.stmt.executeUpdate(q);
//                 if(aa==1)
//                 {
//                     JOptionPane.showMessageDialog(null, "your data successfully inserted");
//                     this.setVisible(false);
//                 }
//                 else
//                 {
//                     JOptionPane.showMessageDialog(null, "please! Fill all details carefully");
//                 this.setVisible(true);
//                 }
//             }
//             catch(HeadlessException | SQLException ee)
//             {
//                  ee.getStackTrace();
//             }
        }
        if(e.getSource()==b2)
        {
            this.setVisible(false);
        }
    }   
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    public static void main(String[] args) {
        new AddBook().setVisible(true);
    }

    
}
