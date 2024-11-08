package control;

import java.io.IOException;
import java.util.List;

import Entity.Supplier;
import dao.SupplierDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/supplier")
public class SupplierControl extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SupplierDAO supplierDAO = new SupplierDAO();
        List<Supplier> suppliers = supplierDAO.getAllSuppliers();
        
        request.setAttribute("suppliers", suppliers);
        request.getRequestDispatcher("supplier.jsp").forward(request, response);
    }
}
