/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller.inf;

import com.java.spendituretracker.dto.ExpenditureDto;
import java.sql.SQLException;

/**
 *
 * @author Calcey
 */
public interface ExpenditureControllerInf {
    
    int addExpenditure(ExpenditureDto expenditureDto) throws SQLException, ClassNotFoundException;
    
}
