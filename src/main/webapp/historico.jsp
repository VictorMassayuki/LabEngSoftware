<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="model.Calculadora"%>

<!DOCTYPE html>

<html>

	<head>

		<meta charset="utf-8">
		<title>HISTÓRICO</title>
		<style type="text/css">
			
			h1 {
            	background: white;
            	padding: 10px;
        	}

        	body {
        		background: blue;

        	}

        	td {
        		color: white;
        	}

		</style>

	</head>

	<body>

		<div align="center">

			<h1>HISTÓRICO DE CONTAS</h1>

            <%
                ArrayList<Calculadora> contas = (ArrayList) request.getAttribute("contas");

                for (int i=0; i < contas.size(); i++) {

                    out.print(contas.get(i).getUsuario().getNome());
                    out.print("             -->   ");
                    out.print(contas.get(i).getHorario());
                    out.print("             -->   ");
                    out.print(contas.get(i).getNumeroUm());
                    out.print("  ");
                    out.print(contas.get(i).getOperacao());
                    out.print("  ");
                    out.print(contas.get(i).getNumeroDois());
                    out.print("  ");
                    out.print("=");
                    out.print("  ");
                    out.print(contas.get(i).getResultado());

                    out.print("<br>");
                    out.print("<br>");
                }
            %>

		</div>

		<br>

		<div align="center">
			
			<a href="calculadora.jsp"><button>Voltar</button></a>

		</div>

	</body>

</html>