package main_game;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

import Tools.Dice;

/**
 * @author student
 * @version 0.002
 *
 */
public class Main {
	
	
	
	static JFrame mainScreen = new JFrame("D&D");
	static JPanel mainScreenPanel = new JPanel();
	static JLabel l = new JLabel();
	static JLabel sp = new JLabel();
	static JLabel startLBL = new JLabel();
	static JButton mapBTN = new JButton("MAP");
	static JButton partyBTN = new JButton("PARTY");
	static JButton journalBTN = new JButton("JOURNAL");
	static JButton settingsBTN = new JButton("");
	static JButton easter_eggBTN = new JButton("");
	static RoundJTextField name = new RoundJTextField();
	
	public static partyScreen party = new partyScreen();
	public static mapScreen map = new mapScreen();
	public static journalScreen journal = new journalScreen();
	
	
	static ImageIcon settings = new ImageIcon("settings.png");
	static ImageIcon sword = new ImageIcon("sword.png");
	static ImageIcon easter_egg = new ImageIcon("easter_egg.png");
	static ImageIcon easter_egg2 = new ImageIcon("easter_egg2.png");
	static ImageIcon swordClicked = new ImageIcon("swordClicked.png");
	static Color yellow = new Color(210,200,0);
	static Color white = new Color(255,255,255);
	static int clicked1 = 0;
	static JScrollPane scrollPane = new JScrollPane();
	static JPanel borderlaoutpanel = new JPanel();
	static JPanel columnpanel = new JPanel();
	static JScrollPane scrollTextPane = new JScrollPane();
	static JPanel borderlaouttextpanel = new JPanel();
	static JPanel columntextpanel = new JPanel();
	
	static scrollButtons[] button = new scrollButtons [encounter.buttonamount];
    static textLabels[] label = new textLabels[encounter.textamount];
	
	
	public static void main(String args[])
	{
		frameSettings();
		start();
		method();
		pane();
		buttonsAndLabels();	
		encounterSelector();
	}
		
	public static void encounterSelector()
	{
		if(encounter.encounterID == 0)
		{
			defaultEncounter e = new defaultEncounter(button, label, borderlaoutpanel, borderlaoutpanel);
		}
		if(encounter.encounterID == 1)
		{
			orkEncounter e = new orkEncounter(button, label, borderlaoutpanel, borderlaoutpanel);
		}
		if(encounter.encounterID == 2)
		{
			goblinEncounter e = new goblinEncounter(button, label, borderlaoutpanel, borderlaoutpanel);
		}
		
	}
	
	public static void start()
	{
		 scrollPane.setVisible(false);
		
	}

	public static void buttonsAndLabels()
	{
	 
	   for(int i = 0; i < encounter.buttonamount;i++) 
	   {
		  
		   button[i] = new scrollButtons();
		   button[i].setBorder(null);
		   button[i].setForeground(white);
		   button[i].setFont(new Font("Times New Roman", Font.PLAIN, 17));
		   button[i].setHorizontalTextPosition(JButton.RIGHT);
		   button[i].setVerticalTextPosition(JButton.CENTER);
		   button[i].setOpaque(false);
		   button[i].setContentAreaFilled(false);
		   button[i].setBorderPainted(false);
		   button[i].setFocusPainted(false);
 
		   columnpanel.add(button[i]);
  
		   //System.out.println("Sucesss. I: " + i + " Button Amount: " + encounter.buttonamount);
	   }
	   
	   for(int x = 0; x < encounter.textamount;x++) 
	   {
        	label[x] = new textLabels();
        	//label[x].setBorder(null);
        	label[x].setForeground(white);
     		label[x].setFont(new Font("Times New Roman", Font.PLAIN, 17));
     		label[x].setOpaque(false);
     		//label[x].setContentAreaFilled(false);
     		//label[x].setBorderPainted(false);
     		//label[x].setFocusPainted(false);
     	
     
     		columntextpanel.add(label[x]);
      
     	
     	}
 	   
	   	mainScreen.hide();
	   	mainScreen.show();

	  // 	encounter.encounterSelector(button, label);

		}
	
