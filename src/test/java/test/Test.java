package test;


import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Console c1= new Console("Switch");
Console c2=new Console("Switch Lite");	
Console c3=new Console("Nintendo 2DS XL");


Jeu j1 =new Jeu ("Mario Kart 8",c1);
Jeu j2 =new Jeu ("Mario golf",c2);
Jeu j3 =new Jeu ("The Legend of Zelda",c3);
Jeu j4 =new Jeu ("No More Heroes 3",c1);
Jeu j5 =new Jeu ("WarioWare",c2);

	}

}
