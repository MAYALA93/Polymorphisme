package Morphisme;

public class Rectangle extends FormeGeometrique {
		private double longueur;
		private double largeur;
		
	public Rectangle(double largeur, double longueur) throws Exception {
		this.setLargeur(largeur);
		this.setLongueur(longueur);
	}
	//Exception : pour mieux traiter les erreurs 
	@Override
	//Override pour red�finir les m�thodes 
	public double calculerPerimetre() {
		return 2*(longueur + largeur);
	}
	@Override
	//ne pas mettre void parce que cela retourne rien
	public double calculerAire() {
		return longueur * largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) throws Exception {
		if (longueur <= 0)
	        throw new Exception("longueur � z�ro ou n�gatif");
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) throws Exception {
		if (largeur <=0)
	        throw new Exception("longueur � z�ro ou n�gatif ");
		this.largeur = largeur;
	}
	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + ", calculerPerimetre()=" + calculerPerimetre()
				+ ", calculerAire()=" + calculerAire() + ", getLongueur()=" + getLongueur() + ", getLargeur()="
				+ getLargeur() + "]";
	}


	}

	//appeler la source et puis sur generate toString 