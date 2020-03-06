<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./sample01.css">
<title>ログイン画面</title>
</head>
<body>

<header>
<p>&emsp;書籍在庫管理システム</p>
</header>

<div class="login">
<div class="login-triangle"></div>

<h2 class="login-header">Login</h2>

<form action="sample01servlet" method="post">

	<% String result = (String)request.getAttribute("result");%>
	<% if(result != null){ %>
	<p><%= result %></p>
	<% } %>

<p>
<input type="text" placeholder="ID" name="id">
</p>

<p>
<input type="password" placeholder="Password" name="password">
</p>

<p>
<button class="button" type="submit">Login</button>
</p>

</form>

</div>

</body>
</html>