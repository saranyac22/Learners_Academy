package admin.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Classreportuser {

	public boolean validate(classreport_login loginBean) throws ClassNotFoundException {
		boolean status = false;

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/mysql","root","Simplilearn");

				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection
						.prepareStatement("select distinct a.studentid,a.studentfirstname,a.studentlastname,\n" + 
								"a.classid,a.classname,\n" + 
								"b.teacherid,b.teacherfirstname,b.teacherlastname,\n" + 
								"c.subjectid,c.subjectname from \n" + 
								"mysql.student_details a left join\n" + 
								"mysql.class_details b on a.classid=b.classid\n" + 
								"Left join mysql.subject_details c on b.teacherid=c.teacherid")) {
			
			preparedStatement.setString(1, loginBean.getStudentid());
			preparedStatement.setString(2, loginBean.getStudentfirstname());
			preparedStatement.setString(1, loginBean.getStudentlastname());
			preparedStatement.setString(2, loginBean.getClassid());
			preparedStatement.setString(1, loginBean.getClassname());
			preparedStatement.setString(2, loginBean.getTeacherid());
			preparedStatement.setString(2, loginBean.getTeacherfirstname());
			preparedStatement.setString(2, loginBean.getTeacherlastname());
			preparedStatement.setString(2, loginBean.getSubjectid());
			preparedStatement.setString(2, loginBean.getSubjectname());
			
	
			ResultSet rs = preparedStatement.executeQuery();
			status = rs.next();

		} catch (SQLException e) {
			// process sql exception
			printSQLException(e);
		}
		return status;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}