/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package da;

import domain.User;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author khong
 */
public class LoginDA {
    private String host = "jdbc:derby://localhost:1527/FosDB";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Login";
    private Connection conn;
    private PreparedStatement stmt;
    
    public LoginDA() {
        createConnection();
}
    
public User getRecord(String username) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE userid = ?";
        User login = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                login = new User(username, rs.getString("password"), rs.getString("question"),rs.getString("answer"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return login;
    }

public void addRecord(User login) {
         String insertStr = "INSERT INTO " + tableName + " VALUES(?, ?, ?, ?)";
        try { 
              stmt=conn.prepareStatement(insertStr);
              stmt.setString(1,login.getUserId());
              stmt.setString(2,login.getPassword());
              stmt.setString(3,login.getQuestion());
              stmt.setString(4,login.getAnswer());

              stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

public void updateRecord(User login){
         String updateStr = "UPDATE " + tableName + " SET password = ?, question = ?, answer = ? WHERE userid = ?";
         try {
              stmt = conn.prepareStatement(updateStr);
              stmt.setString(1,login.getPassword());
              stmt.setString(2,login.getQuestion());
              stmt.setString(3,login.getAnswer());
              stmt.setString(4,login.getUserId());
    
              stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
          }
     }

public void deleteRecord(User login){
         try {
             stmt = conn.prepareStatement("DELETE FROM " + tableName + " WHERE userid = ?");
             stmt.setString(1,login.getUserId());
             stmt.executeUpdate();
             
         }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
          }
     }

private void createConnection() {
        try {
            conn = DriverManager.getConnection(host, user, password);
            System.out.println("***TRACE: Connection established.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void shutDown() {
        if (conn != null)
            try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        LoginDA da = new LoginDA();
    }


}


