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
import mainpack.Items.Utilisateur;

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
			Client c = new Client();
			generateClient(c, params);
			Utilisateur u = new Utilisateur();
			int idClient = Init.getInstance().getClientDao().insert(c);
			generateUtilisateur(u, c, idClient);
			Init.getInstance().getUtilisateurDao().insert(u); // Ajoute les informations nécessaires dans la base utilisateurs pour retrouver le client correspondant
			res.sendRedirect("matching.jsp");
		}

		// Redirection avec attribut

		req.setAttribute("emailconf", emailconf);
		req.setAttribute("passwdconf", passwdconf);
		req.setAttribute("warning", warning);

		RequestDispatcher rd = req.getRequestDispatcher("/formulaire.jsp");
		rd.forward(req, res);
	}
	
	private void generateUtilisateur(Utilisateur u, Client c, int idClient) {
		u.setIdt(-1);
		u.setIdClient(idClient);
		u.setMail(c.getMail());
		u.setMdp(c.getMdp());
		
	}

	private void generateClient(Client c, Map<String, String[]> params){
		c.setIdt(-1);
		if (params.get("photo") != null)
			c.setPhoto(params.get("photo")[0]);
		if (params.get("nom") != null)
			c.setNom(params.get("nom")[0]);
		if (params.get("prenom") != null)
			c.setPrenom(params.get("prenom")[0]);
		if (params.get("entreprise") != null)
			c.setEntite(params.get("entreprise")[0]);
		if (params.get("site") != null)
			c.setSite(params.get("site")[0]);
		if (params.get("adresse") != null)
			c.setAdresse(params.get("adresse")[0]);
		if (params.get("codep") != null)
			c.setCodePostal(params.get("codep")[0]);
		if (params.get("ville") != null)
			c.setVille(params.get("ville")[0]);
		if (params.get("mail") != null)
			c.setMail(params.get("mail")[0]);
		if (params.get("password") != null)
			c.setMdp(params.get("password")[0]);
		if (params.get("date") != null)
			c.setDateNaiss(params.get("date")[0]);
		if (params.get("tel") != null)
			c.setTel(params.get("tel")[0]);
		if (params.get("fax") != null)
			c.setFax(params.get("fax")[0]);
		if (params.get("profession") != null)
			c.setMetier(params.get("profession")[0]);
		if (params.get("domaine") != null)
			c.setDomaineAct(params.get("domaine")[0]);
		if (params.get("description") != null)
			c.setDescription(params.get("description")[0]);
		if (params.get("facebook") != null)
			c.setFacebook(params.get("facebook")[0]);
		if (params.get("twitter") != null)
			c.setTwitter(params.get("twitter")[0]);
		if (params.get("linkedIn") != null)
			c.setLinkedIn(params.get("linkedIn")[0]);
		if (params.get("google") != null)
			c.setGooglePlus(params.get("google")[0]);
		if (params.get("prestation") != null)
			c.setTypeDePrestation(params.get("prestation")[0]);
		if (params.get("produits") != null)
			c.setListeProduits(params.get("produits")[0]);
		c.setValide(true); 
		// TODO Ajouter listeProduits dans le formulaire
	}
}
