<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Zadanie 4
        W projekcie stwórz servlet Mvc14 dostępny pod adresem /Mvc14. Następnie:

        W widoku wyświetlanym metodą GET o nazwie form.jsp stwórz
        formularz zawierający pola o nazwach (title1, author1, isbn1), (title2, author2, isbn2), itd do 5. Formularz ma być przesłany metodą POST do servletu Mvc14.
        Zaimportuj wcześniej stworzoną klasę Book.
        W servlecie Mvc14 odbierz dane i na ich podstawie stwórz obiekty klasy Book.
        Obiekty umieść w liście lub tablicy, którą następnie przekaż do widoku result.jsp.
        W pętli wyświetl właściwości wszystkich obiektów title, author.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method='POST' action="">
    <c:forEach begin="1" step="1" end= "5" var="stat">
        <label>Title: <input type='text' name='title${stat}'></label>
        <label>Author: <input type='text' name='author${stat}'></label>
        <label>ISBN: <input type='text' name='isbn${stat}'></label><br>
    </c:forEach>

    <input type='submit'><br>
</form>

<c:forEach var="book" items="${books}">
    ${book.title}<br>
</c:forEach>

</body>
</html>
