<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee View Page</title>
</head>
<body>

<h2>Welcome to Employee View Page</h2>

<table border=2>

<tr>
	<th>Id</th>
	<td>${emp.empId}</td>
</tr>
<tr>
	<th>Name</th>
	<td>${emp.empName}</td>
</tr>
<tr>
	<th>Gender</th>
	<td>${emp.empGen}</td>
</tr>
<tr>
	<th>Salary</th>
	<td>${emp.empSal}</td>
</tr>
<tr>
	<th>Department</th>
	<td>${emp.empDept}</td>
</tr>
<tr>
	<th>Delete</th>
	<td>
		<a href="/EmployeeCrudSpringBoot/delete?id=${emp.empId}">Delete</a>
	</td>
</tr>
<tr>
	<th>Update</th>
	<td>
		<a href="/EmployeeCrudSpringBoot/getUpdate?id=${emp.empId}">Update</a>
	</td>
</tr>

</table>

<a href="/EmployeeCrudSpringBoot/all">View All</a> &nbsp;
<a href="/EmployeeCrudSpringBoot/reg">Register</a> &nbsp;
<a href="/EmployeeCrudSpringBoot/">Home</a>

${msg}

</body>
</html>