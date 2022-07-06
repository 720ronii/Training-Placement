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
import java.util.ArrayList;
import java.util.List;
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
    
    public static List<jobPojo> getAllActiveJobByCurrentHr(String hrId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status!=-1");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List<jobPojo> alljobList=new ArrayList<>();
        while(rs.next()){
            jobPojo obj=new jobPojo();
            obj.setJobId(rs.getString(1));
            obj.setTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            alljobList.add(obj);
        }
        return alljobList;  
    }
    public static boolean removeJobByJobId(String jobId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set status=-1 where jobid=?");
        ps.setString(1, jobId);
        return ps.executeUpdate()==1;  
    }
    
    public static List<jobPojo> getAllEditableJobByCurrentHr(String hrId) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select jobid,jobtitle,tags,status from jobs where hrid=? and status=0");
        ps.setString(1, hrId);
        ResultSet rs=ps.executeQuery();
        List<jobPojo> alljobList=new ArrayList<>();
        while(rs.next()){
            jobPojo obj=new jobPojo();
            obj.setJobId(rs.getString(1));
            obj.setTitle(rs.getString(2));
            obj.setTags(rs.getString(3));
            obj.setStatus(rs.getInt(4));
            alljobList.add(obj);
        }
        return alljobList;  
    }
    public static boolean editJobById(jobPojo job)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set jobtitle=?,tags=? where jobid=?");
        ps.setString(1, job.getTitle());
        ps.setString(2, job.getTags());
        ps.setString(3, job.getJobId());
        return 1==ps.executeUpdate();
    }
    public static boolean setJobStatus(String jobId)throws SQLException{
         Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update jobs set status=1 where jobid=1");
        ps.setString(1, jobId);
        return 1==ps.executeUpdate();   
    }
   
}
