package mainpack.Items;

import mainpack.Init;

/**
 * 
 * @author anget La classe Groupe permet de créer des offres groupées ainsi que leur
 *         attributs. Les getters permettent de récupérer ces derniers.
 */

public class Groupe extends Item {

	private int idProduit;
	private int idService;
	private int nbPersonnes;
	private String nvPrix; //Prix par personne
	private String description;
	
	public Groupe(){
		
	}

	public Groupe(int id, int idProduit, int idService, int nbPersonnes,
			String nvPrix, String description) {
		super(id);
		this.setIdProduit(idProduit);
		this.setIdService(idService);
		this.setNbPersonnes(nbPersonnes);
		this.setNvPrix(nvPrix);
		this.setDescription(description);
	}

	public String renderHTML() {
		String res="Erreur : Veuillez contacter le gérant du site";
		Produit p;
		Service s;
		if(idProduit>0){
			p =Init.getInstance().getProduitDao().findByIdt(idProduit);
			res = "Offre de groupe"
				+ "<br><s>"
				+ p.getPrix()
				+ "</s> "
				+ nvPrix
				+" à partir de "+nbPersonnes+" achats"
				+ "<br>"
				+ p.getDescription()
				+ "<br>"
				+ description
				+"<br>Vendu par "
						+ Init.getInstance().getClientDao().findByIdt(p.getIdVendeur())
						.getEntite() // Nom entreprise
				+ " à "
				+ Init.getInstance().getClientDao().findByIdt(p.getIdVendeur())
						.getVille();;
		}
		if(idService>0){
			s =Init.getInstance().getServiceDao().findByIdt(idService);
			res = "<br><s>"
				+ s.getPrix()
				+ "</s> "
				+ nvPrix
				+ " à partir de "+nbPersonnes+" achats"
				+ "<br>"
				+ s.getDescription()
				+ "<br>"
				+ description
				+"<br>Proposé par "
						+ Init.getInstance().getClientDao().findByIdt(s.getIdVendeur())
						.getEntite() // Nom entreprise
				+ " à "
				+ Init.getInstance().getClientDao().findByIdt(s.getIdVendeur())
						.getVille();;
		}
		return res;
	}
	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
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
		String libelle="";
		if(idProduit>0){
			libelle =Init.getInstance().getProduitDao().findByIdt(idProduit).getLibelle();
		}
		if(idService>0){
			libelle =Init.getInstance().getServiceDao().findByIdt(idService).getLibelle();
		}
		
		return "<span class='glyphicon glyphicon-globe'></span> "
				+ libelle;
	}

	// /Renvoie le nom de la table dans laquelle doit être stockée l'Item
	@Override
	public String getType() {
		return "promos";
	}
}