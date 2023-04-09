package Etablissement;

public class Banque {

	private double capital;
	private String adresse;
	private String nom;

	public Banque(double capital, String adresse, String nom) {
		this.capital = capital;
		this.adresse = adresse;
		this.nom = nom;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
