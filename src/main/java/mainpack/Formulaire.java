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
public class Formulaire extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		boolean mdpEgaux;
		boolean mailEgaux;
		String nomValidation = ""; 
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		out.println("<html><head><meta charset=UTF-8>");
		out.println("<!-- jQuery -->");
		out.println("<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>");
		out.println("<script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>");

		out.println("<!-- bootstrap -->");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");
		
		out.println("<title>Formulaire</title>");

		out.println("<body><div class='container'>");
		out.println("<h1>Formulaire Inscription</h1>");


		out.print("<form method='post' action='VerifForm'>");
		out.println("<div class='form-group "+nomValidation+"'>" +
						"<label for='nom'>Nom (*) : </label>" +
						"<INPUT type='text' value='' name='nom' required class='form-control'>" +
					"</div>");
		out.println("Prénom (*) : <INPUT type='text' value='' name='prenom' required></td>");
		out.println("Entreprise (*) : <INPUT type='text' value='' name='entreprise' required>");
		out.println("Adresse (*) :<INPUT type='text' value='' name='adresse' required>");
		out.println("Code Postal (*) : <INPUT type='text' value='' name='codepost' required>");
		out.println("Ville (*) : <INPUT type='text' value='' name='ville' required>");
		out.println("E-mail (*) :<INPUT type='email' value='' name='mail' required placeholder='thierry.dupont@gmail.com'>");
		out.println("Confirmer E-mail (*) : <INPUT type='email' value='' name='mail2' required placeholder='thierry.dupont@gmail.com'>");
		out.println("Téléphone (*) : <INPUT type='tel' value='' name='tel' required placeholder='0675000000'>");

		out.println("Fax : <INPUT type='text' value='' name='fax'>");
		out.println("Métier (*) : <INPUT type='text' value='' name='profession' required>");
		out.println("Domaine d'activité (*) : <INPUT type='text' value='' name='activite' required>"); 
		
		out.println("<label for='description'>Description</label>");
		out.println("<textarea name='description' id='description' rows='8' cols='30'>Comment voyez vous votre métier ?</textarea>");

		out.println("Facebook : <INPUT type='text' value='' name='facebook' placeholder='http://monfacebook.fr/'/>");
		out.println("Twitter : <INPUT type='text' value='' name='twitter' placeholder='http://montwitter.fr/'>");
		out.println("LinkedIn : <INPUT type='text' value='' name='linkedin' placeholder='http://monlinkedin.fr/'>");
		out.println("Google + : <INPUT type='text' value='' name='google+' placeholder='http://mongoogleplus.fr/'>");
		out.println("Mot de passe (*) :<INPUT type='password' value='' name='password' required>");
		out.println("Confirmer Mot de passe (*) :<INPUT type='password' value='' name='password2' required>");

		out.println("(*) : Champs requis<td><INPUT type='submit' value='Valider'></FORM></div></body><br><br>");
	}

}
