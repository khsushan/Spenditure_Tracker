/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.model.income;

import com.java.spendituretracker.dbconnection.DBConnection;
import com.java.spendituretracker.model.category.Category;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Calcey
 */
public class Income {
    
    private long incomeId;
    
    private double amount;
    
    private Category category;
    
    private Date date;

    public long getIncomeId() {
        return incomeId;
    }

    public void setIncomeId(long expenditureId) {
        this.incomeId = expenditureId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
     public double getIncomeByMonth(int month) throws SQLException, ClassNotFoundException {
        String query = "SELECT sum(Amount) as Total FROM income as I "
                + "WHERE MONTH(I.Date) = ? ";
        PreparedStatement preparedStatement = DBConnection.GetConnection().prepareStatement(query);
        preparedStatement.setInt(1, month);
        try {
            ResultSet result = preparedStatement.executeQuery();
            if(result.next()){
              return result.getDouble("Total");
            }
            return 0;
        } finally {
            preparedStatement.close();
        }
    }
     
     public int AddIncome() throws SQLException, ClassNotFoundException {

        String query = "INSERT INTO Income(Amount,Date,CategoryId) VALUES(?,?,?)";
        PreparedStatement preparedStatement = DBConnection.GetConnection().prepareStatement(query);
        preparedStatement.setDouble(1, this.getAmount());
        preparedStatement.setDate(2, (java.sql.Date) this.getDate());
        preparedStatement.setLong(3, this.getCategory().getCategoryId());
        try {
            return preparedStatement.executeUpdate();
        } finally {
            preparedStatement.close();
        }

    }
}
