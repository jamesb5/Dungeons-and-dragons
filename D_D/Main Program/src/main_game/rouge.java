package main_game;

import java.util.Scanner;

public class rouge {
	stats s = new stats();
	skills skill = new skills();
	weapon wep = new weapon();
	boolean thievestool;
	boolean sneakattack;
	boolean theivescant;
	public rouge(){
		s.maxhealth = 8 + s.getmodifier(s.constitution);
		s.health = s.maxhealth;
	}
	public void levelup(){
		s.levelup();
		s.maxhealth = s.maxhealth + 8 + s.getmodifier(s.constitution);
		s.health = s.maxhealth;
		System.out.println("You leveled up to level " + s.level);
		if (s.level == 1){
			expertise();
			sneakattack = true;
			theivescant = true;
		}
	}
	public void expertise(){
		Scanner input = new Scanner(System.in);
		System.out.println("Choose your proficiencies or your thieves tool skill.");
		System.out.println("Acrobatics.");
		System.out.println("Athletics.");
		System.out.println("Deception.");
		System.out.println("Insight.");
		System.out.println("Intimidation.");
		System.out.println("Investigation.");
		System.out.println("Perception.");
		System.out.println("Performance.");
		System.out.println("Persuasion.");
		System.out.println("Slightofhand.");
		System.out.println("Stealth.");
		String choice;
		choice = input.nextLine();
		if (choice.equals("acrobatics")){
			skill.acrobatics = true;
			System.out.println("You now have the 'Acrobatics' skill!");}
		else if (choice.equals("athletics")){
			skill.athletics = true;
			System.out.println("You now have the 'Athletics' skill!");}
		else if (choice.equals("deception")){
			skill.deception = true;
			System.out.println("You now have the 'Deception' skill!");}
		else if (choice.equals("insight")){
			skill.insight = true;
			System.out.println("You now have the 'Insight' skill!");}
		else if (choice.equals("intimidation")){
			skill.intimidation = true;
			System.out.println("You now have the 'Intimidation' skill!");}
		else if (choice.equals("investigation")){
			skill.investigation = true;
			System.out.println("You now have the 'Investigation' skill!");}
		else if (choice.equals("perception")){
			skill.perception = true;
			System.out.println("You now have the 'Perception' skill!");}
		else if (choice.equals("performance")){
			skill.performance = true;
			System.out.println("You now have the 'Performance' skill!");}
		else if (choice.equals("persuasion")){
			skill.persuasion = true;
			System.out.println("You now have the 'Persuasion' skill!");}
		else if (choice.equals("slightofhand")){
			skill.slightofhand = true;
			System.out.println("You now have the 'Slight of hand' skill!");}
		else if (choice.equals("stealth")){
			skill.stealth = true;
			System.out.println("You now have the 'Stealth' skill!");}
		input.close();
		}
}
		

