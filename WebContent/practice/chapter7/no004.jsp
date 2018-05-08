<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/jmaster/ch7No001" method="post">
名前<input type="text" name="name"/><br>
パスワード<input type="password" name="pass"/><br>
<input type="hidden" name="action1" value="login"/><br><br>
<input type="submit" value="ログイン"/>
</form>
</body>
</html>