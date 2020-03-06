<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MorningTest つぶやき</title>
</head>

<body>
	<form action="Q2Servlet" method="post">
		つぶやき<br>
		<input type="text" name="tweet">

		<p>名前
			<input type="text" name="name"
				<%	String name = (String)session.getAttribute("nam");
					if(name!=null && !name.equals("")){%>
						value="<%=name %>"
				<%	} %>
			>
		</p>

		<button type="submit">送信</button>
	</form>

	<p>------------------------------</p>

	<%-- アプリケーションスコープに保存されているtweetsを出力 --%>
	<%List<String> tweets = (List<String>)application.getAttribute("tweet"); %>
	<%-- tweetsがスコープにある時だけ出力 --%>
	<%if(tweets!=null && tweets.size()!=0){%>
		<%for(String s:tweets){ %>
			<p><%=s %></p>
		<%} %>
	<%}%>
</body>

</html>