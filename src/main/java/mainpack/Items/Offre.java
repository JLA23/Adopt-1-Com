package mainpack.Items;

public class Offre extends Item {


	private String libelle;
	private String prix;
	private String prixBase;
	private String reduc;
	private String description;
	private String datefin;

	
	
	public Offre(String id, String libelle, String prix, String prixBase, String reduc, String description, String datefin){
		super(id);
		this.libelle=libelle;
		this.prix=prix;
		this.prixBase=prixBase;
		this.reduc=reduc;
		this.description=description;
		this.datefin=datefin;
	}
		
		
	@Override
	String renderHTML() {
		String res="<td>Id : "+id+"<br> Libellé : "+libelle+"<br> Prix : "+prix+"<br> Prix de base : "+prixBase+"<br> Économisez "+reduc+"<br> Description : "+description+"<br> Date de fin : "+datefin;

		return res;
	}
}