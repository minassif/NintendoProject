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

		
Console c1= new Console("Switch");
Console c2=new Console("Switch Lite");	
Console c3=new Console("Nintendo 2DS XL");


Jeu j1 =new Jeu ("Mario Kart 8",c1);
Jeu j2 =new Jeu ("Mario golf",c2);
Jeu j3 =new Jeu ("The Legend of Zelda",c3);
Jeu j4 =new Jeu ("No More Heroes 3",c1);
Jeu j5 =new Jeu ("WarioWare",c2);

List<Jeu> jeux = new ArrayList();
jeux.add(j1);
jeux.add(j2);
jeux.add(j3);
jeux.add(j4);
jeux.add(j5);

Adresse a1= new Adresse() ;

Boutique b1= new Boutique("Nintendo Products",a1,jeux);

List<Jeu> jeuxclient1 = new ArrayList();
jeuxclient1.add(j1);
jeuxclient1.add(j3);
jeuxclient1.add(j4);

Client client1= new Client("Dehorter","Aymeric",jeuxclient1);

	}

}
