<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test-Noxml Spring MVC WebApp</title>
</head>
<body>
	<p>
		User : <security:authentication property="principal.username"/>
		<br><br>
		Role(s) : <security:authentication property="principal.authorities"/>
	</p>
	<h4>Successful Login</h4>
	<br>
	<h3>Welcome to Noxml Spring Security MVC WebApp using Maven - Custom Login Page</h3>
	
	<security:authorize access="hasRole('MANAGER')">
		<p><a href="${pageContext.request.contextPath}/leaders">Go to Team Lead Activities</a></p>
	</security:authorize>
	
	<security:authorize access="hasRole('ADMIN')">
	<p><a href="${pageContext.request.contextPath}/systems">Go to Systems Team Activities</a></p>
	</security:authorize>
	
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<p>
			<input type="submit" value="Logout"/>
		</p>
	</form:form>
</body>
</html>