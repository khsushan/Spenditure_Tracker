/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller;

import com.java.spendituretracker.controller.inf.CategoryControllerInf;
import com.java.spendituretracker.dto.CategoryDto;
import com.java.spendituretracker.model.category.Category;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.ArrayList;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

/**
 *
 * @author Calcey
 */
public class CategoryController implements  CategoryControllerInf{

    private Category category;
    private final ModelMapper modelMapper;

    public CategoryController() {
        category = new Category();
        modelMapper = new ModelMapper();
    }

    public ArrayList<CategoryDto> GetAllCategories() throws ClassNotFoundException, SQLException {
        Type listType = new TypeToken<ArrayList<CategoryDto>>() {
        }.getType();
        ArrayList<Category> categories = category.GetAllCategories();
        return modelMapper.map(categories, listType);
    }

}