	public static void pane() 
	{
	     	//input
	        scrollPane.setBounds(193, 485, 689, 233);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setBorder(null);
	       
	        mainScreen.add(scrollPane);
	        
	        scrollPane.setViewportView(borderlaoutpanel);
	        borderlaoutpanel.setBackground(Color.black);
	        borderlaoutpanel.setLayout(new BorderLayout(0, 0));

	        borderlaoutpanel.add(columnpanel, BorderLayout.NORTH);
	        columnpanel.setLayout(new GridLayout(0, 1, 0, 1));
	        columnpanel.setBackground(Color.black);
	       
	        ////////////////////////////////////////////////////////////////////////////////////////////
	        
	        //output
	        scrollTextPane.setBounds(193, 35, 689, 413);
	        scrollTextPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scrollTextPane.setBorder(null);
	        mainScreen.add(scrollTextPane);
	        
	        scrollTextPane.setViewportView(borderlaouttextpanel);
	        borderlaouttextpanel.setBackground(Color.black);
	        borderlaouttextpanel.setLayout(new BorderLayout(0, 0));

	        borderlaouttextpanel.add(columntextpanel, BorderLayout.NORTH);
	        columntextpanel.setLayout(new GridLayout(0, 1, 0, 1));
	        columntextpanel.setBackground(Color.black);
	
	}

	private static void method() 
	{
		
		easter_eggBTN.addMouseListener(new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				clicked1 = clicked1 + 1;
				if(clicked1 > 4)
				{
					settingsBTN.setText(":-)");
					settingsBTN.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
					
					if(clicked1 > 9)
					{
						settingsBTN.setSize(150,100);
						settingsBTN.setLocation(926,652);
						settingsBTN.setIcon(easter_egg);
						settingsBTN.setText("");
						settingsBTN.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
					
						if(clicked1 > 11)
						{
							String click = "" + clicked1;
							settingsBTN.setText(click);
						}
						 if(clicked1 > 68)
						 {
							settingsBTN.setForeground(Color.PINK); 
							l.setIcon(easter_egg2);
							l.setFont(new Font("Papyrus", Font.PLAIN, 8));
							l.setText("KECHOW");
						 }
						 else if(clicked1 > 419)
						 {
							 settingsBTN.setForeground(Color.green); 
						 }
						 else if(clicked1 > 665)
						 {
							 settingsBTN.setForeground(Color.red); 
						 }
						 else if(clicked1 > 1336)
						 {
							 settingsBTN.setForeground(yellow); 
						 }
					}
				} 
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
			
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
	
		});
		
