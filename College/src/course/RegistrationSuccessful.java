package course;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import announcement.Announce;

/**
 * Servlet implementation class RegistrationSuccessful
 */
@WebServlet("/RegistrationSuccessful")
public class RegistrationSuccessful extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationSuccessful() {
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
		out.print("  OM. G. COLLEGE");
		out.print(" </div>");
		out.print("<div class='intro_bar'>");
		out.print("Student Header");
		out.print("  </div>");
		out.print("<div class='out'>");
		out.print("  <a href='StudentLogin.jsp'><button>Log Out</button></a>");
		out.print("</div>");
		
		
		out.print("<div class='list'>");
		out.print("<h1>Registration Successful</h1>");
		out.print("  <h3><a href='StudentLogin.jsp' >OK</a></h3>");
		out.print("</div>");
		out.print("<footer>");
		out.print("<div class='center'>");
		out.print(" Copyright &copy; <a href='#'>www.omgCollegeOfEngineering.com</a> All rights reserved");
		out.print("</div>");
	out.print("</footer>");
	out.print("<body>");
	}

	
}
