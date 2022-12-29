package login;

import java.io.IOException;  
import java.io.PrintWriter;  
  

import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import dao.UserDao;
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
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
		out.print("    OM. G. COLLEGE");
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
		out.print("<div class='list'>");
		
        out.println("<h1>Update Students</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        User e=UserDao.getEmployeeById(id);  
          
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
        out.print("<tr><td>Full Name:</td><td><input type='text' name='full_name' value='"+e.getFull_name()+"'/></td></tr>");
        out.print("<tr><td>Name:</td><td><input type='text' name='log_name' value='"+e.getLog_name()+"'/></td></tr>");  
        out.print("<tr><td>Password:</td><td><input type='password' name='log_pass' value='"+e.getLog_pass()+"'/></td></tr>");  
        out.print("<tr><td>Department:</td><td><input type='text' name='department' value='"+e.getDepartment()+"'/></td></tr>");  
        out.print("<tr><td>Year:</td><td><input type='number' name='year' value='"+e.getYear()+"'/></td></tr>");  
        out.print("<tr><td>Age:</td><td><input type='number' name='age' value='"+e.getAge()+"'/></td></tr>");  
        out.print("<tr><td>Gender:</td><td><input type='text' name='gender' value='"+e.getGender()+"'/></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='text' name='email' value='"+e.getEmail()+"'/></td></tr>");   
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
		out.print("</div>");
		out.print("<footer>");
		out.print("<div class='center'>");
		out.print(" Copyright &copy; <a href='#'>www.omgCollegeOfEngineering.com</a> All rights reserved");
		out.print("</div>");
	out.print("</footer>");
          
        out.close();  
    }  
}  