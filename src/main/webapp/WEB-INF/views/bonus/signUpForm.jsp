<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 04.11.19
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Private Account </title>
</head>
<body>

<form:form method="POST" action="/account/addAccount" modelAttribute="account" id="accountForm">
    <form:label path="name">Name</form:label>
    <form:input path="name"/>

    <form:label path="id">Id</form:label>
    <form:input type="number" path="id"/>  <%-- typ nie jest konieczny --%>
    <%--<form:input type="checkbox" path="laal"/> tak nie działa bo nie ma takiego pola --%>
    <form:select path="accountType" items="${accountType}"/>
    <input type="submit" value="Submit"/>
</form:form>

<h2>Private</h2>
<c:if test="${not empty privateMap}">
    <c:forEach items="${privateMap}" var="entry">
        Key = ${entry.key}, value = ${entry.value}<br>
    </c:forEach>
</c:if>


<h2>Corporate</h2>
<c:if test="${not empty corporateMap}">
    <c:forEach items="${corporateMap}" var="entry">
        Key = ${entry.key}, value = ${entry.value}<br>
    </c:forEach>
</c:if>
</body>
</html>