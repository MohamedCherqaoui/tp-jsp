package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.codegen.IntegerCache;

import Model.Personne;

import daoconnexion.Daopersonne;


@WebServlet("/act1")
public class Mservlet extends HttpServlet {
	
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Personne p=new Personne(request.getParameter("nom"),request.getParameter("prenom"),Integer.parseInt(request.getParameter("age")),request.getParameter("login"),request.getParameter("password"));
		Daopersonne Dao =new Daopersonne();
		int res=0;
		try {
			res = Dao.ajouterPersonne(p);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(res == 0) {
			out.print("voter inscription est echoue");
			
		}else {
			out.print("votre inscription a ete bien faite ...");
		}
	}

}
