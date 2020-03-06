<%@page import="model.BookBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入荷処理サンプル</title>
</head>
<body>
	<h2>入荷</h2>

	<% ArrayList <BookBean> book = (ArrayList <BookBean>)session.getAttribute("bookmach"); %>
<form action="ArrivalcheckinputServlet" method="post">
<table>
	<% for(BookBean b : book){ %>
	<tr>
	<td><%=b.getId() %></td>
	<td><%=b.getTitle() %></td>
	<td><%=b.getAuthor() %></td>
	<td><%=b.getRelease() %></td>
	<td><%=b.getIsbn() %></td>
	<td><%=b.getPrice() %></td>
	<td><%=b.getStock() %></td>
	<td><input type="text" name="arrivalnum"> </td>

	</tr>
	<% }%>
</table>

	<%--確定ならば  --%>
	<input type="submit" value = "確定">
	<input type="submit" value = "一覧へ戻る">

</form>
</body>
</html>