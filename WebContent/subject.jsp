<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String subject;
	int random=(int)(Math.random()*4);
	switch(random){
	case 0:
		subject="プログラミング入門";
		break;
	case 1:
		subject="オープンソースDB";
		break;
	case 2:
		subject="Linux入門";
		break;
	default:
		subject="Android開発講座";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>今月のおすすめ講座</h2>
<h1><%=subject %></h1>
</body>
</html>