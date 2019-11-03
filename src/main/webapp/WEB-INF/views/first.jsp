<%--
  Created by IntelliJ IDEA.
  User: tomasz
  Date: 03.11.19
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First</title>
</head>
<body>
<h2>First JSP</h2>

<a href='<c:url value="/redirect/second" />'>Link</a>
</body>
</html>
