<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset=UTF-8">
	<title>朝テストQ2</title>
</head>

<body>
	<table border="1">
	<%for(int i=0;i<10;i++){ %>
		<tr>
		<%for(int j=0;j<2;j++){%>
			<td><%=i %><%=j %></td>
	<%	} %>
		</tr>
	<%}%>
	</table>
</body>

</html>