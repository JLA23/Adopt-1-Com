package mainpack.Items;

import mainpack.Init;

public class Produit extends Item {

	private String libelle;
	private String photo;
	private String prix;
	private String description;
	private int idVendeur;
	private int promo = 0;
	private boolean offreGroupe;
	private String categorie;

	public Produit() {

	}

	public Produit(int id, String libelle, String photo, String prix,
			String description, int idVendeur, int promo, boolean offreGroupe,
			String categorie) {
		super(id);
		this.setLibelle(libelle);
		this.setPrix(prix);
		this.setDescription(description);
		this.setPhoto(photo);
		this.setIdVendeur(idVendeur);
		this.setPromo(promo);
		this.setOffreGroupe(offreGroupe);
		this.setCategorie(categorie);

	}

	public int getId() {
		return idt;
	}

	public void setId(int id) {
		this.idt = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return idt + "; " + libelle + "; " + prix + "; " + description + ".";
	}

	public String renderHTML() {
		String res;
		Promo p;
		if (promo == 0)
			res = ""
					+ prix
					+ "<br>"
					+ description
					+ "<br>Vendu par "
					+ Init.getInstance().getClientDao().findByIdt(idVendeur)
							.getEntite() // Nom entreprise
					+ " à "
					+ Init.getInstance().getClientDao().findByIdt(idVendeur)
							.getVille();
		else {
			p = Init.getInstance().getPromoDao().findByIdProduct(idt);
			res = "<s>"
					+ prix
					+ "</s> "
					+ p.getNvPrix()
					+ "<br>"
					+ description
					+"<br>"+p.getDescription()
					+"<br> Se termine le "+p.getDatefin()
					+ "<br>Vendu par "
					+ Init.getInstance().getClientDao().findByIdt(idVendeur)
							.getEntite() // Nom entreprise
					+ " à "
					+ Init.getInstance().getClientDao().findByIdt(idVendeur)
							.getVille();
			;
		}
		return res;
	}

	public int getIdVendeur() {
		return idVendeur;
	}

	public void setIdVendeur(int idVendeur) {
		this.idVendeur = idVendeur;
	}

	public int getPromo() {
		return promo;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

	public boolean getOffreGroupe() {
		return offreGroupe;
	}

	public void setOffreGroupe(boolean offreGroupe) {
		this.offreGroupe = offreGroupe;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String getTitle() {
		if(promo==0)
		return "<span class='glyphicon glyphicon-tags'></span>&nbsp; "
				+ libelle;
		else
			return "<span class='glyphicon glyphicon-euro'></span> "
				+ libelle;
	}

	// /Renvoie le nom de la table dans laquelle doit être stockée l'Item
	@Override
	public String getType() {
		return "produits";
	}

}
