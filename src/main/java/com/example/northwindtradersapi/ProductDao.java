package com.example.northwindtradersapi;

import com.example.northwindtradersapi.Models.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);



}
