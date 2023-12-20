package com.example.northwindtradersapi.Models;

import java.util.ArrayList;

public class CategoryList {
    ArrayList<Category> categoryList;

    public CategoryList() {
        this.categoryList = new ArrayList<>();
        Category category1 = new Category(3,"Meat");
        Category category2 = new Category(2,"Veggies");
        Category category3 = new Category(4,"Soup");
        Category category4 = new Category(1,"Misc");

        categoryList.add(category1);
        categoryList.add(category2);

        categoryList.add(category3);

        categoryList.add(category4);

    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public Category showByID(int id) {
        for (Category category: categoryList) {
            if (id == category.categoryId){
                return category;
            }
        }
        return  null;
    }
}
