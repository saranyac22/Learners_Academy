package admin.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClassManagementServlet
 */
@WebServlet("/class")
public class ClassManagementServlet extends HttpServlet {

    public ClassManagementServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    private Classuser classuser;
	public void init() {
		classuser = new Classuser();
	}
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/classmanagement.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String classid = request.getParameter("classid");
		String classname = request.getParameter("classname");
		String teacherid = request.getParameter("teacherid");
		String teacherfirstname = request.getParameter("teacherfirstname");
		String teacherlastname = request.getParameter("teacherlastname");
		
		class_login clas = new class_login();
		clas.setClassid(classid);
		clas.setClassname(classname);
		clas.setTeacherid(teacherid);
		clas.setTeacherfirstname(teacherfirstname);
		clas.setTeacherlastname(teacherlastname);
		
		try {
			classuser.registerClass(clas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/classsucess.jsp");
		dispatcher.forward(request, response);
	
	}

}