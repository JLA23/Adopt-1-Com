package com.adopt.bdd;

import java.util.List;

import mainpack.Items.Service;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface ServiceDao {
	
	///Création
	@SqlUpdate("create table services (idt integer primary key autoincrement, libelle varchar(100), photo varchar(255), prix varchar(100), description varchar(240), idVendeur integer, promo integer, offreGroupe boolean, categorie varchar(100))")
	public void createServiceTable();

	///Insert
	@SqlUpdate("insert into services (libelle, photo, prix, description, idVendeur, promo, offreGroupe, categorie) values (:libelle, :photo, :prix, :description, :idVendeur, :promo, :offreGroupe, :categorie)")
	@GetGeneratedKeys
	public int insert(@BindBean Service s);
	
	///Update
	@SqlUpdate("update services set libelle = :libelle, photo = :photo, prix=:prix, description = :description, idVendeur = :idVendeur, promo = :promo, offreGroupe = :offreGroupe, categorie = :categorie")
	public void update(@BindBean Service s);
	
	///Trouver un client grace à son id
	@SqlQuery("select * from services where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	public Service findByIdt(@Bind("idt") int idt);
	
	///Compte le nombre de lignes
	@SqlQuery("select count(*) from services")
	public int count();
	
	///Liste tous les services du Client correspondant
	@SqlQuery("select * from services where idVendeur = :idVendeur")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public List<Service> listerServicesParIdClient(@Bind("idVendeur") int idVendeur);
	
	///Supprime le service donné
	@SqlUpdate("delete from services where idt = :idt")
	public int deleteService(@Bind("idt")int idt);
	
	///Supprime la table
	@SqlUpdate("drop table if exists services")
	public void dropServiceTable(); 
	
	public void close();

	
}