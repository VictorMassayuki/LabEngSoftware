<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

	<head>

		<meta charset="utf-8">
		<title>INÍCIO</title>
		<style type="text/css">
			
			h1 {
            	background: white;
            	padding: 10px;
        	}

        	body {
        		background: blue;

        	}

		</style>

	</head>

	<body>

		<div align="center">
			
			<h1>SEJA BEM VINDO!</h1>
			<h2>Favor entrar com seu login</h2>

			<form action="usuario" method="post"/>

				<h3>Login:</h3>
				<input type="text" name="login"><br>

				<h3>Senha:</h3>
				<input type="password" name="senha"><br><br>

				<input type="submit" value="Entrar">

			</form>

		</div>

	</body>

</html>
