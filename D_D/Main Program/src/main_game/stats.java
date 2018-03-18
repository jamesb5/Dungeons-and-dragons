package main_game;

import java.util.Arrays;
import java.util.Scanner;

import Tools.Dice;

public class stats {
	int strength;
	int level;
	int constitution;
	int dexterity;
	int intelligence;
	int wisdom;
	int charisma;
	int armour;
	Dice d6 = new Dice(6);	
	Dice d20 = new Dice(20);
	public void statmaker(){
		boolean statrollcheck = false;
		int [] first = new int[4];
		int [] second = new int[4];
		int [] third = new int[4];
		int [] fourth = new int [4];
		int [] fivth = new int [4];
		int [] sixth = new int [4];
		int firstabilscore;
		int secondabilscore;
		int thirdabilscore;
		int fourthabilscore;
		int fivthabilscore;
		int sixthabilscore;
		boolean [] abilityset = {true, true, true, true, true, true};
		int abilityturn = 1;
		int abilityuse = 0;
		int i;
		do{
		do{
		for (i = 0; i < 4; i++){
			
			first[i] = d6.roll();
			second[i] = d6.roll();
			third[i] = d6.roll();
			fourth[i] = d6.roll();
			fivth[i] = d6.roll();
			sixth[i] = d6.roll();
			
		}
		
		Arrays.sort(first);
		firstabilscore = first[1] + first[2] + first[3];

		
		Arrays.sort(second);
		secondabilscore = second[1] + second[2] + second[3];

		
		Arrays.sort(third);
		thirdabilscore = third[1] + third[2] + third[3];

		
		Arrays.sort(fourth);
		fourthabilscore = fourth[1] + fourth[2] + fourth[3];

		
		Arrays.sort(fivth);
		fivthabilscore = fivth[1] + fivth[2] + fivth[3];

		
		Arrays.sort(sixth);
		sixthabilscore = sixth[1] + sixth[2] + sixth[3];

		}while(firstabilscore < 13 && secondabilscore < 13 && thirdabilscore < 13 && fourthabilscore < 13 && fivthabilscore < 13 && sixthabilscore < 13);
		System.out.println("Your first ability score is " + firstabilscore);
		System.out.println("Your second ability score is " + secondabilscore);
		System.out.println("Your third ability score is " + thirdabilscore);
		System.out.println("Your fourth ability score is " + fourthabilscore);
		System.out.println("Your fivth ability score is " + fivthabilscore);
		System.out.println("Your sixth ability score is " + sixthabilscore);
		Scanner input = new Scanner(System.in);
		System.out.println("Do you wish to reroll?");
		System.out.println("Yes or No?");
		String rerollchoise;
		rerollchoise = input.nextLine();
		if (rerollchoise.equalsIgnoreCase("yes")){
			System.out.println("You reroll your stats!");
			statrollcheck = false;
		}
		else if (rerollchoise.equalsIgnoreCase("no")){
			System.out.println("You may choose where to put your stats in");
			statrollcheck = true;
		}
		}while (statrollcheck == false);

		do{
		Scanner abilityinput = new Scanner(System.in);
		if (abilityturn == 1){
			System.out.println("Choose what stat to put your first ability score in (" + firstabilscore + ")");
			abilityuse = firstabilscore;
		}
		else if (abilityturn == 2){
			System.out.println("Choose what stat to put your second ability score in (" + secondabilscore + ")");
			abilityuse = secondabilscore;
		}
		else if (abilityturn == 3){
			System.out.println("Choose what stat to put your third ability score in (" + thirdabilscore + ")");
			abilityuse = thirdabilscore;
		}
		else if (abilityturn == 4){
			System.out.println("Choose what stat to put your fourth ability score in (" + fourthabilscore + ")");
			abilityuse = fourthabilscore;
		}
		else if (abilityturn == 5){
			System.out.println("Choose what stat to put your fivth ability score in (" + fivthabilscore + ")");
			abilityuse = fivthabilscore;
		}
		else if (abilityturn == 6){
			System.out.println("Choose what stat to put your sixth ability score in (" + sixthabilscore + ")");
			abilityuse = sixthabilscore;
		}
		System.out.println("str, dex, con, int, wis, cha.");
		String choise;
		choise = abilityinput.nextLine();
		if (choise.equalsIgnoreCase("str") && abilityset[0] == true){
			strength = abilityuse;
			System.out.println("Your Strength is now " + abilityuse);
			abilityset[0] = false;
			abilityturn++;
		}
		else if (choise.equalsIgnoreCase("str") && abilityset[0] == false){
			System.out.println("You have already choosen this ability");
		}
		if (choise.equalsIgnoreCase("dex") && abilityset[1] == true){
			dexterity = abilityuse;
			System.out.println("Your Dexterity is now " + abilityuse);
			abilityset[1] = false;
			abilityturn++;
		}
		else if (choise.equalsIgnoreCase("dex") && abilityset[1] == false){
			System.out.println("You have already choosen this ability");
		}
		if (choise.equalsIgnoreCase("con") && abilityset[2] == true){
			constitution = abilityuse;
			System.out.println("Your Constitution is now " + abilityuse);
			abilityset[2] = false;
			abilityturn++;
		}
		else if (choise.equalsIgnoreCase("con") && abilityset[2] == false){
			System.out.println("You have already choosen this ability");
		}
		if (choise.equalsIgnoreCase("int") && abilityset[3] == true){
			intelligence = abilityuse;
			System.out.println("Your Intelligence is now " + abilityuse);
			abilityset[3] = false;
			abilityturn++;
		}
		else if (choise.equalsIgnoreCase("int") && abilityset[3] == false){
			System.out.println("You have already choosen this ability");
		}
		if (choise.equalsIgnoreCase("wis") && abilityset[4] == true){
			wisdom = abilityuse;
			System.out.println("Your Wisdom is now " + abilityuse);
			abilityset[4] = false;
			abilityturn++;
		}
		else if (choise.equalsIgnoreCase("wis") && abilityset[4] == false){
			System.out.println("You have already choosen this ability");
		}
		if (choise.equalsIgnoreCase("cha") && abilityset[5] == true){
			charisma = abilityuse;
			System.out.println("Your Charisma is now " + abilityuse);
			abilityset[5] = false;
			abilityturn++;
		}
		else if (choise.equalsIgnoreCase("cha") && abilityset[5] == false){
			System.out.println("You have already choosen this ability");
		}
		}while (abilityturn < 7);
		}
	
