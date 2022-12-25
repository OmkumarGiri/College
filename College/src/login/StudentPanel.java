package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import announcement.Announce;
import dao.UserDao;

/**
 * Servlet implementation class StudentPanel
 */
@WebServlet("/StudentPanel")
public class StudentPanel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentPanel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		String post=request.getParameter("post");
//		String nid=request.getParameter("id");
//		int id=Integer.parseInt(nid);
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		
//		User u=new User();
//		u.setId(id);
//		u.setLog_name(name);
//		u.setLog_pass(password);
//		
//		String n=u.getLog_name();
//		String p=u.getLog_pass();
		if (UserDao.validate(name, password)) {
			System.out.println("Login Successful"); 
			
			
			out.print("<link rel='stylesheet' href='css/AdminViewStudents.css'>");
			out.print("<link rel='stylesheet' href=''>");
			out.print("<body>");
			out.print(" <div class='clg_box'>");
			out.print("	<div id='logo'>");
			out.print("  <img src='icon1.jpg' alt=''>");
					out.print(" </div>");
			out.print("    OM. G. COLLEGE");
			out.print(" </div>");
			out.print("<div class='intro_bar'>");
			out.print(" Welcome to Student Panel");
			out.print("  </div>");
			out.print("<div class='out'>");
			out.print(" <a href='StudentLogin.jsp' class='button'><img src='lo1.png' alt='' style='width:30px;height:23px;margin:2px;'>Log Out</a>");
			out.print("</div>");
			User e=UserDao.getStudent(name);
			out.print("<div class='menu'>");
			out.print("<a href='StudentPanel1?name="+e.getLog_name()+"' class='m'><img src='mm.png' alt='' style='width:30px;height:23px;margin:2px;'>Menu</a>");
			//out.print("<a href='EditCourseServlet?id="+e.getId()+"'>Course registration</a>");
			//out.print("<a href='ViewStudentAnnouncementServlet?name="+e.getLog_name()+"'>Announcement</a>");
			
			out.print("</div>");
			out.print("<div class='list'>");
			out.print("<h1>Personal Information</h1>");

			
			out.print("<table width=50%>");  
			out.print("<tr><td>Id:</td><td>"+e.getId()+"</td></tr>");
	        out.print("<tr><td>Full Name:</td><td>"+e.getFull_name()+"</td></tr>");
	        out.print("<tr><td>Log Name:</td><td>"+e.getLog_name()+"</td></tr>");  
	        out.print("<tr><td>Log Password:</td><td>"+e.getLog_pass()+"</td></tr>");  
	        out.print("<tr><td>Department:</td><td>"+e.getDepartment()+"</td></tr>");  
	        out.print("<tr><td>Year:</td><td>"+e.getYear()+"</td></tr>");  
	        out.print("<tr><td>Age:</td><td>"+e.getAge()+"</td></tr>");  
	        out.print("<tr><td>Gender:</td><td>"+e.getGender()+"</td></tr>");  
	        out.print("<tr><td>Email:</td><td>"+e.getEmail()+"</td></tr>");   
	        
	        out.print("</td></tr>");  
	         
	        out.print("</table>"); 
	        out.print("</div>");
	        out.print("<footer>");
			out.print("<div class='center'>");
			out.print(" Copyright &copy; <a href='#'>www.omgCollegeOfEngineering.com</a> All rights reserved");
			out.print("</div>");
		out.print("</footer>");
			out.close();  
			out.println("</body>");
			//response.sendRedirect("StudentHeader.jsp");
        } else{
        	response.sendRedirect("StudentLogin.jsp");
        }
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
