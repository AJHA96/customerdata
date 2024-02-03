<%@page import="com.jsp.Entitity.Customer"%>
<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Customer</title>
<%@ include file="all_css_script.jsp"%>
</head>
<body>

   <%
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Customer c=  em.find(Customer.class, Integer.parseInt(request.getParameter("id")));



	%>
<form action="updatecustomer" method="post"> 
Enter firstName:<input type="text"name="firstname"  value="<%=c.getFirstname() %>">
<br>
Enter last name:<input type="text" name="lastname" value="<%=c.getLastname() %>">
<br>
Enter Street:<input type="text" name="streetname" value="<%=c.getStreet() %>">
<br>
Enter address:<input type="text" name="address" value="<%=c.getAddress() %>">
<br>
Enter city:<input type="text" name="city" value="<%=c.getCity()%>">
<br>
Enter state:<input type="text" name="state" value="<%=c.getState()%>">
<br>
Enter email:<input type="email" name="email" value="<%=c.getEmail() %>">
<br>
Enter phoneno:<input type="number" name="phoneno" value="<%=c.getPhoneno() %>"> 
<input type="hidden"  value="<%=c.getId() %>" name ="id">

<button>submit</button>

</form>


</body>
</html>