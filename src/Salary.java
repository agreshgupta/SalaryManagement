import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Agresh Gupta
 */
public class Salary extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    JButton b1,b2;
    Choice c2;
    
    Salary(){
        
        super("Set Salary");
        
        setLayout(new GridLayout(8,2,20,20));
        c2 = new Choice();
        
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("Select * from employee");
            
            while(rs.next()){
            c2.add(rs.getString("id"));
            }
        }catch(Exception e){}
        
        add(new JLabel("Select Employee"));
        add(c2);
        
        l1 = new JLabel("HRA");
        t1 = new JTextField(15);
        add(l1);
        add(t1);
        
        l2 = new JLabel("DA");
        t2 = new JTextField(15);
        add(l2);
        add(t2);
        
        l3 = new JLabel("MED");
        t3 = new JTextField(15);
        add(l3);
        add(t3);
        
        l4 = new JLabel("PF");
        t4 = new JTextField(15);
        add(l4);
        add(t4);
        
        l5 = new JLabel("Basic Salary");
        t5 = new JTextField(15);
        add(l5);
        add(t5);
        
        b1 = new JButton("Submit");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(450,550);
        setLocation(400,200);
        setVisible(true);
        
        getContentPane().setBackground(Color.WHITE);
    }
    
    public void actionPerformed(ActionEvent e) {
        String hra = t1.getText();
        String id = c2.getSelectedItem();
        String da = t2.getText();
        String med = t3.getText();
        String pf = t4.getText();
        String sal = t5.getText();
        
        String qry = "insert into salary values("+id+","+hra+","+da+","+med+","+pf+","+sal+")";
        
        try{
            conn c1 = new conn();
            c1.s.executeUpdate(qry);
            JOptionPane.showMessageDialog(null,"Salary Updated");
        }catch(Exception ee){
            ee.printStackTrace();
        }
    }
    public static void main(String[] args){
        new Salary();
    }

}
