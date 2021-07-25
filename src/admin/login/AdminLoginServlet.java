package admin.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Adminuser loginDao;

	public void init() {
		loginDao = new Adminuser();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/login.jsp");
		dispatcher.forward(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		user_login loginBean = new user_login();
		loginBean.setUsername(username);
		loginBean.setPassword(password);

		try {
			if (loginDao.validate(loginBean)) {
				
				
				 RequestDispatcher dispatcher1 =
					       getServletContext().getRequestDispatcher("/WEB-INF/schoolmanagement.jsp");
					    dispatcher1.forward(request, response);
			} else {
				
				RequestDispatcher dispatcher= request.getRequestDispatcher("/WEB-INF/loginfailure.jsp");
				dispatcher.forward(request, response);
				

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	

	
	
	
}