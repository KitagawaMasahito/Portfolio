<%@page import="model.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./BookList.css">
<title>書籍在庫管理システム</title>
</head>

<body>
	<header>
	<p>&emsp;書籍在庫管理システム</p>
	</header>

	<%-- ------ログイン処理/ログアウト処理------ --%>

	<%-- セッションスコープからUserBean取得 --%>
	<%
		UserBean user = (UserBean) session.getAttribute("user");
	%>
	<%-- UserBeanがnull→非表示、nullでない→「(name)さん」&「ログアウト」 --%>
	<%
		if (user != null) {
	%>
	<p><%=user.getName()%>さん <a href="./sample01.jsp">ログアウト</a>
	</p>
	<%
		} else {
	%>
	<p></p>
	<%
		}
	%>

	<%-- ------エラーメッセージ出力------ --%>

	<%-- リクエストスコープからエラーメッセージ取得 --%>
	<%
		String error = (String) request.getAttribute("error");
	%>
	<%-- errorがnull→非表示、nullでない→errorメッセージ出力 --%>
	<%
		if (error != null) {
	%>
	<p><%=error%></p>
	<%
		} else {
	%>
	<p></p>
	<%
		}
	%>

	<%-- ---書籍一覧出力--- --%>

	<%-- ArrayList取得 --%>
	<%
		ArrayList<BookBean> bookList = (ArrayList<BookBean>) request.getAttribute("books");
	%>
	<%-- 入荷/出荷処理用フォーム設定 --%>
	<form action="ReceivingAndShipping" method="post">
		<%-- ArrayList内容を出力 --%>
		<table>
			<tr>
				<th>選択</th>
				<th>ID</th>
				<th>書籍名</th>
				<th>著者名</th>
				<th>発売日</th>
				<th>ISBN
				<th>金額</th>
				<th>在庫</th>
			</tr>
			<%
				int line = 0;
				for (BookBean b : bookList) {
			%>
			<tr>
				<td><input type="checkbox" name="select"
					value="<%=String.valueOf(b.getId())%>"></td>
				<td><%=b.getId()%></td>
				<td><%=b.getTitle()%></td>
				<td><%=b.getAuthor()%></td>
				<td><%=b.getRelease()%></td>
				<td><%=b.getIsbn()%></td>
				<td><%=b.getPrice()%></td>
				<td><%=b.getStock()%></td>
			</tr>
			<%
				line++;
				}
			%>
		</table>

		<%-- ---入荷/出荷処理分岐--- --%>
		<%--ボタンで選択→サーブレットへ送信 --%>
		<p>
			<button class="button" type="submit" name="nextEve" value="r">入荷</button>
			<button class="button" type="submit" name="nextEve" value="s">出荷</button>

		</p>
	</form>

</body>
</html>