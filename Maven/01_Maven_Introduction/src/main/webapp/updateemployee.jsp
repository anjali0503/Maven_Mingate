<%@page import="com.mindgate.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update employee!!!!</h1>

               <% Employee employee = (Employee)session.getAttribute("emp"); %>
               <form action="UpdateEmployeeServlet" method="post">
EmployeeId <input type="text" name ="id" readonly="true" value="<%= employee.getEmployee_id()%>"><br><br>
Name <input type="text" name ="name" value="<%= employee.getName()%>"><br><br>
Salary <input type="text" name ="salary" value="<%=employee.getSalary()%>"><br><br>
<input type="submit" value="Update Employee">
<br><br>
<a href="index.jsp">All Employees</a>
</form>
</body>
</html>