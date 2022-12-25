<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
<br>
        <form method="post" action="LoginServ" class="container"> 
        <h1>Log In</h1>
        <br>
        <select name="post">
        <option>select any one</option>
        <option>Admin</option>
        <option>Student</option>
        </select>
        <br>
        <input type="text" name="name" placeholder="name">
        <br>
        <input type="password" name="password" placeholder="password">
        <br>
        <input type="submit" value="Login">
        </form>
       
</body>
</html>