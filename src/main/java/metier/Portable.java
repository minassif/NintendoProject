package metier;

import java.time.LocalDate;

public class Portable extends Console {

	

	public Portable(String nom, int prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Portable [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

	

	
	

}
