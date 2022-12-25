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
 * Servlet implementation class EditStaffServlet2
 */
@WebServlet("/EditStaffServlet2")
public class EditStaffServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditStaffServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String full_name=request.getParameter("full_name");
		String position=request.getParameter("position");
		String nphone=request.getParameter("phone");
		int phone=Integer.parseInt(nphone);
		String address=request.getParameter("address");
		String nage=request.getParameter("age");
		int age=Integer.parseInt(nage);
		String gender=request.getParameter("gender");
		String joining_date=request.getParameter("joining_date");


        	
        Staff s=new Staff();
        s.setId(id);
        s.setFull_name(full_name);
		s.setPosition(position);
		s.setPhone(phone);
		s.setAddress(address);
		s.setAge(age);
		s.setGender(gender);
		s.setJoining_date(joining_date);
       
        int status=UserDao.updateStaff(s);  
        if(status>0){  
            response.sendRedirect("ViewStaffServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
            
        }  
          
        out.close();  
    }  
	

}
