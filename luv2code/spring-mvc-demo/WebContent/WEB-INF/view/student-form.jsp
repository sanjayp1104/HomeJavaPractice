<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processForm"  modelAttribute="student">
		First Name : <form:input path="firstname"/>
		
		<br><br>
		Last Name : <form:input path="lastname"/>
		
		<br><br>
		<%-- Country : <form:select path="country">
					<form:option value="India" label="India"/>
					<form:option value="France" label="France"/>
					<form:option value="Brazil" label="Brazil"/>
					<form:option value="Germany" label="Germany"/>
		
				  </form:select> --%>
				  
			<form:select path="country">
				<form:options items="${student.countriesList}"/>
			</form:select>	
				  
		<br><br>
			Favorate Languages:<br>
			Java<form:radiobutton path="favlang" value="Java"/>
			C#<form:radiobutton path="favlang" value="C#"/>
			Python<form:radiobutton path="favlang" value="Python"/>
			Scala<form:radiobutton path="favlang" value="Scala"/>
		<br><br>
			Windows<form:checkbox path="operatingSystems" value="Windows"/>
			Linux<form:checkbox path="operatingSystems" value="Linux"/>
			Mac Os<form:checkbox path="operatingSystems" value="Mac Os"/>
		
		<br><br>
		<input type="submit" value="submit"/>
	
	</form:form>
</body>
</html>