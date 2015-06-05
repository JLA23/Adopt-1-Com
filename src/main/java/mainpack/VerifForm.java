package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.OutilsBDD;

import fr.iutinfo.App;
import fr.iutinfo.UserDao;

@WebServlet("/servlet/VerifForm")
public class VerifForm extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "data.db");
		DBI dbi = new DBI(ds);
		ClientDao dao = App.dbi.open(ClientDao.class);

		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		
		try {

			res.setContentType("text/html");
			HttpSession s = req.getSession(true);

			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			String entreprise = req.getParameter("entreprise");
			String adresse = req.getParameter("adresse");
			String tel = req.getParameter("tel");
			String mail = req.getParameter("mail");
			String fax = req.getParameter("fax");
			String profession = req.getParameter("profession");
			String description = req.getParameter("description");
			String facebook = req.getParameter("facebook");
			String twitter = req.getParameter("twitter");
			String linkedin = req.getParameter("linkedin");

			if (nom == null || prenom == null || entreprise == null
					|| adresse == null || tel == null || mail == null
					|| profession == null) {
				res.sendRedirect("Formulaire?error=1");
			} else {
				dao.insert(nom, prenom, entreprise);
				res.sendRedirect("Formulaire");
			}

		} catch (Exception e) {
			out.println(e.getMessage());
		}

	}

}