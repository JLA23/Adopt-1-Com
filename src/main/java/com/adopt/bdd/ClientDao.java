package com.adopt.bdd;

import mainpack.Items.Client;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

import fr.iutinfo.User;

public interface ClientDao {
	@SqlUpdate("create table clients (idt integer primary key autoincrement, photo varchar(100), nom varchar(100), prenom varchar(100), entite varchar(100), adresse varchar(100), codePostal varchar(5),ville varchar(100), mail varchar(100), tel varchar(20), fax varchar(20), metier varchar(100), domaineAct varchar(100), description varchar(240), facebook varchar(100) )")
	void createClientTable();

	@SqlUpdate("insert into clients (nom, prenom, entite) values (:nom, :prenom, :entite)")
	@GetGeneratedKeys
	int insert(@Bind("nom") String nom, @Bind("prenom") String prenom,
			@Bind("entite") String entite);

	@SqlUpdate("update clients set nom = :nom, prenom = :prenom .... where idt = :idt")
	int update(@BindBean Client s);

	@SqlUpdate("drop table if exists clients")
	void dropUserTable();

	void close();
}
