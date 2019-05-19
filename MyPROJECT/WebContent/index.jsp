<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>WELCOME</title>

</head>
<body>
<h1>Welcome FRIEND!</h1>
<div id="header">
<form name="mainform" action="go">
<input type="text" name="login" placeholder="login">
<input type="text" name="pass" placeholder="password">
<input type="submit" name="send" value="Go">
</form>

<a href="registration.html" name="reg" >Registration</a>
<a href="UnknownPass.jsp" name="uo" >Unknown password?</a>


</div>

<div class="container"> 
<!--<h2>Articles List</h2>
<p><a href='<c:url value="/createarticle.jsp" />'>Create new</a></p>

<c:forEach var="new_articles" items="${new_articles}">
 <p>${new_articles.title}</p>
    <p>${new_articles.content}</p>
     <p>${new_articles.date}</p>
    
</c:forEach>-->
<br>
 <img src="D:\Программирование\ProjectX\ProgectBlog\WebContent\1.jpg">
</div>

<div id="footer">
            <p>Contacts: snail.com</p>
            <p>Copyright © snail.com, 2016</p>
        </div>
</body>
</html>