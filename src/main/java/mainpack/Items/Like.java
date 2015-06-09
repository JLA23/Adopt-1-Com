package mainpack.Items;

public class Like {
	private int idCible;
	private int idUtilisateur;//L'utilisateur qui a aimé
	private String typeCible; //Valeur possible : "clients", "produits", "services", etc.. qui sont les noms des tables (Défini par getItem)
	private boolean aime; // True si c'est un j'aime, false pour un j'aime pas
	
	public Like(int idCible, int idUtilisateur, boolean aime){
		this.setIdCible(idCible);
		this.setIdUtilisateur(idUtilisateur);
		this.setTypeCible(typeCible);
		this.setAime(aime);
	}

	public int getIdCible() {
		return idCible;
	}

	public void setIdCible(int idCible) {
		this.idCible = idCible;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getTypeCible() {
		return typeCible;
	}

	public void setTypeCible(String typeCible) {
		this.typeCible = typeCible;
	}

	public boolean getAime() {
		return aime;
	}

	public void setAime(boolean aime) {
		this.aime = aime;
	}
}
