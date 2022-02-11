<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucesso</title>
</head>
<body>
<% String usnome = (String) session.getAttribute("usnome");
	if(usnome==null){
		response.sendRedirect("login.html");
	}
	else{
		out.print("sessao feita com sucesso"+"<br/>");
	}

%>
<h1>Login feito com sucesso</h1>

<a href="LogoutServlet">Logout</a>
</body>
</html>