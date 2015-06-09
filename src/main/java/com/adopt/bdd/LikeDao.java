package com.adopt.bdd;

import java.util.List;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

import com.adopt.items.Like;

public interface LikeDao {
	@SqlUpdate("create table likes (idCible integer, idUtilisateur integer, typecible varchar(10), aime boolean)")
	public void createLikeTable();

	@SqlUpdate("insert into likes (idCible, idUtilisateur, typeCible, aime) values (:idVendeur, :idUtilisateur, :typeCible, :aime)")
	@GetGeneratedKeys
	public int insert(@BindBean Like l);

	@SqlUpdate("update likes set idCible = :idCible, idUtilisateur = :idUtilisateur, aime = :aime")
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
	public void dropLikeTable();

	public void close();
}
