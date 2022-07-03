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
import trandpl.dbutil.DBConnection;
import trandpl.pojo.jobPojo;

/**
 *
 * @author __roonit
 */
public class jobDAO {
    
    public static int getNewJobId() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select max(jobId) from jobs");
        rs.next();
        String strid=rs.getString(1);
        
        int jobId=101;
        if(strid!=null){
            String id=strid.substring(4);
            jobId=Integer.parseInt(id)+1;
            
        }
         return jobId;      
    }
    public static boolean addNewJob(jobPojo job) throws SQLException{
        
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into jobs values(?,?,?,?,?)");
        ps.setString(1, job.getJobId());
        ps.setString(2, job.getTitle());
        ps.setString(3, job.getHrId());
        ps.setString(4, job.getTags());
        ps.setInt(5, job.getStatus());
        
        return 1==ps.executeUpdate();
    }
    
    
    
}
