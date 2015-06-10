package mainpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("Galerie")
public class Galerie extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\"/>");
		out.println("<title>Galerie</title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<div>");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");

			out.println("</div>");
		out.println("<p>  -------------------------------------------------------------------------------------</p>");
		out.println("<div>");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:100px;heigth:100px\">");

		out.println("</div>");

		out.println("</body>");
		out.println("</html>");

	}
}