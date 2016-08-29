<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:import url="cabecalho.jsp"></c:import>
	<br>

	<div align="center">
		<form action="converter" method="post">
			<b>DIGITE O NÚMERO ROMANO:</b> <br /> <br />
			<input type="text" name="numeroRomano" /> <br /><br/>
			<font color="green">[Escala: I - MMMCMXCIX]</font> <br /> <br />
			<input	type="submit" value="Converter" />
		</form>
		<br />
	</div>

	<br />
	<marquee>
		<b>NOME:</b> Ted Nicolas António Fernandes ----- <b>Contato:</b> +258
		842913365 ----- <b>Email:</b> ted.fernandess@gmail.com
	</marquee>

	<br />
	<c:import url="rodape.jsp"></c:import>

</body>
</html>