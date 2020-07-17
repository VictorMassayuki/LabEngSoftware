package controller;

import dao.CalculadoraDaoImpl;
import model.Calculadora;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

// Listar operacoes
@WebServlet("/historico")
public class HistoricoController extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        try {

            CalculadoraDaoImpl calculadoraDao = new CalculadoraDaoImpl();

            List<Calculadora> contas = calculadoraDao.listarConta();

            req.setAttribute("contas", contas);
            req.getRequestDispatcher("/historico.jsp").forward(req, res);
        } catch (Exception e){
            System.out.println("Erro:" + e.getMessage());
        }
    }

}
