package Compte;

public class CompteRenumere extends Compte {

	private double tauxInteret;

	public CompteRenumere(int numCompte, double montant, double tauxInteret) {
		super(numCompte, montant);

		this.tauxInteret = tauxInteret;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	public void calculerIntret() {

	}

	void verserIntert() {

	}
}
