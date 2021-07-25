<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.sql.*;"%>
</head>
<body>

</body>
<form method="post">

<table border="2">
<tr>
<td>ID</td>
<td>NAME</td>
<td>SKILL</td>
<td>ACTION</td>
</tr>
<%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/mysql";
String username="root";
String password="Simplilearn";
String query="select distinct a.studentid,a.studentfirstname,a.studentlastname,a.classid,a.classname,b.teacherid,b.teacherfirstname,b.teacherlastname,c.subjectid,c.subjectname from mysql.student_details a left joinmysql.class_details b on a.classid=b.classid left join mysql.subject_details c on b.teacherid=c.teacherid;";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>
    <tr><td><%rs.getInt("studentid"); %></td></tr>
    <tr><td><%rs.getString("studentfirstname"); %></td></tr>
    <tr><td><%rs.getString("studentlastname"); %></td></tr>
        <%

}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }




%>

</form>
</html> 