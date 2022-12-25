<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Header</title>
<link rel="stylesheet" href="css/AdminHeader.css">
<style>
 #logo img {
            width: 60px;
            border-radius: 50px;
        }

        #logo {
            margin: 10px 20px;
        }
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
            height: 260%;
            width: 180%;
            z-index: -1;
            opacity: 0.5;
        }
        .clg_box{
            height: 80px;
            width: 300px;
            margin: 1px;
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
            width: 80vw;
            margin: 2px;
            display: flex;
            justify-content: center;
            align-items: center;
            background-color: darkblue;
            animation: intro_bar 2s ease 1s 1  forwards;
            position: absolute;
            left: 302px;
            top: 0px;
            border-radius: 0px 20px;
            font-size: 30px;
            color: white;
            
        }
        li a{
            text-decoration: none;
        }
        .menu{
            width: 300px;
    height: 100vh;
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
        .button {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-flow: row wrap;
	height: 35px;
	
	color:black;
	padding:5px 15px;
	position: absolute;
	right: 10px;
	top: 15px;
	background-color: greenyellow;
	margin: 2px;
	border-radius: 10px;
	font-size: 15px;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
.button:hover {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-flow: row wrap;
	height: 35px;
	
	color:black;
	padding:5px 15px;
	position: absolute;
	right: 10px;
	top: 15px;
	background-color: white;

	margin: 2px;
	border-radius: 10px;
	font-size: 15px;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
.m {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-flow: row wrap;
	height: 20px;
	
	color:black;

	
	background-color: greenyellow;
	
	border-radius: 10px;
	font-size: 15px;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
.m:hover {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-flow: row wrap;
	height: 20px;
	
	color:black;

	
	background-color: white;

	
	border-radius: 10px;
	font-size: 15px;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
.m img{
position:absolute;
left:40px;
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
<div class="clg_box">
<div id="logo">
            <img src="icon1.jpg" alt="">
        </div>
        OM. G. COLLEGE
    </div>
    <div class="intro_bar">
        Welcome to Admin Panel
    </div>
    <div class="out">
		<a href="login.jsp" class="button"><img src='lo1.png' alt='' style="width:30px;height:23px;margin:2px;">Log Out</a>
    </div>
    <div class="menu">
      
		<a href="ViewServlet" class="m"><img src='ms.png' alt='' style='width:30px;height:23px;margin:2px; '>Students</a>
		 <a href="ViewStaffServlet" class="m"><img src='mstf.png' alt='' style='width:30px;height:23px;margin:2px;'>Staff</a>
		<a href="ViewAnnouncementServlet" class="m"><img src='mann.png' alt='' style='width:30px;height:23px;margin:2px;'>Announcement</a>

       
        </div>
     <footer>
        <div class="center">
            Copyright &copy; <a href="#">www.omgCollegeOfEngineering.com</a> All rights reserved
        </div>
    </footer>  
</body>
</html>