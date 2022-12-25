<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Log In</title>

<style>
*{
font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
body {
	background: url(bg.jpeg) no-repeat center top/cover;
	font-size: x-large;
	width: 100%;
	height: 500px;
	padding: 0%;
}

.login {
	display: flex;
	flex-flow: column wrap;
	justify-content: center;
	align-items: center;
	font-size: x-large;
	width: 100%;
	height: 500px;
	padding: 0%;
}
        .container{
            border: 2px solid black;
            background-color:rgba(255, 255, 255, 0.492);
            width: 30%;
            height: 80%;
            padding: 20px;
            display: flex;
            flex-flow: column wrap;
            align-items: center;
        }
        h1{
            margin: 5px;
            font-size:40px;
        }
        .container input{
            border:2px solid black;
            margin: 10px;
            padding: 2px;
            text-align: center;
            font-size: large;
            width: 60%;
            border-radius: 10px;
        }
        select{
            border:2px solid black;
            margin: 10px;
            padding: 2px;
            text-align: center;
            font-size: large;
            width: 3    0%;
            border-radius: 10px;
        }
        input[type=submit]{
        	border:1px solid black;
            margin: 10px;
            padding: 2px;
            text-align: center;
            font-size: large;
            width: 30%;
            border-radius: 10px;
        }
        input[type=submit]:hover{
            background-color: lemonchiffon;
        }
         .container img{
  width:110px;
 heigth:110px;
 margin:20px;
 padding:10px;
 border:2px solid black;

 }
  footer{
 
           color:white;
           font-size:0.8rem;
            padding: 9px 20px;
            margin: 10px;
            display: block;
        }
        .center{
        display: flex;
	flex-flow: row wrap;
	align-items: center;
	justify-content: center;
        }
</style>
</head>
<body>
<br>
<body>
	<a href="index.html">Home</a>>><a href="Log.html">Login</a>>><a href="StudentLogin.html">Student Login</a>
	<br>
	<div class="login">
        <form method="post" action="StudentPanel" class="container"> 
        <h1>Student Log In</h1>
        <img src="stu.png"	alt="admin image" style="margin-bottom:10px;border-radius:110px;">
       
        <input type="text" name="name" placeholder="name">
        
        <input type="password" name="password" placeholder="password">
        
        <input type="submit" value="Login">
        </form>
    </div> 
    <footer>
        <div class="center">
            Copyright &copy; <a href="#">www.omgCollegeOfEngineering.com</a> All rights reserved
        </div>
    </footer>  
</body>
</html>

