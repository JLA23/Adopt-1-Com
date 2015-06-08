package mainpack;

import mainpack.Items.Client;
import mainpack.Items.Produit;
import mainpack.Items.Service;

import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.LikeDao;
import com.adopt.bdd.ProduitDao;
import com.adopt.bdd.PromoDao;
import com.adopt.bdd.ServiceDao;
import com.adopt.bdd.UtilisateurDao;

import fr.iutinfo.App;

public class Init {
	
	DBI dbi;
	ClientDao clientDao;
	ProduitDao produitDao;
	ServiceDao serviceDao;
	PromoDao promoDao;
	LikeDao likeDao;
	UtilisateurDao utilisateurDao;
	
	public Init(){
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "data.db");
		dbi = new DBI(ds);
		initDao();
		initTables();
	}
	
	public void initClientDao(){
		clientDao=App.dbi.open(ClientDao.class);
	}
	
	public void initProduitDao(){
		produitDao=App.dbi.open(ProduitDao.class);
	}
	
	public void initServiceDao(){
		serviceDao=App.dbi.open(ServiceDao.class);
	}
	
	public void initPromoDao(){
		promoDao=App.dbi.open(PromoDao.class);
	}
	
	public void initLikeDao(){
		likeDao=App.dbi.open(LikeDao.class);
	}
	
	public void initUtilisateurDao(){
		utilisateurDao=App.dbi.open(UtilisateurDao.class);
	}
	
	public ClientDao getClientDao(){
		return clientDao;
	}
	
	public ProduitDao getProduitDao(){
		return produitDao;
	}
	
	public ServiceDao getServiceDao(){
		return serviceDao;
	}
	
	public PromoDao getPromoDao(){
		return promoDao;
	}
	
	public LikeDao getLikeDao(){
		return likeDao;
	}
	
	public UtilisateurDao getUtilisateurDao(){
		return utilisateurDao;
	}
	
	public void initDao(){
		initClientDao();
		initProduitDao();
		initServiceDao();
		initPromoDao();
		initLikeDao();
		initUtilisateurDao();
	}
	
	public void initTables(){
		clientDao.dropClientTable();
		clientDao.createClientTable();
		
		produitDao.dropProductTable();
		produitDao.createProductTable();
		
		serviceDao.dropServiceTable();
		serviceDao.createServiceTable();
		
		promoDao.dropPromoTable();
		promoDao.createPromoTable();
		
		likeDao.dropLikeTable();
		likeDao.createLikeTable();
		
		utilisateurDao.dropUtilisateurTable();
		utilisateurDao.createUtilisateurTable();
	}
	
	public void exempleClient(){
		clientDao.insert(new Client(-1, null, "Bourbie", "Rito", "Bourbie & co", "59000", "Lille", "bourbie@gmail.com", "bourbie", "0606060606", "01/01/0001", "0404040404", "Bourbiste", "Bourbe", "Blblblblblblblblbblblblblbl", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, null, "service", "talent", true));
	}
	
	public void exempleProduit(){
		produitDao.insert(new Produit(-1, "Chaise", null, "10€", "Jolie chaise rouge de jardin", 1, null, false, "Mobilier"));
	}
	
	public void exempleService(){
		serviceDao.insert(new Service(-1, "Massage", "10€", "Massage d'une heure"));
	}
}
