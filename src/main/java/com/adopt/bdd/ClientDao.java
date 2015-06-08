package com.adopt.bdd;

import java.util.List;

import mainpack.Items.Client;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface ClientDao {
	@SqlUpdate("create table clients (idt integer primary key autoincrement, photo varchar(255), nom varchar(100), prenom varchar(100), entite varchar(100), adresse varchar(100), codePostal varchar(5),ville varchar(100), mail varchar(100), mdp varchar(40), tel varchar(20), fax varchar(20), metier varchar(100), domaineAct varchar(100), description varchar(250), facebook varchar(100), twitter varchar(100), linkedIn varchar(100), googlePlus varchar(100), typeDePrestation varchar(100), listeProduits varchar(250), valide boolean)")
	void createClientTable();

	@SqlUpdate("insert into clients (photo, nom, prenom, entite, adresse, codePostal, ville, mail, mdp, tel, fax, metier, domaineAct, description, facebook, twitter, linkedIn, googlePlus, typeDePrestation, listeProduits, valide) values (:photo, :nom, :prenom, :entite, :adresse, :codePostal, :ville, :mail, :mdp, :tel, :fax, :metier, :domaineAct, :description, :facebook, :twitter, :linkedIn, :googlePlus, :typeDePrestation, :listeProduits, :valide)")
	@GetGeneratedKeys
	int insert(@BindBean Client c);

	@SqlUpdate("update clients set photo = :photo, nom = :nom, prenom = :prenom, entite = :entite, adresse = :adresse, codePostal = :codePostal, ville = :ville, mail = :mail, mdp = :mdp, tel = :tel, fax = :fax, metier = :metier, domaineAct = :domaineAct, description = :description, facebook = :facebook, twitter = :twitter, linkedIn = :linkedIn, googlePlus = :googlePlus, typeDePrestation = :typeDePrestation, listeProduits = :listeProduits where idt = :idt")
	void update(@BindBean Client c);
	
	@SqlQuery("select * from clients where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	Client findByIdt(@Bind("idt") String idt);
	
	@SqlQuery("select * from clients order by ville, entite, nom")
	@RegisterMapperFactory(BeanMapperFactory.class)
	List<Client> listerClients();
	
	@SqlUpdate("update clients set valide = :valide where idt= :idt")
	int validerClient(@Bind("idt") int idt, @Bind("valide") boolean valide);
	
	@SqlUpdate("delete from clients where idt = :idt")
	int deleteClient(@Bind("idt") int idt);

	@SqlUpdate("drop table if exists clients")
	void dropClientTable();

	void close();
}
