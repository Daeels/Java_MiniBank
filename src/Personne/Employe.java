package Personne;

public class Employe extends Personne {

	private String dateEmbauche;

	public Employe(String nom, String prenom, String dateEmbauche) {
		super(nom, prenom);
		this.dateEmbauche = dateEmbauche;
	}

	public String getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(String dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
}
