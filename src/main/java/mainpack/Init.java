package mainpack;

import mainpack.Items.Client;
import mainpack.Items.Produit;
import mainpack.Items.Promo;
import mainpack.Items.Service;

import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.LikeDao;
import com.adopt.bdd.ProduitDao;
import com.adopt.bdd.PromoDao;
import com.adopt.bdd.ServiceDao;
import com.adopt.bdd.UtilisateurDao;

public class Init {
	
	private static Init instance=null;
	private DBI dbi;
	private static ClientDao clientDao;
	private static ProduitDao produitDao;
	private static ServiceDao serviceDao;
	private static PromoDao promoDao;
	private static LikeDao likeDao;
	private static UtilisateurDao utilisateurDao;
	
	private Init(){
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "data.db");
		dbi = new DBI(ds);
		initDao();
		initTables();
		initExemples();
	}
	
	public static synchronized Init getInstance(){
		if(instance==null){
			instance = new Init();
		}
		return instance;
	}
	
	
	public void initClientDao(){
		clientDao=dbi.open(ClientDao.class);
	}
	
	public void initProduitDao(){
		produitDao=dbi.open(ProduitDao.class);
	}
	
	public void initServiceDao(){
		serviceDao=dbi.open(ServiceDao.class);
	}
	
	public void initPromoDao(){
		promoDao=dbi.open(PromoDao.class);
	}
	
	public void initLikeDao(){
		likeDao=dbi.open(LikeDao.class);
	}
	
	public void initUtilisateurDao(){
		utilisateurDao=dbi.open(UtilisateurDao.class);
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
	
	private void initDao(){
		initClientDao();
		initProduitDao();
		initServiceDao();
		initPromoDao();
		initLikeDao();
		initUtilisateurDao();
	}
	
	private void initTables(){
		System.out.println("init table");
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
	
	public void initExemples(){
		exempleClient();
		exempleProduit();
		exemplePromo();
		exempleService();
	}
	
	private void exempleClient(){
		clientDao.insert(new Client(-1, null, "Bourbie", "Rito", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		clientDao.insert(new Client(-1, null, "Bourbia", "Rita", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		clientDao.insert(new Client(-1, null, "Bourbiu", "Ritu", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		clientDao.insert(new Client(-1, null, "Bourbiy", "Rity", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
	}
	
	private void exempleProduit(){
		produitDao.insert(new Produit(-1, "Chaise", null, "18€", "Jolie chaise rouge de jardin", 1, 1, false, "Mobilier"));
		produitDao.insert(new Produit(-1, "Bureau", null, "50€", "Joli bureau rouge de jardin", 1, 0, false, "Mobilier"));
		produitDao.insert(new Produit(-1, "Lampe", null, "10€", "Jolie lampe rouge de jardin", 1, 0, false, "Mobilier"));
		produitDao.insert(new Produit(-1, "Jambon", null, "20€", "Joli jambon rouge de jardin", 1, 0, false, "Mobilier"));
		produitDao.insert(new Produit(-1, "Poulet", null, "1000€", "Jolie poulet rouge de compagnie", 1, 0, false, "Animaux"));
		produitDao.insert(new Produit(-1, "Poney", null, "273€", "Joli poney disco à paillettes de jardin", 1, 0, false, "Animaux"));
		produitDao.insert(new Produit(-1, "Pingouin", null, "10€", "Jolie pingouin bleu de cuisine", 1, 0, false, "Ustensiles"));
		produitDao.insert(new Produit(-1, "Paillon", null, "5€", "Joli paillon vert de compétition", 1, 0, false, "Mobilier"));
	}
	
	private void exempleService(){
		serviceDao.insert(new Service(-1, "Massage", null, "40€", "Massage plutot sympathique", 1, 0, false, "Bien-être"));
		serviceDao.insert(new Service(-1, "Ménage", null, "20€", "Ménage plutot sympathique", 1, 0, false, "Entretien"));
		serviceDao.insert(new Service(-1, "Restauration", null, "100€", "Resto plutot sympathique", 1, 0, false, "Nourriture"));

	}
	
	private void exemplePromo(){
		promoDao.insert(new Promo(-1, 1, -1, "14/06/2015", "12€", "Remise exceptionnelle sur les chaises de jardin"));
		promoDao.insert(new Promo(-1, -1, 1, "14/06/2015", "4€", "Remise exceptionnelle sur les massages de jardin"));

	}
}