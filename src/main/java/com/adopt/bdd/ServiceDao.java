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
	@SqlUpdate("create table services (idt integer primary key autoincrement, libelle varchar(100), photo varchar(255), description varchar(240), idVendeur integer, promo varchar(100), offreGroupe boolean, categorie varchar(100))")
	public void createServiceTable();

	@SqlUpdate("insert into services (libelle, photo, description, idVendeur, promo, offreGroupe, categorie) values (:libelle, :photo, :description, :idVendeur, :promo, :offreGroupe, :categorie)")
	@GetGeneratedKeys
	public int insert(@BindBean Service s);
	
	@SqlUpdate("update services set libelle = :libelle, photo = :photo, description = :description, idVendeur = :idVendeur, promo = :promo, offreGroupe = :offreGroupe, categorie = :categorie")
	public void update(@BindBean Service s);
	
	@SqlQuery("select * from services where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	public Service findByIdt(@Bind("idt") int idt);
	
	@SqlQuery("select * from services where idVendeur = :idVendeur")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public List<Service> listerServicesParIdClient(@Bind("idVendeur") int idVendeur);
	
	@SqlUpdate("delete from services where idt = :idt")
	public int deleteService(@Bind("idt")int idt);
	
	@SqlUpdate("drop table if exists services")
	public void dropServiceTable(); 
	
	public void close();
}