package mainpack;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpack.Items.Client;
import mainpack.Items.Produit;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.ProduitDao;

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
			ClientDao daoClient = init.getClientDao();
			ProduitDao daoProduit = init.getProduitDao();
			String id = req.getParameter("id");
			int idClient = Integer.parseInt(id);

			Client cl = daoClient.findByIdt(idClient);
			List<Produit> lp = daoProduit.listerProduitsParIdClient(idClient);

			out.println("<html>");

			//Debut de l'en_tête de la page
			out.println("<head>");

			//CSS pour le slider
			out.println("<style>");
			out.println(".slideshow {");
			out.println("width: 450px;");
			out.println(" height: 250px;");
			out.println("overflow: hidden;");
			out.println("border: 3px solid #F2F2F2;");
			out.println("}");
			out.println(".slideshow ul {");
			out.println("width: 400%;");
			out.println("height: 250px;");
			out.println("padding:0; margin:0;");
			out.println("list-style: none;");
			out.println("}");
			out.println(".slideshow li {");
			out.println("float: left;");
			out.println("}");
			out.println("</style>");

			//Script pour bootStrap
			out.println("<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>");
			out.println("<script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");

			//script pour le Slider
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

			//Script pour les toggles
			out.println("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.7.2.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function() {");
			out.println("$('.nav-toggle').click(function(){");
			out.println("var collapse_content_selector = $(this).attr('href');");					
			out.println("var toggle_switch = $(this);");
			out.println("$(collapse_content_selector).toggle(function(){");
			out.println("if($(this).css('display')=='none'){");
			out.println("toggle_switch.html('Mes Produits');");
			out.println("}else{");
			out.println("toggle_switch.html('Mes Produits');");
			out.println("}");
			out.println("});");
			out.println("});");
			out.println("});	");
			out.println("</script>");

			//Css pour les bouton
			out.println("<style>	");
			out.println(".round-border {");
			out.println("border: 1px solid #eee;");
			out.println("border: 1px solid rgba(0, 0, 0, 0.05);");
			out.println("-webkit-border-radius: 4px;");
			out.println("-moz-border-radius: 4px;");
			out.println("border-radius: 4px;");
			out.println("padding: 10px;");
			out.println("margin-bottom: 5px;");
			out.println("}");
			out.println("</style>");

			out.println("</head>");



			
			
			
			
			
			
			//Debut du corps de la page

			out.println("<body>");

			out.println("<div class=\"container\">");

			out.println("<div class=\"row\">");//1
			out.println("<div class=\"col-md-6\">");//2
			out.println("<div class=\"thumbnail\">");//3
			//Slide Image profil
			out.println("<div class=\"slideshow center-block\">");//4
			out.println("<ul>");
			out.println("<li><img src=\"http://cdn-premiere.ladmedia.fr/var/premiere/storage/images/series/news-series/dexter-eli-stone-en-personne-dans-la-saison-5-2357793/34818104-1-fre-FR/Dexter-Eli-Stone-en-personne-dans-la-saison-5_portrait_w532.jpg\" alt=\"\" width=\"450\" height=\"250\"/></li>");
			out.println("<li><img src=\"http://cdn3-public.ladmedia.fr/var/public/storage/images/news/robert-pattinson-il-n-a-personne-a-qui-parler-de-sa-rupture-alors-il-passe-son-temps-a-jouer-a-l-ordinateur-288278/3007198-1-fre-FR/Robert-Pattinson-il-n-a-personne-a-qui-parler-de-sa-rupture-alors-il-passe-son-temps-a-jouer-a-l-ordinateur_portrait_w674.jpg\" alt=\"\" width=\"450\" height=\"250\"/></li>");
			out.println("<li><img src=\"http://fr.web.img4.acsta.net/r_640_600/b_1_d6d6d6/medias/nmedia/18/36/27/48/18670912.jpg\" alt=\"\" width=\"450\" height=\"250\"/></li>");
			out.println("<li><img src=\"http://www.rfimusique.com/sites/rfimusique.files/imagecache/rfi_43_large/sites/images.rfi.fr/files/aef_image/PaulPersonne5.jpg\" alt=\"\" width=\"450\" height=\"250\"/></li>");
			out.println("</ul>");
			out.println("</div>");//4f
			//Description de Metier
			out.println("<div class=\"caption\">");//5
			out.println("<h3>Ma vision du métier!</h3>");
			out.println(""+cl.getDescription()+"");
			//Image Reseaux Sociaux
			out.println("<nav class=\"navbar navbar-default\">");
			out.println("<div class=\"container-fluid\">");//6
			out.println("<div class=\"navbar-header\">");//7
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
			out.println("</div>");//7f
			out.println("</div>");//6f
			out.println("</nav>");
			out.println("</div>");//5f

			out.println("</div>");//3f			
			out.println("</div>");//2f
			out.println("<div class=\"col-md-6\">");//8
			out.println("<div class=\"thumbnail\">");//3
			out.println("<h4>Nom: "+cl.getNom()+"</h4>");
			out.println("<h4>Prenom: "+cl.getPrenom()+" </h4>");
			out.println("<h4>Date de Naissance: "+cl.getDateNaiss()+"</h4>");
			out.println("<h4>Profession: "+cl.getDomaineAct()+"</h4>");
			out.println("<h4>Entreprise: "+cl.getEntite()+"</h4>");
			out.println("<h4>Adresse de l'entreprise: "+cl.getAdresse()+"</h4>");
			out.println("<h4>Telephone: "+cl.getTel()+"</h4>");
			out.println("<h4>Fax: "+cl.getFax()+"</h4>");
			out.println("<h4>Mail: "+cl.getMail()+"</h4>");
			out.println("</div>");//3f
			out.println("</div>");//8f
			
			out.println("</div>");//1f



			//bouton Mes produits
			out.println("<section>");
			out.println("<div>");
			out.println("<p><a href=\"#collapse1\" class=\"nav-toggle btn btn-warning\" role=\"button\">Mes Produits</a><p>");
			out.println("</div>");
			out.println("<div id=\"collapse1\" style=\"display:none\">");
			out.println("<p>");
			out.println("<div class='row'>");
			for(int i = 0; i < lp.size(); i++){
				int j = i%4;
				out.println("<div class=\"col-sm-3 \">");
				out.println("<div class=\"thumbnail\">");
				out.println("<img src=\""+lp.get(i).getPhoto()+"\" alt=\"image profil\" style=\"width=50px;heigth=50px;\">");
				out.println("<h4>"+ lp.get(i).getLibelle() +"</h4>");
				out.println("<p>"+lp.get(i).getDescription()+"</p>");
				out.println("<p>"+lp.get(i).getPrix()+"</p>");	
				out.println("<button type='submit' class='btn btn-success btn-lg'>");
				out.println("<span class=\"glyphicon glyphicon-heart\"></span>");
				out.println("</button>");
				out.println("<button type='submit' class='btn btn-danger btn-lg'>");
				out.println("<span class=\"glyphicon glyphicon-remove\"></span>");
				out.println("</div>");
				out.println("</div>");
			}
			out.println("</div>");
			out.println("</p>");
			out.println("</div>");
			out.println("</section>");
			out.println("</div>");



			out.println("</body>");
			out.println("</html>");

		}
		catch(Exception e){
			out.println(e.getMessage());
		}

	}
}