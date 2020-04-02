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


	<form:form action="processFormmvc" modelAttribute="student">
	
		First name: <form:input path="firstName" />

		<br>
		<br>
	
		Last name: <form:input path="lastName" />

		<br>
		<br>
	
		Country:
		<form:select path="country">
			<form:options items="${student.countries}" />

		</form:select>

		<br>
		<br>
		Favorite Language:
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		C#<form:radiobutton path="favoriteLanguage" value="C#" />
		PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />
		Python<form:radiobutton path="favoriteLanguage" value="Python" />
		<br>
		<br>
		Which Os you want:
		Linux<form:checkbox path="operatingSystem" value="Linux"/>
		MAC OS<form:checkbox path="operatingSystem" value="Mac Os"/>
		Windows<form:checkbox path="operatingSystem" value="Windows"/>
		
		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>

</body>
</html>