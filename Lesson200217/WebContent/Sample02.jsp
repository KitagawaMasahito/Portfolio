<%@page import="model.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample02 Output</title>
</head>

<body>
	<%UserBean user = (UserBean) session.getAttribute("u1"); %>
	<p>こんにちは！<%=user.getNickName() %>さん</p>
	<p>あなたのIDは<%=user.getUserName() %>ですね。</p>
</body>
</html>