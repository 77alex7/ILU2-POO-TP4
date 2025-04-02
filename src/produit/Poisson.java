package produit;

public class Poisson extends Produit {
	private String date;

	protected Poisson(String nom, Unite unite, String date) {
		super("Poisson", Unite.PIECE);
		this.date = date;
	}

	@Override
	public String decrireProduit() {
		StringBuilder chaine= new StringBuilder();
		return chaine.toString();
	}
}
