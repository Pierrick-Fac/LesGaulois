package test_fonctionnel;

import bataille.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obelix",16);

		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix, Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
	}
}