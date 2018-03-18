package main_game;

import java.util.Arrays;

import Tools.Dice;

public class initiative {
	
	Dice d20 = new Dice(20);
	public void rollforinit(int characters, String [] names){
		int [] init = new int[characters];
		int i;

		for(i = 0; i < characters; i++){
			init[i] = d20.roll();
		}

		if (characters == 1){
			names[0] = "Thorny";
			System.out.println(names[0] + " rolled a " + init[0] + " for initiative");
		}
		if (characters == 2){
			int hero = init[0];
			int goblin = init[1];
			System.out.println(names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println(names[1] + " rolled a " + init[1] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[1] + " is the most initative");
			if (hero == init[characters - 1]){
				System.out.println(names[0] + " goes first!");
			}
			if (goblin == init[characters - 1]){
				System.out.println(names[1] + " goes first!");
			}
		}
		if (characters == 3){
			int warrior = init[0];
			int healer = init[1];
			int enemy = init[2];
			System.out.println(names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println("The" + names[1] + " rolled a " + init[1] + " for initiative");
			System.out.println("The" + names[2] + " rolled a " + init[2] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[characters - 1] + " is the most initative");
			if (warrior == init[characters - 1]){
				System.out.println("The " + names[0] + " goes first");
			}
			if (healer == init[characters - 1]){
				System.out.println("The " + names[1] + " goes first");
			}
			if (enemy == init[characters - 1]){
				System.out.println("The " + names[2] + " goes first");
			}
		}
		if (characters == 4){
			int warrior = init[0];
			int healer = init[1];
			int rouge = init[2];
			int enemy = init[3];
			System.out.println("The " + names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println("The " + names[1] + " rolled a " + init[1] + " for initiative");
			System.out.println("The " + names[2] + " rolled a " + init[2] + " for initiative");
			System.out.println("The " + names[3] + " rolled a " + init[3] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[characters - 1] + " is the most initative");
			if (warrior == init[characters - 1]){
				System.out.println("The " + names[0] + " goes first");
			}
			if (healer == init[characters - 1]){
				System.out.println("The " + names[1] + " goes first");
			}
			if (rouge == init[characters - 1]){
				System.out.println("The " + names[2] + " goes first");
			}
			if (enemy == init[characters - 1]){
				System.out.println("The " + names[3] + " goes first");
			}
			
		}
		if (characters == 5){
			int first = init[0];
			int second = init[1];
			int third = init[2];
			int fourth = init[3];
			int fith = init [4];
			System.out.println("The " + names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println("The " + names[1] + " rolled a " + init[1] + " for initiative");
			System.out.println("The " + names[2] + " rolled a " + init[2] + " for initiative");
			System.out.println("The " + names[3] + " rolled a " + init[3] + " for initiative");
			System.out.println("The " + names[4] + " rolled a " + init[4] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[characters - 1] + " is the most initative");
			if (first == init[characters - 1]){
				System.out.println(names[0] + " goes first");
			}
			if (second == init[characters - 1]){
				System.out.println("The " + names[1] + " goes first");
			}
			if (third == init[characters - 1]){
				System.out.println("The " + names[2] + " goes first");
			}
			if (fourth == init[characters - 1]){
				System.out.println("The " + names[3] + " goes first");
			}
			if (fith == init[characters - 1]){
				System.out.println("The " + names[4] + " goes first");
			}
		}
		if (characters == 6){
			int first = init[0];
			int second = init[1];
			int third = init[2];
			int fourth = init[3];
			int fith = init [4];
			int sixth = init [5];
			System.out.println("The " + names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println("The " + names[1] + " rolled a " + init[1] + " for initiative");
			System.out.println("The " + names[2] + " rolled a " + init[2] + " for initiative");
			System.out.println("The " + names[3] + " rolled a " + init[3] + " for initiative");
			System.out.println("The " + names[4] + " rolled a " + init[4] + " for initiative");
			System.out.println("The " + names[5] + " rolled a " + init[5] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[characters - 1] + " is the most initative");
			if (first == init[characters - 1]){
				System.out.println(names[0] + " goes first");
			}
			if (second == init[characters - 1]){
				System.out.println("The " + names[1] + " goes first");
			}
			if (third == init[characters - 1]){
				System.out.println("The " + names[2] + " goes first");
			}
			if (fourth == init[characters - 1]){
					System.out.println("The " + names[3] + " goes first");
			}
			if (fith == init[characters - 1]){
				System.out.println("The " + names[4] + " goes first");
			}
			if (sixth == init[characters - 1]){
				System.out.println("The " + names[5] + " goes first");
			}
		}
		if (characters == 7){
			int first = init[0];
			int second = init[1];
			int third = init[2];
			int fourth = init[3];
			int fith = init [4];
			int sixth = init [5];			
			int seventh = init [6];
			System.out.println("The " + names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println("The " + names[1] + " rolled a " + init[1] + " for initiative");
			System.out.println("The " + names[2] + " rolled a " + init[2] + " for initiative");
			System.out.println("The " + names[3] + " rolled a " + init[3] + " for initiative");
			System.out.println("The " + names[4] + " rolled a " + init[4] + " for initiative");
			System.out.println("The " + names[5] + " rolled a " + init[5] + " for initiative");
			System.out.println("The " + names[6] + " rolled a " + init[6] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[characters - 1] + " is the most initative");
			if (first == init[characters - 1]){
				System.out.println(names[0] + " goes first");
			}
			if (second == init[characters - 1]){
				System.out.println("The " + names[1] + " goes first");
			}
			if (third == init[characters - 1]){
				System.out.println("The " + names[2] + " goes first");
			}
			if (fourth == init[characters - 1]){
				System.out.println("The " + names[3] + " goes first");
			}
			if (fith == init[characters - 1]){
				System.out.println("The " + names[4] + " goes first");
			}
			if (sixth == init[characters - 1]){
				System.out.println("The " + names[5] + " goes first");
			}
			if (seventh == init[characters - 1]){
				System.out.println("The " + names[6] + " goes first");
			}
		}
		if (characters == 8){
			int first = init[0];
			int second = init[1];
			int third = init[2];
			int fourth = init[3];
			int fith = init [4];
			int sixth = init [5];			
			int seventh = init [6];
			int eighth = init [7];
			System.out.println("The " + names[0] + " rolled a " + init[0] + " for initiative");
			System.out.println("The " + names[1] + " rolled a " + init[1] + " for initiative");
			System.out.println("The " + names[2] + " rolled a " + init[2] + " for initiative");
			System.out.println("The " + names[3] + " rolled a " + init[3] + " for initiative");
			System.out.println("The " + names[4] + " rolled a " + init[4] + " for initiative");
			System.out.println("The " + names[5] + " rolled a " + init[5] + " for initiative");
			System.out.println("The " + names[6] + " rolled a " + init[6] + " for initiative");
			System.out.println("The " + names[7] + " rolled a " + init[7] + " for initiative");
			Arrays.sort(init);
			System.out.println(init[characters - 1] + " is the most initative");
			if (first == init[characters - 1]){
				System.out.println("The " + names[0] + " goes first");
			}
			if (second == init[characters - 1]){
				System.out.println("The " + names[1] + " goes first");
			}
			if (third == init[characters - 1]){
				System.out.println("The " + names[2] + " goes first");
			}
			if (fourth == init[characters - 1]){
				System.out.println("The " + names[3] + " goes first");
			}
			if (fith == init[characters - 1]){
				System.out.println("The " + names[4] + " goes first");
			}
			if (sixth == init[characters - 1]){
				System.out.println("The " + names[5] + " goes first");
			}
			if (seventh == init[characters - 1]){
				System.out.println("The " + names[6] + " goes first");
			}
			if (eighth == init[characters - 1]){
				System.out.println("The " + names[7] + " goes first");
			}
		}
	}
	
}
