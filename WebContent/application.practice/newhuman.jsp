<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/jmaster/NewhumanServlet" method="post">
<br>
登録するお名前<input type="text" name="name"/>
<br>
登録するパスワード<input type="password"name="pass"/>
<br>
<input type="submit" value="送信"/>
</form>
</body>
</html>