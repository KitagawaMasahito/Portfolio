<%@page import="model.StudentCard"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sample02</title>
</head>
<body>
	<%StudentCard st = (StudentCard) request.getAttribute("student1"); %>
	学籍番号：<%=st.getId() %>　　名前：<%=st.getName() %>
</body>
</html>