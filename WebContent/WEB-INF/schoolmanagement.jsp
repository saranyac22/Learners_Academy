<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>School Management</title>
</head>
<body>
 <div align="right">
   <form action="<%= request.getContextPath() %>/logout" method="get">
   <input type="submit" value="Logout" size=100 />
  </form>
 </div>
 <div style="color:Blue;font-size:15px;" align="center">
<h1>School Management</h1>
</div>
 <div style="color:Black;font-size:7px;" align="center">
  <h1>What would you like to do today?</h1>
  <form action="<%= request.getContextPath() %>/subject" method="get">
   <input type="submit" value="Manage  the  list of Subjects?" size=100 />
  </form>
   <form action="<%= request.getContextPath() %>/student" method="get">
   <input type="submit" value="Manage  the  list of Students?" size=100 />
  </form>
   <form action="<%= request.getContextPath() %>/teacher" method="get">
   <input type="submit" value="Manage and Assign Teachers?" size=100  />
  </form>
   <form action="<%= request.getContextPath() %>/class" method="get">
   <input type="submit" value="Manage  and  Assign Classes?" size=100 />
  </form>
    <form action="<%= request.getContextPath() %>/classreport" method="get">
   <input type="submit" value="Fetch All The Classes' Report?" size=100 />
  </form>
 </div>
</body>
</html>