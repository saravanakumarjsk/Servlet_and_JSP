<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    session="true"
    %>
<!DOCTYPE html>
<html>
<body>
<%
out.println("<h4> Page Directive - session </h4>");
session.setAttribute("username", "Ram");
out.println("username is "+ session.getAttribute("username"));
%>
</body>
</html>