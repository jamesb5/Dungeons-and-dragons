package main_game;

import javax.swing.JPanel;

public class defaultEncounter extends encounter
{
	
	public defaultEncounter(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel)
	{
		Main.columntextpanel.removeAll();
		Main.columntextpanel.add(label[0]);
		Main.columnpanel.removeAll();
		Main.columnpanel.add(button[0]);
		Main.columnpanel.add(button[1]);
		Main.columnpanel.add(button[2]);
		
		label[0].setText("Welcome, " + Main.user + " to D&D");
		
		button[0].setText("This is where you will choose what do to upon an encounter");
		button[1].setText("The Ork encounter");
		button[2].setText("The Goblin encounter");
	}
}
