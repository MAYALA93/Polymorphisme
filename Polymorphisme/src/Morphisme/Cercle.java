package Morphisme;

import java.lang.Math;

public class Cercle extends FormeGeometrique {
private double rayon;

	public Cercle(double rayon) throws Exception {
		this.setRayon(rayon);
//rajouer les exceptions uniquement sur les constructeur set
	}
@Override	
	public double calculerPerimetre() {
		return 2*Math.PI*(rayon);
		
	}
@Override
	public double calculerAire() {
		return Math.PI*Math.pow(rayon, rayon);
		
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(Double rayon) throws Exception {
		if(rayon <=0)
		throw new Exception ("rayon à zéro négatif");
		this.rayon = rayon;
	}
	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + ", calculerPerimetre()=" + calculerPerimetre() + ", calculerAire()="
				+ calculerAire() + ", getRayon()=" + getRayon() + "]";
	}
	
	
}


	
		

