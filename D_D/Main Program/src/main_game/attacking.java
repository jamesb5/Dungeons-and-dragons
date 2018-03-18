package main_game;

import Tools.Dice;

public class attacking {
	stats s = new stats();
	rouge rou = new rouge();
	savingroll save = new savingroll();
	boolean advantage;
	boolean disadvantage;
	int advroll;
	int disadvroll;
	
	public int meleeroll(boolean finesse){
		if (finesse){
			if (save.dexterity = true){
				return s.d20.roll() + s.getmodifier(s.dexterity) + s.getmodifier(s.dexterity);
			}
			else{
			return s.d20.roll() + s.getmodifier(s.dexterity);
			}
		}
		else{
			if(save.strength = true){
				return s.d20.roll() + s.getmodifier(s.strength) + s.getmodifier(s.strength);
			}
			else{
			return s.d20.roll() + s.getmodifier(s.strength);
			}
		}
	}
	
	public int meleedamage(weapon weapdamage, boolean finesse){
		if (finesse){
			return weapdamage.damage.roll() + s.getmodifier(s.dexterity);
		}
		else{
			return weapdamage.damage.roll() + s.getmodifier(s.strength);
		}
	}
	
	public int critmeleedamage(weapon weapdamage, boolean finesse){
		if (finesse){
			return weapdamage.damage.roll() + weapdamage.damage.roll() + s.getmodifier(s.dexterity);
		}
		else{
			return weapdamage.damage.roll() + weapdamage.damage.roll() + s.getmodifier(s.strength);
		}
	}

	public void attack(int extra, boolean greatweap, boolean sneakatk, weapon wep){
		int numbatk = extra;
		boolean advcheck = true;
		do{
		int mainattack = meleeroll(wep.finesse);
		if (advantage == true){
			int advroll = meleeroll(wep.finesse);
			advcheck = true;
			System.out.println("You rolled a advantage roll of " + advroll);
			if (advroll >= mainattack){
				System.out.println("Your advantage roll of " + advroll + " is more than " + mainattack);
				mainattack = advroll;
				System.out.println("Your attack roll changes to  " + mainattack);
				advantage = false;
			}
			else{
				System.out.println("Your advantage roll of " + advroll + " is less than " + mainattack);
				System.out.println("Your attack roll stays the same as " + mainattack);
				advantage = false;
			}
		}
		else if (disadvantage == true){
			int disadvroll = meleeroll(wep.finesse);
			System.out.println("You rolled a disadvantage roll of " + disadvroll);
			if (disadvroll <= mainattack){
				System.out.println("Your disadvantage roll of " + disadvroll + " is less than " + mainattack);
				mainattack = disadvroll;
				System.out.println("Your attack roll changes to  " + mainattack);
				disadvantage = false;
			}
			else{
				System.out.println("Your disadvantage roll of " + disadvroll + " is more than " + mainattack);
				System.out.println("Your attack roll stays the same as " + mainattack);
				disadvantage = false;
			}
		}
		if (extra != numbatk){
			mainattack = mainattack - s.getmodifier(s.strength);
			}	
		if (mainattack >= 20){
			System.out.println("You roll a " + mainattack + " and make a critical hit!");
			int criticaldamage = critmeleedamage(wep,wep.finesse);
			System.out.println("Your critical hit does damage for " + criticaldamage + " hit points");
		}
		else if (mainattack >= 10){
			System.out.println("You roll a " + mainattack + " and make a hit!");
			int maindamage = meleedamage(wep,wep.finesse);
			if (sneakatk == true && advcheck == true){
				int sneakdamage = s.d6.roll();
				maindamage = maindamage + sneakdamage;
				System.out.println("You make a sneak attack for " + sneakdamage + " extra damage!");
			}
			if (greatweap == true){
				if(wep.twohanded == true){
					if (maindamage >= 1 && maindamage < 3){
						maindamage = meleedamage(wep,wep.finesse);
						System.out.println("You reroll your attack to " + maindamage);
					}
				}
			}
			System.out.println("You hit for " + maindamage + " hit points");
		}
		else if (mainattack < 10){
			System.out.println("You miss your attack!");
			}
		//System.out.println(numbatk);
		numbatk--;
		}while (numbatk > 0);
	}
}
