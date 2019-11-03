<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 03.11.19
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Cart</title>
</head>
<body>
<h2> Produkty w koszyku </h2>


<c:if test="${not empty cart}"> <%--sprawdza czy lista nie jest pusta --%>
    <c:forEach items="${cart}" var="cartItem">
        <p>${cartItem}</p>
        <form action="/cart/quantity" method="post">
            <input type="number" name="quantity">
            <input type="hidden" name="itemName" value="${cartItem.getProduct().getName()}">
            <input type="submit" value="Zmień ilość">
        </form>
        <input type="button" onclick="location.href='/cart/remove?itemName=${cartItem.getProduct().getName()}';"
               value="Kasuj"/>
    </c:forEach>
</c:if>

</body>
</html>
