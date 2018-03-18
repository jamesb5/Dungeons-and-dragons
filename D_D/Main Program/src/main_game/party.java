package main_game;

public class party {
	character character = new character();
	public party(){
		
	}
	
	
	
	boolean [] memb = new boolean[5];
	character [] players = new character[5];
	public void newpartymembers(int numparty){
	numparty = numparty++;
	if (numparty == 1){
		memb[0] = true;
		memb[1] = false;
		memb[2] = false;
		memb[3] = false;
		memb[4] = false;
		memb[5] = false;
	}
	if (numparty == 2){
		memb[0] = true;
		memb[1] = true;
		memb[2] = false;
		memb[3] = false;
		memb[4] = false;
		memb[5] = false;
	}
	if (numparty == 3){
		memb[0] = true;
		memb[1] = true;
		memb[2] = true;
		memb[3] = false;
		memb[4] = false;
		memb[5] = false;
	}
	if (numparty == 4){
		memb[0] = true;
		memb[1] = true;
		memb[2] = true;
		memb[3] = true;
		memb[4] = false;
		memb[5] = false;
	}
	if (numparty == 5){
		memb[0] = true;
		memb[1] = true;
		memb[2] = true;
		memb[3] = true;
		memb[4] = true;
		memb[5] = false;
	}
	if (numparty == 6){
		memb[0] = true;
		memb[1] = true;
		memb[2] = true;
		memb[3] = true;
		memb[4] = true;
		memb[5] = true;
	}
	}
}
	

