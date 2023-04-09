package Personne;

public class Client extends Personne {

	private String adresse;

	public Client(String nom, String prenom, String adresse) {
		super(nom, prenom);
		this.adresse = adresse;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
