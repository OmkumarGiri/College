<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Header</title>
<link rel="stylesheet" href="css/add.css">

</head>
<body>
	<div class="clg_box">
		<div class="logo">
			<img src="icon1.jpg" alt="">
		</div>
		OM. G. COLLEGE
	</div>
	<div class="intro_bar">
	
		<a href="index.html" class="n">Home</a>
    <a href="Log.html" class="n">Login</a>
   	<a href="aboutus.html" class="n">About</a>
    <a href="contactus.html" class="n"> Contact us</a>
	
	</div>
	<div class="out">
		<a href="login.jsp" class="button"><img src='lo1.png' alt=''
			style="width: 30px; height: 23px; margin: 2px;">Log Out</a>
	</div>
	<div class="menu">

		<a href="ViewServlet" class="m"><img src='ms.png' alt=''
			style='width: 30px; height: 23px; margin: 2px;'>Students</a>
		<hr>
		<a href="ViewStaffServlet" class="m"><img src='mstf.png' alt=''
			style='width: 30px; height: 23px; margin: 2px;'>Staff</a>
		<hr>
		<a href="ViewAnnouncementServlet" class="m"><img src='mann.png'
			alt='' style='width: 30px; height: 23px; margin: 2px;'>Announcement</a>
		<hr>

	</div>
	<footer>
	<div class="center">
		Copyright &copy; <a href="#">www.omgCollegeOfEngineering.com</a> All
		rights reserved
	</div>
	</footer>
</body>
</html>