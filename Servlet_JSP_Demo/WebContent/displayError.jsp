<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isErrorPage="true"
%>
<!DOCTYPE html>
<html>
<body>
<font color="red"><br>Error - <%= exception %>></font>
<font color="red"><br>Class - <%= exception.getClass() %>></font>
<font color="red"><br>Message - <%= exception.getMessage() %>></font>
</body>
</html>