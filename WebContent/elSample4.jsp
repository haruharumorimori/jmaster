<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList" %>
<%
	String[] a=new String[]{"one","tue","three"};
	session.setAttribute("data",a);
%>
<%
	ArrayList<String> b=new ArrayList<String>();
	b.add("おかん");
	b.add("おとん");
	b.add("おじ-おずぼーん");
	session.setAttribute("fammily",b);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	配列の中身は
	<br>${data[0]}
	<br>${data[1]}
	<br>${data[2]}
	<br>${fammily[0]}
	<br>${fammily[1]}
	<br>${fammily[2]}
	<br>でーす
</body>
</html>