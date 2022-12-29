package staff;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.User;
import dao.UserDao;

/**
 * Servlet implementation class ViewStaffServlet
 */
@WebServlet("/ViewStaffServlet")
public class ViewStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewStaffServlet() {
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
		List<Staff> list=UserDao.getAllStaff();  
		out.print("<div class='list1'>");
		out.print("<h1>Staff List</h1>");
		out.print("<a href='AddStaff.jsp'>Add Staff</a>");
		out.print("<table border='1' width='75%'");  
		out.print("<tr><th>Id</th><th>Full Name</th><th>Position</th><th>Phone</th><th>Address</th><th>Age</th><th>Gender</th><th>Joining Date</th><th>Edit</th><th>Delete</th></tr>");  
		for(Staff u:list){  
			out.print("<tr><td>"+u.getId()+"</td><td>"+u.getFull_name()+"</td><td>"+u.getPosition()+"</td><td>"+u.getPhone()+"</td><td>"+u.getAddress()+"</td><td>"+u.getAge()+"</td><td>"+u.getGender()+"</td><td>"+u.getJoining_date()+"</td><td><a href='EditStaffServlet?id="+u.getId()+"'>Edit</a></td><td><a href='DeleteStaffServlet?id="+u.getId()+"'>Delete</a></td></tr>");  
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
