<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<form action="login" method="post">
<pre>
<h2>Login</h2>
User Name:<input type="text" name="email"/>
Login:<input type="password" name="password"/>
<input type="submit" value="login"/>
${msg}
</pre>
</form>
</body>
</html>