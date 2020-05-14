<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="true"%>
    <%@ include file="directives_demo.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>isELIgnored</title>
</head>
<body>
<%
out.println("<h3> page directive - isELIgnored</h4>");
%>
${'Welcome to JSTL'}
<c:out value="${'- 3Edge solutions'}" />
</body>
</html>