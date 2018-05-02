<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
pageContext.setAttribute("value1","This is PageScope data");
application.setAttribute("value2","this is applicationScope data");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>value1は${pageScope.value1}です。</h3>
<h3>value2は${requestScope.value2}です。</h3>
</body>
</html>