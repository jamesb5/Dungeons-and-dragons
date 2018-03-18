package main_game;

import javax.swing.JPanel;

public class ork4 {
	public ork4(scrollButtons [] button, textLabels[] label, JPanel cloumnpanel, JPanel cloumntextpanel)
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
		Main.label[0].setText("The ork's movement starts to slow. Its screaming and growls have soften to whimpers as");
		Main.label[1].setText("it falls to its knees and succombs to its wounds. You have freed the town's main road from this ork");
		Main.label[2].setText("and have avenged travelers and merchants who have fell to him");
		Main.label[3].setText("When you return to town the town's inhabitants celebrate your victory! They shower you with praise");
		Main.label[4].setText("and cheer, as you meet the town mayor he gives a large sack of gold for a job well done!");
		Main.label[5].setText("When you retire back to your hotel room, free of charge aswell, you soon fall into sleep after a");
		Main.label[6].setText("rough and tireing day.");
	}
}
