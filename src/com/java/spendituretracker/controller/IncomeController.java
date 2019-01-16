/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller;

import com.java.spendituretracker.common.ModelMapperFactory;
import com.java.spendituretracker.controller.inf.IncomeControllerInf;
import com.java.spendituretracker.dto.ExpenditureListDto;
import com.java.spendituretracker.dto.IncomeDto;
import com.java.spendituretracker.dto.IncomeListDto;
import com.java.spendituretracker.model.expenditure.Expenditure;
import com.java.spendituretracker.model.income.Income;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

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
    
      public ArrayList<IncomeListDto> getIncomeByMonth(int month) throws SQLException, ClassNotFoundException {
        Type listType = new TypeToken<ArrayList<IncomeListDto>>() {
        }.getType();        
         ArrayList<Income> expenditures = income.GetAllIncomeByMonth(month);
        return modelMapper.map(expenditures, listType);
    }
    
}
