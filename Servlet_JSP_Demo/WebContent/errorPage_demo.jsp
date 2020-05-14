<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
	errorPage="displayError.jsp"    
%>
    <%@ include file="directives_demo.jsp" %>
<!DOCTYPE html>
<html>
<head>
<title>Error Page demo</title>
</head>
<body>
<%
out.println("<h4> page directive - errorPage and isErrorPage </h4>");
%>
<%
int a=10;
int b=0;
int res = a/10;
out.println(a +"/" + b + " is "+ a/b);
%>
</body>
</html>