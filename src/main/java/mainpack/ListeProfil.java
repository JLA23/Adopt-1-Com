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
			/*SQLiteDataSource ds = new SQLiteDataSource();
			ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
					+ System.getProperty("file.separator") + "data.db");
			DBI dbi = new DBI(ds);
			ClientDao dao = App.dbi.open(ClientDao.class);*/
			
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
			 
			out.println("<html><head><meta charset=UTF-8>");
			out.println("<title>Liste des Profils</title></head>");
			out.println("<body><center>");
			out.println("<h1>Liste des Profils</h1>" );
			
			out.println("<table border='0'><tr>");
			
			for(int i = 0; i < l.size(); i++){
				if(l.get(i).isValide()==true){
					out.println("<tr>");
					out.println("<td><img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:300px;heigth:300px\"></td>");
					int id = l.get(i).getIdt();
					out.println("<td>" + l.get(i).getPrenom() + " " + l.get(i).getNom() + "<br>" + l.get(i).getMetier() + "<br>" + l.get(i).getEntite() + "<br>" + l.get(i).getVille() + "\n<br><br><input type=\"button\" name=\"submit\" value=\"Profil\" onclick=\"self.location='localhost:8080/PageProfil?id="+id+"'\" target=\"_blank\"> </td>");
					out.println("</tr><tr>");
					out.println("<td><a href="+l.get(i).getFacebook()+"><img src=\"http://www.clementpellerin.fr/wp-content/uploads/2011/05/facebook-icon.png\" alt=\"lien Facebook\" style=\"width:30px;heigth:30px\"></a>");
					out.println("<a href="+l.get(i).getTwitter()+"><img src=\"http://www.sidassport.com/docs/2280-1-logo-twitter-gif.gif\" alt=\"lien Facebook\" style=\"width:30px;heigth:30px\"></a>");
					out.println("<a href="+l.get(i).getGooglePlus()+"><img src=\"http://blog.datanyze.com/wp-content/uploads/2014/09/LinkedIn-large-logo.jpg\" style=\"width:30px;heigth:30px\"></a>");
					out.println("<a href="+l.get(i).getLinkedIn()+"><img src=\"http://www.uha.fr/images/google_icon\" style=\"width:30px;heigth:30px\"></a>");
					out.println("<br><br></td>");
					out.println("<td></td></tr>");
				}
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