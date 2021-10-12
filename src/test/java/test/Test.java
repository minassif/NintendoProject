package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		
Console c1= new Console("Switch",300,LocalDate.now());
Console c2=new Console("Switch Lite",250,LocalDate.now());	
Console c3=new Console("Nintendo 2DS XL",200,LocalDate.now());

List<Console> consoles=new ArrayList();
consoles.add(c1);
consoles.add(c2);
consoles.add(c3);

Jeu j1 =new Jeu ("Mario Kart 8",consoles);
Jeu j2 =new Jeu ("Mario golf",consoles);
Jeu j3 =new Jeu ("The Legend of Zelda",consoles);
Jeu j4 =new Jeu ("No More Heroes 3",consoles);
Jeu j5 =new Jeu ("WarioWare",consoles);

List<Jeu> jeux = new ArrayList();
jeux.add(j1);
jeux.add(j2);
jeux.add(j3);
jeux.add(j4);
jeux.add(j5);

Adresse a1= new Adresse(12,"Rue de la Nintendog","NintendoCity") ;

Boutique b1= new Boutique("Nintendo Products",a1,jeux);

Achat A1 = new Achat(j1,LocalDate.now(),40,b1);
Achat A2 = new Achat(j2,LocalDate.now(),40,b1);

List<Achat> achats = new ArrayList();
achats.add(A1);
achats.add(A2);


Client client1= new Client("Dehorter","Aymeric",achats);

	}

}
