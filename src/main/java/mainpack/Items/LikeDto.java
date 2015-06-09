package mainpack.Items;


public class LikeDto {
	private int userid;
	private int itemid;
	private String itemType;
	private boolean aime;
	
	public LikeDto(){}
	
	public LikeDto(int userid, int itemid, String itemType, boolean aime){
		this.setUserid(userid);
		this.setItemid(itemid);
		this.setItemType(itemType);
		this.setAime(aime);
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public boolean getAime() {
		return aime;
	}
	public void setAime(boolean aime) {
		this.aime = aime;
	}

}
