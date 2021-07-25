package admin.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.sql.*;

/**
 * Servlet implementation class ClassReportServlet
 */
@WebServlet("/classreport")
public class ClassReportServlet extends HttpServlet {
	private Classreportuser loginDao;

	public void init() {
		loginDao = new Classreportuser();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("testing");
	      
	         PrintWriter out = response.getWriter();  
	         response.setContentType("text/html");  
	         out.println("<html><body>");  
	         try 
	         {  
	             Class.forName("com.mysql.jdbc.Driver");  
	             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "Simplilearn");  
	             System.out.println("test");
	             Statement stmt = con.createStatement();  
	             ResultSet rs = stmt.executeQuery("select distinct a.studentid,a.studentfirstname,a.studentlastname,a.classid,a.classname,b.teacherid,b.teacherfirstname,b.teacherlastname,c.subjectid,c.subjectname from mysql.student_details a left join mysql.class_details b on a.classid=b.classid left join mysql.subject_details c on b.teacherid=c.teacherid;");  
	             out.println("<table border=1 width=80% height=40%>");  
	             out.println("<tr><th>Student ID</th><th>Student First Name</th><th>Student Last Name</th><th>Class ID</th><th>Class Name</th><th>Teacher ID</th><th>Teacher First Name</th><th>Teacher Last Name</th><th>Subject ID</th><th>Subject Name</th><tr>");  
	     
	             
	             while (rs.next()) 
	             {  
	                 String n = rs.getString("studentid");  
	                 String nm = rs.getString("studentfirstname");  
	                 String s = rs.getString("studentlastname"); 
	                 String n1 = rs.getString("classid");  
	                 String nm1 = rs.getString("classname");  
	                 String s1 = rs.getString("teacherid"); 
	                 String n2 = rs.getString("teacherfirstname");  
	                 String nm2 = rs.getString("teacherlastname");  
	                 String s2 = rs.getString("subjectid");
	                String s3 = rs.getString("subjectname");
	                 
	                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td><td>" + n1 + "</td><td>" + nm1 + "</td><td>" + s1 + "</td><td>" + n2 + "</td><td>"  + nm2 + "</td><td>" + s2 + "</td><td>" +s3 +  "</td></tr>");   
	             }  
	             out.println("</table>");  
	             out.println("</html></body>");  
	             con.close();  
	            }  
	             catch (Exception e) 
	            {  
	             out.println("error");  
	         }  
	     }  
		
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		

		
	}
}