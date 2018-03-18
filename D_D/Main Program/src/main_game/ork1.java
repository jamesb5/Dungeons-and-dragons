package main_game;

import javax.swing.JPanel;

import Tools.Dice;

public class ork1 extends encounter {
	 Dice d20 = new Dice(20);
	 Dice longsword = new Dice(8);
	public ork1(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel)
	{
		
		Main.columntextpanel.removeAll();
		Main.columntextpanel.add(label[0]);
		Main.columntextpanel.add(label[1]);
		Main.columntextpanel.add(label[2]);
		Main.columntextpanel.add(label[3]);
		Main.columntextpanel.add(label[4]);
		Main.columntextpanel.add(label[5]);
		Main.columnpanel.removeAll();
		Main.columnpanel.add(button[0]);
		int attack = d20.roll();
		int totalattack = attack + 3 + 3;
		int damage;
		int backroundroll = d20.roll();
		if (backroundroll > 16){
			Main.label[0].setText("You swing your sword at the orc with steady speed and control");
			Main.label[1].setText("Your attack roll is " + attack + " with a strength modifier of 3 and your proficiency of 3 for a total of " + totalattack + "!");
			if(attack == 20){
				damage = longsword.roll() + longsword.roll() + 3;
				Main.label[2].setText("You deal a critical hit to the ork and hit a vital part of his body, You deal " + damage + " damage with a strength modifier");
				Main.label[3].setText("of 3");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("Your turn ends.");
			}
			else if (attack == 1){
				damage = longsword.roll() + 3;
				Main.label[2].setText("Your attack on the ork failed miserably and you ended up hitting yourself for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack >= 12){
				damage = longsword.roll() + 3;
				Main.label[2].setText("You deal " + damage + " damage plus your strength modifier of 3!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.orkhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack < 12){
				Main.label[2].setText("You miss!");
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			Main.label[5].setText("");
		}
		else if (backroundroll <= 16 && backroundroll > 12){
			Main.label[0].setText("You scream like a mad man while you run at the orc, sword in hand ready to strike");
			Main.label[1].setText("Your attack roll is " + attack + " with a strength modifier of 3 and your proficiency of 3 for a total of " + totalattack + "!");
			if(attack == 20){
				damage = longsword.roll() + longsword.roll() + 3;
				Main.label[2].setText("You deal a critical hit to the ork and hit a vital part of his body, You deal " + damage + " with a strength modifier");
				Main.label[3].setText("of 3");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("Your turn ends.");
			}
			else if (attack == 1){
				damage = longsword.roll() + 3;
				Main.label[2].setText("Your attack on the ork failed miserably and you ended up hitting yourself for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack >= 12){
				damage = longsword.roll() + 3;
				Main.label[2].setText("You deal " + damage + " damage plus your strength modifier of 3!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.orkhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack < 12){
				Main.label[2].setText("You miss!");
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			Main.label[5].setText("");
		}
		else if (backroundroll <= 12 && backroundroll > 8){
			Main.label[0].setText("You ready yourself and wait till you see a opening and than you go in for the blow");
			Main.label[1].setText("Your attack roll is " + attack + " with a strength modifier of 3 and your proficiency of 3 for a total of " + totalattack + "!");
			if(attack == 20){
				damage = longsword.roll() + longsword.roll() + 3;
				Main.label[2].setText("You deal a critical hit to the ork and hit a vital part of his body, You deal " + damage + " with a strength modifier");
				Main.label[3].setText("of 3");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("Your turn ends.");
			}
			else if (attack == 1){
				damage = longsword.roll() + 3;
				Main.label[2].setText("Your attack on the ork failed miserably and you ended up hitting yourself for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack >= 12){
				damage = longsword.roll() + 3;
				Main.label[2].setText("You deal " + damage + " damage plus your strength modifier of 3!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.orkhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack < 12){
				Main.label[2].setText("You miss!");
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			Main.label[5].setText("");
		}
		else if (backroundroll <= 8 && backroundroll > 4){
			Main.label[0].setText("You go to attack but faint your attack half way through and strike at his other side");
			Main.label[1].setText("Your attack roll is " + attack + " with a strength modifier of 3 and your proficiency of 3 for a total of " + totalattack + "!");
			if(attack == 20){
				damage = longsword.roll() + longsword.roll() + 3;
				Main.label[2].setText("You deal a critical hit to the ork and hit a vital part of his body, You deal " + damage + " with a strength modifier");
				Main.label[3].setText("of 3");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("Your turn ends.");
			}
			else if (attack == 1){
				damage = longsword.roll() + 3;
				Main.label[2].setText("Your attack on the ork failed miserably and you ended up hitting yourself for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack >= 12){
				damage = longsword.roll() + 3;
				Main.label[2].setText("You deal " + damage + " damage plus your strength modifier of 3!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.orkhealth = totalhealth;
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			else if (totalattack < 12){
				Main.label[2].setText("You miss!");
				Main.label[3].setText("Your turn ends.");
				Main.label[4].setText("");
			}
			Main.label[5].setText("");
		}
		else if (backroundroll <= 4){
			Main.label[0].setText("You lower your sword slighty down till it points towards the angry ork, he tries to go for the ");
			Main.label[1].setText("attack but you parry his axe and take a swing at his opening");
			Main.label[2].setText("Your attack roll is " + attack + " with a strength modifier of 3 and your proficiency of 3 for a total of " + totalattack + "!");
			if(attack == 20){
				damage = longsword.roll() + longsword.roll() + 3;
				Main.label[3].setText("You deal a critical hit to the ork and hit a vital part of his body, You deal " + damage + " with a strength modifier");
				Main.label[4].setText("of 3");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[5].setText("Your turn ends.");
			}
			else if (attack == 1){
				damage = longsword.roll() + 3;
				Main.label[3].setText("Your attack on the ork failed miserably and you ended up hitting yourself for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[4].setText("Your turn ends.");
				Main.label[5].setText("");
			}
			else if (totalattack >= 12){
				damage = longsword.roll() + 3;
				Main.label[3].setText("You deal " + damage + " damage plus your strength modifier of 3!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("Your turn ends.");
				Main.label[5].setText("");
			}
			else if (totalattack < 12){
				Main.label[3].setText("You miss!");
				Main.label[4].setText("Your turn ends.");
				Main.label[5].setText("");
			}

		}


		button[0].setText("Continue.");
	}
}
