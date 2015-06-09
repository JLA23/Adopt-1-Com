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
	@SqlUpdate("create table likes (idCible integer, idUtilisateur integer, typecible varchar(10), aime boolean)")
	public void createLikeTable();

	@SqlUpdate("insert into likes (idCible, idUtilisateur, typeCible, aime) values (:idCible, :idUtilisateur, :typeCible, :aime)")
	@GetGeneratedKeys
	public int insert(@BindBean Like l);

	@SqlUpdate("update likes set idCible = :idCible, idUtilisateur = :idUtilisateur, aime = :aime")
	public void update(@BindBean Like l);

	@SqlQuery("select count(*) from likes where idCible = :idCible and typeCible = :typeCible")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public int nbVues(@Bind("idCible") int idCible, @Bind("typeCible") String typeCible);

	@SqlQuery("select count(*) from likes where idCible = :idCible and typeCible=:typeCible and aime = 'true'")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public int nbLikes(@Bind("idCible") int idCible, @Bind("typeCible") String typeCible);
	
	@SqlQuery("select count(*) from likes where idCible = :idCible and typeCible=:typeCible and aime = 'false'")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public int nbDislikes(@Bind("idCible") int idCible, @Bind("typeCible") String typeCible);
	
	///Le paramètre aime permet de choisir entre les j'aime et les j'aime pas
	@SqlQuery("select * from likes where idUtilisateur = :idUtilisateur and aime = :aime")
	@RegisterMapperFactory(BeanMapperFactory.class)
	public List<Like> findByUtilisateur(@Bind("idUtilisateur") int idUtilisateur, @Bind("aime") boolean aime);

	@SqlUpdate("delete from likes where idCible = :idCible and idUtilisateur = :idUtilisateur")
	public int deleteLike(@Bind("idUtilisateur") int idUtilisateur, @Bind("idCible") int idCible);

	@SqlUpdate("drop table if exists likes")
	public void dropLikeTable();

	public void close();
}
