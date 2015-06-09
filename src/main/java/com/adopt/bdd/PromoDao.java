package com.adopt.bdd;

import mainpack.Items.Promo;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapperFactory;
import org.skife.jdbi.v2.tweak.BeanMapperFactory;

public interface PromoDao {
	@SqlUpdate("create table promos (idt integer primary key autoincrement, idProduit integer, idService integer, date varchar(100), remise varchar(255), description varchar(240))")
	void createPromoTable();

	@SqlUpdate("insert into promos (idProduit, idService, date, remise, description) values (:idProduit, :idService , :date, :remise, :description)")
	@GetGeneratedKeys
	int insert(@BindBean Promo p);
	
	@SqlUpdate("update promos set idProduit = :idProduit, idService = :idService, date = :date, remise = :remise, description = :description")
	void update(@BindBean Promo p);
	
	@SqlQuery("select * from promos where idt = :idt")
    @RegisterMapperFactory(BeanMapperFactory.class)
	Promo findByIdt(@Bind("idt") int idt);
	
	@SqlQuery("select * from promos where idProduit = :idProduit")
	@RegisterMapperFactory(BeanMapperFactory.class)
	Promo findByIdProduct(@Bind("idProduit") int idProduit);
	
	@SqlQuery("select * from promos where idService = :idService")
	@RegisterMapperFactory(BeanMapperFactory.class)
	Promo findByIdService(@Bind("idService") int idService);
	
	@SqlUpdate("delete from promos where idt = :idt")
	int deletePromo(@Bind("idt")int idt);
	
	@SqlUpdate("drop table if exists promos")
	void dropPromoTable(); 
	
	void close();
}
