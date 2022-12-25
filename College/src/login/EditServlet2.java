package login;

import java.io.IOException;  
import java.io.PrintWriter;  
  


import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  

import dao.UserDao;
@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
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
        user.setId(id);
        user.setFull_name(full_name);
        user.setLog_name(log_name);
        user.setLog_pass(log_pass);
        user.setDepartment(department);
        user.setYear(year);
        user.setAge(age);
        user.setGender(gender);
        user.setEmail(email); 
       
        int status=UserDao.update(user);  
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
            
        }  
          
        out.close();  
    }  
  
}  