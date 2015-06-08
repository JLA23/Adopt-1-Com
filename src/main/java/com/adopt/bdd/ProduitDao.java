package com.adopt.bdd;

import mainpack.Items.Produit;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface ProduitDao {
	@SqlUpdate("create table produits (idt integer primary key autoincrement, libelle varchar(100), photo varchar(255), description varchar(240), idVendeur integer, promo varchar(100), offreGroupe boolean, categorie varchar(100))")
	void createClientTable();

	@SqlUpdate("insert into produits (libelle, photo, description, idVendeur, promo, offreGroupe, categorie) values (:libelle, :photo, :description, :idVendeur, :promo, :offreGroupe, :categorie)")
	@GetGeneratedKeys
	int insert(@BindBean Produit p);
	
	@SqlUpdate("update produits set libelle = :libelle, photo = :photo, description = :description, idVendeur = :idVendeur, promo = :promo, offreGroupe = :offreGroupe, categorie = :categorie")
	int update(@BindBean Produit p);
	
	@SqlUpdate("delete from produits where idt = :idt")
	int deleteProd(@Bind("idt")int idt);
	
	@SqlUpdate("drop table if exists produits")
	void dropProductTable(); 
	
	void close();
}
