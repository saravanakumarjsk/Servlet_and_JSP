<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>JSP Directives</h4>
	<ol>
		<li>Page
		<li>Include
		<li>TagLine
	</ol>

	<%
		out.println("<h4>Page directive - info </h4>");
		String info = getServletInfo();
		out.println(info);
	%>
</body>
</html>