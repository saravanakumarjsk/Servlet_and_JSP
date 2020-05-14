<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="elements.jsp"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<h4>Scriplet tag</h4>
	<%
		out.println("welcome to scriplet tag, this is java code");
	%>
	<br>
	<%="Welcome to expression tag"%>
	<br>
	<%!int a = 10;

	public void dsiplayA(JspWriter out) throws IOException {
		out.println("A is " + a);
	}%>

	
</body>
</html>