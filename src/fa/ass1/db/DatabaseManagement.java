package fa.ass1.db;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DatabaseManagement {
    public static Connection con;    
   
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        try {
            con = (Connection) DriverManager.getConnection("jdbc:mysql://207.148.64.133:3306/faass1?useUnicode=true&characterEncoding=UTF-8", "tien", "12345678");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        };
        return con;
    }
    

}
