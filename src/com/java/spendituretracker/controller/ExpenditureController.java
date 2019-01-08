/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller;

import com.java.spendituretracker.controller.inf.ExpenditureControllerInf;
import com.java.spendituretracker.dto.ExpenditureDto;
import com.java.spendituretracker.model.expenditure.Expenditure;
import java.sql.SQLException;
import org.modelmapper.ModelMapper;

/**
 *
 * @author Calcey
 */
public class ExpenditureController implements ExpenditureControllerInf{
  
    private Expenditure expenditure;
    private ModelMapper modelMapper;
    
    public ExpenditureController()
    {
        expenditure = new Expenditure();
        modelMapper = new ModelMapper();
    }
    
    public int addExpenditure(ExpenditureDto expenditureDto) throws SQLException, ClassNotFoundException{
       expenditure =  modelMapper.map(expenditureDto, Expenditure.class);
       return expenditure.AddExpenditure();
    }
    
}
