import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Agresh Gupta
 */
public class New_Employee extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton b1,b2;
    Choice c1;
    
    New_Employee(){
        super("New Employee");
        
        setSize(600,500);
        setLocation(600,200);
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        
        p1.setLayout(new GridLayout(8,2,10,40));
        l1 = new JLabel("Name");
        t1 = new JTextField(15);
        p1.add(l1);
        p1.add(t1);
        
        c1 = new Choice();
        c1.add("Male");
        c1.add("Female");
        
        l2 = new JLabel("Gender");
        p1.add(l2);
        p1.add(c1);
        
        l3 = new JLabel("Address");
        t2 = new JTextField(15);
        p1.add(l3);
        p1.add(t2);
        
        l4 = new JLabel("State");
        t3 = new JTextField(15);
        p1.add(l4);
        p1.add(t3);
        
        l5 = new JLabel("City");
        t4= new JTextField(15);
        p1.add(l5);
        p1.add(t4);
        
        l6 = new JLabel("Email");
        t5 = new JTextField(15);
        p1.add(l6);
        p1.add(t5);
        
        l7 = new JLabel("Phone");
        t6 = new JTextField(15);
        p1.add(l7);
        p1.add(t6);
        
        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");
        
        p1.add(b1);
        p1.add(b2);
        
        setLayout(new BorderLayout());
        add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("icons/new_employee.png"))),"West");
        add(p1,"Center");
        
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        
        b2.addActionListener(this);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
    }
    public void actionPerformed(ActionEvent ae){
        String n = t1.getText();
        String g = c1.getSelectedItem();
        String a = t2.getText();
        String s = t3.getText();
        String c = t4.getText();
        String e = t5.getText();
        String p = t6.getText();
        String qry = "insert into employee value(null,'"+n+"','"+g+"','"+a+"','"+s+"','"+c+"','"+e+"','"+p+"')";
        
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null, "Employee Created");
            this.setVisible(false);
            
        }catch(Exception ee){
            ee.printStackTrace();
        }  
    }
    public static void main(String args[]){
        new New_Employee().setVisible(true);
    }
}
