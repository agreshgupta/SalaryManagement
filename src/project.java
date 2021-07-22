import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Agresh Gupta
 */
public class project extends JFrame implements ActionListener{
    
    project(){
        setSize(2000,1100);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/payroll.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        add(l1);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        JMenu m1 = new JMenu("Master");
        m1.setForeground(Color.RED);
        
        JMenuItem t1 = new JMenuItem("New Employee");
        t1.setForeground(Color.blue);
        t1.setFont(new Font("monospaced",Font.PLAIN,12));
        t1.setMnemonic('N');
        t1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/New.png")));
        t1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        
        JMenuItem t3 = new JMenuItem("Salary");
        t3.setForeground(Color.blue);
        t3.setFont(new Font("monospaced",Font.PLAIN,12));
        t3.setMnemonic('S');
        t3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/schereport.png")));
        t3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        
        JMenuItem t4 = new JMenuItem("List Employee");
        t4.setForeground(Color.blue);
        t4.setFont(new Font("monospaced",Font.PLAIN,12));
        t4.setMnemonic('L');
        t4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/newinvoice.png")));
        t4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));
         
        m1.add(t1);
        m1.add(t3);
        m1.add(t4);
        mb.add(m1);
        
        t1.addActionListener(this);
        t3.addActionListener(this);
        t4.addActionListener(this);
       
        JMenu edit = new JMenu("Update");
        edit.setForeground(Color.BLUE);
        
        JMenuItem s1 = new JMenuItem("Update Salary");
        s1.setForeground(Color.blue);
        s1.setFont(new Font("monospaced",Font.PLAIN,12));
        s1.setMnemonic('U');
        s1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/EditOpen.png")));
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK));
        
        JMenuItem s3 = new JMenuItem("Update Employee");
        s3.setForeground(Color.blue);
        s3.setFont(new Font("monospaced",Font.PLAIN,12));
        s3.setMnemonic('P');
        s3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        s3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        
        JMenuItem s4 = new JMenuItem("Take Attendance");
        s4.setForeground(Color.blue);
        s4.setFont(new Font("monospaced",Font.PLAIN,12));
        s4.setMnemonic('T');
        s4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/EXPENSE.png")));
        s4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
         
        edit.add(s1);
        edit.add(s3);
        edit.add(s4);
        edit.add(edit);
        
        s1.addActionListener(this);
        s3.addActionListener(this);
        s4.addActionListener(this);
        
        JMenu re = new JMenu("Reports");
        re.setForeground(Color.RED);
        
        JMenuItem r1 = new JMenuItem("Generate PaySlip");
        r1.setForeground(Color.blue);
        r1.setFont(new Font("monospaced",Font.PLAIN,12));
        r1.setMnemonic('A');
        r1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        
        JMenuItem r3 = new JMenuItem("List Attendance");
        r3.setForeground(Color.blue);
        r3.setFont(new Font("monospaced",Font.PLAIN,12));
        r3.setMnemonic('B');
        r3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/empreport.png")));
        r3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
       
         
        re.add(r1);
        re.add(r3);
       
        mb.add(re);
        
        r1.addActionListener(this);
        r3.addActionListener(this);
        
        JMenu uti = new JMenu("Utilities");
        uti.setForeground(Color.BLUE);
        
        JMenuItem u1 = new JMenuItem("Notepad");
        u1.setForeground(Color.blue);
        u1.setFont(new Font("monospaced",Font.PLAIN,12));
        u1.setMnemonic('C');
        u1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/new.png")));
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
        
        JMenuItem u3 = new JMenuItem("Calculator");
        u3.setForeground(Color.blue);
        u3.setFont(new Font("monospaced",Font.PLAIN,12));
        u3.setMnemonic('D');
        u3.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/calc.png")));
        u3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        
        JMenuItem u4 = new JMenuItem("Web Browser");
        u4.setForeground(Color.blue);
        u4.setFont(new Font("monospaced",Font.PLAIN,12));
        u4.setMnemonic('E');
        u4.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/EXPENSE.png")));
        u4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
         
        uti.add(u1);
        uti.add(u3);
        uti.add(u4);
        mb.add(uti);
        
        u1.addActionListener(this);
        u3.addActionListener(this);
        u4.addActionListener(this);
        
        JMenu exit = new JMenu("Exit");
        re.setForeground(Color.RED);
        
        JMenuItem e1 = new JMenuItem("exit");
        e1.setForeground(Color.blue);
        e1.setFont(new Font("monospaced",Font.PLAIN,12));
        e1.setMnemonic('X');
        e1.setIcon(new ImageIcon(ClassLoader.getSystemResource("icon/payments.png")));
        e1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        
        exit.add(e1);
        mb.add(exit);
        e1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if(msg.equals("New Employee")){
            new New_Employee().setVisible(true);
        }else if(msg.equals("List Employee")){
            new List_Employee().setVisible(true);
        }else if(msg.equals("Update Employee")){
            new Update_Employee().setVisible(true);
        }else if(msg.equals("Salary")){
            new Salary().setVisible(true);
        }else if(msg.equals("Update Salary")){
            new Update_Salary().setVisible(true);
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){}
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else  if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
            }catch(Exception e){}
        }else if(msg.equals("Take Attendance")){
            new TakeAttendance().setVisible(true);
        }else if(msg.equals("Exit")){
            dispose();
        }else if(msg.equals("Generate Payslip")){
            new Pay_Slip().setVisible(true);
        }else if(msg.equals("List Attendace")){
            //new List_Attendance().setVisible(true);
        }
    }
    public static void main(String args[]){
        new project().setVisible(true);
    }
    
}
