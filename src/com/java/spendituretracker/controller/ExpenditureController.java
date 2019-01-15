/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller;

import com.java.spendituretracker.common.ModelMapperFactory;
import com.java.spendituretracker.controller.inf.ExpenditureControllerInf;
import com.java.spendituretracker.dto.ExpenditureDto;
import com.java.spendituretracker.dto.ExpenditureListDto;
import com.java.spendituretracker.model.expenditure.Expenditure;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeToken;

/**
 *
 * @author Calcey
 */
public class ExpenditureController implements ExpenditureControllerInf {

    private Expenditure expenditure;
    private final ModelMapper modelMapper;

    public ExpenditureController() {
        expenditure = new Expenditure();
        modelMapper = ModelMapperFactory.getModelMapper();
    }

    @Override
    public int addExpenditure(ExpenditureDto expenditureDto) throws SQLException, ClassNotFoundException {
        expenditure = modelMapper.map(expenditureDto, Expenditure.class);
        return expenditure.AddExpenditure();
    }

    public ArrayList<ExpenditureListDto> getExpendituresByMonth(int month) throws SQLException, ClassNotFoundException {
        Type listType = new TypeToken<ArrayList<ExpenditureListDto>>() {
        }.getType();        
         ArrayList<Expenditure> expenditures = expenditure.GetAllExpendituresByMonth(month);
        return modelMapper.map(expenditures, listType);
    }

}
