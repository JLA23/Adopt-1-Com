package com.adopt.bdd;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

import fr.iutinfo.User;

public interface ProduitDao {
	@SqlUpdate("create table produits (idt integer primary key autoincrement, nom varchar(100), prenom varchar(100), entite varchar(100))")
	void createClientTable();

	@SqlUpdate("insert into produits (nom, prenom, entite) values (:nom, :prenom, :entite)")
	@GetGeneratedKeys
	int insert(@Bind("nom") String nom, @Bind("prenom") String prenom, @Bind("entite") String entite);

	
	@SqlUpdate("drop table if exists produits")
	void dropUserTable(); 
	
	void close();
}
