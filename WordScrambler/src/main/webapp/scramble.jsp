<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Word scrambler</title>
</head>
<body>
	<form action="getScrambleWordServlet" method="post">
		<p>Enter the word to be scrambled:</p>
		<input type="text" name="scrambleWord" size="20"> <input type="submit"
			value="Scramble word!" />
	</form>
<a href="unscramble.jsp">Unscramble a word</a>
</body>
</html>