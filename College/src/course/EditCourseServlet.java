package course;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.User;
import dao.UserDao;

/**
 * Servlet implementation class EditCourseServlet
 */
@WebServlet("/EditCourseServlet")
public class EditCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        
  
        
        out.print("<link rel='stylesheet' href='css/add.css'>");
	
		out.print("<body>");
		out.print(" <div class='clg_box'>");
		out.print("	<div class='logo'>");
		out.print("  <img src='icon1.jpg' alt=''>");
				out.print(" </div>");
		out.print("  OM. G. COLLEGE");
		out.print(" </div>");
		out.print("<div class='intro_bar'>");
		out.print("		<a href='index.html' class='n'>Home</a>");
		out.print("<a href='Log.html' class='n'>Login</a>");
				out.print("<a href='aboutus.html' class='n'>About</a>");
						out.print(" <a href='contactus.html' class='n'> Contact us</a>");
		out.print("  </div>");
		out.print("<div class='out'>");
		out.print(" <a href='StudentLogin.jsp' class='button'><img src='lo1.png' alt='' style='width:30px;height:23px;margin:2px;'>Log Out</a>");
		out.print("</div>");
		
		User e=UserDao.getStudentInfo(id);
		
		out.print("<div class='menu'>");
		out.print("<a href='StudentPanel1?name="+e.getLog_name()+"' class='m'><img src='ms.png' alt='' style='width:30px;height:23px;margin:2px;'>Student</a>");
		out.print("<hr>");
		out.print("<a href='EditCourseServlet?id="+e.getId()+"' class='m'><img src='mcr.png' alt='' style='width:30px;height:23px;margin:2px;'>Course registration</a>");
		out.print("<hr>");
		out.print("<a href='ViewStudentAnnouncementServlet?name="+e.getLog_name()+"' class='m'><img src='mann.png' alt='' style='width:30px;height:23px;margin:2px;'>Announcement</a>");
		out.print("<hr>");

		out.print("</div>");
		out.print("<div class='list3'>");
		
         
		out.println("<h1 style='color:black;'>Course Registration</h1>"); 
		 out.print("<br>");
        Course c=new Course();
          
        out.print("<form action='CourseServlet'  class='ctn'>" );
        
        out.print("<table style='color:black; font-size:20px;'>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value="+id+"></td></tr>");  
//        out.print("<tr><td>Roll number:</td><td><input type='hidden' name='one' value='English'/></td></tr>");
        out.print("<tr><td>Sub:1 Computer Network</td><td><input type='checkbox' name='one' value='Computer Network'/></td></tr>");
        out.print("<tr><td>Sub:2 Analog Communication</td><td><input type='checkbox' name='two' value='Analog Communication'/></td></tr>");  
        out.print("<tr><td>Sub:3 Microwave Engineering</td><td><input type='checkbox' name='three' value='Microwave Engineering'/></td></tr>"); 
        out.print("<tr><td>Sub:4 Embedded System</td><td><input type='checkbox' name='four' value='Embedded System'/></td></tr>"); 
        out.print("<tr><td>Sub:5 Microcontroller And Application</td><td><input type='checkbox' name='five' value='Microcontroller And Application'/></td></tr>"); 
        out.print("<tr><td>Sub:6 Digital Signal Processing</td><td><input type='checkbox' name='six' value='Digital Signal Processing'/></td></tr>"); 
        out.print("<tr><td>Sub:7 Digital Communications</td><td><input type='checkbox' name='seven' value='Digital Communications'/></td></tr>"); 
        out.print("<tr><td>Sub:8 Broadband Communications</td><td><input type='checkbox' name='eight' value='Broadband Communications'/></td></tr>"); 
        out.print("<tr><td>Sub:9 Mathematics 1</td><td><input type='checkbox' name='nine' value='Mathematics 1'/></td></tr>"); 
        out.print("<tr><td>Sub:10 Mathematics 2</td><td><input type='checkbox' name='ten' value='Mathematics 2'/></td></tr>"); 
        out.print("</table>");
        out.print("<br>");
        out.print("<tr><td colspan='2'><input type='submit' value='Save '/></td></tr>"); 
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
