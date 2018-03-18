package main_game;

import java.util.Scanner;

public class character extends stats {
	stats s = new stats();
	String name;
	String background;
	int speed;
	int amounthitdie = s.level;
	int equpsize;
	int featuresize;
	int hitdice;
	int spellamount;
	int strmod = getmodifier(strength);
	int dexmod = getmodifier(dexterity);
	int conmod = getmodifier(constitution);
	int intmod = getmodifier(intelligence);
	int wismod = getmodifier(wisdom);
	int chamod = getmodifier(charisma);
	String classes;
	String race;
	boolean [][] deathsaves = new boolean[2] [3];
	int proficencybonus;
	boolean [] proficency = new boolean [24];
	String [] equipment = new String [equpsize];
	String [] feature = new String [featuresize];
	String [] weapons = new String [3];
	String [] spells = new String [spellamount];
	int [][] hitdie = new int [amounthitdie] [hitdice];
	boolean activity;
	public void newcharacter(){
		boolean racecheck = false;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your character's name?");
		name = input.nextLine();
		System.out.println("Your character's name is " + name);

		s.statmaker();
		System.out.println("The stats are done");
		
		System.out.println("What is your race?");
		do{
		race = input.nextLine();
		if (race.equalsIgnoreCase("dwarf")){
			race = "Dwarf";
			racecheck = true;
		}

		else if (race.equalsIgnoreCase("elf")){
			race = "elf";
			racecheck = true;
		}

		else if (race.equalsIgnoreCase("halfling")){
			race = "Halfing";
			racecheck = true;
		}
		else if (race.equalsIgnoreCase("human")){
			race = "Human";
			racecheck = true;
		}
		else if (race.equalsIgnoreCase("dragonborn")){
			race = "Dragonborn";
			racecheck = true;
		}
		else if (race.equalsIgnoreCase("gnome")){
			race = "Gnome";
			racecheck = true;
		}

		else if (race.equalsIgnoreCase("half elf")){
			race = "Half-elf";
			racecheck = true;
		}

		else if (race.equalsIgnoreCase("tiefling")){
			race = "Tiefling";
			racecheck = true;
		}
		else{
			System.out.println("Thats not a race in dnd ya dummy");
			racecheck = false;
		}

	}while (racecheck == false);
		System.out.println(name + "'s race is " + race);
		System.out.println("What shall " + name + "'s class be?");
		System.out.println("Barbarian");
		System.out.println("Bard");
		
		System.out.println("Fighter");

	}
	public void existingcharacters(int npcid){
		if(npcid == 0){
			name = "Default";
			background = "Noble";
			s.level = 1;
			speed = 6;
			s.strength = 10;
			s.constitution = 10;
			s.dexterity = 10;
			s.intelligence = 10;
			s.wisdom = 10;
			s.charisma = 10;
			equpsize = 2;
			equipment[0] = "chain mail";
			weapons[1] = "longsword";
			
		}
	}
}
