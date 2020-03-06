<%@page import="model.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MorningTest 2/18</title>
</head>

<body>
	<%UserBean user = (UserBean) request.getAttribute("u01"); %>
	ID：<%=user.getUserName() %>　名前：<%=user.getNickName() %>
</body>
</html>