<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Book My Show </h1>
<form method="get" action='.//index'>
<table>
<tr><td> Seat Type <select name="type" id="type">
  <option value="Platinum">Platinum</option>
  <option value="Gold">Gold</option>
  <option value="Silver">Silver</option>
</select></td></tr>
<tr><td>Enter the number of Ticket <input type='text' name='num'></td></tr>
<tr><td><input type='submit' value='book ticket'></td></tr>
</table>
</form>
</body>
</html>