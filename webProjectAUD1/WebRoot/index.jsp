<html>
<title>Welcome</title>
<style type="text/css">
<!--
#Layer1 {
	position: absolute;
	width: 1131px;
	height: 225px;
	z-index: 1;
	left: 3px;
	top: 14px;
}

#Layer2 {
	position: absolute;
	width: 283px;
	height: 220px;
	z-index: 1;
	left: 617px;
	top: 141px;
	background-color: #354865;
}

body,td,th {
	font-family: Arial, Helvetica, sans-serif;
	font-size: 14px;
	color: #FFFFFF;
}

body {
	background-color: #993300;
	background-repeat: no-repeat;
}
-->
</style>
<body>
	<hr>
	<h1 align="center">
		<marquee behavior="alternate">WELCOME @ MY PAGE</marquee>
	</h1>
	<hr>
	<div id="Layer2">
		<p>&nbsp;</p>
		<%String m=(String)request.getAttribute("msg");
if(m!=null)
{
 %>
		<h1>
			<font color="red"> <%=m %></font>
		</h1>
		<% }%>

		<form action="log">
			<table width="284" height="90" align="center">
				<tr>
					<th width="102" scope="row">USER NAME:</th>
					<td width="166"><input type="text" name="name"></td>
				</tr>
				<tr>
					<th scope="row">PASSWORD:</th>
					<td><input type="password" name="pass"></td>
				</tr>
			</table>
			<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

			<input type="submit" value="login"> <a href="Signup.jsp"><input
				type="button" value="SignUp"></a>
		</form>
	</div>
	<hr />
</body>
</html>
