package Personne;

public class DirecteurGeneral extends Personne {

	private double revenu;

	public DirecteurGeneral(String nom, String prenom, double revenu) {
		super(nom, prenom);

		this.revenu = revenu;

	}

	public double getRevenu() {
		return revenu;
	}

	public void setRevenu(double revenu) {
		this.revenu = revenu;
	}
}