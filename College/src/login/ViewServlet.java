package login;


import java.io.IOException;
import java.io.PrintWriter;  
import java.util.List;  



import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import dao.UserDao;
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
			throws ServletException, IOException {  
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		out.print("<link rel='stylesheet' href='css/add.css'>");
		out.print("<link rel='stylesheet' href=''>");
		out.print("<body>");
		out.print(" <div class='clg_box'>");
		out.print("	<div class='logo'>");
		out.print("  <img src='icon1.jpg' alt=''>");
				out.print(" </div>");
		out.print("   OM. G. COLLEGE");
		out.print(" </div>");
		out.print("<div class='intro_bar'>");
		out.print("		<a href='index.html' class='n'>Home</a>");
		out.print("<a href='Log.html' class='n'>Login</a>");
				out.print("<a href='aboutus.html' class='n'>About</a>");
						out.print(" <a href='contactus.html' class='n'> Contact us</a>");		out.print("  </div>");
		out.print("<div class='out'>");
		out.print(" <a href='login.jsp' class='button'><img src='lo1.png' alt='' style='width:30px;height:23px;margin:2px;'>Log Out</a>");
		out.print("</div>");
		out.print("<div class='menu'>");

		out.print("<a href='ViewServlet' class='m'><img src='ms.png' alt='' style='width:30px;height:23px;margin:2px; '>Students</a>");
		out.print("<hr>");
		out.print("<a href='ViewStaffServlet' class='m'><img src='mstf.png' alt='' style='width:30px;height:23px;margin:2px;'>Staff</a>");
		out.print("<hr>");
		out.print("<a href='ViewAnnouncementServlet' class='m'><img src='mann.png' alt='' style='width:30px;height:23px;margin:2px;'>Announcement</a>");
		out.print("<hr>");


		out.print("</div>");
		List<User> list=UserDao.getAllEmployees();  
		out.print("<div class='list1'>");
		out.print("<h1>Students List</h1>");
		out.print("<a href='AdminAddStudents.jsp'>Add Students</a>");
		out.print("<table border='1' width='75%'");  
		
		out.print("<tr><th>Id</th><th>Full Name</th><th>Log Name</th><th>Log Pass</th><th>Department</th><th>Year</th><th>Age</th><th>Gender</th><th>Email</th><th>Edit Student</th><th>Delete Student</th><th>View Courses</th></tr>");  
		for(User u:list){  
			out.print("<tr><td>"+u.getId()+"</td><td>"+u.getFull_name()+"</td><td>"+u.getLog_name()+"</td><td>"+u.getLog_pass()+"</td><td>"+u.getDepartment()+"</td><td>"+u.getYear()+"</td><td>"+u.getAge()+"</td><td>"+u.getGender()+"</td><td>"+u.getEmail()+"</td><td><a href='EditServlet?id="+u.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+u.getId()+"'>Delete Student</a></td><td><a href='ViewCourseServlet?id="+u.getId()+"'>View Courses</a></td></tr>");  
		}  
		out.print("</table>");  
		out.print("</div>");
		out.print("<footer>");
		out.print("<div class='center'>");
		out.print(" Copyright &copy; <a href='#'>www.omgCollegeOfEngineering.com</a> All rights reserved");
		out.print("</div>");
	out.print("</footer>");
		out.close();  
		out.println("</body>");
	}  
}  