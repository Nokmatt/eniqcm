package src.fr.eni.eniAsk.dao;

import java.sql.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Connect {

    
   

    public static Connection connexionDb() throws Exception {
        
        Connection conn = null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            // Setup the connection with the DB
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eni_qcm?" + "user=root&password=");  
          
        } catch (Exception e) {
            out.println("Erreur : Impossible de se connecter </br>" + e.getMessage() + "</br>" + e.getCause());
        }
        
        return conn;
        
        
        
    }
}
