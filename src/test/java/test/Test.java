package test;


import java.util.ArrayList;
import java.util.List;

import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {

		
Console c1= new Console("Switch",300,"12/02/2017");
Console c2=new Console("Switch Lite",250,"13/05/2018");	
Console c3=new Console("Nintendo 2DS XL",200,"13/10/2012");

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

List<Jeu> jeuxclient1 = new ArrayList();
jeuxclient1.add(j1);
jeuxclient1.add(j3);
jeuxclient1.add(j4);

Client client1= new Client("Dehorter","Aymeric",jeuxclient1);

	}

}
