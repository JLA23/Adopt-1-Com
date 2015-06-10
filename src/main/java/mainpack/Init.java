package mainpack;

import mainpack.Items.Client;
import mainpack.Items.Groupe;
import mainpack.Items.Produit;
import mainpack.Items.Promo;
import mainpack.Items.Service;

import org.skife.jdbi.v2.DBI;
import org.sqlite.SQLiteDataSource;

import com.adopt.bdd.ClientDao;
import com.adopt.bdd.GroupeDao;
import com.adopt.bdd.LikeDao;
import com.adopt.bdd.ProduitDao;
import com.adopt.bdd.PromoDao;
import com.adopt.bdd.ServiceDao;
import com.adopt.bdd.UtilisateurDao;

public class Init {
	
	private static Init instance=null;
	private DBI dbi;
	
	private Init(){
		SQLiteDataSource ds = new SQLiteDataSource();
		ds.setUrl("jdbc:sqlite:" + System.getProperty("java.io.tmpdir")
				+ System.getProperty("file.separator") + "data.db");
		dbi = new DBI(ds);
		initTables();
		initExemples();
	}
	
	public static synchronized Init getInstance(){
		if(instance==null){
			instance = new Init();
		}
		return instance;
	}
	
	
	public ClientDao initClientDao(){
		return dbi.open(ClientDao.class);
	}
	
	public ProduitDao initProduitDao(){
		return dbi.open(ProduitDao.class);
	}
	
	public ServiceDao initServiceDao(){
		return dbi.open(ServiceDao.class);
	}
	
	public PromoDao initPromoDao(){
		return dbi.open(PromoDao.class);
	}
	
	public LikeDao initLikeDao(){
		return dbi.open(LikeDao.class);
	}
	
	public UtilisateurDao initUtilisateurDao(){
		return dbi.open(UtilisateurDao.class);
	}
	
	public GroupeDao initGroupeDao(){
		 return dbi.open(GroupeDao.class);
	}
	
	public ClientDao getClientDao(){
		return initClientDao();
	}
	
	public ProduitDao getProduitDao(){
		return initProduitDao();
	}
	
	public ServiceDao getServiceDao(){
		return initServiceDao();
	}
	
	public PromoDao getPromoDao(){
		return initPromoDao();
	}
	
	public LikeDao getLikeDao(){
		return initLikeDao();
	}
	
	public UtilisateurDao getUtilisateurDao(){
		return initUtilisateurDao();
	}
	
	public GroupeDao getGroupeDao(){
		return initGroupeDao();
	}
	
	private void initTables(){
		ClientDao clientDao = getClientDao();
		clientDao.dropClientTable();
		clientDao.createClientTable();
		clientDao.close();
		
		getProduitDao().dropProductTable();
		getProduitDao().createProductTable();
		
		getServiceDao().dropServiceTable();
		getServiceDao().createServiceTable();
		
		getPromoDao().dropPromoTable();
		getPromoDao().createPromoTable();
		
		getLikeDao().dropLikeTable();
		getLikeDao().createLikeTable();
		
		getUtilisateurDao().dropUtilisateurTable();
		getUtilisateurDao().createUtilisateurTable();
		
		GroupeDao groupeDao = getGroupeDao();
		groupeDao.dropGroupeTable();
		groupeDao.createGroupeTable();
		groupeDao.close();
	}
	
	public void initExemples(){
		exempleClient();
		exempleProduit();
		exemplePromo();
		exempleService();
		//exempleGroupe();
	}
	

	private void exempleClient(){
		ClientDao cd = getClientDao();
		cd.insert(new Client(-1, null, "Bourbie", "Rito", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		cd.insert(new Client(-1, null, "Bourbia", "Rita", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		cd.insert(new Client(-1, null, "Bourbiu", "Ritu", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		cd.insert(new Client(-1, null, "Bourbiy", "Rity", "Bourbie & co", null, "18 rue du pingouin", "59000", "Lille", "bourbie@gmail.com", "bourbue", "01/01/2015", "0606060606", "0404040404", "Bourbiste", "Bourbe", "Blblblblblb", "http://facebourbe/bourbie", "http://twitter/bourbie", null, null, "service", "talent", true));
		cd.close();
	}
	
	private void exempleProduit(){
		ProduitDao pd = getProduitDao();
		pd.insert(new Produit(-1, "Chaise", null, "18€", "Jolie chaise rouge de jardin", 1, 1, false, "Mobilier"));
		pd.insert(new Produit(-1, "Bureau", null, "50€", "Joli bureau rouge de jardin", 1, 0, false, "Mobilier"));
		pd.insert(new Produit(-1, "Lampe", null, "10€", "Jolie lampe rouge de jardin", 1, 0, false, "Mobilier"));
		pd.insert(new Produit(-1, "Jambon", null, "20€", "Joli jambon rouge de jardin", 1, 0, false, "Mobilier"));
		pd.insert(new Produit(-1, "Poulet", null, "1000€", "Jolie poulet rouge de compagnie", 1, 0, false, "Animaux"));
		pd.insert(new Produit(-1, "Poney", null, "273€", "Joli poney disco à paillettes de jardin", 1, 0, false, "Animaux"));
		pd.insert(new Produit(-1, "Pingouin", null, "10€", "Jolie pingouin bleu de cuisine", 1, 0, false, "Ustensiles"));
		pd.insert(new Produit(-1, "Paillon", null, "5€", "Joli paillon vert de compétition", 1, 0, false, "Mobilier"));
		pd.close();
	}
	
	private void exempleService(){
		ServiceDao sd = getServiceDao();
		sd.insert(new Service(-1, "Massage", null, "40€", "Massage plutot sympathique", 1, 2, false, "Bien-être"));
		sd.insert(new Service(-1, "Ménage", null, "20€", "Ménage plutot sympathique", 1, 0, false, "Entretien"));
		sd.insert(new Service(-1, "Restauration", null, "100€", "Resto plutot sympathique", 1, 0, false, "Nourriture"));
		sd.close();
	}
	
	private void exemplePromo(){
		PromoDao pd = getPromoDao();
		pd.insert(new Promo(-1, 1, -1, "14/06/2015", "12€", "Remise exceptionnelle sur les chaises de jardin"));
		pd.insert(new Promo(-1, -1, 1, "14/06/2015", "4€", "Remise exceptionnelle sur les massages de jardin"));
		pd.close();
	}
	

	private void exempleGroupe() {
		GroupeDao gd = getGroupeDao();
		gd.insert(new Groupe(-1, 2, -1, 10, "35€", "Remise sur les bureaux si vous venez nombreux!"));
		gd.close();
	}
}