package fr.efrei.hundredyear.battle;

import java.util.Scanner;
import java.util.Random;

import fr.efrei.hundredyear.character.Mobs;
import fr.efrei.hundredyear.character.Player;

public class Combat
{

	public Combat(Player player, Mobs ennemy)
	{
		Scanner sc = new Scanner(System.in);
		char carac;
		Random randomGenerator = new Random();
		int randomInt;
		
		System.out.println("\nVous avez rencontre un " + ennemy.getName());
		
		do
		{

			randomInt = randomGenerator.nextInt(9);
			int playerAtk = player.getAttack();
			int ennemyAtk = ennemy.getAttack();
			
			if(randomInt <= 3){
				playerAtk = (int) (playerAtk * 1.5) ;
				ennemyAtk = (int) (ennemyAtk * 1.5) ;
			}
			
			System.out.println("Vous avez inflige " + playerAtk + " degat.");
			ennemy.setSolCurr(ennemy.getSolCurr() - playerAtk);
			System.out.println(ennemy.getName() + " a inflige " + ennemyAtk + " degat.");
			player.setSolCurr(player.getSolCurr() - ennemyAtk);

			System.out.println("Nom : " + player.getName());
			System.out.println("Vie : " + player.getSolCurr() + "/" + player.getSolMax());
			System.out.println();
			if (ennemy.getSolCurr() > 0)
			{
				System.out.println("Nom : " + ennemy.getName());
				System.out.println("Vie : " + ennemy.getSolCurr() + "/" + ennemy.getSolMax());
			}
			else
			{
				System.out.println(ennemy.getName() + " est mort.");
			}

			if ((player.getSolCurr() > 0) && (ennemy.getSolCurr()> 0))
			{
				System.out.println("Continuer le combat ? (y/n)");
				String saisie = sc.nextLine();
				carac = saisie.charAt(0);
			}
			else
			{
				System.out.println("Victoire!!!");
				carac = 'n';
			}
		} while (carac != 'n');
	}

}
