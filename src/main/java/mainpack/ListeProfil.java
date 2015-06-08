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

@WebServlet("ListeProfil")
public class ListeProfil extends HttpServlet
{
	public void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException
	{	
		PrintWriter out=res.getWriter();;
		
		try{
			SQLiteDataSource ds = new SQLiteDataSource();
			ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
					+ System.getProperty("file.separator") + "data.db");
			DBI dbi = new DBI(ds);
			ClientDao dao = App.dbi.open(ClientDao.class);
			
			dao.createClientTable();
			Client client1 = new Client(1, "lol", "Dylan", "Defives", "IUTALille", "Lille", "59000", "Lille", "a", "a", "01/02/1194", "06", "06", "etudiant", "etude", "lol", "lol", "lol", "lol", "lol", "lol", "lol", true);
			Client client2 = new Client(2, "lol", "Luc", "Jourdain", "IUTALille", "Lille", "59000", "Lille", "a", "a", "01/02/2012", "06", "06", "etudiant", "etude", "lol", "lol", "lol", "lol", "lol", "lol", "lol", true);

			dao.insert(client1);
			dao.insert(client2);
			
			res.setContentType( "text/html" );
			
			List<Client> l = dao.listerClients();
			 
			out.println("<html><head><meta charset=UTF-8>");
			out.println("<title>Liste des Profils</title></head>");
			out.println("<body><center>");
			out.println("<h1>Liste des Profils</h1>" );
			
			out.println("<table border='0'><tr>");
			
			for(int i = 0; i < l.size(); i++){
				out.println("<tr>");
				out.println("<td><img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:300px;heigth:300px\"></td>");
				out.println("<td>Nom: " + l.get(i).getNom() + " " + l.get(i).getPrenom() + "<br>Profession: " + l.get(i).getMetier() + "<br>Entreprise: " + l.get(i).getEntite() + "</td>");
				out.println("</tr><tr>");
				int id = l.get(i).getIdt();
				out.println("<td><input type=\"button\" name=\"submit\" value=\"Profil\" onclick=\"self.location='localhost:8080/PageProfil&id="+id+"'\" target=\"_blank\"></td>");
				out.println("<td></td></tr>");
			}
			
		    out.println("</table>");
		    out.println("<br>");
		    
			out.println("");
			out.println("</center></body></html>");
			
		} catch(Exception e){
			out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}