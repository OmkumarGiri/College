package UserController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import dao.UserDao;
import login.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
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
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		org.hibernate.Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
	        String full_name = request.getParameter("full_name");
	        String log_name = request.getParameter("log_name");
	        String log_pass = request.getParameter("log_pass");
	        String department = request.getParameter("department");
	        String nyear = request.getParameter("year");
	        int year=Integer.parseInt(nyear);
	        String nage = request.getParameter("age");
	        int age=Integer.parseInt(nage);
	        String gender = request.getParameter("gender");
	        String email = request.getParameter("email");

	        User user = new User();
	        user.setFull_name(full_name);
	        user.setLog_name(log_name);
	        user.setLog_pass(log_pass);
	        user.setDepartment(department);
	        user.setYear(year);
	        user.setAge(age);
	        user.setGender(gender);
	        user.setEmail(email);

	        session.save(user);
	        t.commit();
	        
	        System.out.println("Successfully registered");
	        response.sendRedirect("ViewServlet");
	        sf.close();  
	        session.close();  
//	        RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
//	        dispatcher.forward(request, response);
	}

}
