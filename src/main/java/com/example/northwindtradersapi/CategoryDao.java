package com.example.northwindtradersapi;

import com.example.northwindtradersapi.Models.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
}
