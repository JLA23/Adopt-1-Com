package mainpack.Items;

abstract public class Item {
	int id;
	
	public Item(int idt){
		this.id=idt;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public abstract String renderHTML();
}
