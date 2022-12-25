package course;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class CourseServlet
 */
@WebServlet("/CourseServlet")
public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseServlet() {
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
		
		String nid=request.getParameter("id");
		int id=Integer.parseInt(nid);
		String one=request.getParameter("one");
		String two=request.getParameter("two");
		String three=request.getParameter("three");
		
		String four=request.getParameter("four");
		String five=request.getParameter("five");
		String six=request.getParameter("six");
		String seven=request.getParameter("seven");
		String eight=request.getParameter("eight");
		String nine=request.getParameter("nine");
		String ten=request.getParameter("ten");

		Course s=new Course();
		s.setId(id);
		s.setOne(one);
		s.setTwo(two);
		s.setThree(three);
		s.setFour(four);
		s.setFive(five);
		s.setSix(six);
		s.setSeven(seven);
		s.setEight(eight);
		s.setNine(nine);
		s.setTen(ten);
		

		session.save(s);
		t.commit();
		session.close();
		System.out.println("Successfully registered");
		response.sendRedirect("RegistrationSuccessful"); 
	}


}
