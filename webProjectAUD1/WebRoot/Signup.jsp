<html>
<title>Welcome</title>
<style type="text/css">
<!--
#Layer1 {
	position: absolute;
	width: 331px;
	height: 225px;
	z-index: 1;
	left: 3px;
	top: 14px;
}

#Layer2 {
	position: absolute;
	z-index: 1;
	left: 585px;
	top: 140px;
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
		<marquee behavior="alternate" bgcolor="#145255">Fill the
			required Data below:</marquee>
	</h1>
	<div id="Layer2">
		<p>&nbsp;</p>

		<form action="register">
			<table align="center" border="6" height="420">
				<tr>
					<th scope="row">Enter User Name:</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th scope="row">Enter Password:</th>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<th scope="row">Contact no.:</th>
					<td><input type="text" name="contact"></td>
				</tr>
				<tr>
					<th scope="row">Qualification:</th>
					<td><input type="text" name="edu"></td>
				</tr>
				<tr>
					<th scope="row">Address:</th>
					<td><input type="text" name="add"></td>
				</tr>
				<tr>
					<th scope="row">Date of Birth:</th>
					<td><input type="text" name="dob"></td>
				</tr>
				<tr>
					<th scope="row">Nationality:</th>
					<td><input type="text" name="nation"></td>
				</tr>
				<tr>
					<th scope="row">Gender:</th>
					<td><input type="radio" name="gender" value="male">male<input
						type="radio" name="gender" value="female">female</td>
				</tr>
				<tr>
					<th scope="row">Category:</th>
					<td><input type="checkbox" name="cat" value="Open">Open:<br>
					<input type="checkbox" name="cat" value="OBC">OBC:<br>
					<input type="checkbox" name="cat" value="SC/ST">SC/ST:</td>
				</tr>

			</table>
			<br>
			<div align="center">
				<input type="submit" value="Register">
			</div>
		</form>
	</div>
	<hr />
</body>
</html>

