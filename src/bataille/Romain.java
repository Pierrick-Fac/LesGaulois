package bataille;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified(this.force);
	}
	
	public String getNom() {
		return nom;
	}
	
	private boolean isInvariantVerified(int force) {
		if (force >= 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert isInvariantVerified(forceCoup);
		int force_debut = force;
		force = force - forceCoup;
		assert isInvariantVerified(this.force);
		if (force <= 0) {
			this.parler("J'abandonne !");
		}
		else {
			this.parler("Aie");
		}
		assert force_debut < force;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	}
	
}
