package mainpack.Items;

abstract public class Item {
	String id;
	
	public Item(String id){
		this.id=id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	abstract String renderHTML();
}
