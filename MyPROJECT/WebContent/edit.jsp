<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="edit" method="post">
<div id="content">

<input type="text" value="${user_now_s.getId()}" name="id" readonly/>
<br>
<input type="text" size="40" value="${user_now_s.getLogin()}" name="login">
<br>
<br>
<input type="text" size="40" value="${user_now_s.getName()}" name="name">
<br>
<br>
<input type="text" size="40" value="${user_now_s.getSurame()}" name="surname">
<br>
<br>
<input type="text" size="40" value="${user_now_s.getEmail()}" name="email">
<br>
<br>
<input type="text" size="40" value="${user_now_s.getPassword()}" name="pass">
<br>
<br>
<input type="date" name="date_" value="${user_now_s.getBirthday()}">
<br>
</div>

<p><input type="submit" value="OK" >Update</p>
</form>

</body>
</html>