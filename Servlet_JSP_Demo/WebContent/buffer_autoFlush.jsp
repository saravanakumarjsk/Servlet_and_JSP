<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page buffer="none" autoFlush="true" %>
<!DOCTYPE html>
<html>
<body>
<%
out.println("<h2>Page directive - autoflush and buffer </h4>");
%>
<%
int size = out.getBufferSize();
out.println("Default buffer size is [8kb] "+ size +"Bytes");
%>
</body>
</html>