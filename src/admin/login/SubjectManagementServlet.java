package admin.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubjectManagementServlet
 */
@WebServlet("/subject")
public class SubjectManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/subjectmanagement.jsp");
		dispatcher.forward(request, response);
	}

	private Subjectuser subjectuser;
	public void init() {
		subjectuser = new Subjectuser();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String subjectid = request.getParameter("subjectid");
		String subjectname = request.getParameter("subjectname");
		String classid = request.getParameter("classid");
		String classname = request.getParameter("classname");
		String teacherid = request.getParameter("teacherid");
		String teacherfirstname = request.getParameter("teacherfirstname");
		String teacherlastname = request.getParameter("teacherlastname");
		
		subject_login subject = new subject_login();
		subject.setSubjectid(subjectid);
	    subject.setSubjectname(subjectname);
	    subject.setClassid(classid);
	    subject.setClassname(classname);
	    subject.setTeacherid(teacherid);
	    subject.setTeacherfirstname(teacherfirstname);
	    subject.setTeacherlastname(teacherlastname);
		
		try {
			subjectuser.registerSubject(subject);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/subjectsuccess.jsp");
		dispatcher.forward(request, response);
		
	}

}
