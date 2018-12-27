package Morphisme;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws Exception {
		
ArrayList<FormeGeometrique> formes = new ArrayList <FormeGeometrique>(); 
				
              formes.add(new Cercle(12.5));
              formes.add(new Carre(5.6));
              formes.add(new Rectangle(50, 85));
				
		 //FormeGeometrique FG = new Cercle(12.5);
		//FG.calculerAire();				
		//FG.calculerPerimetre();
	
		for(FormeGeometrique forme : formes){
	//mettre la methode forEach pour chaque forme pour mes classe 
	//..on va appliquer la m�thode forme
			System.out.print(forme);
			System.out.print(" ,Aire: "+forme.calculerAire());
			System.out.println(" ,Perim�tre: "+forme.calculerPerimetre());					
		}
	}
}


//on rajoute for pour h�riter des elements des autres classes 
//voila le polymorphisme c'est l'aptitude d'un objet a pouvoir prendre 
//..plusieurs formes
//on peut prendre une classe parente et l'utillser 
//..dans les classes enfant
//plusieurs fa�ons de faire les tableaux

