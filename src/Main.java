import java.io.IOException;
import java.util.Scanner;

import fr.efrei.hundredyear.battle.Combat;
import fr.efrei.hundredyear.character.Mobs;
import fr.efrei.hundredyear.character.Player;

public class Main
{

	public static void main(String[] args)
	{

		System.out.println("Nom?");
		Scanner sc = new Scanner(System.in);
		String saisie = sc.nextLine();
		
		int testFIN;

		do
		{
			Player joueur = new Player(saisie);
			Mobs mob = new Mobs("Slime");
			Combat battle = new Combat(joueur, mob);
			testFIN = joueur.getSolCurr();
			
		}while(testFIN > 0 );
		
	}

}
