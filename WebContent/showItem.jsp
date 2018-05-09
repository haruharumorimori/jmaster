<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="itemForm.jsp"/>
	<table border ="1" cellspacing="0">
		<tr><td>NO</td><td>商品名</td><td>値段</td><td>削除</td></tr>

		<c:forEach items="${items}" var="item">
		<tr><td >${item.code}</td><td>${item.name}</td><td>${item.price}</td><td><a href="/jmaster/ItemServlet?code='${item.code}'&action='delete'">×</a></td></tr>
		</c:forEach>
	</table>
</body>
</html>