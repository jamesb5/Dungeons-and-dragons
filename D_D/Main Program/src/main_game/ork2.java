package main_game;

import javax.swing.JPanel;

import Tools.Dice;

public class ork2 {
	 Dice d20 = new Dice(20);
	 Dice axe = new Dice(12);
	public ork2(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel)
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
		int totalattack = attack + 4 + 3;
		int damage;
		int backroundroll = d20.roll();
		if (backroundroll >= 15){
			Main.label[0].setText("The ork attacks back at you furiously!");
			Main.label[1].setText("The ork's attack roll is " + attack + " with a strength modifier of 4 and his proficiency of 3 for a total of " + totalattack + "!");
			if(attack == 20){
				damage = axe.roll() + axe.roll() + 4;
				Main.label[2].setText("The ork deals a critical hit to you and hits a vital part of your body, his hit deals " + damage + " damage with a");
				Main.label[3].setText("strength modifier of 4");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends.");

			}
			else if (attack == 1){
				damage = axe.roll() + 3;
				Main.label[2].setText("The ork in his blind rage and bloodlust forgot he was holding the axe on the blade end causeing his");
				Main.label[3].setText("hands to bleed for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends.");
			}
			else if (attack >= 17){
				damage = axe.roll() + 4;
				Main.label[2].setText("The ork deals " + damage + " damage with a strength modifier of 4!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.playerhealth = totalhealth;
				Main.label[3].setText("The ork's turn ends.");
				Main.label[4].setText("");
			}
			else{
				Main.label[2].setText("The ork misses!");
				Main.label[3].setText("The ork's turn ends");
				Main.label[4].setText("");
			}

			Main.label[5].setText("");
		}
		else if (backroundroll < 15 && backroundroll >= 10){
			Main.label[0].setText("The ork snarls furiously and charges at you!");
			Main.label[1].setText("The ork's attack roll is " + attack + " with a strength modifier of 4 and his proficiency of 3!");
			if(attack == 20){
				damage = axe.roll() + axe.roll() + 4;
				Main.label[2].setText("The ork deals a critical hit to you and hits a vital part of your body, his hit deals " + damage + " damage with a");
				Main.label[3].setText("strength modifier of 4");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends.");
				Main.label[5].setText("");
			}
			else if (attack == 1){
				damage = axe.roll() + 3;
				Main.label[2].setText("The ork in his blind rage and bloodlust forgot he was holding the axe on the blade end causeing his");
				Main.label[3].setText("hands to bleed for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends.");
				Main.label[5].setText("");
			}
			else if (attack >= 17){
				damage = axe.roll() + 4;
				Main.label[2].setText("The ork deals " + damage + " damage with a strength modifier of 4!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.playerhealth = totalhealth;
				Main.label[3].setText("The ork's turn ends");
				Main.label[4].setText("");
				Main.label[5].setText("");
			}
			else{
				Main.label[2].setText("The ork misses!");
				Main.label[3].setText("The ork's turn ends");
				Main.label[4].setText("");
				Main.label[5].setText("");
			}

		}
		else if (backroundroll < 10 && backroundroll >= 5){
			Main.label[0].setText("Foaming from the mouth the ork yells out a war chant and rushes towards you with his axe over ");
			Main.label[1].setText("his head!");
			Main.label[2].setText("The ork's attack roll is " + attack + " with a strength modifier of 4 and his proficiency of 3!");
			if(attack == 20){
				damage = axe.roll() + axe.roll() + 4;
				Main.label[3].setText("The ork deals a critical hit to you and hits a vital part of your body, his hit deals " + damage + " damage with a");
				Main.label[4].setText("strength modifier of 4");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[5].setText("The ork's turn ends.");

			}
			else if (attack == 1){
				damage = axe.roll() + 3;
				Main.label[3].setText("The ork in his blind rage and bloodlust forgot he was holding the axe on the blade end causeing his hands to bleed for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends.");
				Main.label[5].setText("");
			}
			else if (attack >= 17){
				damage = axe.roll() + 4;
				Main.label[3].setText("The ork deals " + damage + " damage with a strength modifier of 4!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.playerhealth = totalhealth;
				Main.label[4].setText("");
				Main.label[5].setText("");
			}
			else{
				Main.label[3].setText("The ork misses!");
				Main.label[4].setText("The ork's turn ends");
				Main.label[5].setText("");
			}

		}
		else if (backroundroll < 5){
			Main.label[0].setText("The green hands gripping on the axe tighten as the ork swings his axe with frightning speed and ");
			Main.label[1].setText("force!");
			Main.label[2].setText("The ork's attack roll is " + attack + " with a strength modifier of 4 and his proficiency of 3!");
			if(attack == 20){
				damage = axe.roll() + axe.roll() + 4;
				Main.label[3].setText("The ork deals a critical hit to you and hits a vital part of your body, his hit deals " + damage + " damage with a");
				Main.label[4].setText("strength modifier of 4");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				orkEncounter.playerhealth = totalhealth;
				Main.label[5].setText("The ork's turn ends.");

			}
			else if (attack == 1){
				damage = axe.roll() + 3;
				Main.label[3].setText("The ork in his blind rage and bloodlust forgot he was holding the axe on the blade end causeing his hands to bleed for " + damage + " damage!");
				int totalhealth = Main.getdamage(damage, orkEncounter.orkhealth);
				orkEncounter.orkhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends.");
				Main.label[5].setText("");
			}
			else if (attack >= 17){
				damage = axe.roll() + 4;
				Main.label[3].setText("The ork deals " + damage + " damage with a strength modifier of 4!");
				int totalhealth = Main.getdamage(damage, orkEncounter.playerhealth);
				System.out.println(totalhealth + " left");
				orkEncounter.playerhealth = totalhealth;
				Main.label[4].setText("The ork's turn ends");
				Main.label[5].setText("");
			}
			else{
				Main.label[3].setText("The ork misses!");
				Main.label[4].setText("The ork's turn ends");
				Main.label[5].setText("");
			}

		}
	}

}
