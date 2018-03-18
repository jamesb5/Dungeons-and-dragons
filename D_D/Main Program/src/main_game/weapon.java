package main_game;

import Tools.Dice;

public class weapon extends character {
boolean finesse;
boolean heavy;
boolean light;
boolean loading;
boolean range;
boolean thrown;
boolean twohanded;
boolean versatile;
Dice damage;
int attackRoll;
	public void longsword(){
		damage = new Dice(8);
		attackRoll = s.strength;
		if (proficency[1] = true){
			
		}
		finesse = false;
		heavy = false;
		light = false;
		loading = false;
		range = false;
		thrown = false;
		twohanded = false;
		versatile = true;
	}
	public void dagger(){
		damage = new Dice(4);
		finesse = true;
		heavy = false;
		light = true;
		loading = false;
		range = false;
		thrown = true;
		twohanded = false;
		versatile = false;
	}
}
