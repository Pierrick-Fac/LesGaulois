package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public boolean resterPotion() {
		if (quantitePotion <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		quantitePotion = quantite;
		this.forcePotion = forcePotion;
	}

	public int prendreLouche() {
		if (resterPotion()) {
			quantitePotion = quantitePotion - 1;
			return forcePotion;
		}
		else {
			return 1;
		}
	}
}
