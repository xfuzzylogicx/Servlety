<%--
W projekcie stwórz servlety umożliwiające:

Wyświetlanie listy książek, dostępnej pod adresem /all-books.
Edycję książki - link do edycji w tabeli html dla każdej książki.
Dodaj linki umożliwiające usuwanie książek - link do usunięcia w tabeli html dla każdej książki.

Przykład interfejsu:

| Title | Author | Isbn | Akcja | ----------------- |:----------------:|:------- ------:| ----------:|
| Thinking in Java | Bruce Eckel | 9789814035750 | Usuń Edytuj| | Java 2 Podstawy | Cay S. Horstmann |
9788371979842 | Usuń Edytuj|
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method='POST'  >
    <label>Title: <input type='text' name='title'></label>
    <label>Author: <input type='text' name='author'></label>
    <label>ISBN: <input type='number' name='isbn'></label>
    <input type='submit'><br>
</form>


</body>
</html>
