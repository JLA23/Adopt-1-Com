package mainpack;

import java.sql.*;
import java.util.List;
import java.sql.Date;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

import mainpack.Items.Client;

import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;

import com.adopt.bdd.ClientDao;

import fr.iutinfo.App;

@WebServlet("ListeProfil2")
public class ListeProfil2 extends HttpServlet
{
	public void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException
	{	
		PrintWriter out=res.getWriter();;

		try{

			Init init = Init.getInstance();
			ClientDao dao = init.getClientDao();

			try{
				init.initTables();
				init.exempleClient();
			} catch(Exception e){
				System.out.println("BDD déjà faite !");
			}

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

			out.println("<title>Liste des Profils</title>");
			out.println("</head>");


			//Debut du corps de la page
			out.println("<body><center>");
			out.println("<h1>Liste des Profils</h1>" );


			for(int i = 0; i < l.size(); i++){
				if(l.get(i).isValide()==true){
					int id = l.get(i).getIdt();
					out.println("<div class=\"row\">");
					out.println("<div class=\"col-md-2\">");
					out.println("<div class=\"thumbnail\">");
					out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"...\">");
					out.println("<p><a href=\"#\" class=\"btn btn-success\" role=\"\">J'aime</a> <a href=\"#\" class=\"btn btn-danger\" role=\"button\">J'aime pas</a></p>");
					out.println("<h3>" +l.get(i).getPrenom() + " " + l.get(i).getNom()+"</h3>");
					out.println("" + l.get(i).getMetier() + "<br>" + l.get(i).getEntite() + "<br>" + l.get(i).getVille() + "\n<br><br><a class=\"btn btn-warning btn-lg\" href=\"PageProfil?id="+id+"\" role=\"button\">En savoir plus</a>");
					out.println("</div>");
					out.println("</div>");
					out.println("</div>");
				}
			}

			out.println("</center></body></html>");

		} catch(Exception e){
			out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}