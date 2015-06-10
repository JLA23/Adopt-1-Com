package com.adopt.bdd;

import mainpack.Items.Groupe;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface GroupeDao {
	@SqlUpdate("create table groupes (idt integer primary key autoincrement, idProduit integer, idService integer, nbPersonnes integer, nvPrix varchar(255), description varchar(240))")
	void createGroupeTable();

	@SqlUpdate("insert into groupes (idProduit, idService, nbPersonnes, nvPrix, description) values (:idProduit, :idService , :nbPersonnes, :nvPrix, :description)")
	@GetGeneratedKeys
	int insert(@BindBean Groupe g);
	
	@SqlUpdate("update groupes set idProduit = :idProduit, idService = :idService, nbPersonnes = :nbPersonnes, nvPrix = :nvPrix, description = :description")
	void update(@BindBean Groupe p);
	
	@SqlQuery("select count(*) from groupes")
	public int count();
	
	@SqlQuery("select * from groupes where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	Groupe findByIdt(@Bind("idt") int idt);
	
	@SqlQuery("select * from groupes where idProduit = :idProduit")
	@RegisterMapperFactory(BeanMapperFactory.class)
	Groupe findByIdProduct(@Bind("idProduit") int idProduit);
	
	@SqlQuery("select * from groupes where idService = :idService")
	@RegisterMapperFactory(BeanMapperFactory.class)
	Groupe findByIdService(@Bind("idService") int idService);
	
	@SqlUpdate("delete from groupes where idt = :idt")
	int deleteGroupe(@Bind("idt")int idt);
	
	@SqlUpdate("drop table if exists promos")
	void dropGroupeTable(); 
	
	void close();
}
