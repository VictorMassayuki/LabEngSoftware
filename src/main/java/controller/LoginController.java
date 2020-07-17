package controller;

import dao.LoginDaoImpl;
import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/usuario")
public class LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

        ServletContext sc = req.getServletContext();

        String nome = req.getParameter("login");
        String senha = req.getParameter("senha");

        LoginDaoImpl loginDao = new LoginDaoImpl();

        try {
            Usuario usuario = loginDao.buscarUsuario(nome, senha);
            HttpSession session = req.getSession();

            session.setAttribute("usuario", usuario);

            sc.getRequestDispatcher("/calculadora.jsp").forward(req, res);
        } catch (Exception e) {
            System.out.println(e);
            sc.getRequestDispatcher("/index.jsp").forward(req, res);
        }

    }

}
