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

		out.print("<form method='post' action='VerifForm' enctype='multipart/form-data'>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='nom'>Nom (*) : </label>"
				+ "<INPUT type='text' value='' name='nom' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='prenom'>Prénom (*) : </label>"
				+ "<INPUT type='text' value='' name='prenom' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" 
				+ "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='nom'>Photo (*) : </label>"
				+ "<input type='hidden' name='MAX_FILE_SIZE' value='1048576' />"
				+ "<input type='file' value='' name='photo' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>"
				+ "<br>Les photos doivent respecter le format X par Y, "
				+ "et peser 1 Mo maximum."
				+ "</div></div>");

		out.println("<div class='row'>" + "<div class='col-md-8'>");
		out.println("<div class='form-group'>"
				+ "<label for='entreprise'>Entreprise (*) : </label>"
				+ "<INPUT type='text' value='' name='entreprise' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-8'>");
		out.println("<div class='form-group'>"
				+ "<label for='adresse'>Adresse (*) : </label>"
				+ "<INPUT type='text' value='' name='adresse' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='codep'>Code Postal (*) : </label>"
				+ "<INPUT type='text' value='' name='codep' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='ville'>Ville (*) : </label>"
				+ "<INPUT type='text' value='' name='ville' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='mail'>E-Mail (*) : </label>"
				+ "<INPUT type='text' value='' name='mail' required placeholder='thierry.dupont@gmail.com' class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='mail2'>Confirmer E-Mail (*) : </label>"
				+ "<INPUT type='text' value='' name='mail2' required placeholder='thierry.dupont@gmail.com' class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='tel'>Téléphone (*) : </label>"
				+ "<INPUT type='text' value='' name='tel' required placeholder='0675000000' class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='fax'>Fax : </label>"
				+ "<INPUT type='text' value='' name='fax' class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-8'>");
		out.println("<div class='form-group'>"
				+ "<label for='profession'>Métier (*) : </label>"
				+ "<INPUT type='text' value='' name='profession' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='prestation'>Type de Prestation (*) : </label>"
				+ "<select name='prestation' id='prestation' required class='form-control'>"
				+ "<option value='produit'>Produit</option>"
				+ "<option value='service'>Service</option>"
				+ "<option value='both'>Les deux</option>"
				+ "</select></div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='domaine'>Domaine d'Activité (*) : </label>"
				+ "<select name='domaine' id='domaine' required class='form-control'>"
				+ "<option value='agriculture'>Agriculture</option>"
				+ "<option value='plomberie'>Plomberie</option>"
				+ "<option value='librairie'>Librairie</option>"
				+ "</select></div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-8'>");
		out.println("<div class='form-group'>"
				+ "<label for='description'>Description : </label>"
				+ "<textarea name='description' id='description' rows=5 class='form-control'>"
				+ "Comment voyez vous votre métier ?</textarea>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='facebook'>Facebook : </label>"
				+ "<INPUT type='text' value='' name='facebook' placeholder='http://monfacebook.fr/' class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='twitter'>Twitter : </label>"
				+ "<INPUT type='text' value='' name='twitter' placeholder='http://montwitter.fr/'class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='linkedin'>LinkedIn : </label>"
				+ "<INPUT type='text' value='' name='linkedin' placeholder='http://monlinkedin.fr/'class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='google'>Google+ : </label>"
				+ "<INPUT type='text' value='' name='google' placeholder='http://mongoogleplus.fr/'class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>" + "<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='password'>Mot de passe (*) : </label>"
				+ "<INPUT type='password' value='' name='password' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='password2'>Confirmer Mot de passe (*) : </label>"
				+ "<INPUT type='password' value='' name='password2' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='form-group'>"
				+ "<label>(*) : Champs requis</label>"
				+ "<br><button type='submit' class='btn btn-success btn-lg'>Valider</button>"
				+ "</div>");

		out.println("</form></body>");
	}
}
