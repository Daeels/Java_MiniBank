package Etablissement;

public class Agence {

	private int numero;
	private String adresse;
	private String nom;

	public Agence(int numero, String adresse, String nom) {
		this.numero = numero;
		this.adresse = adresse;
		this.nom = nom;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
