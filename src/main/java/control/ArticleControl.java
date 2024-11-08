package control;

import java.io.IOException;
import java.util.List;

import Entity.Article;
import dao.ArticleDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("")
public class ArticleControl {
private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		lấy data từ Dao
        ArticleDAO articleDAO = new ArticleDAO();
        List<Article> articles = articleDAO.getAllArticle();

//        set data cho jsp
        request.setAttribute("articles", articles);
        request.getRequestDispatcher("stock.jsp").forward(request, response); 
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
