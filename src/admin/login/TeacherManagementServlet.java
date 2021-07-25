package admin.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherManagementServlet
 */
@WebServlet("/teacher")
public class TeacherManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private Teacheruser teacheruser;
	public void init() {
		teacheruser = new Teacheruser();
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/teachermanagement.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String teacherid = request.getParameter("teacherid");
		String teacherfirstname = request.getParameter("teacherfirstname");
		String teacherlastname = request.getParameter("teacherlastname");
		String subjectid = request.getParameter("subjectid");
		String subjectname = request.getParameter("subjectname");
		
		teacher_login teacher = new teacher_login();
		teacher.setTeacherid(teacherid);
		teacher.setTeacherfirstname(teacherfirstname);
		teacher.setTeacherlastname(teacherlastname);
		teacher.setSubjectid(subjectid);
		teacher.setSubjectname(subjectname);
		
		try {
			teacheruser.registerTeacher(teacher);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/teachersuccess.jsp");
		dispatcher.forward(request, response);
	
	}

}