		mapBTN.addMouseListener(new MouseListener() 
		{
			
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				mapBTN.setIcon(swordClicked);
				mapBTN.setForeground(yellow);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				mapBTN.setIcon(sword);
				mapBTN.setForeground(white);
				
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				map.setVisible(true);
				
			}
	
		});
		
		partyBTN.addMouseListener(new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				partyBTN.setIcon(swordClicked);
				partyBTN.setForeground(yellow);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				partyBTN.setIcon(sword);
				partyBTN.setForeground(white);
			
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				party.setVisible(true);
				
			}
	
		});
		
		journalBTN.addMouseListener(new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				journalBTN.setIcon(swordClicked);
				journalBTN.setForeground(yellow);
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				journalBTN.setIcon(sword);
				journalBTN.setForeground(white);
				
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				journal.setVisible(true);
				
			}
	
		});
		
		settingsBTN.addMouseListener(new MouseListener() 
		{

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				//partyBTN.setIcon(swordClicked);
			
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				//partyBTN.setIcon(sword);
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				
				
			}
	
		});
	}


	/**
	 * Contains all the settings for JFrame, JPanel & JButtons.                          (1)
	 */
	private static void frameSettings() 
	{
		//JFrame: mainScreen
		mainScreen.setSize(1080,780);
		mainScreen.setContentPane(new JLabel(new ImageIcon("background.png")));
		mainScreen.setVisible(true);
		mainScreen.setResizable(false);
		mainScreen.setDefaultCloseOperation(mainScreen.EXIT_ON_CLOSE);
		
		//JPanel: mainScreenPanel
		mainScreenPanel.setLayout(null);
		mainScreen.add(mainScreenPanel);
		
		//////////////////////start/////////////////////////////////
		startLBL.setLocation(420,500);
		startLBL.setSize(120,30);
		startLBL.setForeground(Color.white);
		startLBL.setFont(new Font("Papyrus", Font.PLAIN, 20));
		//startLBL.setOpaque(true);
		startLBL.setText("Enter name: ");
		mainScreen.add(startLBL);
		
		name.setLocation(540, 500);
		name.setSize(120,30);
		name.setFont(new Font("Papyrus", Font.PLAIN, 20));
		name.setBackground(Color.black);
		name.setForeground(Color.white);
		//name.setBorder(new RoundedCornerBorder());
		mainScreen.add(name);
		
		/////////////////////////////////////////////////////////////
		
		l.setLocation(5,5);
		l.setSize(100,50);
		l.setForeground(Color.white);
		l.setFont(new Font("Papyrus", Font.PLAIN, 4));
		l.setOpaque(false);
		mainScreen.add(l);
	
		mapBTN.setSize(150,60);
		mapBTN.setLocation(925,5);
		mapBTN.setBorder(null);
		mapBTN.setIcon(sword);
		mapBTN.setForeground(white);
		mapBTN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mapBTN.setHorizontalTextPosition(JButton.CENTER);
		mapBTN.setVerticalTextPosition(JButton.CENTER);
		mapBTN.setOpaque(false);
	    mapBTN.setContentAreaFilled(false);
	    mapBTN.setBorderPainted(false);
	    mapBTN.setFocusPainted(false);
	    mainScreen.add(mapBTN);
	    mapBTN.repaint();
	    
	    partyBTN.setSize(150,60);
	    partyBTN.setLocation(925,45);
	    partyBTN.setBorder(null);
	    partyBTN.setIcon(sword);
	    partyBTN.setForeground(white);
	    partyBTN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    partyBTN.setHorizontalTextPosition(JButton.CENTER);
	    partyBTN.setVerticalTextPosition(JButton.CENTER);
	    partyBTN.setOpaque(false);
	    partyBTN.setContentAreaFilled(false);
	    partyBTN.setBorderPainted(false);
	    partyBTN.setFocusPainted(false);
	    mainScreen.add(partyBTN);
	    partyBTN.repaint();
	    
	    journalBTN.setSize(150,60);
	    journalBTN.setLocation(925,85);
	    journalBTN.setBorder(null);
	    journalBTN.setIcon(sword);
	    journalBTN.setForeground(white);
	    journalBTN.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    journalBTN.setHorizontalTextPosition(JButton.CENTER);
	    journalBTN.setVerticalTextPosition(JButton.CENTER);
	    journalBTN.setOpaque(false);
	    journalBTN.setContentAreaFilled(false);
	    journalBTN.setBorderPainted(false);
	    journalBTN.setFocusPainted(false);
	    mainScreen.add(journalBTN);
	    journalBTN.repaint();
	    
	    settingsBTN.setSize(100,100);
	    settingsBTN.setLocation(1007,685);
	    settingsBTN.setIcon(settings);
	    settingsBTN.setBorder(null);
	    settingsBTN.setForeground(Color.white);
	    settingsBTN.setFont(new Font("Comic Sans MS", Font.PLAIN, 40));
	    settingsBTN.setHorizontalTextPosition(JButton.CENTER);
	    settingsBTN.setVerticalTextPosition(JButton.CENTER);
	    settingsBTN.setOpaque(false);
	    settingsBTN.setContentAreaFilled(false);
	    settingsBTN.setBorderPainted(false);
	    settingsBTN.setFocusPainted(false);
	    mainScreen.add(settingsBTN);
	    settingsBTN.repaint();
	    
	    easter_eggBTN.setSize(130,70);
	    easter_eggBTN.setLocation(0,210);
	    easter_eggBTN.setBorder(null);
	    easter_eggBTN.setOpaque(true);
	    easter_eggBTN.setContentAreaFilled(false);
	    easter_eggBTN.setBorderPainted(false);
	    easter_eggBTN.setFocusPainted(false);
	    mainScreen.add(easter_eggBTN);
	    easter_eggBTN.repaint();
	    
	 
		mainScreen.repaint();
	}
	
}
