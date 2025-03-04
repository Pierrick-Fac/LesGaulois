package bataille;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified(this.force);
		equipements = new Equipement[2];
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
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
			case 2:
				System.out.println("Le soldat " + nom + " est déjà bien protégé !");
				break;
			
			case 1:
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
					break;
				}
				else {
					ajouterEquipement(equipement, 1);
					break;
				}
					
			default:
				ajouterEquipement(equipement, 0);
		}
	}
	
	private void ajouterEquipement(Equipement equipement,int emplacement) {
		equipements[emplacement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
	}
	
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	
}
