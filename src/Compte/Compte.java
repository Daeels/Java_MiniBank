package Compte;

public abstract class Compte {

	protected int numCompte;
	protected double montant;

	public Compte(int numCompte, double montant) {

		this.numCompte = numCompte;
		this.montant = montant;
	}

	public double getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
}
