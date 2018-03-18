package main_game;

import javax.swing.JPanel;

public class ork6 {
	public ork6(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel){
		Main.columntextpanel.removeAll();
		Main.columntextpanel.add(label[0]);
		Main.columntextpanel.add(label[1]);
		Main.columntextpanel.add(label[2]);
		Main.columntextpanel.add(label[3]);
		Main.columntextpanel.add(label[4]);
		Main.columnpanel.removeAll();
		Main.columnpanel.add(button[0]);
		Main.label[0].setText("The ork has " + orkEncounter.orkhealth + " health left!");
		Main.label[1].setText("You have " + orkEncounter.playerhealth + " health left!");
		Main.label[2].setText("The both of you are now drenched in sweat in a standoff only 10 feet from eachother, the ork yells");
		Main.label[3].setText("out and beats his chest while screaming out some nonsense you cant seem to comprehend. The ork");
		Main.label[4].setText("threatens 'Your head will make a fine addition to my collection!'");
		Main.button[0].setText("Not this time, and this time you wont escape! (attack him)");
	}
}
