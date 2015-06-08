package com.adopt.bdd;

public class Ville {
	private int cp;
	private String ville;

	public Ville(int cp, String ville) {
		this.cp = cp;
		this.ville = ville;
	}

	public Ville() {
		
	}
	
	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}
	
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public boolean equals(Object u) {
		return ville.equals(((Ville) u).ville);
	}

	public String toString() {
		return cp + ": " + ville;
	}


}