package Morphisme;

public class Carre extends Rectangle{

	public Carre (double cote) throws Exception  
	{
       this(cote,cote);
    }


	private Carre(double longueur, double largeur) throws Exception {
		super(longueur, largeur);
		//faire appel au constructeur car il hérite de rectangle
	}

	@Override
	public String toString() {
		return "Carre [calculerPerimetre()=" + calculerPerimetre() + ", calculerAire()=" + calculerAire()
				+ ", getLongueur()=" + getLongueur() + ", getLargeur()=" + getLargeur() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
//créer une exception pour le carré afin de verifier la valeur et aussi parce que 
//dans la classe rectangle nous avons crée l'exception