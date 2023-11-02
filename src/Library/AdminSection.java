/*
 */
package Library;
import java.awt.event.*;
import java.awt.*;
import javax.swing.* ;
import java.sql.*;
/**
 *
 * @author Dishant
 */
public class AdminSection extends JFrame implements ActionListener {
    JLabel l1;
    JPanel p1,p2;
    Font f2,f1;
    JMenuBar mb1,mb2,mb3,mb4;
    JMenu m1,m2,m3,m4;
    JMenuItem mi1,mi2,mi3,mi4; 
    AdminSection()
    {
     super("Admin Section");
     setLocation(0,0);
     setSize(1500,800);
        
     f1=new Font("Arial",Font.BOLD,25);
        f2=new Font("Arial",Font.BOLD,20);
        
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("Library/icon/library2.jpg"));
        Image img=ic.getImage().getScaledInstance(1500, 800, Image.SCALE_DEFAULT); 
        ImageIcon ic1=new ImageIcon(img);
        l1=new JLabel(ic1);
        
        mb1=new JMenuBar();
        m1=new JMenu("Add Info");
        mi1=new JMenuItem("Add Librarian");
        
      
        m2=new JMenu("View Info");
        mi2=new JMenuItem("View Librarian");
        
        
        m3=new JMenu("Delete Info");
        mi3=new JMenuItem("Delete Librarian");
        
         
        m4=new JMenu("Exit");
        mi4=new JMenuItem("Log OUT");
        
        m1.add(mi1);
        m2.add(mi2);
        m3.add(mi3);
        m4.add(mi4);
        
        mb1.add(m1);
        mb1.add(m2);
        mb1.add(m3);
        mb1.add(m4);
        
//        p1.add(mb1);
//        p1.add(mb2);
//        p1.add(mb3);
//        p1.add(mb4);
        
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        
        setJMenuBar(mb1);
//        setJMenuBar(mb2);
//        setJMenuBar(mb3);
//        setJMenuBar(mb4);

        
        add(l1);
        
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String command=e.getActionCommand();
       if(command.equals("Add Librarian"))
       {
          new AddLibrarian().setVisible(true); 
       }
       else if(command.equals("View Librarian"))
       {
           new ViewLibrarian().setVisible(true);
       }
       else if(command.equals("Delete Librarian"))
       {
           new DeleteLibrarian().setVisible(true);
       }else if(command.equals("Log Out"))
       {
           System.exit(0);
       }
       
    }
    public static void main(String args[])
    {
        new AdminSection().setVisible(true);
    }
    
}
