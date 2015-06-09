package mainpack.Items;

public class Produit extends Item {

	private String libelle;
	private String photo;
	private String prix;
	private String description;
	private int idVendeur;
	private String promo;
	private boolean offreGroupe;
	private String categorie;
	
	public Produit(){
		
	}

	public Produit(int id, String libelle, String photo, String prix, String description, int idVendeur, String promo, boolean offreGroupe, String categorie) {
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
		String res = "<td>Libellé : " + libelle
				+ "<br> Prix : " + prix + "<br> Description : " + description;

		return res;
	}

	public int getIdVendeur() {
		return idVendeur;
	}

	public void setIdVendeur(int idVendeur2) {
		this.idVendeur = idVendeur2;
	}

	public String getPromo() {
		return promo;
	}

	public void setPromo(String promo) {
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
		return "<span class='glyphicon glyphicon-shopping-cart'></span> " + libelle;
	}

}
