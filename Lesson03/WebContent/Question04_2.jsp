<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset=UTF-8">
	<title>Question04</title>
</head>

<body>
	<%
		LocalDateTime nowDaT = LocalDateTime.now();
		int year = nowDaT.getYear();
		int month = nowDaT.getMonthValue();
		int day = nowDaT.getDayOfMonth();
		int hour = nowDaT.getHour();
		int minute = nowDaT.getMinute();
		int second = nowDaT.getSecond();
	%>
	
	<p>今日は<%=year %>年<%=month %>月<%=day %>日です。</p>
	<p>今の時刻は<%=hour %>時<%=minute %>分<%=second %>秒です。</p>
</body>

</html>