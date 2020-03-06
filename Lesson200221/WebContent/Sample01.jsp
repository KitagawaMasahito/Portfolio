<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>リクエストパラメータでの処理の分岐</title>
</head>

<body>
	<form action="Sample01Servlet">
		リクエストパラメータ無し送信ボタン<br>
		<button type="submit">無</button><br>
		リクエストパラメータ有ボタン(name属性：action、値:done)<br>
		<button type="submit" name="action" value="done">有</button>
	</form>
</body>
</html>