package mainpack.Items;

public class Produit extends Item {
	
	private String libelle;
	private String prix;
	private String description;


	public Produit(String id, String libelle, String prix, String description){
		super(id);
		this.libelle=libelle;
		this.prix=prix;
		this.description=description;
	}
		
		
	@Override
	String renderHTML() {
		String res="<td>Id : "+id+"<br> Libellé : "+libelle+"<br> Prix : "+prix+"<br> Description : "+description;

		return res;
	}

}
