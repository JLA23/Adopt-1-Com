package mainpack.Items;

abstract public class Item {
	int idt;
	
	public Item(){}
	
	
	public Item(int idt){
		this.idt=idt;
	}
	
	public int getId(){
		return idt;
	}
	
	public void setId(int id){
		this.idt=id;
	}
	
	public abstract String renderHTML();
}
