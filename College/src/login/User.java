package login;
import java.util.*;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    
    private int id,year,age;

   private String full_name,log_name,log_pass,department,gender,email;
   private List<String> answers;  
public List<String> getAnswers() {
	return answers;
}

public void setAnswers(List<String> answers) {
	this.answers = answers;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getFull_name() {
	return full_name;
}

public void setFull_name(String full_name) {
	this.full_name = full_name;
}

public String getLog_name() {
	return log_name;
}

public void setLog_name(String log_name) {
	this.log_name = log_name;
}

public String getLog_pass() {
	return log_pass;
}

public void setLog_pass(String log_pass) {
	this.log_pass = log_pass;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public static long getSerialversionuid() {
	return serialVersionUID;
}
   
}
