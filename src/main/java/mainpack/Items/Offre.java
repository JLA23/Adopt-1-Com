package mainpack.Items;

/**
 * 
 * @author anget La classe Client permet de créer des Offres ainsi que leur
 *         attributs. Les getters permettent de récupérer ces derniers.
 */

public class Offre extends Item {


	private String libelle;
	private String prix;
	private String prixBase;
	private String reduc;
	private String description;
	private String datefin;

	
	public Offre(int id, String libelle, String prix, String prixBase, String reduc, String description, String datefin){
		super(id);
		this.libelle=libelle;
		this.prix=prix;
		this.prixBase=prixBase;
		this.reduc=reduc;
		this.description=description;
		this.datefin=datefin;
	}
		
		
	public String renderHTML() {
		String res="<td>Id : "+id+"<br> Libellé : "+libelle+"<br> Prix : "+prix+"<br> Prix de base : "+prixBase+"<br> Économisez "+reduc+"<br> Description : "+description+"<br> Date de fin : "+datefin;

		return res;
	}
}