package main_game;

import javax.swing.JPanel;

public class ork7 {
	public ork7(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel){
		Main.columntextpanel.removeAll();
		Main.columntextpanel.add(label[0]);
		Main.columntextpanel.add(label[1]);
		Main.columntextpanel.add(label[2]);
		Main.columntextpanel.add(label[3]);
		Main.columntextpanel.add(label[4]);
		Main.columntextpanel.add(label[5]);
		Main.columntextpanel.add(label[6]);
		Main.columnpanel.removeAll();
		Main.columnpanel.add(button[0]);
		Main.label[0].setText("The ork has " + orkEncounter.orkhealth + " health left!");
		Main.label[1].setText("You have " + orkEncounter.playerhealth + " health left!");
		Main.label[2].setText("The moment you look at Rak'zul'tan you see blood across his face, either from you or him or most ");
		Main.label[3].setText("likely both. The only reason he hasnt fallen over and died is his sheer determination to kill you or");
		Main.label[4].setText("adrenaline. Mostly the latter. He growls silently and begins to warn you 'If you think your gonna ");
		Main.label[5].setText("just lop my head off, take your money and leave, you got another thing coming you so called hero'.");
		Main.label[6].setText("He gets into his stance despite barely being able to stand, 'Show me what you got human!'");
		Main.button[0].setText("It's gonna feel good taking your head off and getting that money! (attack him)");
	}
}
