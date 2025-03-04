package lieux;

import bataille.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;
	
	public Village(String nom, int MAX, Gaulois chef) {
		villageois = new Gaulois[MAX];
		this.nom = nom;
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbVillageois() {
		return nbVillageois;
	}
	public void setNbVillageois(int nbVillageois) {
		this.nbVillageois = nbVillageois;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <= nbVillageois) {
			return villageois[numVillageois-1];
		}
		else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village !");
			return null;
		}
	}
	
	public void afficherVillageois() {
		System.out.print("Dans le village " + nom + " du chef " + chef);
		if (nbVillageois <= 0) {
			System.out.println(", le chef est seul.");
		}
		else if (nbVillageois == 1) {
			System.out.println(" vive le légendaire gaulois : ");
			System.out.println("- " + trouverVillageois(1));
		}
		else {
			System.out.println(" vivent les légendaires gaulois : ");
			for (int i = 0; i < nbVillageois; i++) {
				Gaulois gaulois = villageois[i];
				System.out.println("- " + gaulois);
			}
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des Irréductibles",30,abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",16);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		
		village.afficherVillageois();
	}
}
