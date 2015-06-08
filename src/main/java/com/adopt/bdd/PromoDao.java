package com.adopt.bdd;

import java.util.List;

import mainpack.Items.Produit;
import mainpack.Items.Promo;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface PromoDao {
	@SqlUpdate("create table promos (idt integer primary key autoincrement, libelle varchar(100), photo varchar(255), description varchar(240), idVendeur integer, promo varchar(100), offreGroupe boolean, categorie varchar(100))")
	void createPromoTable();

	@SqlUpdate("insert into promos (libelle, photo, description, idVendeur, promo, offreGroupe, categorie) values (:libelle, :photo, :description, :idVendeur, :promo, :offreGroupe, :categorie)")
	@GetGeneratedKeys
	int insert(@BindBean Promo p);
	
	@SqlUpdate("update promos set libelle = :libelle, photo = :photo, description = :description, idVendeur = :idVendeur, promo = :promo, offreGroupe = :offreGroupe, categorie = :categorie")
	void update(@BindBean Promo p);
	
	@SqlQuery("select * from produits where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	Produit findByIdt(@Bind("idt") int idt);
	
	@SqlQuery("select * from promos where idVendeur = :idVendeur")
	@RegisterMapperFactory(BeanMapperFactory.class)
	List<Produit> listerProduitsParIdClient(@Bind("idVendeur") int idVendeur);
	
	@SqlUpdate("delete from promos where idt = :idt")
	int deletePromo(@Bind("idt")int idt);
	
	@SqlUpdate("drop table if exists promos")
	void dropPromoTable(); 
	
	void close();
}
