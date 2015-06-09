package mainpack.Items;

/**
 * 
 * @author jourdail La classe Client permet de créer des clients ainsi que leur
 *         attributs. Les getters permettent de récupérer ces derniers.
 */

public class Client extends Item {

	private String photo;
	private String nom;
	private String prenom;
	private String entite;
	private String site;
	private String adresse;
	private String codePostal;
	private String ville;
	private String mail;
	private String mdp;
	private String dateNaiss;
	private String tel;
	private String fax;
	private String metier;
	private String domaineAct;
	private String description; // Comment voyez-vous votre métier?
	private String facebook;
	private String twitter;
	private String linkedIn;
	private String googlePlus;
	private String typeDePrestation; // Produits, services ou les deux?
	private String listeProduits; // Liste non exhaustive des articles ou des
									// services proposés
	private boolean valide;

	/**
	 * Constructeur
	 * 
	 * @param id
	 *            du client
	 * @param nom
	 *            du client
	 * @param prenom
	 *            du client
	 * @param entite
	 *            de l'entreprise ou du commerçant
	 */
	
	public Client(){}

	public Client(int idt, String photo, String prenom, String nom,
			String entite, String site, String adresse, String codePostal, String ville,
			String mail, String mdp, String dateNaiss, String tel, String fax, String metier,
			String domaineAct, String description, String facebook,
			String twitter, String linkedIn, String googlePlus, String typeDePrestation, String listeProduits, boolean valide) {
		super(idt);
		this.setPhoto(photo);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setEntite(entite);
		this.setSite(site);
		this.setAdresse(adresse);
		this.setCodePostal(codePostal);
		this.setVille(ville);
		this.setMail(mail);
		this.setMdp(mdp);
		this.setDateNaiss(dateNaiss);
		this.setTel(tel);
		this.setFax(fax);
		this.setMetier(metier);
		this.setDomaineAct(domaineAct);
		this.setDescription(description);
		this.setFacebook(facebook);
		this.setTwitter(twitter);
		this.setLinkedIn(linkedIn);
		this.setGooglePlus(googlePlus);
		this.setTypeDePrestation(typeDePrestation);
		this.setListeProduits(listeProduits);
		this.setValide(valide);
	}

	
	public String toString() {
		return idt + "; " + nom + "; " + prenom + "; " + entite + ".";
	}

	public String renderHTML() {
		String res = "<td>" + metier +" à "+entite
				+ "<br>" + ville
				+ "<br> "+ description;
		return res;
	}

	public int getId() {
		return idt;
	}

	public void setId(int id) {
		this.idt = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEntite() {
		return entite;
	}

	public void setEntite(String entite) {
		this.entite = entite;
	}

	public boolean equals(Object u) {
		return nom.equals(((Client) u).nom);
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getDomaineAct() {
		return domaineAct;
	}

	public void setDomaineAct(String domaineAct) {
		this.domaineAct = domaineAct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getLinkedIn() {
		return linkedIn;
	}

	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}

	public String getMdp() { // TODO : à enregistrer crypté
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getGooglePlus() {
		return googlePlus;
	}

	public void setGooglePlus(String googlePlus) {
		this.googlePlus = googlePlus;
	}

	public String getTypeDePrestation() {
		return typeDePrestation;
	}

	public void setTypeDePrestation(String typeDePrestation) {
		this.typeDePrestation = typeDePrestation;
	}

	public String getListeProduits() {
		return listeProduits;
	}

	public void setListeProduits(String listeProduits) {
		this.listeProduits = listeProduits;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	@Override
	public String getTitle() {
		return "<span class='glyphicon glyphicon-user'></span> "+prenom+" "+nom;
	}

	///Renvoie le nom de la table dans laquelle doit être stockée l'Item
	@Override
	public String getType() {
		return "clients";
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}