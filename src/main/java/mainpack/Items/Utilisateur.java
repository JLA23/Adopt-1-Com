package mainpack.Items;

/**
 * 
 * @author jourdail La classe Client permet de créer des clients ainsi que leur
 *         attributs. Les getters permettent de récupérer ces derniers.
 */

public class Utilisateur extends Item {

	private String photo;
	private int idClient;
	private String nom;
	private String prenom;
	private String codePostal;
	private String ville;
	private String mail;
	private String mdp;
	private String dateNaiss;
	private String tel;
	private String metier;
	private String facebook;
	private String twitter;
	private String linkedIn;
	private String googlePlus;

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
	
	public Utilisateur(){
		super(1);
	}

	public Utilisateur(int idt, String photo, int idClient, String prenom, String nom,
			String codePostal, String ville,
			String mail, String mdp, String dateNaiss, String tel, String metier,
			String facebook,
			String twitter, String linkedIn, String googlePlus) {
		super(idt);
		this.setPhoto(photo);
		this.setIdClient(idClient);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setCodePostal(codePostal);
		this.setVille(ville);
		this.setMail(mail);
		this.setMdp(mdp);
		this.setDateNaiss(dateNaiss);
		this.setTel(tel);
		this.setMetier(metier);
		this.setFacebook(facebook);
		this.setTwitter(twitter);
		this.setLinkedIn(linkedIn);
		this.setGooglePlus(googlePlus);
	}

	
	public String toString() {
		return idt + "; " + nom + "; " + prenom + "; ";
	}

	public String renderHTML() {
		String res = "<td>Prénom : " + prenom + "<br> Métier : " + metier
				+ "<br> Ville : " + ville;
		return res;
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

	public boolean equals(Object u) {
		return nom.equals(((Utilisateur) u).nom);
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

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
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
		return prenom+" "+nom;
	}
	
	///Renvoie le nom de la table dans laquelle doit être stockée l'Item
	@Override
	public String getType() {
		return "utilisateurs";
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

}