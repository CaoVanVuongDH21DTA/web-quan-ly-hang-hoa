package control;

import dao.StockDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import Entity.Stock;
import java.io.IOException;
import java.util.List;

@WebServlet("/stock")
public class StockControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		lấy data từ Dao
        StockDAO stockDAO = new StockDAO();
        List<Stock> stocks = stockDAO.getAllStocks();

//        set data cho jsp
        request.setAttribute("stocks", stocks);
        request.getRequestDispatcher("stock.jsp").forward(request, response); 
	}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
