package controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * 
 * @author Victor
 */

@WebServlet(name="Usuario", urlPatterns= {"/Usuario"})
public class Login extends HttpServlet{
	@Override
	public void doPost(	HttpServletRequest req,
						HttpServletResponse res){
		try{
			String id = req.getParameter("login");
			String senha = req.getParameter("senha");
			
			if(id.equals("massa") && senha.equals("abc123"))
				res.sendRedirect("calculadora.html");
			else
				res.sendRedirect("index.html");
			
		} catch(Exception e){
			System.out.println("Tente Novamente");
		}
	}
}