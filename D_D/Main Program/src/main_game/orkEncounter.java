package main_game;

import javax.swing.JPanel;

public class orkEncounter extends encounter
{
	static int orkhealth;
	static int playerhealth;
	public orkEncounter(scrollButtons [] button, textLabels[] label, JPanel columnpanel, JPanel columntextpanel)
	{
		Main.columntextpanel.removeAll();
		Main.columntextpanel.add(label[0]);
		Main.columntextpanel.add(label[1]);
		Main.columntextpanel.add(label[2]);
		Main.columntextpanel.add(label[3]);
		Main.columntextpanel.add(label[4]);
		Main.columntextpanel.add(label[5]);
		Main.columntextpanel.add(label[6]);
		Main.columntextpanel.add(label[7]);
		Main.columntextpanel.add(label[8]);
		Main.columntextpanel.add(label[9]);
		Main.columntextpanel.add(label[10]);
		Main.columnpanel.removeAll();
		Main.columnpanel.add(button[0]);
		Main.columnpanel.add(button[1]);
		Main.columnpanel.add(button[2]);
		orkhealth = 20;
		playerhealth = 35;
		label[0].setText("You have been employed by the mayor of a small town that the infamous ork bandit Rak'zul'tan has");
		label[1].setText("been harassing merchants and nobles arriving and leaving the town for valubles. The town guard ");
		label[2].setText("strangely have been ignoring the pleas of the town so the mayor has offered a bounty for the ork's ");
		label[3].setText("head. The reward is more than worth the trip there, plus the fame wouldnt hurt a bit either, so at night");
		label[4].setText("you leave the city with only the essentials such as food, armour and of course your weapon. The road");
		label[5].setText("there was mostly quiet mostly being uneventfull with the odd animal passing by. After many days of ");
		label[6].setText("travelling your keen senses see a large green figure blending in with the scenery. He seemed to have ");
		label[7].setText("noticed this and begins to step out of the shrubery carrying a bloody axe. 'Stop right there if you");
		label[8].setText("value your life human, now here is how this is going to go, your going to hand over your gold and");
		label[9].setText("silver and I wont have to hack your neck off, how do we say to that?'");
		button[0].setText("Call his bluff and draw your sword! (Attack the Ork)");
		button[1].setText("Scrounge up what silver and copper you have and hope he is in a good mood (Persuade him)");
		button[2].setText("Run Away and hope hes a slow runner!"); 
	}
}
