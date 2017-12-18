
package da;

import domain.Food;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author khong
 */
public class FoodDA {
    private String host = "jdbc:derby://localhost:1527/FosDB";
    private String user = "nbuser";
    private String password = "nbuser";
    private String tableName = "Food";
    private Connection conn;
    private PreparedStatement stmt;
    
    public FoodDA() {
        createConnection();
    }
    
    public Food getRecord(int foodid) {
        String queryStr = "SELECT * FROM " + tableName + " WHERE foodid = ?";
        Food food = null;
        try {
            stmt = conn.prepareStatement(queryStr);
            stmt.setInt(1, foodid);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                food = new Food(foodid, rs.getString("foodname"), rs.getDouble("foodprice"),rs.getInt("foodcount"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return food;
    }
    
        
     public void addRecord(Food food) {
         String insertStr = "INSERT INTO " + tableName + " (foodname,foodprice,foodcount)VALUES(?, ?, ?)";
         
        try { 
              stmt=conn.prepareStatement(insertStr);
              stmt.setString(1,food.getFoodName());
              stmt.setDouble(2,food.getFoodPrice());
              stmt.setInt(3,food.getFoodCount());
              stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     
    public void updateRecord(Food food){
         String updateStr = "UPDATE " + tableName + " SET foodname = ?, foodprice = ?, foodcount = ? WHERE foodid = ?";
    
         try {
              stmt = conn.prepareStatement(updateStr);
              stmt.setString(1,food.getFoodName());
              stmt.setDouble(2,food.getFoodPrice());
              stmt.setInt(3,food.getFoodCount());
              stmt.setInt(4,food.getFoodId());

              stmt.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
          }
     }
     
     public void deleteRecord(Food food){
         //String deleteStr = "DELETE FROM " + tableName + " WHERE Code = ?";
         try {
             stmt = conn.prepareStatement("DELETE FROM " + tableName + " WHERE foodid = ?");
             //stmt = conn.prepareStatement(deleteStr);
             stmt.setInt(1,food.getFoodId());
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
        FoodDA da = new FoodDA();
    }
    
}
