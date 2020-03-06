<%@page import="model.FruitBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Question03 確認画面</title>
</head>

<body>
	<%-- フルーツ情報をセッションスコープより取り出し --%>
	<%	FruitBean fruit = (FruitBean)session.getAttribute("kudamono");	%>

	<%-- 出力「以下のフルーツを登録します。(\n)フルーツ名：○○(\n)価格：△△	--%>
	<p>以下のフルーツを登録します。</p>
	フルーツ名；<%=fruit.getName() %><br>
	価格：<%=fruit.getPrice() %>

	<%-- 登録ボタン---Question03Servletへ"get"で送信--- --%>
	<form action="Question03Servlet" method="get">
		<p><button type="submit">登録実行</button></p>
	</form>
</body>

</html>