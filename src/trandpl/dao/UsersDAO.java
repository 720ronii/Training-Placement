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
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import trandpl.dbutil.DBConnection;
import trandpl.pojo.CurrentUsers;
import trandpl.pojo.HrPojo;
import trandpl.pojo.UsersPojo;


/**
 *
 * @author __roonit
 */
public class UsersDAO {
    
    public static  boolean validateUser(UsersPojo user) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from users where userid=? and password=? and type=? and active='y'");
        ps.setString(1, user.getId());
        ps.setString(2, user.getPassword());;
        ps.setString(3, user.getType());
        ResultSet rs=ps.executeQuery();
       
        
        if(rs.next()){
            CurrentUsers.setUserId(rs.getString(1));         
            CurrentUsers.setId(rs.getString(2));
            CurrentUsers.setName(rs.getString(3));
            CurrentUsers.setType(rs.getString(5));
           // System.out.println("hello");
            return true;
        }
        return false;       
    }
    
    public static Map<String,HrPojo> getAllHrList() throws SQLException{
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
     ResultSet rs=st.executeQuery("select userid,id,name from users where type='Hr'");
    Map<String,HrPojo> allHr=new HashMap<>();
    while(rs.next())
    {
        String userid=rs.getString(1);
        String hrid=rs.getString(2);
        String name=rs.getString(3);
        HrPojo obj=new HrPojo();
        obj.setHrId(hrid);
        obj.setHrName(name);
        allHr.put(userid, obj);
    }
    
    return allHr;
    } 
    
    public static boolean updatepassword(String password, String userId)throws Exception{
        Connection conn= DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=?,active='y', where userid=?");
        ps.setString(1,password);
        ps.setString(2, userId);
        return 1==ps.executeUpdate();    
    }
    
    public static boolean removeUser(String userId) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set active='N' where userid=?");
        ps.setString(1, userId);
        return 1==ps.executeUpdate();
    }
}
