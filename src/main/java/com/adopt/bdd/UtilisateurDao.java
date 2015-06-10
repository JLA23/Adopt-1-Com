package com.adopt.bdd;
import java.util.List;

import mainpack.Items.Client;
import mainpack.Items.Utilisateur;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface UtilisateurDao {
	@SqlUpdate("create table utilisateurs (idt integer primary key autoincrement, photo varchar(255), idClient integer, nom varchar(100), prenom varchar(100), codePostal varchar(5),ville varchar(100), mail varchar(100), mdp varchar(40), dateNaiss varchar(20), tel varchar(20), metier varchar(100), facebook varchar(100), twitter varchar(100), linkedIn varchar(100), googlePlus varchar(100))")
	public void createUtilisateurTable();

	@SqlUpdate("insert into utilisateurs (photo, idclient, nom, prenom, codePostal, ville, mail, mdp, dateNaiss, tel, metier, facebook, twitter, linkedIn, googlePlus) values (:photo, :idClient, :nom, :prenom, :codePostal, :ville, :mail, :mdp, :dateNaiss, :tel, :fax, :metier, :facebook, :twitter, :linkedIn, :googlePlus)")
	@GetGeneratedKeys
	public int insert(@BindBean Utilisateur u);

	@SqlUpdate("update utilisateurs set photo = :photo, idClient=:idClient, nom = :nom, prenom = :prenom, codePostal = :codePostal, ville = :ville, mail = :mail, mdp = :mdp, dateNaiss = :dateNaiss, tel = :tel, fax = :fax, metier = :metier, facebook = :facebook, twitter = :twitter, linkedIn = :linkedIn, googlePlus = :googlePlus where idt = :idt")
	public void update(@BindBean Utilisateur u);
	
	@SqlQuery("select * from utilisateurs where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	public Utilisateur findByIdt(@Bind("idt") int idt);
	
	@SqlQuery("select * from clients where idt = :idClient")
	public Client findClientByIdClient(@Bind("idClient") int idClient);
	
	@SqlQuery("select * from utilisateurs order by ville, nom")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public List<Utilisateur> listerUtilisateur();
	
	@SqlUpdate("delete from utilisateurs where idt = :idt")
	public int deleteUtilisateur(@Bind("idt") int idt);

	@SqlUpdate("drop table if exists utilisateurs")
	public void dropUtilisateurTable();

	public void close();
}