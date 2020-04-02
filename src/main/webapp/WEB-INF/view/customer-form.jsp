<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.errors {
	color: red
}
</style>
</head>
<body>
	<form:form action="process" modelAttribute="customer">
first name:<form:input path="firstName" />
		<form:errors path="firstName" cssClass="errors"></form:errors>
		<br>
LastName(*):<form:input path="lastName" />
		<form:errors path="lastName" cssClass="errors" />
		<br>
		<br>

		Free passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="errors" />

		<br>
		<br>
	Postal code: <form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="errors" />

		<br>
		<br>
	CourseCode: <form:input path="courseCode" />
		<form:errors path="courseCode" cssClass="errors" />

		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>