<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="all_css_script.jsp" %>
</head>
<body>
<form action="savedata" method="post"> 
Enter firstName:<input type="text"name="firstname">
<br>
Enter last name:<input type="text" name="lastname">
<br>
Enter Street:<input type="text" name="street">
<br>
Enter address:<input type="text" name="address">
<br>
Enter city:<input type="text" name="city">
<br>
Enter state:<input type="text" name="state" >
<br>
Enter email:<input type="email" name="email">
<br>
Enter phoneno:<input type="number" name="phoneno">

<button>submit</button>

</form>

</body>
</html>