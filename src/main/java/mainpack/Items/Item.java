package mainpack.Items;

abstract public class Item {
	int idt;
	
	public Item(){}
	
	
	public Item(int idt){
		this.idt=idt;
	}
	
	public int getIdt(){
		return idt;
	}
	
	public void setIdt(int id){
		this.idt=id;
	}
	
	abstract public String getTitle();
	
	public abstract String renderHTML();
}
