package admin.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Subjectuser {

    public int registerSubject(subject_login subject) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO subject_details" +
            "  (subjectid, subjectname, classid, classname, teacherid, teacherfirstname, teacherlastname) VALUES " +
            " (?, ?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost/mysql", "root", "Simplilearn");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, subject.getSubjectid());
            preparedStatement.setString(2, subject.getSubjectname());
            preparedStatement.setString(3, subject.getClassid());
            preparedStatement.setString(4, subject.getClassname());
            preparedStatement.setString(5, subject.getTeacherid());
            preparedStatement.setString(6, subject.getTeacherfirstname());
            preparedStatement.setString(7, subject.getTeacherlastname());

          
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
