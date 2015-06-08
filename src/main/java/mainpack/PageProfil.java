package mainpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("PageProfil")
public class PageProfil extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{	
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		out.println("<html>");
		out.println("<head>");
		out.println("");
		out.println("<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>");
		out.println("<script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>");

		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
		out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");
		out.println("</head>");

		out.println("<body>");
		
		out.println("<div class=\"col-md-8\">");
		out.println("<div class=\"thumbnail\">");
		
		
		
		out.println("<div class=\"row\">");
		out.println("<div class=\"col-md-6\">");
		out.println("<div class=\"thumbnail\">");
		out.println("<img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil utilisateur\">");
		out.println("<div class=\"caption\">");
		out.println("<h3>Ma vision du métier!</h3>");
		out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras iaculis sed ipsum et lacinia. Sed eget sem ipsum.Donec auctor dignissim nisi, sed tempus dolor iaculis sed. Vivamus eget gravida libero. Aliquam erat volutpat. Donec auctor tristique cras amet.</p>");
		/*out.println("<p><img alt=\"Brand\" src=\"http://www.freecomicbookday.com/GenericImages/facebook-icon.png\">" +
				"<img alt=\"Brand\" src=\"http://www.freecomicbookday.com/GenericImages/facebook-icon.png\">" +
				"<img alt=\"Brand\" src=\"http://www.freecomicbookday.com/GenericImages/facebook-icon.png\">" +
				"<img alt=\"Brand\" src=\"http://www.freecomicbookday.com/GenericImages/facebook-icon.png\">" +
				"<a href=\"#\" class=\"btn btn-warning\" role=\"button\">En savoir plus ...</a></p>");*/
		out.println("<nav class=\"navbar navbar-default\">");
		out.println("<div class=\"container-fluid\">");
		out.println("<div class=\"navbar-header\">");
		out.println("<a class=\"navbar-brand\" href=\"#\">");
		out.println("<img alt=\"Brand\" src=\"http://www.freecomicbookday.com/GenericImages/facebook-icon.png\">");
		out.println("</a>");
		out.println("<a class=\"navbar-brand\" href=\"#\">");
		out.println("<img alt=\"Brand\" src=\"http://www.paprikawriting.com/wp-content/uploads/twitter-icon-30x30.gif\">");
		out.println("</a>");
		out.println("<a class=\"navbar-brand\" href=\"#\">");
		out.println("<img alt=\"Brand\" src=\"http://malaysianseoservices.com/wp-content/uploads/2014/06/Google-Icon-30-x-30.png\">");
		out.println("</a>");
		out.println("<a class=\"navbar-brand\" href=\"#\">");
		out.println("<img alt=\"Brand\" src=\"http://mikeunclebach.com/wp-content/uploads/2013/03/linkedin-icon-30x30.png\">");
		out.println("</a>");
		out.println("</div>");
		out.println("</div>");
		out.println("</nav>");
		out.println("<a href=\"#\" class=\"btn btn-warning\" role=\"button\">En savoir plus ...</a>");
		out.println("</div>");
		out.println("</div>");
		out.println("</div>");
		
		out.println("<div class=\"col-md-6\">");
		out.println("<h4>Nom: </h4><br />");
		out.println("<h4>Prenom: </h4><br />");
		out.println("<h4>Date de Naissance: </h4><br />");
		out.println("<h4>Profession: </h4><br />");
		out.println("<h4>Entreprise: </h4><br />");
		out.println("<h4>Adresse du metier: </h4><br />");
		out.println("<h4>Telephone: </h4><br />");
		out.println("<h4>Fax: </h4><br />");
		out.println("<h4>Mail: </h4><br />");
		out.println("</div>");
		out.println("</div>");
		
		
		
		out.println("</div>");
		out.println("</div>");
		
		

		out.println("</body>");
		out.println("</html>");
	}
}