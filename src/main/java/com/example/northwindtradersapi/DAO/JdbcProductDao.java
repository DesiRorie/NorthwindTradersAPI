package com.example.northwindtradersapi.DAO;

import com.example.northwindtradersapi.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

@Component
public class JdbcProductDao implements ProductDao {
    private  final DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public ArrayList<Product> getAll() {
        ArrayList<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM Products;";
        try(Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rows = statement.executeQuery(sql);
            while(rows.next()){
                int productId = rows.getInt("ProductID");
                String productName = rows.getString("ProductName");
                int categoryId = rows.getInt("CategoryID");
                Double unitPrice = rows.getDouble("UnitPrice");
                Product product = new Product(productId,productName,categoryId,unitPrice);
                products.add(product);
            }
        }
        catch (SQLException e){ System.out.println(e); }
        return products;
    }

    @Override
    public Product getById(int id) {
        Product returnedProduct = null;
        String sql = "SELECT * FROM Products WHERE ProductID = ?";
        try(Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, id);
            ResultSet rows = preparedStatement.executeQuery();

            if (rows.next()) {
                int productId = rows.getInt("ProductID");
                String productName = rows.getString("ProductName");
                int categoryId = rows.getInt("CategoryID");
                Double unitPrice = rows.getDouble("UnitPrice");
                returnedProduct = new Product(productId, productName, categoryId, unitPrice);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return returnedProduct;
    }
}
