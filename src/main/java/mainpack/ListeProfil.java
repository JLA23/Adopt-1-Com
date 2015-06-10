package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpack.Items.Client;

import com.adopt.bdd.ClientDao;

@WebServlet("ListeProfil")
public class ListeProfil extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException
	{	
		PrintWriter out=res.getWriter();;

		try{

			Init init = Init.getInstance();
			ClientDao dao = init.getClientDao();

			res.setContentType( "text/html" );

			List<Client> l = dao.listerClients();

			//Debut de l'en-tête de la page
			out.println("<html><head>");
			out.println("<meta charset='utf-8'>");

			out.println("<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>");
			out.println("<script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");

			out.println("<title>Entreprises, commerçants et artisans locaux</title>");
			out.println("</head>");


			//Debut du corps de la page
			out.println("<body><div class='container'>");
			out.println("<h1 class='text-center'>Entreprises, commerçants et artisans locaux</h1>" );
			out.println("<br />");
			out.println("<div class='row'>");
			for(int i = 0; i < l.size(); i++){
				if(l.get(i).isValide()){
					int id = l.get(i).getIdt();
					out.println("<div class='col-md-4 text-center'>");
					out.println("<div class=\"thumbnail\">");
					out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"...\">");
					out.println("<p><a href=\"#\" class=\"btn btn-success\" role=\"\">J'aime</a> <a href=\"#\" class=\"btn btn-danger\" role=\"button\">J'aime pas</a></p>");
					out.println("<h3>" +l.get(i).getPrenom() + " " + l.get(i).getNom()+"</h3>");
					out.println("" + l.get(i).getMetier() + "<br>" + l.get(i).getEntite() + "<br>" + l.get(i).getVille() + "\n<br><br><a class=\"btn btn-warning btn-lg\" href=\"PageProfil?id="+id+"\" role=\"button\">En savoir plus</a>");
					out.println("</div>");
					out.println("</div>");
				}
			}
			out.println("</div>");
			out.println("</div></body></html>");

		} catch(Exception e){
			out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}