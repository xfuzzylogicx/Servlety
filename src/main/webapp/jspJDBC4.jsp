<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: seb
  Date: 16.01.19
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Lista książek to:</h3>
<ul>
    <c:forEach var="b" items="${Books}">
        <li>
            Tytuł: ${b.title}, Autor: ${b.author}, ISBN: ${b.isbn}
        </li>
    </c:forEach>
</ul>

<form method='POST'>
    <label>Search by Title: <input type='text' name='titleSearch'></label>
    <input type='submit' value="Search"><br>
</form>

</body>
</html>