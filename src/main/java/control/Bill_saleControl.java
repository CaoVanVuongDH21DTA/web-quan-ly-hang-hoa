package control;

import java.io.IOException;
import java.util.List;

import Entity.Bill_sale;
import dao.Bill_saleDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.text.DecimalFormat;

@WebServlet("/index")
public class Bill_saleControl extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Step 1: Retrieve data from DAO
        Bill_saleDAO billsaleDao = new Bill_saleDAO();
        List<Bill_sale> billsales = billsaleDao.getAllBillsale(); // Get all bill sales

        // Step 2: Set data for the JSP
        request.setAttribute("billsales", billsales);  // Set the sales data for the JSP

        // Step 3: Get weekly sales data
        List<Bill_sale> salesData = billsaleDao.getWeeklySalesData();  // Fetch weekly sales data
        request.setAttribute("salesData", salesData);  // Set weekly sales data for the JSP
        
        List<Bill_sale> topProducts = billsaleDao.getTopProductsByQuantity(); // Fetch top products
        request.setAttribute("topProducts", topProducts);
        
        List<Bill_sale> topProductsByValue = billsaleDao.getTopProductsByValue();
        request.setAttribute("topProductsByValue", topProductsByValue);


     // Step 4: Format total value for each product
        DecimalFormat formatter = new DecimalFormat("###,###.##");
        for (Bill_sale product : topProductsByValue) {
        	// Format the totalValue field
            String formattedTotalValue = formatter.format(product.getTotalValue());
            product.setFormattedTotalValue(formattedTotalValue);  // Assuming you have a setter for this field
        }
        
     // In your doGet method:
        double totalMonday = billsaleDao.calculateTotalForDay(salesData, 2);
        double totalTuesday = billsaleDao.calculateTotalForDay(salesData, 3);
        double totalWednesday = billsaleDao.calculateTotalForDay(salesData, 4);
        double totalThursday = billsaleDao.calculateTotalForDay(salesData, 5);
        double totalFriday = billsaleDao.calculateTotalForDay(salesData, 6);
        double totalSaturday = billsaleDao.calculateTotalForDay(salesData, 7);
        double totalSunday = billsaleDao.calculateTotalForDay(salesData, 1);
        double totalWeek = billsaleDao.calculateTotalForWeek(salesData);
        double totalLastWeek = billsaleDao.calculateTotalForLastWeek(salesData);

     // Format the weekly total values
        String formattedTotalMonday = formatter.format(totalMonday);
        String formattedTotalTuesday = formatter.format(totalTuesday);
        String formattedTotalWednesday = formatter.format(totalWednesday);
        String formattedTotalThursday = formatter.format(totalThursday);
        String formattedTotalFriday = formatter.format(totalFriday);
        String formattedTotalSaturday = formatter.format(totalSaturday);
        String formattedTotalSunday = formatter.format(totalSunday);
        String formattedTotalWeek = formatter.format(totalWeek);
        String formattedTotalLastWeek = formatter.format(totalLastWeek);

        // Set formatted totals as attributes
        request.setAttribute("formattedTotalMonday", formattedTotalMonday);
        request.setAttribute("formattedTotalTuesday", formattedTotalTuesday);
        request.setAttribute("formattedTotalWednesday", formattedTotalWednesday);
        request.setAttribute("formattedTotalThursday", formattedTotalThursday);
        request.setAttribute("formattedTotalFriday", formattedTotalFriday);
        request.setAttribute("formattedTotalSaturday", formattedTotalSaturday);
        request.setAttribute("formattedTotalSunday", formattedTotalSunday);
        request.setAttribute("formattedTotalWeek", formattedTotalWeek);
        request.setAttribute("formattedTotalLastWeek", formattedTotalLastWeek);
        
        // Step 4: Forward to index.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");  
        dispatcher.forward(request, response);  
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle POST requests if necessary
    }
    
    
}
