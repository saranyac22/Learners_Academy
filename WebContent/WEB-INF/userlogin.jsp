<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Learner's Academy</title>
</head>
<body>
 <div align="center">
  <h1>Administrator Login</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>User Name</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>