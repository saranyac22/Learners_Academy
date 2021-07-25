<!DOCTYPE html>
<html>
<title>Welcome to Learner's Academy</title>
<head>
<meta charset="ISO-8859-1">
<body>
<div style="color:Orange;font-size:20px;" align="center">
<h1>Welcome to Learner's Academy</h1>
</div>
	<div align="center">
		<h1>Administrator Login</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<table style="with: 100%">
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
<div style="color:Red;font-size:6px;" align="center">
<h1>You should be an Administrator to login!</h1>
</div>
</body>
</html>