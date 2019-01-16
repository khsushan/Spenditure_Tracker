/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller.inf;

import com.java.spendituretracker.dto.IncomeDto;
import com.java.spendituretracker.dto.IncomeListDto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Calcey
 */
public interface IncomeControllerInf {
    
    double getTotalIncomeByMonth(int month) throws SQLException, ClassNotFoundException;
    
    int addIncome(IncomeDto incomeDto) throws SQLException, ClassNotFoundException;
        ArrayList<IncomeListDto> getIncomeByMonth(int month) throws SQLException, ClassNotFoundException;

}
