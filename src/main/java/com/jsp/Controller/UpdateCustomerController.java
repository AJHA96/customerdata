package com.jsp.Controller;

import java.io.IOException;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.Dao.CustomerDao;
import com.jsp.Entitity.Customer;


@WebServlet("/updatecustomer")
public class UpdateCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
     
		String firstName=req.getParameter("firstname");
		String lastName=req.getParameter("lastname");
		String streetname=req.getParameter("streetname");
		String address=req.getParameter("address");
		String city=req.getParameter("city");
		String state=req.getParameter("state");
		String email=req.getParameter("email");
		long phoneno=Long.parseLong(req.getParameter("phoneno"));
		
		Customer customer=new Customer();
		customer.setId(Integer.parseInt(req.getParameter("id")));
		customer.setFirstname(firstName);
		customer.setLastname(lastName);
		customer.setAddress(address);
		customer.setCity(city);
		customer.setStreet(streetname);
		customer.setState(state);
		customer.setEmail(email);
		customer.setPhoneno(phoneno);
		CustomerDao dao=new CustomerDao();
		dao.updateCustomer(customer);
		RequestDispatcher rd = req.getRequestDispatcher("showCostomer.jsp");
		rd.forward(req, response);
        
	}

}
