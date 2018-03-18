package main_game;

import javax.swing.JPanel;

public class ork3 extends encounter {
	
	public ork3(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel)
	{
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
		Main.columnpanel.add(button[1]);
		Main.columnpanel.add(button[2]);
		System.out.println(orkEncounter.playerhealth);
		System.out.println(orkEncounter.orkhealth);
		Main.label[0].setText("The ork has " + orkEncounter.orkhealth + " health left!");
		Main.label[1].setText("You have " + orkEncounter.playerhealth + " health left!");
		Main.label[2].setText("You both stagger back, with you breathing heavily from your attack the ork begins to laugh with a");
		Main.label[3].setText("loud deep voice strong enough to vibrate the ground.");
		Main.label[4].setText("The ork spits onto the dirt road and says with a deep chuckle 'Hahaha do you think your small little");
		Main.label[5].setText("sword is going to help you!'");
		Main.label[6].setText("What do you have to say to this jest?");
		Main.button[0].setText("But it will help me gut your insides! (Attack him)");
		Main.button[1].setText("Well that flimsy axe wont do you any good either! (Taunt him)");
		Main.button[2].setText("I wont be needing a sword once your in flames! (Cast a spell at him)");
	}
}
