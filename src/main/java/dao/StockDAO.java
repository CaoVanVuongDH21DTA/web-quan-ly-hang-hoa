package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Entity.Stock;
import connectData.DatabaseConnection;

public class StockDAO {
	public List<Stock> getAllStocks() {
		List<Stock> stocks = new ArrayList<>();
	    String sql = "SELECT * FROM stocks";

	    try (Connection connection = DatabaseConnection.getConnection();
	            PreparedStatement statement = connection.prepareStatement(sql)) {
	        ResultSet rs = statement.executeQuery();
	        while (rs.next()) {
	        	stocks.add( new Stock(
	                rs.getInt("ma_product"),
	                rs.getString("product_name"),
	                rs.getString("don_vi_product"),
	                rs.getInt("quantity"),
	                rs.getDouble("cost")
	            ));
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return stocks;
	}
}