import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Agresh Gupta
 */
public class List_Employee extends JFrame implements ActionListener{
    
    JTable j1;
    JButton b1;
    String h[]={"emp id","Name","Gender","Address","State","City","Email Id","Phone"};
    String d[][] = new String[20][8];
    int i=0,j=0;
    
    List_Employee(){
        super("Employees");
        
        setSize(800,400);
        setLocation(350,200);
        
        try{
            String q = "Select * from employee";
            conn c1 = new conn();
            ResultSet rs=c1.s.executeQuery(q);
            while(rs.next()){
                d[i][j++]=rs.getString("id");
                d[i][j++]=rs.getString("name");
                d[i][j++]=rs.getString("gender");
                d[i][j++]=rs.getString("address");
                d[i][j++]=rs.getString("state");
                d[i][j++]=rs.getString("city");
                d[i][j++]=rs.getString("email");
                d[i][j++]=rs.getString("phone");
                i++;
                j = 0;
            }
            j1 = new JTable(d,h);
        }catch(Exception e){}
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane s1= new JScrollPane(j1);
        add(s1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            j1.print();
        }catch(Exception e){}
    }
    public static void main(String args[]){
        new List_Employee().setVisible(true);
    }
}
