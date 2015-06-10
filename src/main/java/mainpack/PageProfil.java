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

			out.println("<meta charset=\"UTF-8\"/>");
			// Lien vers le fichier CSS 
			out.println("<link rel=\"stylesheet\" href=\"style.css\" />");

			out.println("<title>Page Profil</title>");

			//Script pour bootStrap
			out.println("<script src=\"//code.jquery.com/jquery-1.11.2.min.js\"></script>");
			out.println("<script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">");
			out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">");
			out.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>");

			// Script pour le Slider
			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.5.1/jquery.min.js\"></script>");

			//Script pour les toggles
			out.println("<script type=\"text/javascript\" src=\"http://code.jquery.com/jquery-1.7.2.js\"></script>");

			//Script pour la pop-up		
			out.println("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.4.1/jquery.min.js\"></script>");

			//Appel vers notre fichier js contenant nos fonctions 
			out.println("<script type=\"text/javascript\" src=\"les_scripts.js\"></script>");

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
			out.println("<div class=\"caption\">");
			out.println("<h3>Ma vision du métier!</h3>");
			out.println("<nav class=\"navbar navbar-default\">");
			out.println("<div class=\"container-fluid\">");
			out.println("<div class=\"navbar-header\">");
			out.println("<p>");
			out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed bibendum tempor arcu, eu aliquet nisi ullamcorper ac. Vestibulum vulputate euismod velit a vulputate. Nulla in velit eget tellus mollis auctor et a nunc. Quisque laoreet eros scelerisque posuere.");
			out.println("</p>");
			out.println("</div>");
			out.println("</div>");
			out.println("</nav>");
			out.println("</div>");
			out.println("<div class=\"col-sm-3 \">");
			out.println("<div class=\"thumbnail\">");
			out.println("<a href=\"#\"><img src=\"http://www.freecomicbookday.com/GenericImages/facebook-icon.png\" alt=\"Facebook\"></a>");
			out.println("</div>");
			out.println("</div>");
			out.println("<div class=\"col-sm-3 \">");
			out.println("<div class=\"thumbnail\">");
			out.println("<a href=\"#\"><img src=\"http://www.paprikawriting.com/wp-content/uploads/twitter-icon-30x30.gif\"></a>");
			out.println("</div>");
			out.println("</div>");
			out.println("<div class=\"col-sm-3\">");
			out.println("<div class=\"thumbnail\">");
			out.println("<a href=\"#\"><img src=\"http://malaysianseoservices.com/wp-content/uploads/2014/06/Google-Icon-30-x-30.png\"></a>");
			out.println("</div>");
			out.println("</div>");
			out.println("<div class=\"col-sm-3\">");
			out.println("<div class=\"thumbnail\">");
			out.println("<a href=\"#\"><img src=\"http://mikeunclebach.com/wp-content/uploads/2013/03/linkedin-icon-30x30.png\"></a>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");			
			out.println("</div>");
			//2eme colonne avec les infos du profil
			out.println("<div class=\"col-md-6\">");//8
			out.println("<div class=\"thumbnail\">");//3
			out.println("<h4>Nom: "+cl.getNom()+"</h4>");
			out.println("<h4>Prenom: "+cl.getPrenom()+" </h4>");
			out.println("<h4>Date de Naissance: "+cl.getDateNaiss()+"</h4>");
			out.println("<h4>Domaine: "+cl.getDomaineAct()+"</h4>");
			out.println("<h4>Profession: "+cl.getMetier()+"</h4>");
			out.println("<h4>Entreprise: "+cl.getEntite()+"</h4>");
			out.println("<h4>Adresse de l'entreprise: "+cl.getAdresse()+", "+ cl.getVille() +"</h4>");
			out.println("<h4>Telephone: "+cl.getTel()+"</h4>");
			out.println("<h4>Mail: "+cl.getMail()+"</h4>");
			if(cl.getFax() != null){	
				out.println("<h4>Fax: "+cl.getFax()+"</h4>");
			}
			out.println("</div>");//3f
			out.println("</div>");//8f

			out.println("</div>");//1f



			//bouton Mes produits
			out.println("<section>");
			out.println("<div class='row'>");
			out.println("<div class=\"col-sm-2\">");
			out.println("<p><a href=\"#collapse1\" class=\"nav-toggle btn btn-warning\" role=\"button\">Mes Produits</a><a href=\"#?w=600\" rel=\"formulaireAjoutProduit\" class=\"btn btn-warning poplight\" role=\"button\">+</a></p>");
			out.println("</div>");
			out.println("<div class=\"col-sm-2\">");
			out.println("<p><a href=\"#collapse2\" class=\"nav-toggle2 btn btn-warning\" role=\"button\">Mes services</a><a href=\"#\"  class=\"btn btn-warning\" role=\"button\">+</a></p>");
			out.println("</div>");
			out.println("</div>");

			out.println("<div id=\"collapse1\" style=\"display:none\">");
			out.println("<p>");
			out.println("<h3>Mes produits</h3>");
			out.println("<div class='row'>");

			for(int i = 0; i < lp.size(); i++){
				int j = i%4;
				out.println("<div class=\"col-sm-3 \">");
				out.println("<div class=\"thumbnail\">");
				out.println("<img src=\""+lp.get(i).getPhoto()+"\" alt=\"image profil\">");
				out.println("<h4>"+ lp.get(i).getLibelle() +"</h4>");
				out.println("<p>"+lp.get(i).getDescription()+"</p>");
				out.println("<p>"+lp.get(i).getPrix()+"</p>");	
				out.println("<a type='submit' class='btn btn-success btn-lg'>");
				out.println("<span class=\"glyphicon glyphicon-thumbs-up\"></span>");
				out.println("</a>");
				out.println("<a type='submit' class='btn btn-danger btn-lg'>");
				out.println("<span class=\"glyphicon glyphicon-thumbs-down\"></span>");
				out.println("</a>");
				out.println("<a href=\"#?w=600\" rel=\"formulaireModifProduit\" type='Button' class='btn btn-primary btn-sm poplight'>");
				out.println("<span class=\"glyphicon glyphicon-pencil\"></span>");
				out.println("</a>");
				out.println("<a href=\"#?w=500\" rel=\"Validation\" type='Button' class='btn btn-danger btn-sm poplight'>");
				out.println("<span class=\"glyphicon glyphicon-remove\"></span>");
				out.println("</a>");
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
			
			//Formulaire ajout de produits
			out.println("<div id=\"formulaireAjoutProduit\" class=\"popup_block text-center\">");
			out.println("<h2>Ajouter produit</h2>");
			out.println("<div class=\"container-fluid\">");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-6\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Nom</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>	");
			out.println("<div class=\"col-md-6\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Prix</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>");
			out.println("</div><br />");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-12\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Catégorie</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>");	
			out.println("</div><br />");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-12\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Image</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>");	
			out.println("</div><br />");
			out.println("<div class=\"row\">");
			out.println("<div class='col-md-12 col-sm-offset-0'>");
			out.println("<div class='form-group'>");
			out.println("<label class=\"text-center\">Description</label>");
			out.println("<textarea name='description' id='description' rows=5 class='form-control' placeholder=\"Description du produit\" aria-describedby=\"basic-addon1\"></textarea>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");
			out.println("<p><a type='Button' class='btn btn-default btn-lg'>Ajouter</a></p>");
				
			out.println("</div>");
			out.println("</div>");
			
			out.println("</div>");
			
			// Formulaire de modification des produits
			out.println("<div id=\"formulaireModifProduit\" class=\"popup_block text-center\">");
			out.println("<h2>Modification</h2>");
			out.println("<div class=\"container-fluid\">");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-6\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Nom</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>	");
			out.println("<div class=\"col-md-6\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Prix</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>");
			out.println("</div><br />");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-12\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Catégorie</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>");	
			out.println("</div><br />");
			out.println("<div class=\"row\">");
			out.println("<div class=\"col-md-12\">");
			out.println("<div class=\"input-group input-group-lg\">");
			out.println("<span class=\"input-group-addon\" id=\"sizing-addon1\">Image</span>");
			out.println("<input type=\"text\" class=\"form-control\" aria-describedby=\"sizing-addon1\">");
			out.println("</div>");
			out.println("</div>");	
			out.println("</div><br />");
			out.println("<div class=\"row\">");
			out.println("<div class='col-md-12 col-sm-offset-0'>");
			out.println("<div class='form-group'>");
			out.println("<label class=\"text-center\">Description</label>");
			out.println("<textarea name='description' id='description' rows=5 class='form-control' placeholder=\"Description du produit\" aria-describedby=\"basic-addon1\"></textarea>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");
			out.println("<p><a type='Button' class='btn btn-default btn-lg'>Modifier</a></p>");
			out.println("</div>");
			out.println("</div>");
			out.println("</div>");
		
			// Formulaire de validation des suppressions
			out.println("<div id=\"Validation\" class=\"popup_block text-center\">");
			out.println("<p>Etes vous sur de vouloir supprimer cet article ?</p>");
			out.println("<div class=\"thumbnail \">");
			out.println("	<a type='Button' class='btn btn-success btn-lg'>oui</span></a>");
			out.println("<a type='Button' class='btn btn-danger btn-lg'>non</a>");
			out.println("</div>");

		}
		catch(Exception e){
			out.println(e.getMessage());
		}

	}
}