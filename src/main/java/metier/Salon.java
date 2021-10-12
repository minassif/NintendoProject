package metier;

import java.time.LocalDate;

public class Salon extends Console{

	

	public Salon(String nom, int prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Salon [nom=" + nom + ", prix=" + prix + ", dateSortie=" + dateSortie + "]";
	}

	
	
	

}
