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

@WebServlet("PageProfil")
public class PageProfil extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{	
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		try{

			Init init = Init.getInstance();
			ClientDao dao = init.getClientDao();
			String id = req.getParameter("id");
			int idd = Integer.parseInt(id);

			Client cl = dao.findByIdt(idd);

			out.println("<html>");

			//Debut de l'en_tête de la page
			out.println("<head>");
			out.println("<style>");
			out.println(".slideshow {");
			out.println("width: 350px;");
			out.println(" height: 200px;");
			out.println("overflow: hidden;");
			out.println("border: 3px solid #F2F2F2;");
			out.println("}");
			out.println(".slideshow ul {");
			out.println("width: 400%;");
			out.println("height: 200px;");
			out.println("padding:0; margin:0;");
			out.println("list-style: none;");
			out.println("}");
			out.println(".slideshow li {");
			out.println("float: left;");
			out.println("}");
			out.println("</style>");

			out.println("<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>");
			out.println("<script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>");

			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");

			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js\"></script>");

			out.println("<script type=\"text/javascript\">");
			out.println("$(function(){");
			out.println("setInterval(function(){");
			out.println("$(\".slideshow ul\").animate({marginLeft:-350},800,function(){");
			out.println("$(this).css({marginLeft:0}).find(\"li:last\").after($(this).find(\"li:first\"));");
			out.println("})");
			out.println("}, 3500);");
			out.println("});");
			out.println("</script>");

			out.println("</head>");


			//Debut du corps de la page
			out.println("<body>");
			out.println("<div class=\"col-md-8\">");
			out.println("<div class=\"thumbnail\">");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-6\">");
			out.println("<div class=\"thumbnail\">");
			out.println("<div class=\"slideshow\">");
			out.println("<ul>");
			out.println("<li><img src=\"http://cdn-premiere.ladmedia.fr/var/premiere/storage/images/series/news-series/dexter-eli-stone-en-personne-dans-la-saison-5-2357793/34818104-1-fre-FR/Dexter-Eli-Stone-en-personne-dans-la-saison-5_portrait_w532.jpg\" alt=\"\" width=\"350\" height=\"200\"/></li>");
			out.println("<li><img src=\"http://cdn3-public.ladmedia.fr/var/public/storage/images/news/robert-pattinson-il-n-a-personne-a-qui-parler-de-sa-rupture-alors-il-passe-son-temps-a-jouer-a-l-ordinateur-288278/3007198-1-fre-FR/Robert-Pattinson-il-n-a-personne-a-qui-parler-de-sa-rupture-alors-il-passe-son-temps-a-jouer-a-l-ordinateur_portrait_w674.jpg\" alt=\"\" width=\"350\" height=\"200\"/></li>");
			out.println("<li><img src=\"http://fr.web.img4.acsta.net/r_640_600/b_1_d6d6d6/medias/nmedia/18/36/27/48/18670912.jpg\" alt=\"\" width=\"350\" height=\"200\"/></li>");
			out.println("<li><img src=\"http://www.rfimusique.com/sites/rfimusique.files/imagecache/rfi_43_large/sites/images.rfi.fr/files/aef_image/PaulPersonne5.jpg\" alt=\"\" width=\"350\" height=\"200\"/></li>");
			out.println("</ul>");
			out.println("</div>");


			out.println("<div class=\"caption\">");
			out.println("<h3>Ma vision du métier!</h3>");
			out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras iaculis sed ipsum et lacinia. Sed eget sem ipsum.Donec auctor dignissim nisi, sed tempus dolor iaculis sed. Vivamus eget gravida libero. Aliquam erat volutpat. Donec auctor tristique cras amet.</p>");
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
			out.println("<a href=\"#\" class=\"btn btn-warning\" role=\"button\" style=\"width=100px;height=50px\">Mes Produits</a><a href=\"#\" class=\"btn btn-warning\" role=\"button\">Mes Promotions</a><a href=\"#\" class=\"btn btn-warning\" role=\"button\">Promotions Groupées</a>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");
			out.println("<div class=\"col-md-6\">");
			out.println("<h4>Nom: "+cl.getNom()+"</h4><br />");
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
		catch(Exception e){
			out.println(e.getMessage());
		}

	}
}