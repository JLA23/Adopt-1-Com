package mainpack;

import java.io.IOException;
import java.util.Map;

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
		String emailconf = "";
		String passwdconf = "";
		boolean checked = true;
		if ((params.get("mail") == null && params.get("mail2") == null)
				|| !params.get("mail").equals(params.get("mail2"))) {
			emailconf = "has-error";
			checked = false;
		}
		if ((params.get("password") == null && params.get("password") == null)
				|| !params.get("password").equals(
						params.get("password2"))) {
			passwdconf = "has-error";
			checked = false;
		}
		
		// redirection basique
		if (checked == true) {
			res.sendRedirect("Matching");
		}
			
		// Redirection avec attribut
		
		req.setAttribute("emailconf", new Object());
		req.setAttribute("passwdconf", new Object());
		
		req.getServletContext().getRequestDispatcher("formulaire.jsp").forward(req, res);
	}
}