	public int getmodifier(int value){
		
		int mod = 0;
		
		if (value == 1){
			mod = -5;
		}
		else if (value >= 2 && value <= 3){
			mod = -4;
		}
		else if (value >= 4 && value <= 5){
			mod = -3;
		}
		else if (value >= 6 && value <= 7){
			mod = -2;
		}
		else if (value >= 8 && value <= 9){
			mod = -1;
		}
		else if (value >= 10 && value <= 11){
			mod = 0;
		}
		else if (value >= 12 && value <= 13){
			mod = 1;
		}
		else if (value >= 14 && value <= 15){
			mod = 2;
		}
		else if (value >= 16 && value <= 17){
			mod = 3;
		}
		else if (value >= 18 && value <= 19){
			mod = 4;
		}
		else if (value >= 20 && value <= 21){
			mod = 5;
		}
		else if (value >= 22 && value <= 23){
			mod = 6;
		}
		else if (value >= 24 && value <= 25){
			mod = 7;
		}
		else if (value >= 26 && value <= 27){
			mod = 8;
		}
		else if (value >= 28 && value <= 29){
			mod = 9;
		}
		else if (value >= 30 && value <= 31){
			mod = 10;
		}
		return mod;
	}
	
	public int levelup(){
		return level++;
	}
	public void setstr(int value){
		strength = value;
		constitution = value;
		dexterity = value;
		intelligence = value;
		charisma = value;
		wisdom = value;
	}	
}
	
