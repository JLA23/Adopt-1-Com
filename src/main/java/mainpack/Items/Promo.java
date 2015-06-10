package mainpack.Items;

/**
 * 
 * @author anget La classe Promo permet de créer des Promos ainsi que leur
 *         attributs. Les getters permettent de récupérer ces derniers.
 */

public class Promo extends Item {

	private int idProduit;
	private int idService;
	private String datefin;
	private String nvPrix;
	private String description;
	
	public Promo(){
		
	}

	public Promo(int id, int idProduit, int idService, String datefin,
			String nvPrix, String description) {
		super(id);
		this.setIdProduit(idProduit);
		this.setIdService(idService);
		this.setDatefin(datefin);
		this.setNvPrix(nvPrix);
		this.setDescription(description);
	}

	public String renderHTML() {
		/*
		 * TODO String
		 * res="<td>Id : "+id+"<br> Prix : "+prix+"<br> Prix de base : "
		 * +prixBase+"<br> Économisez "+reduc+"<br> Description : "+description+
		 * "<br> Date de fin : "+datefin;
		 * 
		 * return res;
		 */
		return null;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getDatefin() {
		return datefin;
	}

	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}

	public String getNvPrix() {
		return nvPrix;
	}

	public void setNvPrix(String nvPrix) {
		this.nvPrix = nvPrix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIdService() {
		return idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	@Override
	public String getTitle() {
		return null;
	}

	// /Renvoie le nom de la table dans laquelle doit être stockée l'Item
	@Override
	public String getType() {
		return "promos";
	}
}