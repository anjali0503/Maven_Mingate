<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Employee Details</h1>
<hr>
<form action="AddNewEmployeeServlet" method="post">
EmployeeId <input type="text" name ="id"><br><br>
Name <input type="text" name ="name"><br><br>
Salary <input type="text" name ="salary"><br><br>
<input type="submit" value="Add">
<br><br>
<a href="index.jsp">All Employees</a>
</form>

</body>
</html>