<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*"%>

	    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
 body{
            background: url(bg.jpeg) no-repeat center top/cover;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
            margin: 0px;
            color:black;
        }
        .clg_box::before{
        content: "";
            background-color: black;
            position: absolute;
            height: 100%;
            width: 100%;
            z-index: -1;
            opacity: 0.3;
        }
        .clg_box{
            height: 80px;
            width: 300px;
            margin: 2px;
            background-color: greenyellow;
            border-radius: 0px 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            font-size: 25px;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        }
        .intro_bar{
            height: 80px;
            width:10px;
            margin: 2px;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: yellow;
            animation: intro_bar 2s ease 1s 1  forwards;
            position: absolute;
            left: 302px;
            top: 0px;
            border-radius: 0px 20px;
            
        }
        @keyframes intro_bar {
            from{
                font-size: 0px;
                width: 100px;
            }
            to{
                width: 80vw;
                font-size: 30px;
                background-color: darkblue;
    color: white;
            }
        }
        li a{
            text-decoration: none;
        }
        .menu{
            width: 300px;
    height: 500px;
    background-color: darkblue;
    color: white;
    border: 0.5px solid wheat;
    margin: 2px;
    padding: 26px 0px;
    animation: o1 1s ease 2s 1 forwards;
        }
        
        .li li{
            transition: all 1s ease 0.5s;
            
        }
        .li li:hover{
            z-index: -10;
        }
        button{
            
            padding:  10px 20px;
            position: absolute;
            right: 1px;
            top: 10px;
            background-color: greenyellow;
            margin: 2px;
            border-radius: 20px;
            font-size: 20px;
            font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
        }
        .list{
        position: relative;
        left:300px;
        bottom: 400px;
    
        }
        .menu a{
            display: flex;
            background-color: greenyellow;
            justify-content: center;
    border-radius: 15px;
    margin: 10px;
    padding: 10px;
    text-decoration: none;
    color: black ;
        }
</style>
<title>Insert title here</title>
</head>
<body>
<div class="clg_box">
        Om.G. College
    </div>
    <div class="intro_bar">
        Welcome to Student Header
    </div>
    <div class="out">
        <a href="login.jsp"><button>Log Out</button></a>
    </div>
    <div class="menu">
        <a href="StudentHeader.jsp">Student</a>
        <a href="ViewStudentAnnouncementServlet">View Announcement</a>
</div>
<div class="list">
hiiiiiiii
<jsp:useBean id="obj" class="login.User"/>
	<% 
	System.out.println(obj.getFull_name());
	%>
</div>
       
</body>
</html>