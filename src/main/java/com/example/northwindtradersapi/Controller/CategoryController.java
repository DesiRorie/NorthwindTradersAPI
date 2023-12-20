package com.example.northwindtradersapi.Controller;

import com.example.northwindtradersapi.Models.Category;
import com.example.northwindtradersapi.Models.CategoryList;
import com.example.northwindtradersapi.Models.Product;
import com.example.northwindtradersapi.Models.Store;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategoryController {
    @RequestMapping(path = "/categories" , method = RequestMethod.GET)
    public ArrayList<Category> getCategories()
    {
        CategoryList categoryList = new CategoryList();
        return categoryList.getCategoryList();
    }


    @RequestMapping(path="/categories/{id}", method=RequestMethod.GET)
    public Category getByCategoryID(@PathVariable int id) {
        CategoryList categoryList = new CategoryList();
        return categoryList.showByID(id);
    }


}




