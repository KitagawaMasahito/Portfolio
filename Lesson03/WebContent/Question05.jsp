<%@page import="java.util.Collections"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset=UTF-8">
	<title>Question05</title>
</head>

<body>
	<%
		List<String> omikuji = new ArrayList<>();
		Collections.addAll(omikuji, "大吉","吉","中吉","末吉","凶");
		int mikujiBou = (int)(Math.random()*5);
	%>
	今日の運勢は<%=omikuji.get(mikujiBou) %>です。
</body>

</html>