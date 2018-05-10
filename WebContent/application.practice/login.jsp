<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/jmaster/AppServlet" method="post">
name<input type="text" name="naming"/><br>
pass<input type="password" name="password"/><br>
<input type="hidden" name="action" value="login"/>
<input type="submit" value="login"/>
</form>
</body>
</html>