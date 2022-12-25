package announcement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import staff.Staff;
import dao.UserDao;

/**
 * Servlet implementation class ViewAnnouncementServlet
 */
@WebServlet("/ViewAnnouncementServlet")
public class ViewAnnouncementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewAnnouncementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		out.print("<link rel='stylesheet' href='css/b.css'>");
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
		out.print("<div class='menu'>");

		out.print("<a href='ViewServlet' class='m'><img src='ms.png' alt='' style='width:30px;height:23px;margin:2px; '>Students</a>");
		out.print("<a href='ViewStaffServlet' class='m'><img src='mstf.png' alt='' style='width:30px;height:23px;margin:2px;'>Staff</a>");
		out.print("<a href='ViewAnnouncementServlet' class='m'><img src='mann.png' alt='' style='width:30px;height:23px;margin:2px;'>Announcement</a>");


		out.print("</div>");
		List<Announce> list=UserDao.getAnnounce();  
		out.print("<div class='list1'>");
		out.print("<h1>Announcement List</h1>");
		out.print("<a href='AddAnnouncement.jsp'>Add Announcement</a>");
		out.print("<table border='1' width='75%'");  
		out.print("<tr><th>Id</th><th>Announcement</th><th>Date</th><th>Delete</th></tr>");  
		for(Announce u:list){  
			out.print("<tr><td>"+u.getId()+"</td><td>"+u.getAnnouncement()+"</td><td>"+u.getDate()+"</td><td><a href='DeleteAnnounceServlet?id="+u.getId()+"'>Delete</a></td></tr>");  
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
