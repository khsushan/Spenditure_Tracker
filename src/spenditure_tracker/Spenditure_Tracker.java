/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spenditure_tracker;

import com.java.spendituretracker.dbconnection.DBConnection;
import com.java.spendituretracker.view.MainView;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Calcey
 */
public class Spenditure_Tracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection connection = DBConnection.GetConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Spenditure_Tracker.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Spenditure_Tracker.class.getName()).log(Level.SEVERE, null, ex);
        }
       java.awt.EventQueue.invokeLater(() -> {
           new MainView().setVisible(true);
       });
    }
    
}
