package Item;

public class Weapon {


	// *******************VARIABLE*************************
	protected String nom; // nom de l'arme
	protected int atk; // stat attaque
	
	// ****************** GET *********************
	public String getNom() {
		return nom;
	}
	public int getAtk() {
		return atk;
	}
	// ********************SET************************
	public void setNom(String pNom) {
		nom = pNom;
	}

	public void setAtk(int pAtk) {
		atk = pAtk;
	}
}
