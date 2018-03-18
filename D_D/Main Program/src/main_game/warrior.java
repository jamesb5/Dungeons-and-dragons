package main_game;

import java.util.Scanner;

import Tools.Dice;

/* Warrior class (aka fighter)
 * 1. Martial archetypes are not finished and they probably wont be.
 * 2. Action surge cant be done because turns arent in yet.
 * 3. Increase ability is finished but will need to be changed when the gui is made.
 */
public class warrior {
	stats s = new stats();
	weapon wep = new weapon();
	attacking atk = new attacking();
	savingroll save = new savingroll();
	boolean archery;
	boolean defence;
	boolean dueling;
	boolean greatweapon;
	boolean protection;
	boolean twoweapon;
	boolean secondwind;
	boolean actionsurge;
	boolean actionsurge2;
	boolean advantage;
	boolean disadvantage;
	boolean champion;
	boolean battlemaster;
	boolean eldritchknight;
	boolean improvecrit;
	boolean indomitable;
	boolean indomitable2;
	boolean indomitable3;
	boolean indomitablecheck;
	int extraattack;
	int conmod;
	Dice d10 = new Dice(10);
	public warrior(){
		s.maxhealth = 10 + s.getmodifier(s.constitution);
		s.health = s.maxhealth;
		save.constitution = true;
		save.strength = true;
	}
	public void levelup(){
			s.levelup();
				s.maxhealth = s.maxhealth + 10 + s.getmodifier(s.constitution);
				s.health = s.maxhealth;
				System.out.println("You leveled up to level " + s.level);
				if (s.level == 4){
					incabil();
				}
				else if (s.level == 5){
					extraattack++;
				}
				else if (s.level == 6){
					incabil();
				}
				else if (s.level == 8){
					incabil();
				}
				else if (s.level == 9){
					indomitable = true;
				}
				else if (s.level == 11){
					extraattack++;
				}
				else if (s.level == 12){
					incabil();
				}
				else if (s.level == 13){
					indomitable2 = true;
				}
				else if (s.level == 14){
					incabil();
				}
				else if (s.level == 16){
					incabil();
				}
				else if (s.level == 17){
					actionsurge2 = true;
					indomitable3 = true;
				}
				else if (s.level == 19){
					incabil();
				}
				else if (s.level == 20){
					extraattack++;
				}
				else if (s.level < 5){
					s.proficiency = 2;
				}
				else if (s.level >= 5 && s.level < 9){
					s.proficiency = 3;
				}
				else if (s.level >= 9 && s.level < 13){
					s.proficiency = 4;
				}
				else if (s.level >= 13 && s.level < 17){
					s.proficiency = 5;
				}
				else if(s.level >= 17 && s.level <= 20){
					s.proficiency = 6;
				}
			}
	public void secondwind(){
		if (secondwind = true && s.health < s.maxhealth - 10 - s.level){
			s.health = s.health + 10 + s.level;
			secondwind = false;
		}
	}
	public void actionsurge(){//Finish once turns are implemented
		if (actionsurge = true){
			if (actionsurge2 = true){
				actionsurge = true;
				actionsurge2 = false;
			}
			else if (actionsurge2 = false){
				actionsurge = false;
			}
		}
	}
	public void incabil(){//Finish this once gui happens
		s.extrascore = 2; 
		Scanner input = new Scanner(System.in);
			do{
			System.out.println("What ability do you want to increase?");
			System.out.println("Stength.");
			System.out.println("Constitution.");
			System.out.println("Intelligence");
			System.out.println("Dexterity.");
			System.out.println("Wisdom.");
			System.out.println("Charisma.");
			String choice;
			choice = input.nextLine();
			if (choice.equals("strength")){
				s.strength = s.strength + 1;
				s.extrascore = s.extrascore - 1;
				System.out.println("Strength is increased by 1!");}
			else if (choice.equals("constitution")){
				s.constitution = s.constitution + 1;
				s.extrascore = s.extrascore - 1;
				System.out.println("Constitution is increased by 1!");}
			else if (choice.equals("intelligence")){
				s.constitution = s.constitution + 1;
				s.extrascore = s.extrascore - 1;
				System.out.println("intelligence is increased by 1!");}
			else if (choice.equals("dexterity")){
				s.dexterity = s.dexterity + 1;
				s.extrascore = s.extrascore - 1;
				System.out.println("Dexterity is increased by 1!");}
			else if (choice.equals("wisdom")){
				s.wisdom = s.wisdom + 1;
				s.extrascore = s.extrascore - 1;
				System.out.println("Wisdom is increased by 1!");}
			else if (choice.equals("charisma")){
				s.charisma = s.charisma + 1;
				s.extrascore = s.extrascore - 1;
				System.out.println("Charisma is increased by 1!");}
			}while (s.extrascore > 0);
			input.close();}

	public void indomitable(){
			if (indomitable = true){
				System.out.println("You can use your indomitable ability to reroll!");
			}
		}
	}