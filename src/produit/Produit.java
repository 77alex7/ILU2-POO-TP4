package produit;

public abstract class Produit {
	private String nom;
	private Unite unite;
	
	protected Produit(String nom,Unite unite) {
		this.nom=nom;
		this.unite=unite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Unite getUnite() {
		return unite;
	}
	
	@Override
	public String toString() {
		return nom;
	}
	public abstract String decrireProduit();	
}
