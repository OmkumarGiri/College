package dao;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import login.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import course.Course;
import announcement.Announce;
import staff.Staff;

public class UserDao {

	static SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	public void saveInfo(User user){
		
		
		org.hibernate.Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		session.save(user);
		t.commit();
		session.close();
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","Omkumar");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static boolean validate(String log_name, String password) {
		
		Transaction t=null;
		try{
			Session s1=sf.openSession();
			 User user = (User) s1.createQuery("from User u WHERE u.log_name = :log_name").setParameter("log_name", log_name).uniqueResult();

		            if (user != null && user.getLog_pass().equals(password)) {
		                return true;
		            }
		            t.commit();
		}catch(Exception e){
			System.out.println(e);
		}
		return false;
	}
	public static List<User> getAllEmployees() {
List<User> list=new ArrayList<User>();  
        
        try{  
            Connection con=UserDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from students");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                User u=new User();  
                u.setId(rs.getInt(1));
                u.setFull_name(rs.getString(2));
                u.setLog_name(rs.getString(3));  
                u.setLog_pass(rs.getString(4));  
                u.setDepartment(rs.getString(5));
                u.setYear(rs.getInt(6));
                u.setAge(rs.getInt(7));
                u.setGender(rs.getString(8));
                u.setEmail(rs.getString(9));
                list.add(u);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
	}
	public static int update(User e) {
		int status=0;  
        try{  
            Connection con=UserDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("update students set full_name =?,log_name=?,log_pass=?,department=?,year=?,age=?,gender=?,email=? where id=?");  
              
            ps.setString(1,e.getFull_name());   
            ps.setString(2,e.getLog_name());
            ps.setString(3,e.getLog_pass());
            ps.setString(4,e.getDepartment());
            ps.setInt(5,e.getYear());
            ps.setInt(6,e.getAge());
            ps.setString(7,e.getGender());
            ps.setString(8,e.getEmail());
            ps.setInt(9,e.getId());
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status; 
	}
	public static User getEmployeeById(int id) {
		  User e=new User();  
        
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from students where id=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setId(rs.getInt(1));
	                e.setFull_name(rs.getString(2));  
	                e.setLog_name(rs.getString(3));  
	                e.setLog_pass(rs.getString(4));
	                e.setDepartment(rs.getString(5));
	                e.setYear(rs.getInt(6));
	                e.setAge(rs.getInt(7));
	                e.setGender(rs.getString(8));
	                e.setEmail(rs.getString(9));
	                
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	}
	public static int delete(int id) {
		   int status=0;  
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from students where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	}
	public static List<Staff> getAllStaff() {
		List<Staff> list=new ArrayList<Staff>();  
		 try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from staff");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	                Staff u=new Staff(); 
	                u.setId(rs.getInt(1));
	                u.setFull_name(rs.getString(2));
	                u.setPosition(rs.getString(3));  
	                u.setPhone(rs.getInt(4));  
	                u.setAddress(rs.getString(5));
	                u.setAge(rs.getInt(6));
	                u.setGender(rs.getString(7));
	                u.setJoining_date(rs.getString(8));
	                list.add(u);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
		return list;
	}
	public static int deleteStaff(int id) {
		 int status=0;  
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from staff where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	}
	public static Staff getStaffById(int id) {
		Staff s=new Staff();
		try{
			 Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from staff where id=?");  
	            
	            ps.setInt(1, id);
	            ResultSet rs=ps.executeQuery();
	            while(rs.next()){
	            	s.setId(rs.getInt(1));
	            	s.setFull_name(rs.getString(2));
	            	s.setPosition(rs.getString(3));
	            	s.setPhone(rs.getInt(4));
	            	s.setAddress(rs.getString(5));
	            	s.setAge(rs.getInt(6));
	            	s.setGender(rs.getString(7));
	            	s.setJoining_date(rs.getString(8));
	            }
	            
	            
		}catch(Exception e){
			System.out.println(e);
		}
		return s;
	}
	public static int updateStaff(Staff s) {
		int status=0;
		
		try{
			 Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("update staff set full_name=?,position=?,phone=?,address=?,age=?,gender=?,joining_date=? where id=?");
	            
	            ps.setString(1,s.getFull_name());
	            ps.setString(2, s.getPosition());
	            ps.setInt(3,s.getPhone());
	            ps.setString(4, s.getAddress());
	            ps.setInt(5, s.getAge());
	            ps.setString(6,s.getGender());
	            ps.setString(7,s.getJoining_date());
	            ps.setInt(8, s.getId());
	            status=ps.executeUpdate();
	            con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		// TODO Auto-generated method stub
		return status;
	}
	public static List<Announce> getAnnounce() {
		List<Announce> list=new ArrayList<Announce>();
		try{
			Connection con=UserDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from announcement");
			 ResultSet rs=ps.executeQuery();  
	            while(rs.next()){
	            	Announce a=new Announce();
	            	a.setId(rs.getInt(1));
	            	a.setAnnouncement(rs.getString(2));
	            	a.setDate(rs.getString(3));
	            	list.add(a);
	            }
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
		return list;
	}
	public static int deleteAnnouncement(int id) {
		 int status=0;  
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from announcement where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	}
	public static User getStudent(String name) {
		  User e=new User();  
      
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from students where log_name=?");  
	            ps.setString(1,name);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setId(rs.getInt(1));
	                e.setFull_name(rs.getString(2));  
	                e.setLog_name(rs.getString(3));  
	                e.setLog_pass(rs.getString(4));
	                e.setDepartment(rs.getString(5));
	                e.setYear(rs.getInt(6));
	                e.setAge(rs.getInt(7));
	                e.setGender(rs.getString(8));
	                e.setEmail(rs.getString(9));
	                
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	}
	public static User getStudentInfo(int id) {
		  User e=new User();  
      
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from students where id=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setId(rs.getInt(1));
	                e.setFull_name(rs.getString(2));  
	                e.setLog_name(rs.getString(3));  
	                e.setLog_pass(rs.getString(4));
	                e.setDepartment(rs.getString(5));
	                e.setYear(rs.getInt(6));
	                e.setAge(rs.getInt(7));
	                e.setGender(rs.getString(8));
	                e.setEmail(rs.getString(9));
	                
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	}
	public static Course getCourseById(int id) {
		 Course e=new Course();  
	      
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from course where id=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setId(rs.getInt(1));
	                e.setOne(rs.getString(2));  
	                e.setTwo(rs.getString(3));  
	                e.setThree(rs.getString(4));
	                e.setFour(rs.getString(5));
	                e.setFive(rs.getString(6));
	                
	                e.setSix(rs.getString(7));
	                e.setSeven(rs.getString(8));
	                e.setEight(rs.getString(9));
	                e.setNine(rs.getString(10));
	                e.setTen(rs.getString(11));
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	}
	public static int deleteCourse(int id) {
		 int status=0;  
	        try{  
	            Connection con=UserDao.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from course where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status; 
		
	}
}