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
		out.println("<meta charset=\"utf-8\"/>");
		out.println("<title>Profil</title>");
		out.println("<script type=\"text/javascript\">");

		out.println("function open_infos(){");
		out.println("width = 540;");
		out.println("height = 600;");
		out.println("if(window.innerWidth){");
		out.println("var left = (window.innerWidth-width)/2;");
		out.println("var top = (window.innerHeight-height)/2;");
		out.println("}");
		out.println("else{");
		out.println("var left = (document.body.clientWidth-width)/2;");
		out.println("var top = (document.body.clientHeight-height)/2;");
		out.println("}");
		out.println("window.open('Galerie','Gallery de nom','menubar=no, scrollbars=no, top='+top+', left='+left+', width='+width+', height='+height+'');");
		out.println("}");
		out.println("</script>");
		out.println("</head>");

		out.println("<body>");
		out.println("<div id=\"fb-root\"></div>");
		out.println("<script>(function(d, s, id) {");
		out.println("	var js, fjs = d.getElementsByTagName(s)[0];");
		out.println("if (d.getElementById(id)) return;");
		out.println("js = d.createElement(s); js.id = id;");
		out.println("js.src = \"//connect.facebook.net/fr_FR/sdk.js#xfbml=1&version=v2.3\";");
		out.println("fjs.parentNode.insertBefore(js, fjs);");
		out.println("}(document, 'script', 'facebook-jssdk'));");
		out.println("</script>");
		out.println("<a href=\"\" onblur=\"open_infos()\"><img src=\"http://www.expert-juridique.fr/images/profile/lawyer/default.gif\" alt=\"image profil\" style=\"width:300px;heigth:300px\"></a>");
		out.println("<b> ");
		out.println("<p> Nom:</p>");
		out.println("<p> Prenom:</p>");
		out.println("<p> Profession:</p>");
		out.println("<p> Entreprise:</p>");
		out.println("<p> Ma vision du métier:</p>");
		out.println("<p> Adresse de l'entreprise:</p>");
		out.println("<p> Telephone:</p>");
		out.println("<p> Fax:</p>");
		out.println("<p> Mail:</p>");
		out.println("</b>");
		out.println("<img src=\"http://www.clementpellerin.fr/wp-content/uploads/2011/05/facebook-icon.png\" alt=\"lien Facebook\" style=\"width:50px;heigth:50px\">");
		out.println("<img src=\"http://www.sidassport.com/docs/2280-1-logo-twitter-gif.gif\" alt=\"lien Facebook\" style=\"width:50px;heigth:50px\">");
		out.println("<img src=\"http://blog.datanyze.com/wp-content/uploads/2014/09/LinkedIn-large-logo.jpg\" style=\"width:50px;heigth:50px\">");
		out.println("<img src=\"http://www.uha.fr/images/google_icon\" style=\"width:50px;heigth:50px\">");
		out.println("</body>");
		out.println("</html>");

	}
}