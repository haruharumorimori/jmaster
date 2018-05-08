<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
    session.setAttribute("session", "wwww");
 	pageContext.setAttribute("page","wwwww");

  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${session}<br>
${page}
</body>
</html>