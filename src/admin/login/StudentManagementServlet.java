package admin.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentManagementServlet
 */
@WebServlet("/student")
public class StudentManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private Studentuser studentuser;
	public void init() {
		studentuser = new Studentuser();
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/studentmanagement.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentid = request.getParameter("studentid");
		String studentfirstname = request.getParameter("studentfirstname");
		String studentlastname = request.getParameter("studentlastname");
		String classid = request.getParameter("classid");
		String classname = request.getParameter("classname");
		
		student_login student = new student_login();
		student.setStudentid(studentid);
		student.setStudentfirstname(studentfirstname);
		student.setStudentlastname(studentlastname);
		student.setClassid(classid);
		student.setClassname(classname);
		
		try {
			studentuser.registerStudent(student);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/studentsuccess.jsp");
		dispatcher.forward(request, response);
	
	}

}
