<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ログイン画面</title>
</head>
<body>
<center>
<h2>交通費管理システム</h2>
<form method="post" action="/TeMS/stp/LoginToMenu">
社員ID<input type="text" name="社員ID"/><br><br>
パスワード<input type="text" name="パスワード"/><br><br>
<input type="submit" value="ログイン"/>
</form>
</center>
</body>
</html>