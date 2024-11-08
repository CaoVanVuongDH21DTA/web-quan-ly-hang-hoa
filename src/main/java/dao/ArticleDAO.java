package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Entity.Article;
import connectData.DatabaseConnection;

public class ArticleDAO {
	public List<Article> getAllArticle() {
        List<Article> articles = new ArrayList<>();
        String sql = "SELECT * FROM articles"; // Truy vấn từ bảng 'articles'

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            System.out.println("Đang lấy thông tin bài viết...");

            ResultSet rs = statement.executeQuery();

            // Duyệt qua tất cả các dòng trong kết quả truy vấn
            while (rs.next()) {
                // Tạo đối tượng Article từ kết quả truy vấn
                Article article = new Article();
                article.setArticle(rs.getInt("article"));
                article.setArticleName(rs.getString("article_name"));
                article.setLevel2Name(rs.getString("level_2_name"));
                article.setTuKhoa(rs.getString("tu_khoa"));
                article.setLevel4Name(rs.getString("level_4_name"));
                article.setMcName(rs.getString("mc_name"));
                article.setIdLevel1(rs.getInt("id_level_1"));
                article.setLevel1Name(rs.getString("level_1_name"));

                // Thêm đối tượng Article vào danh sách
                articles.add(article);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return articles;
    }
}