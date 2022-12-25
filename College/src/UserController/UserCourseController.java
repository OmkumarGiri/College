package UserController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import course.Course;

/**
 * Servlet implementation class UserCourseController
 */
@WebServlet("/UserCourseController")
public class UserCourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserCourseController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		
		String one=request.getParameter("one");
		String two=request.getParameter("two");
		String three=request.getParameter("three");
		
		String four=request.getParameter("four");
		String five=request.getParameter("five");
		String six=request.getParameter("six");

		Course s=new Course();
		s.setOne(one);
		s.setTwo(two);
		s.setThree(three);
		s.setFour(four);
		s.setFive(five);
		s.setSix(six);
		

		session.save(s);
		t.commit();
		System.out.println("Successfully registered");
        response.sendRedirect("ViewStaffServlet");
		
	}


}
