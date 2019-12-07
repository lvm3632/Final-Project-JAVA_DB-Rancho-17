/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RICHARD
 */
public class DBConnection {
    
  /*  private static final String DEFAULT_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DEFAULT_URL = "jdbc:oracle:thin:@10.40.53.10:1521:alum";
    private static final String DEFAULT_USERNAME = "a01636172";
    private static final String DEFAULT_PASSWORD = "tec6172";*/
    /*
    public static void main(String[] args) {
        long begTime = System.currentTimeMillis();

        String driver = ((args.length > 0) ? args[0] : DEFAULT_DRIVER);
        String url = ((args.length > 1) ? args[1] : DEFAULT_URL);
        String username = ((args.length > 2) ? args[2] : DEFAULT_USERNAME);
        String password = ((args.length > 3) ? args[3] : DEFAULT_PASSWORD);

        Connection connection = null;

        try {
            connection = getConnection(driver, url, username, password);
          
            
        } catch (Exception e) {
            rollback(connection);
            e.printStackTrace();
        } finally {
            close(connection);
            long endTime = System.currentTimeMillis();
            System.out.println("wall time: " + (endTime - begTime) + " ms");
        }
    }
    
    *//*
    public static Connection getConnection(String driver, String url, String username, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        if ((username == null) || (password == null) || (username.trim().length() == 0) || (password.trim().length() == 0)) {
            return DriverManager.getConnection(url);
        } else {
            return DriverManager.getConnection(url, username, password);
        }
    }*/
    
    /*
    public  static Connection  getConnection() throws ClassNotFoundException, SQLException{
       return DBConnection.getConnection(DEFAULT_URL, DEFAULT_URL, DEFAULT_URL, DEFAULT_URL);
    }*/
    
      public static void close(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
       public static void rollback(Connection connection) {
        try {
            if (connection != null) {
                connection.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    public static Connection getConnecction(){
     try {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            String myDB = "jdbc:oracle:thin:@10.40.53.10:1521:alum";
            String usuario="a01636172"; 
            String password="tec6172";
            Connection cnx = DriverManager.getConnection(myDB,usuario,password);
         
            return cnx;
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }  
        
/*
    static Connection getConnecction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    
    
    
    
    
    
    
    
    }
