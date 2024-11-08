package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import Entity.Bill_sale;
import connectData.DatabaseConnection;

public class Bill_saleDAO {
	public List<Bill_sale> getAllBillsale() {
		List<Bill_sale> bill_sale = new ArrayList<>();
	    String sql = "SELECT * FROM bill_sale";

	    try (Connection connection = DatabaseConnection.getConnection();
	            PreparedStatement statement = connection.prepareStatement(sql)) {
	        ResultSet rs = statement.executeQuery();
	     // Duyệt qua tất cả các dòng trong kết quả truy vấn
            while (rs.next()) {
                // Tạo đối tượng Bill_sale từ kết quả truy vấn
                Bill_sale billSale = new Bill_sale();
                billSale.setMabill(rs.getInt("mabill"));
                billSale.setDate(rs.getDate("date"));
                billSale.setTime(rs.getString("time"));
                billSale.setBarcode(rs.getString("barcode"));
                billSale.setMaProduct(rs.getInt("ma_product"));
                billSale.setProductName(rs.getString("product_name"));
                billSale.setDonViProduct(rs.getString("don_vi_product"));
                billSale.setQuantity(rs.getInt("quanlity"));
                billSale.setPrice(rs.getDouble("price"));
                billSale.setDiscount(rs.getDouble("discount"));
                billSale.setPriceTruocThue(rs.getDouble("price_truoc_thue"));
                billSale.setThueSuatGTGT(rs.getDouble("thue_suat_gtgt"));
                billSale.setTienThueGTGT(rs.getDouble("tien_thue_gtgt"));
                billSale.setTotalAmount(rs.getDouble("total_amount"));

                // Thêm đối tượng Bill_sale vào danh sách
                bill_sale.add(billSale);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return bill_sale;
	}
	
	public List<Bill_sale> getWeeklySalesData() {
        List<Bill_sale> salesData = new ArrayList<>();
        String sql = "SELECT product_name, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 2 THEN total_amount ELSE 0 END) AS thu_2, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 3 THEN total_amount ELSE 0 END) AS thu_3, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 4 THEN total_amount ELSE 0 END) AS thu_4, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 5 THEN total_amount ELSE 0 END) AS thu_5, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 6 THEN total_amount ELSE 0 END) AS thu_6, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 7 THEN total_amount ELSE 0 END) AS thu_7, " +
                     "SUM(CASE WHEN DAYOFWEEK(date) = 1 THEN total_amount ELSE 0 END) AS cn, " +
                     "SUM(total_amount) AS tong_cong, " +
                     "(SELECT SUM(total_amount) FROM bill_sale WHERE WEEK(date) = WEEK(CURRENT_DATE) - 1 AND product_name = b.product_name) AS tuan_truoc " +
                     "FROM bill_sale b " +
                     "GROUP BY product_name";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
            	Bill_sale sale = new Bill_sale();
                sale.setProductName(rs.getString("product_name"));
                sale.setThu2(rs.getDouble("thu_2"));
                sale.setThu3(rs.getDouble("thu_3"));
                sale.setThu4(rs.getDouble("thu_4"));
                sale.setThu5(rs.getDouble("thu_5"));
                sale.setThu6(rs.getDouble("thu_6"));
                sale.setThu7(rs.getDouble("thu_7"));
                sale.setCn(rs.getDouble("cn"));
                sale.setTongCong(rs.getDouble("tong_cong"));
                sale.setTuanTruoc(rs.getDouble("tuan_truoc"));
                
                DecimalFormat formatter = new DecimalFormat("###,###.##");
                
                sale.setThu2Formatted(formatter.format(sale.getThu2()));
                sale.setThu3Formatted(formatter.format(sale.getThu3()));
                sale.setThu4Formatted(formatter.format(sale.getThu4()));
                sale.setThu5Formatted(formatter.format(sale.getThu5()));
                sale.setThu6Formatted(formatter.format(sale.getThu6()));
                sale.setThu7Formatted(formatter.format(sale.getThu7()));
                sale.setCnFormatted(formatter.format(sale.getCn()));
                sale.setTongCongFormatted(formatter.format(sale.getTongCong()));
                sale.setTuanTruocFormatted(formatter.format(sale.getTuanTruoc()));

                salesData.add(sale);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return salesData;
    }
	
	public List<Bill_sale> getTopProductsByQuantity() {
	    List<Bill_sale> topProducts = new ArrayList<>();
	    String sql = "SELECT barcode, product_name, SUM(quanlity) AS total_quanlity " +
	                 "FROM bill_sale " +
	                 "GROUP BY barcode, product_name " +
	                 "ORDER BY total_quanlity DESC LIMIT 5"; // Top 10 products

	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql)) {
	        ResultSet rs = statement.executeQuery();

	        while (rs.next()) {
	            Bill_sale sale = new Bill_sale();
	            sale.setBarcode(rs.getString("barcode"));
	            sale.setProductName(rs.getString("product_name"));
	            sale.setQuantity(rs.getInt("total_quanlity"));

	            topProducts.add(sale);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return topProducts;
	}
	
	public List<Bill_sale> getTopProductsByValue() {
	    List<Bill_sale> topProducts = new ArrayList<>();
	    String sql = "SELECT barcode, product_name, SUM(total_amount) AS total_value " +
	                 "FROM bill_sale " +
	                 "GROUP BY barcode, product_name " +
	                 "ORDER BY total_value DESC LIMIT 5"; // Top 10 products by revenue

	    try (Connection connection = DatabaseConnection.getConnection();
	         PreparedStatement statement = connection.prepareStatement(sql)) {
	        ResultSet rs = statement.executeQuery();

	        while (rs.next()) {
	            Bill_sale sale = new Bill_sale();
	            sale.setBarcode(rs.getString("barcode"));
	            sale.setProductName(rs.getString("product_name"));
	            sale.setTotalValue(rs.getDouble("total_value"));

	            topProducts.add(sale);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return topProducts;
	}

	
	public double calculateTotalForDay(List<Bill_sale> salesData, int dayOfWeek) {
	    double total = 0.0;
	    for (Bill_sale sale : salesData) {
	        switch (dayOfWeek) {
	            case 2: total += sale.getThu2(); break;
	            case 3: total += sale.getThu3(); break;
	            case 4: total += sale.getThu4(); break;
	            case 5: total += sale.getThu5(); break;
	            case 6: total += sale.getThu6(); break;
	            case 7: total += sale.getThu7(); break;
	            case 1: total += sale.getCn(); break;
	        }
	    }
	    return total;
	}

	public double calculateTotalForWeek(List<Bill_sale> salesData) {
	    double total = 0.0;
	    for (Bill_sale sale : salesData) {
	        total += sale.getTongCong(); // Tổng cộng cả tuần
	    }
	    return total;
	}

	public double calculateTotalForLastWeek(List<Bill_sale> salesData) {
	    double total = 0.0;
	    for (Bill_sale sale : salesData) {
	        total += sale.getTuanTruoc(); // Tổng doanh thu tuần trước
	    }
	    return total;
	}

}
