package control;

import java.io.IOException;
import java.util.List;

import Entity.Product;
import dao.ProductDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product-exp")
public class ProductControl extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		lấy data từ Dao
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.getAllProducts();

//        set data cho jsp
        request.setAttribute("products", products);
        request.getRequestDispatcher("product-exp.jsp").forward(request, response); 
	}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
