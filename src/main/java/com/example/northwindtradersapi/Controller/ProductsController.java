package com.example.northwindtradersapi.Controller;

import com.example.northwindtradersapi.Models.Product;
import com.example.northwindtradersapi.Models.Store;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductsController {
    @RequestMapping(path = "/products" , method = RequestMethod.GET)
    public ArrayList<Product> getProducts()
    {
        Store store = new Store();
        return store.displayProducts();
    }


    @RequestMapping(path="/products/{id}", method=RequestMethod.GET)
    public Product getProductById(@PathVariable int id) {
        Store store = new Store();
        return store.showByID(id);
    }


}




