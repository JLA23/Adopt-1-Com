package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

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

		String emailconf = "";
		String passwdconf = "";
		boolean checked = true;
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		// Bloc Checkouts
		Map<String, String[]> params = req.getParameterMap();

		if (params.containsKey("prenom")) {
			params.get("prenom");
		}
		if (params.containsKey("nom")) {
			params.get("nom");
		}
		if (params.containsKey("date")) {
			params.get("date");
		}
		if (params.containsKey("entreprise")) {
			params.get("entreprise");
		}
		if (params.containsKey("adresse")) {
			params.get("adresse");
		}
		if (params.containsKey("codep")) {
			params.get("codep");
		}
		if (params.containsKey("ville")) {
			params.get("ville");
		}
		if (params.containsKey("mail")) {
			params.get("mail");
		}
		if (params.containsKey("mail2")) {
			params.get("mail2");
		}
		if (params.containsKey("tel")) {
			params.get("tel");
		}
		if (params.containsKey("fax")) {
			params.get("prenom");
		}
		if (params.containsKey("prestation")) {
			params.get("prestation");
		}
		if (params.containsKey("domaine")) {
			params.get("domaine");
		}
		if (params.containsKey("description")) {
			params.get("description");
		}
		if (params.containsKey("facebook")) {
			params.get("facebook");
		}
		if (params.containsKey("twitter")) {
			params.get("twitter");
		}
		if (params.containsKey("linkedin")) {
			params.get("linkedin");
		}
		if (params.containsKey("google")) {
			params.get("google");
		}
		if (params.containsKey("password")) {
			params.get("password");
		}
		if (params.containsKey("password2")) {
			params.get("password2");
		}

		if ((req.getParameter("mail") == null && req.getParameter("mail2") == null)
				|| !req.getParameter("mail").equals(req.getParameter("mail2"))) {
			emailconf = "has-error";
			checked = false;
		}
		if ((req.getParameter("password") == null && req
				.getParameter("password") == null)
				|| !req.getParameter("password").equals(
						req.getParameter("password2"))) {
			passwdconf = "has-error";
			checked = false;
		}

		if (checked == true) {
			res.sendRedirect("Matching");
		}

		// Bloc Formulaire
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
		out.println("<div class='col-sm-offset-1'>");
		out.println("<h1>Formulaire Inscription</h1></div>");

		out.print("<br><br><form method='post' action='Formulaire' enctype='multipart/form-data'>");

		out.println("<div class='row'>"
				+ "<div class='col-md-3 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='nom'>Nom (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("nom") != null ? params.get("nom") : "") + ""
				+ "' name='nom' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-3'>");
		out.println("<div class='form-group'>"
				+ "<label for='prenom'>Prénom (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("prenom") != null ? params.get("prenom") : "")
				+ "" + "' name='prenom' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-2'>");
		out.println("<div class='form-group'>"
				+ "<label for='date'>Date de Naissance (*) : </label>"
				+ "<INPUT type='date' value='"
				+ (params.get("date") != null ? params.get("date") : "") + ""
				+ "' name='date' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='nom'>Photo (*) : </label>"
				+ "<input type='hidden' name='MAX_FILE_SIZE' value='1048576' />"
				+ "<input type='file' value='' name='photo' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>"
				+ "<br>Les photos doivent respecter le format X par Y, "
				+ "et peser 1 Mo maximum." + "</div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-8 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='entreprise'>Entreprise (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("entreprise") != null ? params.get("entreprise")
						: "") + ""
				+ "' name='entreprise' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-8 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='adresse'>Adresse (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("adresse") != null ? params.get("adresse") : "")
				+ "" + "' name='adresse' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='codep'>Code Postal (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("codep") != null ? params.get("codep") : "") + ""
				+ "' name='codep' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='ville'>Ville (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("ville") != null ? params.get("ville") : "") + ""
				+ "' name='ville' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='mail'>E-Mail (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("mail") != null ? params.get("mail") : "")
				+ ""
				+ "' name='mail' required placeholder='thierry.dupont@gmail.com' class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group "
				+ emailconf
				+ "'>"
				+ "<label for='mail2'>Confirmer E-Mail (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("mail2") != null ? params.get("mail2") : "")
				+ ""
				+ "' name='mail2' required placeholder='thierry.dupont@gmail.com' class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='tel'>Téléphone (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("tel") != null ? params.get("tel") : "")
				+ ""
				+ "' name='tel' required placeholder='0675000000' class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='fax'>Fax : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("fax") != null ? params.get("fax") : "") + ""
				+ "' name='fax' class='form-control'>" + "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-8 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='profession'>Métier (*) : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("metier") != null ? params.get("metier") : "")
				+ "" + "' name='profession' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='prestation'>Type de Prestation (*) : </label>"
				+ "<select name='prestation' id='prestation' value'"
				+ (params.get("prestation") != null ? params.get("adresse")
						: "") + "" + "' required class='form-control'>"
				+ "<option value='produit'>Produit</option>"
				+ "<option value='service'>Service</option>"
				+ "<option value='both'>Les deux</option>"
				+ "</select></div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='domaine'>Domaine d'Activité (*) : </label>"
				+ "<select name='domaine' id='domaine' value='"
				+ (params.get("domaine") != null ? params.get("domaine") : "")
				+ "" + "' required class='form-control'>"
				+ "<option value='agriculture'>Agriculture</option>"
				+ "<option value='plomberie'>Plomberie</option>"
				+ "<option value='librairie'>Librairie</option>"
				+ "</select></div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-8 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='description'>Description : </label>"
				+ "<textarea name='description' id='description' rows=5 class='form-control'>");
		if (params.get("description") == null) {
			out.println("Comment voyez vous votre métier ?</textarea>");
		} else {
			out.println(params.get("description") + "</textarea>");
		}
		out.println("</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='facebook'>Facebook : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("facebook") != null ? params.get("facebook") : "")
				+ ""
				+ "' name='facebook' placeholder='http://monfacebook.fr/' class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='twitter'>Twitter : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("twitter") != null ? params.get("twitter") : "")
				+ ""
				+ "' name='twitter' placeholder='http://montwitter.fr/'class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='linkedin'>LinkedIn : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("linkedin") != null ? params.get("linkedin") : "")
				+ ""
				+ "' name='linkedin' placeholder='http://monlinkedin.fr/'class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group'>"
				+ "<label for='google'>Google+ : </label>"
				+ "<INPUT type='text' value='"
				+ (params.get("google") != null ? params.get("google") : "")
				+ ""
				+ "' name='google' placeholder='http://mongoogleplus.fr/'class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='row'>"
				+ "<div class='col-md-4 col-sm-offset-1'>");
		out.println("<div class='form-group'>"
				+ "<label for='password'>Mot de passe (*) : </label>"
				+ "<INPUT type='password' value='"
				+ (params.get("password") != null ? params.get("password") : "")
				+ ""
				+ "' name='password' minlength='6' required class='form-control'>"
				+ "</div></div>");

		out.println("<div class='col-md-4'>");
		out.println("<div class='form-group "
				+ passwdconf
				+ "'>"
				+ "<label for='password2'>Confirmer Mot de passe (*) : </label>"
				+ "<INPUT type='password' value='"
				+ (params.get("password2") != null ? params.get("password2")
						: "")
				+ ""
				+ "' name='password2' minlength='6' required class='form-control'>"
				+ "</div></div></div>");

		out.println("<div class='form-group col-sm-offset-1'>"
				+ "<label>(*) : Champs requis</label>" + "</div>");

		out.println("<div class='form-group col-sm-offset-8'>"
				+ "<br><button type='submit' class='btn btn-success btn-lg'>Valider</button>"
				+ "</div>");

		out.println("</form></body>");
	}
}
