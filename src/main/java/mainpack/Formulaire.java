package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Formulaire")
public class Formulaire extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		boolean mdpEgaux;
		boolean mailEgaux;	
		
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		// ENLEVER LE TABLEAU, A FAIRE EN BOOTSTRAP
		out.println("<html><head><meta charset=UTF-8>");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<title>Formulaire</title>");
		out.println("<link href=\"../../bootstrap/css/dist/bootstrap.css\" rel=\"stylesheet\"></head>");
		out.println("<body><center>");
		out.println("<h1>Formulaire Inscription</h1>" );
		
		out.println("<table cellpadding=10>");
		out.print("<form method='post' action='VerifForm'>");
		out.println("<tr><td>Nom (*) : <td><INPUT type='text' value='' name='nom' required></td>");
		out.println("<td>Prénom (*) :<td> <INPUT type='text' value='' name='prenom' required></td>");
		out.println("<tr><td>Entreprise (*) : <TD><INPUT type='text' value='' name='entreprise' required></td>");
		out.println("<td>Adresse (*) : <td><INPUT type='text' value='' name='adresse' required></td>");
		out.println("<tr><td>Code Postal (*) : <td><INPUT type='text' value='' name='codepost' required></td>");
		out.println("<td>Ville (*) : <td><INPUT type='text' value='' name='ville' required></td>");
		out.println("<tr><td>E-mail (*) : <td><INPUT type='email' value='' name='mail' required placeholder='thierry.dupont@gmail.com'></td>");
		out.println("<td>Confirmer E-mail (*) : <td><INPUT type='email' value='' name='mail2' required placeholder='thierry.dupont@gmail.com'></td>");
		out.println("<tr><td>Téléphone (*) : <td><INPUT type='tel' value='' name='tel' required placeholder='0675000000'></td>");
		
		out.println("<td>Fax : <td><INPUT type='text' value='' name='fax'></td>");
		out.println("<tr><td>Métier (*) : <td><INPUT type='text' value='' name='profession' required></td>");
		out.println("<td>Domaine d'activité (*) : <td><INPUT type='text' value='' name='activite' required></td>"); // MENU DEROULANT
		out.println("<tr><td><label for='description'>Description</label>");     
		out.println("<tr><td><textarea name='description' id='description' rows='8' cols='30'>Comment voyez vous votre métier ?</textarea></td>");
		
		out.println("<tr><td>Facebook : <td><INPUT type='text' value='' name='facebook' placeholder='http://monfacebook.fr/'/></td>");
		out.println("<td>Twitter : <td><INPUT type='text' value='' name='twitter' placeholder='http://montwitter.fr/'></td>");
		out.println("<tr><td>LinkedIn : <td><INPUT type='text' value='' name='linkedin' placeholder='http://monlinkedin.fr/'></td>");
		out.println("<td>Google + : <td><INPUT type='text' value='' name='google+' placeholder='http://mongoogleplus.fr/'></td>");
		out.println("<tr><td>Mot de passe (*) :<td><INPUT type='password' value='' name='password' required></td>");
		out.println("<td>Confirmer Mot de passe (*) :<td><INPUT type='password' value='' name='password2' required></td>");

		out.println("<tr><td>(*) : Champs requis<td><INPUT type='submit' value='Valider'></FORM></TD></TR></table></center></body><br><br>");
	}
	

}
