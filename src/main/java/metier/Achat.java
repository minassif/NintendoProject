package metier;

import java.time.LocalDate;

public class Achat {

private Jeu jeux;
private LocalDate date ;
private double prix;
private Boutique boutique ;
public Achat(Jeu jeux, LocalDate date, double prix, Boutique boutique) {
	
	super();
	this.jeux = jeux;
	this.date = date;
	this.prix = prix;
	this.boutique = boutique;
}
public Jeu getJeux() {
	return jeux;
}
public void setJeux(Jeu jeux) {
	this.jeux = jeux;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public Boutique getBoutique() {
	return boutique;
}
public void setBoutique(Boutique boutique) {
	this.boutique = boutique;
}
@Override
public String toString() {
	return "Achat [jeux=" + jeux + ", date=" + date + ", prix=" + prix + ", boutique=" + boutique + "]";
}


	
	
}
