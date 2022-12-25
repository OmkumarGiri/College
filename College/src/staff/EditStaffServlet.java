package staff;

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
 * Servlet implementation class EditStaffServlet
 */
@WebServlet("/EditStaffServlet")
public class EditStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStaffServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.print("<link rel='stylesheet' href='css/AdminViewStudents.css'>");
			out.print("<link rel='stylesheet' href=''>");
			out.print("<body>");
			out.print(" <div class='clg_box'>");
			out.print("	<div id='logo'>");
			out.print("  <img src='icon1.jpg' alt=''>");
					out.print(" </div>");
			out.print("  OM. G. COLLEGE");
			out.print(" </div>");
			out.print("<div class='intro_bar'>");
			out.print("Admin Header");
			out.print("  </div>");
			out.print("<div class='out'>");
			out.print(" <a href='login.jsp' class='button'><img src='lo1.png' alt='' style='width:30px;height:23px;margin:2px;'>Log Out</a>");
			out.print("</div>");
			out.print("<div class='menu'>");

			out.print("<a href='ViewServlet' class='m'><img src='ms.png' alt='' style='width:30px;height:23px;margin:2px; '>Students</a>");
			out.print("<a href='ViewStaffServlet' class='m'><img src='mstf.png' alt='' style='width:30px;height:23px;margin:2px;'>Staff</a>");
			out.print("<a href='ViewAnnouncementServlet' class='m'><img src='mann.png' alt='' style='width:30px;height:23px;margin:2px;'>Announcement</a>");

			out.print("</div>");
			out.print("<div class='list'>");
	
	        out.println("<h1>Update Employee</h1>");  
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	          
	        Staff e=UserDao.getStaffById(id);  
	          
	        out.print("<form action='EditStaffServlet2' method='post'>");  
	        out.print("<table>");  
	        out.print("<tr><td><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");  
	        out.print("<tr><td>Full Name:</td><td><input type='text' name='full_name' value='"+e.getFull_name()+"'/></td></tr>");
	        out.print("<tr><td>Position:</td><td><input type='text' name='position' value='"+e.getPosition()+"'/></td></tr>");  
	        out.print("<tr><td>Phone:</td><td><input type='number' name='phone' value='"+e.getPhone()+"'/></td></tr>");  
	        out.print("<tr><td>Address:</td><td><input type='text' name='address' value='"+e.getAddress()+"'/></td></tr>");  
	        out.print("<tr><td>Age:</td><td><input type='number' name='age' value='"+e.getAge()+"'/></td></tr>");  
	        out.print("<tr><td>Gender:</td><td><input type='text' name='gender' value='"+e.getGender()+"'/></td></tr>");  
	        out.print("<tr><td>Joining date:</td><td><input type='text' name='joining_date' value='"+e.getJoining_date()+"'/></td></tr>");   
	        out.print("</td></tr>");  
	        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
	        out.print("</table>");  
	        out.print("</form>");  
	        out.print("<footer>");
			out.print("<div class='center'>");
			out.print(" Copyright &copy; <a href='#'>www.omgCollegeOfEngineering.com</a> All rights reserved");
			out.print("</div>");
		out.print("</footer>");
	        out.print("</div>");
	        out.close();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
