<%@page contentType="text/html" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Preis Kalkulator</title>
</head>
<body>
	<br>
	<br>
	<br>
	<form action="home" method="post" modelAttribute="shippingprice">
		Country: <select name="country">
			<option value="Deutschland" selected>Deutschland</option>
			<option value="USA">USA</option>
			<option value="Norway">Norway</option>
			<option value="Neitherland">Neitherland</option>
			<option value="China">China</option>
		</select> Weight: <input type="text" name="weight" /> 
		<input type="submit" value="Find Price"> Price : ${price}
	</form>
</body>
</html>