
// This class connect Databose with our application
/**
 *
 * @author Agresh Gupta
 */
//Importing sql
import java.sql.*;

public class conn {
    public Connection c;//Class connection from java.sql
    public Statement s;//Statement helps use execute sql queries in our java app
    public conn(){//conn constractor
        try{
            Class.forName("com.mysql.jdbc.Driver");//Connecting jdbc driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","Abhishek6");//Provinding database access
            s = c.createStatement();//it will allow us to run queries
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
}
