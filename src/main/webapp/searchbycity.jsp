<%@page import="java.util.List"%>
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
<title>Show Costumer data</title>
<%@ include file="all_css_script.jsp"%>
</head>
<body>

	<table class="table table-dark">
		<thead>
			<tr>
				<td><a class="btn btn-primary" href="saveData.jsp" role="button">add
						Customer</a></td>
				<td>
			    <div class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            search
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="searchbyname.jsp">first Name</a></li>
            <li><a class="dropdown-item" href="searchbyemail.jsp">Email</a></li>
           
            <li><a class="dropdown-item" href="searchbycity.jsp">City</a></li>
               <li><a class="dropdown-item" href="searchbynumber.jsp">Phone Number</a></li>
          </ul>
        </div>
        
         <form class="d-flex"  action="citysearch.jsp">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="fn">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
				
				
				
				
				</td>
			</tr>


			<tr>
				<th>First name</th>
				<th>Last name</th>
				<th>street</th>
				<th>Address</th>
				<th>City</th>


				<th>State</th>
				<th>Email</th>
				<th>Phone number</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
		</thead>
		<%
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<Customer> c = (em.createQuery("from Customer")).getResultList();

		for (Customer cc : c) {
		%>

		<tbody>
			<tr>
				<td><%=cc.getFirstname()%></td>
				<td><%=cc.getLastname()%></td>
				<td><%=cc.getStreet()%></td>
				<td><%=cc.getAddress()%></td>
				<td><%=cc.getCity()%></td>
				<td><%=cc.getState()%></td>
				<td><%=cc.getEmail()%></td>
				<td><%=cc.getPhoneno()%></td>
				<td><a class="btn btn-primary"
					href="updatecustomer.jsp?id=<%=cc.getId()%>" role="button">Edit</a></td>
				<td><a class="btn btn-primary"
					href="deletecustomer?id=<%=cc.getId()%>" role="button">Delete</a></td>
			</tr>
		</tbody>
		<%
		}
		%>
	</table>








</body>
</html>