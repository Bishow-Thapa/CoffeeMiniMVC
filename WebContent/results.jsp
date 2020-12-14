<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee Recommendation JSP</title>
</head>
<body>
	<h1 align="center">Coffee Recommendation</h1>
	<p align="center">
	<%
		List styles = (List) request.getAttribute("styles");
		Iterator it = styles.iterator();
		while(it.hasNext())
		{
			out.print("<br> try: " + it.next());
		}
	%>
	</p>
</body>
</html>