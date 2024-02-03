package com.jsp.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginUserController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");

  if(request.getParameter("username").equals( "test@sunbasedata.com")&& request.getParameter("password").equals("Test@123")){
		 
	  request.getRequestDispatcher("showCostomer.jsp").forward(request, response);
		
		
	}else {
	      response.getWriter().print("<h1>invailid user id and password </h1>");
		 request.getRequestDispatcher("login.jsp").include(request, response);
	}

}
}