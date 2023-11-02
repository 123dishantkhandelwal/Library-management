/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author user
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.* ;
import java.sql.*;

public class LibrarianSection extends JFrame implements ActionListener {
    JLabel l1;
    JPanel p1,p2;
    Font f2,f1;
    JMenuBar mb1,mb2,mb3,mb4,mb5;
    JMenu m1,m2,m3,m4,m5;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6; 
    
    LibrarianSection()
    {
     super("Librarian Section");
     setLocation(0,0);
     setSize(1500,800);
     
     f1=new Font("Arial",Font.BOLD,25);
     f2=new Font("Arial",Font.BOLD,20);
     
     ImageIcon ic;
        ic = new ImageIcon(ClassLoader.getSystemResource("Library/icon/download.jpeg"));
     Image img=ic.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT); 
     ImageIcon ic1=new ImageIcon(img);
     l1=new JLabel(ic1);
     
      mb1=new JMenuBar();
        m1=new JMenu("Add Info");
        mi1=new JMenuItem("Add Book");
        
         mb2=new JMenuBar();
        m2=new JMenu("View Info");
        mi2=new JMenuItem("View Book");
        mi6=new JMenuItem("View Issue Book");
        
         mb3=new JMenuBar();
        m3=new JMenu("Issue Info");
        mi3=new JMenuItem("Issue Book");
        
         mb4=new JMenuBar();
        m4=new JMenu("Return");
        mi4=new JMenuItem("Return Book");
        
        m5=new JMenu("Exit");
        mi5=new JMenuItem("Log OUT");
        
        m1.add(mi1);
        m2.add(mi2);
         m2.add(mi6);
        m3.add(mi3);
        m4.add(mi4);
        m5.add(mi5);
        
        mb1.add(m1);
        mb1.add(m2);
        
        mb1.add(m3);
        mb1.add(m4);
        mb1.add(m5);
        
         mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi6.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        
        setJMenuBar(mb1);
        add(l1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     String command=e.getActionCommand();
       if(command.equals("Add Book"))
       {
          //new AddBook().setVisible(true); 
       }
       else if(command.equals("View Book"))
       {
           //new ViewBook().setVisible(true);
       }
        else if(command.equals("View Issue Book"))
       {
           //new ViewIssueBook().setVisible(true);
       }
       else if(command.equals("Issue Book"))
       {
           //new IssueBook().setVisible(true);
       }
       else if(command.equals("Return Book"))
       {
           //new ReturnBook().setVisible(true);
       }
       else if(command.equals("Log Out"))
       {
           System.exit(0);
       }
       
    }
    
    
    public static void main(String args[])
    {
        new LibrarianSection().setVisible(true);
    }
}
