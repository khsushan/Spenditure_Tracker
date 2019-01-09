/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller.inf;

import com.java.spendituretracker.dto.ExpenditureDto;
import com.java.spendituretracker.dto.ExpenditureListDto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Calcey
 */
public interface ExpenditureControllerInf {
    
    int addExpenditure(ExpenditureDto expenditureDto) throws SQLException, ClassNotFoundException;
    
    ArrayList<ExpenditureListDto> getExpendituresByMonth(int month) throws SQLException, ClassNotFoundException;
    
}
