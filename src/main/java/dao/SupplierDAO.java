package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Entity.Supplier;
import connectData.DatabaseConnection;

public class SupplierDAO {

    // Phương thức lấy tất cả nhà cung cấp
    public List<Supplier> getAllSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        String sql = "SELECT * FROM suppliers";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            
            while (resultSet.next()) {
                int maNcc = resultSet.getInt("ma_ncc");
                String tenNcc = resultSet.getString("ten_ncc");
                String thongTinXuLySuVu = resultSet.getString("thong_tin_xu_ly_su_vu");
                String dieuKienDoiTra = resultSet.getString("dieu_kien_doi_tra");
                
                Supplier supplier = new Supplier(maNcc, tenNcc, thongTinXuLySuVu, dieuKienDoiTra);
                suppliers.add(supplier);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return suppliers;
    }
}