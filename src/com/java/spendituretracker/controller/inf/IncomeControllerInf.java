/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller.inf;

import com.java.spendituretracker.dto.IncomeDto;
import java.sql.SQLException;

/**
 *
 * @author Calcey
 */
public interface IncomeControllerInf {
    
    double getTotalIncomeByMonth(int month) throws SQLException, ClassNotFoundException;
    
    int addIncome(IncomeDto incomeDto) throws SQLException, ClassNotFoundException;
    
}
