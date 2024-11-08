package dao;

import Entity.Product;
import connectData.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    // Phương thức lấy toàn bộ sản phẩm
    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();

        String sql = "SELECT * FROM products";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int maProduct = resultSet.getInt("ma_product");
                String productName = resultSet.getString("product_name");
                String donViProduct = resultSet.getString("don_vi_product");
                int quantity = resultSet.getInt("quantity");
                java.sql.Date expiryDate = resultSet.getDate("expiry_date");
                int remainingDays = resultSet.getInt("remaining_days");
                int returnPolicy = resultSet.getInt("return_policy");

                // Tạo đối tượng Product và thêm vào danh sách
                Product product = new Product(maProduct, productName, donViProduct, quantity, expiryDate, remainingDays, returnPolicy);
                products.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }
}
