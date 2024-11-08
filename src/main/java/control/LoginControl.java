package control;

import java.io.IOException;


import Entity.Account;
import dao.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginControl extends HttpServlet {
	private UserDAO userDAO = new UserDAO();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Account a = userDAO.login(username, password);
		
		if(a == null) {
			request.setAttribute("errorMessage", "Tên đăng nhập hoặc mật khẩu không đúng");
			request.getRequestDispatcher("login").forward(request, response);
		}else {
			request.getRequestDispatcher("index").forward(request, response);
		}
	}
}
