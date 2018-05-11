<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String a=(String)session.getAttribute("name1");

%>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%if(a==null){ %>
<jsp:forward page="/application.practice/login.jsp"/>

<%}else{ %>
<h1>
${name1}様お待ちしておりました。ようこそ！
</h1>
<%} %>
<br><br>
<a href="/jmaster/application.practice/login.jsp">ログアウト</a>
</body>
</html>