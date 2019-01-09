/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spendituretracker.controller.inf;

import com.java.spendituretracker.dto.CategoryDto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Calcey
 */
public interface CategoryControllerInf {

    ArrayList<CategoryDto> GetAllCategories() throws ClassNotFoundException, SQLException;

}
