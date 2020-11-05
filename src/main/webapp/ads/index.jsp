<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: carolineesquivel
  Date: 11/4/20
  Time: 12:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Viewing Ads</h1>
<c:forEach var="ad" items="${ads}">
    <div>
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
