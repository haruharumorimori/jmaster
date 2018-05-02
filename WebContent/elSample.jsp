<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("data1","This is Sample1");
	session.setAttribute("data2","This is Sample2");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>data1は${data1}です。</h3>
<h3>data2は${data2}です。</h3>
</body>
</html>