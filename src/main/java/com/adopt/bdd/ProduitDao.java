package com.adopt.bdd;

import java.util.List;

import mainpack.Items.Produit;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface ProduitDao {
	@SqlUpdate("create table produits (idt integer primary key autoincrement, libelle varchar(100), photo varchar(255), prix varchar(100), description varchar(240), idVendeur integer, promo integer, offreGroupe boolean, categorie varchar(100))")
	void createProductTable();

	@SqlUpdate("insert into produits (libelle, photo, prix, description, idVendeur, promo, offreGroupe, categorie) values (:libelle, :photo, :prix, :description, :idVendeur, :promo, :offreGroupe, :categorie)")
	@GetGeneratedKeys
	int insert(@BindBean Produit p);
	
	@SqlUpdate("update produits set libelle = :libelle, photo = :photo, prix = :prix, description = :description, idVendeur = :idVendeur, promo = :promo, offreGroupe = :offreGroupe, categorie = :categorie")
	void update(@BindBean Produit p);
	
	@SqlQuery("select count(*) from produits")
	public int count();
	
	@SqlQuery("select * from produits where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	Produit findByIdt(@Bind("idt") int idt);
	
	@SqlQuery("select * from produits where idVendeur = :idVendeur")
	@RegisterMapperFactory(BeanMapperFactory.class)
	List<Produit> listerProduitsParIdClient(@Bind("idVendeur") int idVendeur);
	
	@SqlUpdate("delete from produits where idt = :idt")
	int deleteProd(@Bind("idt")int idt);
	
	@SqlUpdate("drop table if exists produits")
	void dropProductTable(); 
	
	void close();
}
