package course;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Dao {

	public static void main(String[] args) {    
	      
	 
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();  
	          
	        Session session=factory.openSession();  
	       
	    Transaction t=session.beginTransaction();    
	        
	    ArrayList<String> list1=new ArrayList<String>();    
	    list1.add("Java is a programming language");    
	    list1.add("Java is a platform");    
	   
	        
	    Course question1=new Course();    
	    question1.setCname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	       
	        
	    session.persist(question1);    
	       
	        
	    t.commit();    
	    session.close();    
	    System.out.println("success");    
	 }    

}
