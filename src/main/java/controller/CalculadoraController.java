package controller;


import dao.CalculadoraDaoImpl;
import model.Calculadora;
import model.Usuario;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

// Salvar Operacoes e  vai pro resultado.jsp
@WebServlet(value = "/conta")
public class CalculadoraController extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        ServletContext sc = req.getServletContext();

        String numeroUm = req.getParameter("n1");
        String numeroDois = req.getParameter("n2");
        String operacao = req.getParameter("op");

        Double numero1 = Double.parseDouble(numeroUm);
        Double numero2 = Double.parseDouble(numeroDois);
        Double resultado = 0.0;

        boolean erro = false;

        if (operacao.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operacao.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operacao.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacao.equals("/")) {
            if (operacao.equals("/") && numero2 == 0) {
                erro = true;
            } else {
                resultado = numero1 / numero2;
            }
        } else if (operacao.equals("raiz")) {
            if (operacao.equals("raiz") && (numero2 < 0)) {
                erro = true;
            } else {
                resultado = Math.sqrt(numero2);
            }
        } else if (operacao.equals("^")) {
            resultado = Math.pow(numero1, numero2);
        }

        CalculadoraDaoImpl calculadoraDao = new CalculadoraDaoImpl();

        HttpSession session = req.getSession();

        Usuario usuario = (Usuario) session.getAttribute("usuario");

        calculadoraDao.salvarConta(numero1, numero2, operacao, resultado, usuario);

        req.setAttribute("resultado", resultado);
        req.setAttribute("erro", erro);

        sc.getRequestDispatcher("/calculadora.jsp").forward(req, res);
    }

}
