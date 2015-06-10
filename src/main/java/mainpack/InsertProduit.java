package mainpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mainpack.Items.Produit;

import com.adopt.bdd.ProduitDao;

@WebServlet("InsertProduit")
public class InsertProduit extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();

		ProduitDao dao = null;

		try{

			Init init = Init.getInstance();
			dao = init.getProduitDao();

		} catch(Exception e) {
			out.println(e.getMessage());
		}

		res.setContentType("text/html");
		String nom = req.getParameter("nom");
		String prix = req.getParameter("prix");
		String urlImage = req.getParameter("image");
		String categ = req.getParameter("categ");
		String idd = req.getParameter("idClient");

		int id = Integer.valueOf(idd);
		String description = req.getParameter("description");
		out.println(nom);
		out.println(prix);
		out.println(urlImage);
		out.println(categ);
		out.println(id);
		out.println(description);
		Produit pdt = new Produit(-1, nom, urlImage, prix, description, id, 0, false, categ);
		dao.insert(pdt);

		//res.sendRedirect("PageProfil?id="+id+"");
		
	}
}