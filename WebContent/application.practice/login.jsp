<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.getAttribute("message");

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/jmaster/AppServlet" method="post">
${message}<br>
name<input type="text" name="naming"/><br>
pass<input type="password" name="password"/><br>
<input type="hidden" name="action" value="login"/>
<input type="submit" value="login"/>
<br><br>

<a href="/jmaster/AppServlet?action=logout">ログアウト</a>
<br><br><br>
<a href="/jmaster/application.practice/newhuman.jsp">新規登録はこちら</a>
</form>
</body>
</html>