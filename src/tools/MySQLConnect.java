
package tools;
import java.sql.*;
public class MySQLConnect {
    //private MySQLConnect conn;
    private static Connection connection;
    private static final String ADDRESS = "localhost";
    private static final String DATABASE_NAME = "SIEUTHI_T_T";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    
   public MySQLConnect(){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://" + ADDRESS + "/" + DATABASE_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&useUnicode=true&characterEncoding=utf-8";
            connection = DriverManager.getConnection(connectionString);

            }catch (Exception e) {
            e.printStackTrace();
        }
    }
public Connection getConnection() {
return connection;
}
    
}
