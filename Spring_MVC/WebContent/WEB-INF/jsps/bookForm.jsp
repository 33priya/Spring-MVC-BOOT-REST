<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>
<h1>Enter book details:</h1>
<form:form action="addBook.htm" method="post" modelAttribute="book">
	Book Name: <form:input path="bookName"/><br>
	ISBN: <form:input path="ISBN"/><br>
	Publication: <form:input path="publication"/><br>
	Price: <form:input path="price"/><br>
	Description: <form:input path="description"/><br>
	Author: <form:input path="author"/><br><br>
	<input type="submit" value="Add Book"/>
</form:form>
</body>
</html>