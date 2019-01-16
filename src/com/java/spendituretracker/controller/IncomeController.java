/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller;

import com.java.spendituretracker.common.ModelMapperFactory;
import com.java.spendituretracker.controller.inf.IncomeControllerInf;
import com.java.spendituretracker.dto.IncomeDto;
import com.java.spendituretracker.model.income.Income;
import java.sql.SQLException;
import org.modelmapper.ModelMapper;

/**
 *
 * @author Calcey
 */
public class IncomeController implements  IncomeControllerInf{
    
    private Income income;
    private final ModelMapper modelMapper;

    public IncomeController(){
        modelMapper = ModelMapperFactory.getModelMapper();
        income = new Income();
    }
    
    @Override
    public double getTotalIncomeByMonth(int month) throws SQLException, ClassNotFoundException{
       return income.getIncomeByMonth(month);
    }
    
    @Override
    public int addIncome(IncomeDto incomeDto) throws SQLException, ClassNotFoundException {
        income = modelMapper.map(incomeDto, Income.class);
        return income.AddIncome();
    }
    
}
