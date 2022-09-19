<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Word unscrambler</title>
</head>
<body>
	<form action="getUnscrambleWordServlet" method="post">
		<p>Enter the word to be unscrambled:</p>
		<input type="text" name="unscrambleWord" size="20"> <input type="submit"
			value="Unscramble word!" />
	</form>
<a href="scramble.jsp">Scramble a word</a>
</body>
</html>