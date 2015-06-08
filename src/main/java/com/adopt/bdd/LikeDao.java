package com.adopt.bdd;

import java.util.List;

import mainpack.Items.Like;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface LikeDao {
	@SqlUpdate("create table likes (idVendeur integer, idUtilisateur integer, aime boolean)")
	public void createClientTable();

	@SqlUpdate("insert into likes (idVendeur, idUtilisateur, aime) values (:idVendeur, :idUtilisateur, :aime)")
	@GetGeneratedKeys
	public int insert(@BindBean Like l);

	@SqlUpdate("update likes set idVendeur = :idVendeur, idUtilisateur = :idUtilisateur, aime = :aime")
	public void update(@BindBean Like l);

	@SqlQuery("select * from likes where idVendeur = :idVendeur")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public List<Like> findByVendeur(@Bind("idVendeur") int idVendeur);

	@SqlQuery("select * from likes where idUtilisateur = :idUtilisateur")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public List<Like> findByUtilisateur(@Bind("idUtilisateur") int idUtilisateur);

	@SqlUpdate("delete from likes where idVendeur = :idVendeur and idUtilisateur = :idUtilisateur")
	public int deleteLike(@Bind("idUtilisateur") int idUtilisateur, @Bind("idVendeur") int idVendeur);

	@SqlUpdate("drop table if exists likes")
	public void dropServiceTable();

	public void close();
}
