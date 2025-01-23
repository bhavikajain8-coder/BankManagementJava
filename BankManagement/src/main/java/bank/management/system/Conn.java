package bank.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Correct database name
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "(A5harv)");
            s = c.createStatement();
            System.out.println("Connection successful!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
