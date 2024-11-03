package dao;

import connectData.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entity.Account;

public class UserDAO {
    
	public Account login(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            
            statement.setString(1, username);
            statement.setString(2, password);  // Trong thực tế, bạn nên dùng mã hóa BCrypt ở đây
            
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                return new Account(
                    resultSet.getInt("user_id"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("email"),
                    resultSet.getString("full_name"),
                    resultSet.getString("phone_number"),
                    resultSet.getString("address")
                );
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}