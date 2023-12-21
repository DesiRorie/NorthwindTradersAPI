package com.example.northwindtradersapi.Controller;

import com.example.northwindtradersapi.DAO.JdbcProductDao;
import com.example.northwindtradersapi.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductsController {
    private JdbcProductDao jdbcProductDao;
    @Autowired
    public ProductsController(JdbcProductDao dao) {
        this.jdbcProductDao = dao;
    }

    @RequestMapping(path = "/products" , method = RequestMethod.GET)
    public ArrayList<Product> getProducts()
    {
        System.out.println("ALLLLLL");
        return jdbcProductDao.getAll();
    }


    @RequestMapping(path="/products/{id}", method=RequestMethod.GET)
    public Product getProductById(@PathVariable int id) {
        return jdbcProductDao.getById(id);
    }


}




