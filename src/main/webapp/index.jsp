<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title><%= "some title" %></title>
    <jsp:include page="partials/head.jsp"></jsp:include>
</head>
<body>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">

    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
    <jsp:include page="partials/scripts.jsp"></jsp:include>
</body>
</html>
