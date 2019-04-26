<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Detail Page</title>
</head>
<body>
	<h1>Book details:</h1>
	<font color="Blue">BOOK NAME:</font> ${book.bookName} <br>
	<font color="Blue">ISBN:</font> ${book.ISBN} <br>
	<font color="Blue">PUBLICATION:</font> ${book.publication} <br>
	<font color="Blue">PRICE:</font> ${book.price} <br>
	<font color="Blue">DESCRIPTION:</font> ${book.description} <br>
	<font color="Blue">AUTHOR:</font> ${book.author}
</body>
</html>