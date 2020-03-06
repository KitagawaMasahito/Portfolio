<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question01</title>
</head>
<body>
	<form action="Question01Servlet"  method="get">
		<p>
			<button type="submit" name="action" value="forward">フォワード</button>
			<button type="submit" name="action" value="redirect">リダイレクト</button>
		</p>
	</form>
</body>
</html>