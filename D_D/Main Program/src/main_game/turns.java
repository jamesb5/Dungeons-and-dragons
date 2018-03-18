package main_game;

import java.util.Arrays;

import Tools.Dice;

public class turns {
	int character;
	Dice d20 = new Dice(20);
	public void rollforinititive(){
	 int [] turn = new int [character];
	 int i;
	 for (i = 0; i < character; i++){
		 turn[i] = d20.roll();
	 }
	 
	 Arrays.sort(turn);
	 if (character >= 1){
		 
	 }
	 
	 
	}
}
