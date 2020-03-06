<%@page import="model.UserBean"%>
<%@page import="model.BookBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>出荷処理</title>
</head>
<body>
	<h1>出荷処理</h1>

	<%-- ------ログイン処理/ログアウト処理------ --%>

	<%-- セッションスコープからUserBean取得 --%>
	<%UserBean user = (UserBean)session.getAttribute("user"); %>
	<%-- UserBeanがnull→非表示、nullでない→「(name)さん」&「ログアウト」 --%>
	<%if(user!=null){ %>
		<p><%=user.getName() %>さん　<a href="./sample01.jsp">ログアウト</a></p>
	<%}else{%>
		<p>　</p>
	<%} %>

	<%-- ------エラーメッセージ出力------ --%>

	<%-- リクエストスコープからエラーメッセージ取得 --%>
	<%String error = (String)request.getAttribute("error");%>
	<%-- errorがnull→非表示、nullでない→errorメッセージ出力 --%>
	<% if(error != null){ %>
		<p><%= error %></p>
	<%}else{%>
		<p>　</p>
	<%} %>

	<%-- ---書籍一覧出力--- --%>

	<% ArrayList <BookBean> book = (ArrayList <BookBean>)session.getAttribute("bookmach"); %>
	<%-- 入荷/出荷処理用フォーム設定 --%>
	<form action="ShippingConfirmServlet" method="post">
	<%-- ArrayList内容を出力 --%>
	<table>
		<tr>
			<th>ID</th><th>書籍名</th><th>著者名</th><th>発売日</th><th>ISBN<th>金額</th><th>在庫</th><th>入荷数</th>
		</tr>
		<% for(BookBean b : book){ %>
		<tr>
		<td><%=b.getId() %></td>
		<td><%=b.getTitle() %></td>
		<td><%=b.getAuthor() %></td>
		<td><%=b.getRelease() %></td>
		<td><%=b.getIsbn() %></td>
		<td><%=b.getPrice() %></td>
		<td><%=b.getStock() %></td>
		<td><input type="text" name="shipSum"></td>
		</tr>
		<% }%>
	</table>

	<%-- ---入荷/出荷処理分岐--- --%>
	<%--ボタンで選択→サーブレットへ送信 --%>
	<button type="submit" name="nextEve" value="confirm">確認</button>
	</form>
	<form action="BookListServlet" method="post">
		<button type="submit">一覧に戻る</button>
	</form>

</body>
</html>