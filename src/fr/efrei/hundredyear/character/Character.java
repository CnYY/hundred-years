package fr.efrei.hundredyear.character;

public class Character
{

	// *******************VARIABLE*************************
	protected String name; // nom du personnage
	protected int soldierMax; // Sante max du personnage
	protected int soldierCurr; // Sante courante
	protected int attack; // attack stat
	

	// ****************** GET *********************
	public String getName() {
		return name;
	}


	public int getSolMax() {
		return soldierMax;
	}

	public int getSolCurr() {
		return soldierCurr;
	}

	public int getAttack() {
		return attack;
	}
	

	// ********************SET************************
	public void setName(String pName) {
		name = pName;
	}


	public void setSolMax(int pSolMax) {
		soldierMax = pSolMax;
	}

	public void setSolCurr(int pSolCurr) {
		soldierCurr = pSolCurr;
	}
	
	public void setAttack(int pAttack) {
		attack = pAttack;
	}
	

}
