package com.adopt.items;

public class Like {
	int idVendeur;
	int idUtilisateur;
	boolean aime; // True si c'est un j'aime, false pour un j'aime pas
	
	public Like(int idVendeur, int idUtilisateur, boolean aime){
		this.idVendeur = idVendeur;
		this.idUtilisateur = idUtilisateur;
		this.aime = aime;
	}
}
