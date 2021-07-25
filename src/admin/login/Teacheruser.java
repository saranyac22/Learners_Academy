package admin.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Teacheruser {

    public int registerTeacher(teacher_login teacher) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO  teacher_details" +
            "  (teacherid, teacherfirstname, teacherlastname, subjectid, subjectname) VALUES " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost/mysql", "root", "Simplilearn");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, teacher.getTeacherid());
            preparedStatement.setString(2, teacher.getTeacherfirstname());
            preparedStatement.setString(3, teacher.getTeacherlastname());
            preparedStatement.setString(4, teacher.getSubjectid());
            preparedStatement.setString(5, teacher.getSubjectname());
        

          
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
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
