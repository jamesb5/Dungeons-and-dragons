package main_game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class partyScreen extends JFrame
{
	JButton party1 = new JButton();
	JButton party2 = new JButton();
	JButton party3 = new JButton();
	JButton party4 = new JButton();
	JButton party5 = new JButton();
	JButton party6 = new JButton();
	
	JPanel partyScreenPanel = new JPanel();
	 
	public partyScreen()
	{
		setSize(502,500);
		//partyScreen.setContentPane(new JLabel(new ImageIcon("background.png")));
		setVisible(false);
		setResizable(false);
		setTitle("Party");
		
		buttons();

	}

	public void buttons() 
	{
	 
		partyScreenPanel.setLayout(null);
		add(partyScreenPanel);
		
	    party1.setSize(83,15);
	    party1.setLocation(0,0);
	    //party1.setBorder(null);
	    //party1.setIcon(sword);
	    party1.setForeground(Color.BLACK);
	    party1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    party1.setHorizontalTextPosition(JButton.CENTER);
	    party1.setVerticalTextPosition(JButton.CENTER);
	    //party1.setOpaque(false);
	    //party1.setContentAreaFilled(false);
	    //party1.setBorderPainted(false);
	    party1.setFocusPainted(false);
	    party1.setText("Character 1");
	   	partyScreenPanel.add(party1);
		party1.repaint();
	    
		party2.setSize(83,15);
	    party2.setLocation(83,0);
	    //party2.setBorder(null);
	    //party2.setIcon(sword);
	    party2.setForeground(Color.BLACK);
	    party2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    party2.setHorizontalTextPosition(JButton.CENTER);
	    party2.setVerticalTextPosition(JButton.CENTER);
	    //party2.setOpaque(false);
	    //party2.setContentAreaFilled(false);
	    //party2.setBorderPainted(false);
	    party2.setFocusPainted(false);
	    party2.setText("Character 2");
	   	partyScreenPanel.add(party2);
		party2.repaint();
		
		party3.setSize(83,15);
	    party3.setLocation(166,0);
	    //party3.setBorder(null);
	    //party3.setIcon(sword);
	    party3.setForeground(Color.BLACK);
	    party3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    party3.setHorizontalTextPosition(JButton.CENTER);
	    party3.setVerticalTextPosition(JButton.CENTER);
	    //party3.setOpaque(false);
	    //party3.setContentAreaFilled(false);
	    //party3.setBorderPainted(false);
	    party3.setFocusPainted(false);
	    party3.setText("Character 3");
	   	partyScreenPanel.add(party3);
		party3.repaint();
		
		party4.setSize(83,15);
	    party4.setLocation(249,0);
	    //party4.setBorder(null);
	    //party4.setIcon(sword);
	    party4.setForeground(Color.BLACK);
	    party4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    party4.setHorizontalTextPosition(JButton.CENTER);
	    party4.setVerticalTextPosition(JButton.CENTER);
	    //party4.setOpaque(false);
	    //party4.setContentAreaFilled(false);
	    //party4.setBorderPainted(false);
	    party4.setFocusPainted(false);
	    party4.setText("Character 4");
	   	partyScreenPanel.add(party4);
		party4.repaint();
		
		party5.setSize(83,15);
	    party5.setLocation(332,0);
	    //party5.setBorder(null);
	    //party5.setIcon(sword);
	    party5.setForeground(Color.BLACK);
	    party5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    party5.setHorizontalTextPosition(JButton.CENTER);
	    party5.setVerticalTextPosition(JButton.CENTER);
	    //party5.setOpaque(false);
	    //party5.setContentAreaFilled(false);
	    //party5.setBorderPainted(false);
	    party5.setFocusPainted(false);
	    party5.setText("Character 5");
	   	partyScreenPanel.add(party5);
		party5.repaint();
		
		party6.setSize(83,15);
	    party6.setLocation(415,0);
	    //party6.setBorder(null);
	    //party6.setIcon(sword);
	    party6.setForeground(Color.BLACK);
	    party6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
	    party6.setHorizontalTextPosition(JButton.CENTER);
	    party6.setVerticalTextPosition(JButton.CENTER);
	    //party6.setOpaque(false);
	    //party6.setContentAreaFilled(false);
	    //party6.setBorderPainted(false);
	    party6.setFocusPainted(false);
	    party6.setText("Character 6");
	   	partyScreenPanel.add(party6);
		party6.repaint();
	}
}
