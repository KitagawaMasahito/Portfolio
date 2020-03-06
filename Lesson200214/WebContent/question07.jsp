<%@page import="java.util.ArrayList"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% ArrayList<Product> sushi = (ArrayList<Product>) request.getAttribute("menu");  %>
	<h1>商品一覧</h1>
	<table>
		<tr>
			<th>名前</th><th>価格(１カン)</th>
		</tr>
		<% for(Product s:sushi){ %>
		<tr>
			<td><%=s.getName() %></td><td><%=s.getPrice() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>