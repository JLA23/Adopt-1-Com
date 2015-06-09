package mainpack;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpack.Items.Client;

@WebServlet("Formulaire2")
public class Formulaire2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		Map<String, String[]> params = req.getParameterMap();
		System.out.println(params.get("photo")[0]);
		
		String emailconf = "";
		String passwdconf = "";
		String warning = "";
		boolean checked = true;
		if (!params.get("mail")[0].equals(params.get("mail2")[0])) {
			emailconf = "has-error";
			warning = "has-warning";
			checked = false;
		}
		if (!params.get("password")[0].equals(params.get("password2")[0])) {
			passwdconf = "has-error";
			warning = "has-warning";
			checked = false;
		}
		
		// redirection basique
		if (checked == true) {
			//Client c = new Client(-1, params.get("photo")[0], params.get("prenom")[0], params.get("nom")[0], params.get("entreprise")[0], params.get("site")[0], params.get("adresse")[0], params.get("codep")[0], params.get("ville")[0], params.get("mail")[0], params.get("password")[0], params.get("date")[0], params.get("tel")[0], params.get("fax")[0], params.get("profession")[0], params.get("domaine")[0], params.get("description")[0], params.get("facebook")[0], params.get("twitter")[0], params.get("linkedIn")[0], params.get("google")[0], params.get("prestation")[0], null, true); //TODO Ajouter listeProduits dans le formulaire
			//Init.getInstance().getClientDao().insert(c);
			res.sendRedirect("matching.jsp");
		}
			
		// Redirection avec attribut
		
		req.setAttribute("emailconf", emailconf);
		req.setAttribute("passwdconf", passwdconf);
		req.setAttribute("warning", warning);
		
		RequestDispatcher rd = req.getRequestDispatcher("/formulaire.jsp");
		rd.forward(req, res);
	}
}
