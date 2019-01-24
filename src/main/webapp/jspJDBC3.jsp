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
            Tytuł: ${b.title}, Autor: ${b.author}, ISBN: ${b.isbn}<%--, ID: ${b.id}--%> <a href="/Jdbc4?action=1&isbn=${b.isbn}">Delete</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>