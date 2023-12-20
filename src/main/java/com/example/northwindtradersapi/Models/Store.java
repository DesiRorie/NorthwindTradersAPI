package com.example.northwindtradersapi.Models;

import java.util.ArrayList;

public class Store {
    ArrayList<Product> store;

    public Store() {
        this.store = new ArrayList<>();
        Product product1 = new Product(1,"Beans",2,5.25);
        Product product2 = new Product(2,"Chicken",3,9.25);
        Product product3 = new Product(3,"Soup",4,3.25);
        Product product4 = new Product(4,"Steak",3,10.25);
        store.add(product1);
        store.add(product2);
        store.add(product3);
        store.add(product4);
    }
    public ArrayList<Product> displayProducts(){
  return this.store;
    }
    public Product showByID(int id) {
        for (Product product: store) {
            if (id == product.productId){
                return product;
            }
        }
        return  null;
    }

}
