<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Student Management</h1>
  <form action="<%= request.getContextPath() %>/student" method="post">
   <table style="with: 80%">
    <tr>
     <td>Student ID</td>
     <td><input type="text" name="studentid" /></td>
    </tr>
    <tr>
     <td>Student First Name</td>
     <td><input type="text" name="studentfirstname" /></td>
    </tr>
    <tr>
     <td>Student Last Name</td>
     <td><input type="text" name="studentlastname" /></td>
    </tr>
    <tr>
     <td>Class ID</td>
     <td><input type="text" name="classid" /></td>
    </tr>
    <tr>
     <td>Class Name</td>
     <td><input type="text" name="classname" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>