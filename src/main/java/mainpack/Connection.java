package mainpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpack.Items.Client;

import com.adopt.bdd.ClientDao;

@WebServlet("Connection")
public class Connection extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		ClientDao dao = null;

		try{

			Init init = Init.getInstance();
			dao = init.getClientDao();

		} catch(Exception e) {
			out.println(e.getMessage());
		}

		res.setContentType("text/html");
		String email = req.getParameter("email");
		String mdp = req.getParameter("mdp");
		Client c = dao.logIn(email, mdp);

		if(c == null) {
			res.sendRedirect("login.html");
		} else {
			res.sendRedirect("ListeProfil");
		}
	}
}