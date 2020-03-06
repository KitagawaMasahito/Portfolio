<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Question03 フルーツ登録</title>
</head>

<body>
	<%-- 見出し --%>
	<h1>フルーツ登録</h1>

	<%-- 入力フォーム：入力情報をQuestion03Servletへpostで送信 --%>
	<form action="/Question03Servlet" method="post">
		フルーツ名：<input type="text" name="name"><br>
		価格：<input type="text" name="price"><br>
		<button type="submit">登録</button>
	</form>
</body>

</html>