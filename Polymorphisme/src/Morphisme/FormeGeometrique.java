package Morphisme;

public abstract class FormeGeometrique {

public abstract double calculerAire();
public abstract double calculerPerimetre();

@Override
public String toString() {
	return "FormeGeometrique [calculerAire()=" + calculerAire() + ", calculerPerimetre()=" + calculerPerimetre() + "]";
}
}
		
//override permet de redefinir la méthode 
   //toString va convertir ton objet
   

	