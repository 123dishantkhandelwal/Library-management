/*
Login Page coding 
*/


package Library;
import java.awt.event.*;
import java.awt.*;
import javax.swing.* ;

/**
 *
 * @author user
 */
public class Index extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4;
    JButton b1,b2;
    JPanel p1,p2,p3;
    Font f1,f2;
    Index()
    {
        super("Login Page");
        setLocation(500,350);
        setSize(500,200);
        
        l1=new JLabel("Admin Login");
        l2=new JLabel("Librarian Login");
        l3=new JLabel("Library Management");
        
        b1=new JButton("Login");
        b2=new JButton("Login");
        
        f1=new Font("Arial",Font.BOLD,25);
        f2=new Font("Arial",Font.BOLD,20);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Library/icon/img1.jpg"));
        Image i=img.getImage().getScaledInstance(130,120,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i);
        l4=new JLabel(img2);
        
        l1.setFont(f2);
        l2.setFont(f2);
        l3.setFont(f1);
        b1.setFont(f2);
        b2.setFont(f2);
         l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(Color.WHITE );
         
        p1=new JPanel();
        p1.setLayout(new GridLayout(2,2,10,10));
        p1.add(l1);
        p1.add(b1);
        p1.add(l2);
        p1.add(b2);
        
         p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l4);
        
       p3=new JPanel();
       p3.setLayout(new GridLayout(1,1,10,10));
       p3.add(l3);
       p3.setBackground(Color.BLUE);
       setLayout(new BorderLayout(10,10));
       add(p3,"North");
       add(p2,"West");
       add(p1,"Center");  
       
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            System.out.println("Admin Login");
            new Admin().setVisible(true);
            this.setVisible(false);
        }
         if(e.getSource()==b2)
        {
            System.out.println("Librarian Login");
            //new Librarian.setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String args[]) throws NullPointerException
    {
        new Index().setVisible(true);
    }
    
}
