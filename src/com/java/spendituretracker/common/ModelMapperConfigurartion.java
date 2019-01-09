/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.common;

import com.java.spendituretracker.dto.ExpenditureListDto;
import com.java.spendituretracker.model.expenditure.Expenditure;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

/**
 *
 * @author Calcey
 */
public final class ModelMapperConfigurartion {
    
    private static ModelMapper modelMapper;
    
    public static ModelMapper getModelMapper(){
        if(modelMapper == null){
            modelMapper = new ModelMapper();
            configureModelMapper();
        }
        
        return  modelMapper;
    }
    
    private static void configureModelMapper(){
         modelMapper.addMappings(new PropertyMap<Expenditure, ExpenditureListDto>() {
            @Override
            protected void configure() {
                map().setCategoryName(source.getCategory().getCategoryName());
            }
        });
    }
    
    
    
}
