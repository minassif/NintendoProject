package metier;

import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected int prix;
	protected LocalDate dateSortie;

	

	public Console(String nom, int prix, LocalDate dateSortie) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = LocalDate.now();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public LocalDate getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

	
	
	
}
