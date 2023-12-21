package com.example.northwindtradersapi.DAO;

import com.example.northwindtradersapi.Models.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
    Category insert(Category category);
}
