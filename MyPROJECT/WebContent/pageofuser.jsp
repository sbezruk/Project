<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${user_now.name}</title>
</head>
<body>
<h3>Welcome ${user_now.login}</h3>

<a href="index.jsp" name="reg" >LOG OUT</a>
<p>ID: ${user_now.id} </p>
<p>Name: ${user_now.name} </p>
<p>Surname: ${user_now.surname} </p>
<p>Email: ${user_now.email} </p>
<a href="edit.jsp" name="ed" >Edit</a>

<h2>ARTICLES</h2>

</body>
</html>