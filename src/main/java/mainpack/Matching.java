package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Matching", urlPatterns = { "/Matching" }, initParams = { @WebInitParam(name = "simpleParam", value = "paramValue") })
public class Matching extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		Client clients[] = new BDD().getClients();
		Client act = clients[(int)new Random().nextInt(clients.length)];
		out.println("<head><title>Matching</title></head><body><center>" );
		out.println("<h1>Matching</h1>" );
		out.println("<table border=1 cellpadding=10>");
		out.println("<form action='/Matching' method = 'post'>"); // PAGEHTML A MODIFIER
		out.println("<tr><td><INPUT TYPE = submit Value=\"J'aime\"></td>");
		out.println("<td>Id : "+act.getId()+"<br> Nom : "+act.getNom()+"<br> Prénom : "+act.getPrenom()+"<br> Entite : "+act.getEntite());
		out.println("<td><INPUT TYPE = submit Value=\"J'aime pas\"></tr>");
		out.println("</form>");
		out.println("</table>");


		out.close();
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}