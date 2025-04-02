package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois gaulois;

	protected Sanglier(int poids, Gaulois gaulois) {
		super("Sanglier", Unite.KILOGRAMME);
		this.poids = poids;
		this.gaulois = gaulois;
	}

	@Override
	public String decrireProduit() {
		StringBuilder chaine= new StringBuilder();
		return chaine.toString();
	}
}
