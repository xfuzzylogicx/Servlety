<%--
  Created by IntelliJ IDEA.
  User: seb
  Date: 06.01.19
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method='POST'>
        <label>Title: <input type='text' name='title'></label>
        <label>Author: <input type='text' name='author'></label>
        <label>ISBN: <input type='text' name='isbn'></label><br>
    <input type='submit'><br>
</form>

<a href="/Mvc5b">Click me(Mvc5b)</a><br><br>

Title: ${book.title}<br>
Author: ${book.author}
</body>
</html>
