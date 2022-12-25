package course;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.User;
import course.Course;
import dao.UserDao;

/**
 * Servlet implementation class ViewCourseServlet
 */
@WebServlet("/ViewCourseServlet")
public class ViewCourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCourseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		
		out.print("<link rel='stylesheet' href='css/a.css'>");
		out.print("<link rel='stylesheet' href=''>");
		out.print("<body>");
		out.print(" <div class='clg_box'>");
		out.print("	<div id='logo'>");
		out.print("  <img src='icon1.jpg' alt=''>");
				out.print(" </div>");
		out.print("    OM. G. COLLEGE");
		out.print(" </div>");
		out.print("<div class='intro_bar'>");
		out.print("Admin Header");
		out.print("  </div>");
		out.print("<div class='out'>");
		out.print(" <a href='login.jsp' class='button'><img src='lo1.png' alt='' style='width:30px;height:23px;margin:2px;'>Log Out</a>");
		out.print("</div>");
//		out.print("<div class='menu'>");
//		out.print("<a href='ViewServlet' margin='50px'>Back</a>");
//		out.print(" <a href='ViewStaffServlet'>Staff</a>");
//		out.print("<a href='ViewAnnouncementServlet'>Announcement</a>");
//
//		out.print("</div>");
		out.print("<div class='list'>");
		
        out.println("<h1>Registered Courses</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
          
        User e=UserDao.getEmployeeById(id);  
        
        out.print("<form action='EditServlet2' method='post'>"); 
        out.print("<h2><a href='ViewServlet' class='vclass'>Back</a></h2>");
        
        Course c=UserDao.getCourseById(id);
        out.print("<h2><b><a href='DeleteCourseServlet?id="+c.getId()+"'>Delete Course</a></br></h2>");
        out.print("<div class='cr'>");
        out.print("<h3>Name:"+e.getFull_name()+"</h3>");
        out.print("<h3>Roll no:"+e.getId()+"</h3>");
       
        out.print("<table border='1' height='500px' width='600px' style='color:black; background-color:white; padding:20px; align-items:center;'>");  
        out.print("<tr><td><h3>Course Names</h3></td><td><h3>Credits</h3></td></tr>");
      
        out.print("<tr><td>1)"+c.getOne()+"</td><td>1</td></tr>");
        out.print("<tr><td>2)"+c.getTwo()+"</td><td>2</td></tr>");  
        out.print("<tr><td>3)"+c.getThree()+"</td><td>1</td></tr>");  
        out.print("<tr><td>4)"+c.getFour()+"</td><td>3</td></tr>");  
        out.print("<tr><td>5)"+c.getFive()+"</td><td>1</td></tr>");  
        out.print("<tr><td>6)"+c.getSix()+"</td><td>2</td></tr>");  
        out.print("<tr><td>7)"+c.getSeven()+"</td><td>1</td></tr>"); 
        out.print("<tr><td>8)"+c.getEight()+"</td><td>1</td></tr>"); 
        out.print("<tr><td>9)"+c.getNine()+"</td><td>1</td></tr>"); 
        out.print("<tr><td>10)"+c.getTen()+"</td><td>4</td></tr>"); 
      
        
        out.print("</td></tr>");   
        out.print("</table>");  
        out.print("</form>");  
		out.print("</div>");
		out.print("</div>");
		out.print("<footer>");
		out.print("<div class='center'>");
		out.print(" Copyright &copy; <a href='#'>www.omgCollegeOfEngineering.com</a> All rights reserved");
		out.print("</div>");
	out.print("</footer>");
          
        out.close(); 
	}
}
