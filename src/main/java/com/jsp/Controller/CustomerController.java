package com.jsp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dao.CustomerDao;
import com.jsp.Entitity.Customer;

@WebServlet("/savedata")
public class CustomerController extends HttpServlet  {
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException 
	{
		String firstName=req.getParameter("firstname");
		String lastName=req.getParameter("lastname");
		String streetname=req.getParameter("street");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String email=req.getParameter("email");
		long phoneno=Long.parseLong(req.getParameter("phoneno"));
		Customer customer=new Customer();
		customer.setFirstname(firstName);
		customer.setLastname(lastName);
		customer.setAddress(address);
		customer.setCity(city);
		customer.setStreet(streetname);
		customer.setState(state);
		customer.setEmail(email);
		customer.setPhoneno(phoneno);
		CustomerDao dao=new CustomerDao();
		dao.saveCustomer(customer);
		
		RequestDispatcher rd= req.getRequestDispatcher("showCostomer.jsp");
		rd.forward(req, resp);
 		
	}
	

}
