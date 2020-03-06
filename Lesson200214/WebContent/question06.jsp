<%@page import="java.util.ArrayList"%>
<%@page import="model.StudentCard"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>question06</title>
</head>
<body>
	<%List<StudentCard> studentList = (ArrayList<StudentCard>) request.getAttribute("stuList"); %>

	<h1>学生リスト</h1>
	<h3>学籍番号　　　名前</h3>
	<%for(StudentCard s:studentList){ %>
		<p>　　<%=s.getId() %>　　　　<%=s.getName() %></p>
	<%} %>
</body>
</html>