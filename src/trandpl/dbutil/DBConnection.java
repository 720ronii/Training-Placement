package trandpl.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    
    private static Connection conn;
    static{
        
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@ DESKTOP-AD2HP11:1521/XE","tnp","Ronit"); //url 
            JOptionPane.showMessageDialog(null,"Connected Succesfully !");
           
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Fail to conect server");
            ex.printStackTrace();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in opening DB: "+ex.getMessage());
            ex.printStackTrace();
        }      
    }
    public static Connection getConnection(){
            return  conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected Succesfully ");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error in closing connection"+ex.getMessage());
            ex.printStackTrace();
        }           
    }  
}
