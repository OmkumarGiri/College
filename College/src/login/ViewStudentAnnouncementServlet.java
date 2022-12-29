package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import announcement.Announce;
import dao.UserDao;

/**
 * Servlet implementation class ViewStudentAnnouncementServlet
 */
@WebServlet("/ViewStudentAnnouncementServlet")
public class ViewStudentAnnouncementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStudentAnnouncementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		out.print("<link rel='stylesheet' href='css/add.css'>");
		out.print("<link rel='stylesheet' href=''>");
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
						out.print(" <a href='contactus.html' class='n'> Contact us</a>");		out.print("  </div>");
		out.print("<div class='out'>");
		out.print(" <a href='StudentLogin.jsp' class='button'><img src='lo1.png' alt='' style='width:30px;height:23px;margin:2px;'>Log Out</a>");
		out.print("</div>");
		out.print("<div class='menu'>");
		//out.print("<a href='StudentPanel'>Student</a>");
		
		String name=request.getParameter("name");
		User e=UserDao.getStudent(name);
		User s=new User();
		s.setLog_name(name);
		
		out.print("<a href='StudentPanel1?name="+s.getLog_name()+"' class='m'><img src='ms.png' alt='' style='width:30px;height:23px;margin:2px;'>Student</a>");
//		User e=new User();
		out.print("<hr>");
		out.print("<a href='EditCourseServlet?id="+e.getId()+"' class='m'><img src='mcr.png' alt='' style='width:30px;height:23px;margin:2px;'>Course registration</a>");
		out.print("<hr>");
		out.print("<a href='ViewStudentAnnouncementServlet?name="+s.getLog_name()+"' class='m'><img src='mann.png' alt='' style='width:30px;height:23px;margin:2px;'>Announcement</a>");
		out.print("<hr>");

		out.print("</div>");
		List<Announce> list=UserDao.getAnnounce();  
		out.print("<div class='list1'>");
		out.print("<h1>Announcement List</h1>");
//		out.print("<a href='Announcement.jsp'>Add Announcement</a>");
		out.print("<table border='1' width='75%'");  
		out.print("<tr><th>Id</th><th>Announcement</th><th>Date</th></tr>");  
		for(Announce u:list){  
			out.print("<tr><td>"+u.getId()+"</td><td>"+u.getAnnouncement()+"</td><td>"+u.getDate()+"</td></tr>");  
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
