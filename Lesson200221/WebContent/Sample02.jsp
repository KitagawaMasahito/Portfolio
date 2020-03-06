<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="product" scope="request" class="model.ProductBean"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Sample02 アクションタグ</title>
</head>

<body>
	<p>アクションタグ使用</p>
	商品名：<jsp:getProperty property="name" name="product"/><br>
	価格：<jsp:getProperty property="price" name="product"/>

	<p>スクリプトレット使用</p>
	インスタンス:${prod}<br>
	商品名：${prod.name}<br>
	価格：${prod.price}
</body>

</html>