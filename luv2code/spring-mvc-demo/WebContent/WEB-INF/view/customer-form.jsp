<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration Form</title>
<style>
.error {color : red}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First Name :<form:input path="firstName"/>
					<form:errors path="firstName" cssClass="error"/>
		<br><br>
		Last Name : <form:input path="lastName"/>
					<form:errors path="lastName" cssClass="error"/> 	
		<br><br>
		Number of Passes : <form:input path="noofPasses"/>
							<form:errors path="noofPasses" cssClass="error"/> 	
		<br><br>
		Postal Code : <form:input path="postalCode"/>
							<form:errors path="postalCode" cssClass="error"/> 
		<br><br>
		Show Code : <form:input path="showCode"/>
							<form:errors path="showCode" cssClass="error"/> 
		<br><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>