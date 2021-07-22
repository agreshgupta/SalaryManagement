import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

/**
 *
 * @author Agresh Gupta
 */
public class Pay_Slip extends JFrame implements ActionListener{
    Choice c1;
    JTextArea t1;
    JButton b1;
    
    Pay_Slip(){
        setSize(800,700);
        setLocation(400,150);
        c1=new Choice();
        try{
            conn c =new conn();
            ResultSet rs=c.s.executeQuery("Select * from salary");
            while(rs.next()){
                c1.add(rs.getString("id"));
                
            }
        }catch(Exception e){}
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.add(new JLabel("Select Id"));
        p1.add(c1);
        add(p1,"North");
        
        t1 = new JTextArea(30,80);
        JScrollPane jsp =new JScrollPane(t1);
        Font f1=new Font("arial",Font.BOLD,20);
        t1.setFont(f1);
        b1=new JButton("Generate Pay Slip");
        
        add(b1,"South");
        add(jsp,"Center");
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("Select * from employee where id="+c1.getSelectedItem());
            rs.next();
            String name = rs.getString("name");
            rs.close();
            rs = c.s.executeQuery("select * from salary where id=" + this.c1.getSelectedItem());
            double gross = 0.0D;
            double net = 0.0D;
            Date d1 = new Date();
            int month = d1.getMonth();
            this.t1.setText(" ----------------   PAY SLIP FOR THE MONTH OF " + month + " ,2021  ------------------------");
            this.t1.append("\n");
            if (rs.next()) {
                this.t1.append("\n     Employee ID " + rs.getString("id"));
                this.t1.append("\n     Employee Name " + name);
                this.t1.append("\n----------------------------------------------------------------");
                this.t1.append("\n");
                double hra = rs.getDouble("hra");
                this.t1.append("\n                  HRA         : " + hra);
                double da = rs.getDouble("da");
                this.t1.append("\n                  DA          : " + da);
                double med = rs.getDouble("med");
                this.t1.append("\n                  MED         : " + med);
                double pf = rs.getDouble("pf");
                this.t1.append("\n                  PF          : " + pf);
                double basic = rs.getDouble("basic_salary");
                gross = hra + da + med + pf + basic;
                net = gross - pf;
                this.t1.append("\n                  BASIC SALARY : " + basic);
                this.t1.append("\n-------------------------------------------------------");
                this.t1.append("\n");
                this.t1.append("\n       GROSS SALARY :" + gross + "    \n       NET SALARY : " + net);
                this.t1.append("\n       Tax   :   2.1% of gross " + gross * 2.1D / 100.0D);
                this.t1.append("\n -------------------------------------------------");
                this.t1.append("\n");
                this.t1.append("\n");
                this.t1.append("\n");
                this.t1.append("   (  Signature  )      ");
            }
        } catch (Exception var21) {
            var21.printStackTrace();
        }

    }

    public static void main(String[] args) {
        (new Pay_Slip()).setVisible(true);
    }
}
