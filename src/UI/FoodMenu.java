/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.sun.glass.events.KeyEvent;
import control.MaintainFood;
import da.TableModelDA;
import domain.Food;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class FoodMenu extends javax.swing.JFrame {

    private MaintainFood foodControl;
    static final String DATABASE_URL = "jdbc:derby://localhost:1527/FosDB";
    static final String USERNAME = "nbuser";
    static final String PASSWORD = "nbuser";
    static final String DEFAULT_QUERY = "SELECT foodid as id, foodname as name, cast(foodprice as decimal(5,2)) as price FROM FOOD";
    private TableModelDA tableModel;
    
    public FoodMenu() {
        foodControl = new MaintainFood();
        initComponents();
        searchFood();
    }

    public void searchFood(){
        try {
            
            tableModel = new TableModelDA(DATABASE_URL, USERNAME, PASSWORD, DEFAULT_QUERY);
            jTable1.setModel(tableModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(615, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FOOD MENU ITEM");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 10, 340, 66);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("FOOD ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 270, 138, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("FOOD NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 310, 138, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("FOOD PRICE (RM)");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 350, 160, 40);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 270, 218, 40);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(220, 310, 218, 40);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(220, 350, 218, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 420, 90, 40);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(480, 420, 90, 40);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(230, 420, 90, 40);

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(360, 420, 80, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 480, 170);

        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(615, 540));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 630, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModelDA model = (TableModelDA) jTable1.getModel();
        String id = model.getValueAt(index, 0).toString();
        String name = model.getValueAt(index, 1).toString();
        String price = model.getValueAt(index, 2).toString();;

        jTextField1.setText(id);
        jTextField2.setText(name);
        jTextField3.setText(price);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please choose one food ", "**********************", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int foods = Integer.parseInt(jTextField1.getText());
            Food food = foodControl.selectRecord(foods);

            if (food != null) {
                int i = JOptionPane.showConfirmDialog(null, ("Food Details\nID : " + food.getFoodId() + "\nName : " + food.getFoodName() + "\nPrice : " + food.getFoodPrice()), "Delete Food Reocrd", JOptionPane.YES_NO_OPTION);
                if (i == JOptionPane.YES_OPTION) {
                    foodControl.deleteRecord(food);
                    JOptionPane.showMessageDialog(null, "Food record deleted", "Delete Record", JOptionPane.INFORMATION_MESSAGE);
                    searchFood();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please choose one food ", "**********************", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int foods = Integer.parseInt(jTextField1.getText());
            Food food = foodControl.selectRecord(foods);

            if (food != null) {
                int foodcount = food.getFoodCount();
                int fc = 0;
                fc += foodcount;
                int i = JOptionPane.showConfirmDialog(null,"Do you want to update comment?","Update Feedback Reocrd",JOptionPane.YES_NO_OPTION);
                if(i == JOptionPane.YES_OPTION){
                    food.setFoodName(jTextField2.getText());
                    food.setFoodPrice(Double.parseDouble(jTextField3.getText()));
                    food.setFoodcount(fc);
                    foodControl.updateRecord(food);
                    JOptionPane.showMessageDialog(null, "Food Updated", "Updated", JOptionPane.INFORMATION_MESSAGE);
                    searchFood();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No such food ID.", "RECORD NOT FOUND", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField2.getText().equals("") || jTextField3.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please key in your Food Name and Price.", "***********", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Food food;
            int id = 0;
            double foodprice = Double.parseDouble(jTextField3.getText());
            int fc = 0;
            String name = jTextField2.getText();
            int i = JOptionPane.showConfirmDialog(null,"Do you want to add new food?","Add New Food",JOptionPane.YES_NO_OPTION);
            if(i == JOptionPane.YES_OPTION){
                food = new Food(id,name,foodprice,fc);
                foodControl.addRecord(food);
                JOptionPane.showMessageDialog(null, "New Food Added", "New Food", JOptionPane.INFORMATION_MESSAGE);
                searchFood();
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c =  evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE)) || (c==KeyEvent.VK_DELETE)){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField3KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
