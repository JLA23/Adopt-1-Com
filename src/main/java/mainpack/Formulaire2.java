package mainpack;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
			//Insertion BDD
			res.sendRedirect("Matching");
		}
			
		// Redirection avec attribut
		
		req.setAttribute("emailconf", emailconf);
		req.setAttribute("passwdconf", passwdconf);
		req.setAttribute("warning", warning);
		
		RequestDispatcher rd = req.getRequestDispatcher("/formulaire.jsp");
		rd.forward(req, res);
	}
}
