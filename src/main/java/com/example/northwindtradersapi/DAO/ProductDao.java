package com.example.northwindtradersapi.DAO;

import com.example.northwindtradersapi.Models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);



}
