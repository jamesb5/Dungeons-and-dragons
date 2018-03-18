package main_game;

import javax.swing.JPanel;

public class goblinEncounter
{
	
	public  goblinEncounter(scrollButtons [] button, textLabels[] label,  JPanel cloumnpanel, JPanel cloumntextpanel)
	{
		encounter.encounterID = 2;
		encounter.buttonamount = 4;
		encounter.textamount = 1;
		
		label[0].setText("You encounter a huge ork brandishing a bloody axe");
		
		button[0].setText("Attack the Goblin");
		button[1].setText("Bribe the Goblin");
		button[2].setText("Run Away");
		button[3].setText("Do a Flip!");
		
	}

}
