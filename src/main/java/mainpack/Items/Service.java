package mainpack.Items;

public class Service extends Item {

	private String libelle;
	private String prix;
	private String description;


	public Service(int id, String libelle, String prix, String description){
		super(id);
		this.libelle=libelle;
		this.prix=prix;
		this.description=description;
	}
		
		
	public String renderHTML() {
		String res="<td>Id : "+idt+"<br> Libellé : "+libelle+"<br> Prix : "+prix+"<br> Description : "+description;

		return res;
	}

}
