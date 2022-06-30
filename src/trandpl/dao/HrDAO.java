/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trandpl.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import trandpl.dbutil.DBConnection;
import trandpl.pojo.HrPojo;

/**
 *
 * @author __roonit
 */
public class HrDAO {
    
    public static int getNewHrId() throws SQLException 
    { 
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select max(hrid) from hr");
        int hrId=101;
        rs.next();
            String strid=rs.getString(1);
            
            if(strid !=null){
            String id=strid.substring(3);
            hrId=Integer.parseInt(id)+1;
        //   return hrId;   
        }
        return hrId;   
    }
    
    public static int addNewHr(HrPojo hr) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select userid from users where userid=?");
        ps.setString(1, hr.getUserId());
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            return -1;
        }
        ps=conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
        ps.setString(1, hr.getUserId());
        ps.setString(2, hr.getHrId());
        ps.setString(3, hr.getHrName());
        ps.setString(4, hr.getPassword());
        ps.setString(5, hr.getType());
        ps.setString(6, "y");
        int x=ps.executeUpdate();
        int y=0;
        if(x==1){
            ps=conn.prepareStatement("insert into hr values(?,?,?,?)");
                    ps.setString(1, hr.getHrId());
                    ps.setString(2, hr.getPhone());
                    ps.setString(3, hr.getCopanyName());
                    ps.setString(4, hr.getProfession());
                    y=ps.executeUpdate();
//                    if(y==1)
//                        return 1;     
        }
        return y;
    }    
    
    public static List<HrPojo> getAllHr() throws SQLException{
           
        Connection conn= DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select hr.hrid,users.userid,users.name,hr.phone,hr.companyname from hr,users where hr.hrid=users.id and users.active='y'order by hr.hrid");
        List<HrPojo> allHrList=new ArrayList<>();
        while(rs.next()){
            HrPojo obj=new HrPojo();
            obj.setHrId(rs.getString(1));
            obj.setUserId(rs.getString(2));
            obj.setHrName(rs.getString(3));
            obj.setPhone(rs.getString(4));
            obj.setCopanyName(rs.getString(5));
            allHrList.add(obj);
        }
        return allHrList;
    }
    
    
}
