<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	public class PersonBean{
	private String name;
	private int age;
	
	public void setName(String name){
		 this.name=name;
	 	}
	 public String getName(){
		 return name;
	 	}
	 public void setAge(int age){
		 this.age=age;
	 	}
	 public int getAge(){
		 return age;
	 	}
	 }
%>
<%
	PersonBean bean=new PersonBean();
	bean.setName("Tanaka");
	bean.setAge(30);
	request.setAttribute("person",bean);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>この人の名前は${person.name}です。</h3>
<h3>この人の年齢は${person.age}です。</h3>
</body>
</html>