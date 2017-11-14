/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulohyprojekt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author client
 */
public class ConnectionProvider {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DBNAME = "projektuloha";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String UseSSL = "?useSSL=false";

    
    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL + DBNAME + UseSSL, USERNAME, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return conn;
    }
    
    public List<Task> getTasks(){
        String query = "SELECT * FROM Tasks";
        Connection conn = getConnection();
        Task task = null;
        List<Task> listOfTasks = new ArrayList();
        if(conn != null){
            try{
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    int id = rs.getInt("id");
                    String taskName = rs.getString("taskname");
                    String taskDescription = rs.getString("description");
                    Date taskDeadline = rs.getDate("deadline");
                    Date taskDateCreated = rs.getDate("dateCreated");

                    task = new Task(id, taskName, taskDescription, taskDeadline, taskDateCreated );
                    listOfTasks.add(task);
                }
                conn.close();
                return listOfTasks;
            }catch(SQLException ex){
                System.out.println("Error: " + ex.toString());
            }
        }
        return null;        
        
    }
    
    public String getCurrentDateTime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String dateString = sdf.format(date);
        return dateString;
    }
}
