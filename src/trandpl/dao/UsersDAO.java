/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import trandpl.dbutil.DBConnection;
import trandpl.pojo.CurrentUsers;
import trandpl.pojo.UsersPojo;


/**
 *
 * @author __roonit
 */
public class UsersDAO {
    
    public static  boolean validateUser(UsersPojo user) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from users where userid=? and password=? and type=?");
        ps.setString(1, user.getId());
        ps.setString(2, user.getPassword());;
        ps.setString(3, user.getType());
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            CurrentUsers.setUserId(rs.getString(1));         
            CurrentUsers.setId(rs.getString(2));
            CurrentUsers.setName(rs.getString(3));
            CurrentUsers.setType(rs.getString(5));
            System.out.println("hello");
            return true;
        }
        return false;       
    }
}
