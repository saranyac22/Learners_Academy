<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div align="center">
  <h1>Teacher Management</h1>
  <form action="<%= request.getContextPath() %>/teacher" method="post">
   <table style="with: 80%">
    <tr>
     <td>Teacher ID</td>
     <td><input type="text" name="teacherid" /></td>
    </tr>
    <tr>
     <td>Teacher First Name</td>
     <td><input type="text" name="teacherfirstname" /></td>
    </tr>
     <tr>
     <td>Teacher Last Name</td>
     <td><input type="text" name="teacherlastname" /></td>
    </tr>
    <tr>
     <td>Subject ID</td>
     <td><input type="text" name="subjectid" /></td>
    </tr>
    <tr>
     <td>Subject Name</td>
     <td><input type="text" name="subjectname" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>