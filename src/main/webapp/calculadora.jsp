<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>

		<meta charset="utf-8">
		<title>CALCULADORA</title>
		<style type="text/css">
			
			h1 {
            	background: white;
            	padding: 10px;
        	}

        	body {
        		background: white;
        	}


		</style>

	</head>

	<body>

		<div action="calculadora" method="get" align="center">

			<h1>CALCULADORA</h1>

			<form action="conta" method="post">

				<strong>N1:</strong> <input type="text" name="n1"><br><br>
				<strong>Op:</strong> <input type="text" name="op"><br><br>
				<strong>N2:</strong> <input type="text" name="n2"><br><br>
				<input type="submit" value="Calcular"></center><br><br>

				<%
				    Object resultado = request.getAttribute("resultado");
				    Boolean erro = (Boolean)request.getAttribute("erro");

				    if (erro == null) {
				        erro = false;
				    }

                    if (resultado != null && erro == false) {
                        out.print("<strong>");
                        out.print("Resultado:");
                        out.print("<strong>");
                        out.print(resultado);
                    }

                    if (erro == true) {
                        out.print("<h2>");
                        out.print("Calculo Invalido");
                        out.print("</h2>");
                    }

                    out.print("<br>");
                    out.print("<br>");
                    out.print("<br>");
                    out.print("<br>");

			    %>
			</form>

		</div>

		<form action="historico" method="get" align="center">

		    <input type="submit" value="Histórico">

		</form>

		<div align="center">

		    <a href="index.jsp"><button>Sair</button></a>

		</div>

	</body>

</html>