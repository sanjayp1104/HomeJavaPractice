<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test-Noxml Spring MVC WebApp</title>
</head>
<body>
	<h4>Successful Login</h4>
	<br>
	<h3>Welcome to Noxml Spring Security MVC WebApp using Maven - Custom Login Page</h3>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<p>
			<input type="submit" value="Logout"/>
		</p>
	</form:form>
</body>
</html>