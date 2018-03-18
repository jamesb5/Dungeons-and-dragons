package Tools;

import java.util.Random;

public class Dice {

	int Dicevalue;
	
	public Dice(int value){
		Dicevalue = value;
	}
	
	public void setvalue(int value){
		
		Dicevalue = value;
		
	}
	public int roll(){
		Random rand = new Random();
		
		return rand.nextInt(Dicevalue) + 1;
	}
		
}
