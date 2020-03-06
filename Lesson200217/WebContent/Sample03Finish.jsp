<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample03 確定</title>
</head>

<body>
	<%-- 購入情報をセッションスコープより取り出し --%>
	<%	String book = (String)session.getAttribute("book");
		String quantity = (String)session.getAttribute("quantity"); %>

	<%-- 「(本の種類) (冊数)冊購入しました」と出力 --%>
	<%=book %> <%=quantity %>冊購入しました。

</body>
</html>