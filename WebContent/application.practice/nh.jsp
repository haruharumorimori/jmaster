<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.getAttribute("name1");
request.getAttribute("pass1");

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>新しく登録しました</h1>
名前:${name1}様、よろしくお願い致します。
<br>
<a href="/jmaster/application.practice/login.jsp">ログイン画面へ</a>
</body>
</html>