package main_game;

import javax.swing.JPanel;

public class ork5 {
	public ork5(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel){
		Main.columntextpanel.removeAll();
		Main.columntextpanel.add(label[0]);
		Main.columntextpanel.add(label[1]);
		Main.columntextpanel.add(label[2]);
		Main.columntextpanel.add(label[3]);
		Main.columntextpanel.add(label[4]);
		Main.columnpanel.removeAll();
		Main.columnpanel.add(button[0]);
		Main.columnpanel.add(button[1]);
		Main.columnpanel.add(button[2]);
		Main.label[0].setText("The ork has " + orkEncounter.orkhealth + " health left!");
		Main.label[1].setText("You have " + orkEncounter.playerhealth + " health left!");
		Main.label[2].setText("The ork is begining to look tired, he growls and locks eyes with you. The ork begins to speak ");
		Main.label[3].setText("'You are definetly a better challange than those snobby merchants and nobles that go through here.");
		Main.label[4].setText("And good thing, this job was getting pretty boring, now time for some fun!'");
		Main.button[0].setText("Oh we are gonna be having fun alright! (Attack him)");
		Main.button[1].setText("A job? Dont tell me you do this for a living!? (persuade him)");
		Main.button[2].setText("Your gonna be wishing you attacked some random noble once your in ashes! (Cast a spell)");
	}
}
