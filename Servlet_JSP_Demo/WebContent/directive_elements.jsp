<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,java.text.*" 
    info="Directives Demo"%>
    <%@ include file="directives_demo.jsp" %>
<!DOCTYPE html>
<html>
<body>
<%
out.println("<h4>Page directive - info </h4>");
Date date = new Date();
out.println(date);
SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
out.println("<br>"+sdf.format(date)+"<br>");
%>
</body>
</html>