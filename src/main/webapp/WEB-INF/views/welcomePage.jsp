<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 03.11.19
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
<h2>Witaj</h2>
<form action="/cart/add" method="post">
    Wprowadź nazwę produktu<input type="text" , name="name"><br>
    Wprowadź cenę produktu<input type="number" , step="0.01" name="price"><br>
    Wprowadź ilość produktu<input type="number" , name="quantity"><br>
    <input type="submit" , value="Wyślij">
</form>
</body>
</html>
