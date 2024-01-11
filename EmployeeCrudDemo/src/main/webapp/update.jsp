<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>UPDATE</h1>

<form method="post" action="Update">



  Employee Id : <input type="text" name="empid" id="empid" value="${emp.id}" readonly><br>
    Employee name: <input type="text" name="ename" id="ename" value="${emp.name}"><br>
    Employee Salary: <input type="text" name="sal" id="sal" value="${emp.sal}"><br>
    <button type="submit" name="btn" id="btn">Update employee</button>
</form>
</body>
</html>