package com.jsp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dao.CustomerDao;

@WebServlet("/deletecustomer")
public class DeleteCustomerController extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    
		
		   CustomerDao dao = new CustomerDao();
		   dao.deleteCustomer(Integer.parseInt(req.getParameter("id")));
		   req.getRequestDispatcher("showCostomer.jsp").forward(req, resp);
	}

}
