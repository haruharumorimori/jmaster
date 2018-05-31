<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.getAttribute("debu");
	request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
あなたのBMIは${debu.getBMI()}<br>
はっきり言って${message}
</body>
</html>