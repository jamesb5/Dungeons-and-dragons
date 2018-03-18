package main_game;

import java.awt.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import Tools.Dice;

/*
 * encounterID:
 * 0: default
 * 1: ork
 * 2: goblin
 */


public class scrollButtons extends JButton
{
	 Color yellow = new Color(210,200,0);
	 Color white = new Color(255,255,255);
	 boolean clicked = false;


	scrollButtons()
	{
			addMouseListener(new MouseListener()
			{

				@Override
				public void mouseClicked(MouseEvent arg0) 
				{
					clicked = true;
					
					if (encounter.encounterID == 1)
					{
						if(Main.button[0].clicked == true)
						{
							Main.button[0].setText("Such interesting shapes the walls are made of..");
						
						}
						
						if(Main.button[1].clicked == true)
						{
							encounter.encounterID = 2;
							Main.encounterSelector();
						
						}
						
						if(Main.button[2].clicked == true)
						{
							encounter.encounterID = 3;
							Main.encounterSelector();
						}
							
					}
					
					
					
					else if (encounter.encounterID == 2)
					{
						
						if(Main.button[0].clicked == true)
						{
							encounter.encounterID = 4;
							Main.encounterSelector();

							Main.button[0].clicked = false;
						}
						
						if(Main.button[1].clicked == true)
						{
							System.out.println("Ork was bribed");
							Main.label[0].setText(" ORK IT WAS BRIBED");
						}
						if(Main.button[2].clicked == true)
						{
							System.out.println("Ork ranaway");
						}
					
					
					}
					else if (encounter.encounterID == 3)
					{
						
						if(Main.button[0].clicked == true)
						{
							
							System.out.println("Goblin was attacked");
						}
					
					}
					else if (encounter.encounterID == 4)
					{
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 5;
						Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 5)
					{
						if (orkEncounter.playerhealth <= 0){
							encounter.encounterID = 9;
							Main.encounterSelector();
						}
						encounter.encounterID = 6;
						Main.encounterSelector();
					}
					else if (encounter.encounterID == 6)
					{
						if(Main.button[0].clicked == true)
						{
							encounter.encounterID = 9;
							Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 7)
					{
						encounter.encounterID = 9;
						Main.encounterSelector();
					}
					else if (encounter.encounterID == 8){
						if(Main.button[0].clicked == true)
						{
							encounter.encounterID = 11;
							Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 9){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 10;
						Main.encounterSelector();
						}
						}
					else if (encounter.encounterID == 10){
						encounter.encounterID = 8;
						Main.encounterSelector();
					}
					else if (encounter.encounterID == 11){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 12;
						Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 12){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else if (orkEncounter.playerhealth <= 0){
							encounter.encounterID = 20;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 13;
						Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 13){
						encounter.encounterID = 14;
						Main.encounterSelector();
					}
					else if (encounter.encounterID == 14){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else if (orkEncounter.playerhealth <= 0){
							encounter.encounterID = 20;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 15;
						Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 15){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else if (orkEncounter.playerhealth <= 0){
							encounter.encounterID = 20;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 16;
						Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 16){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else if (orkEncounter.playerhealth <= 0){
							encounter.encounterID = 20;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 17;
						Main.encounterSelector();
						}
					}
					else if (encounter.encounterID == 17){
						if (orkEncounter.orkhealth <= 0){
							encounter.encounterID = 7;
							Main.encounterSelector();
						}
						else if (orkEncounter.playerhealth <= 0){
							encounter.encounterID = 20;
							Main.encounterSelector();
						}
						else{
						encounter.encounterID = 18;
						Main.encounterSelector();
						}
					}
					
				}

				@Override
				public void mouseEntered(MouseEvent arg0) 
				{
						
						setForeground(yellow);
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) 
				{
						setForeground(white);
						clicked = false;
				}

				@Override
				public void mousePressed(MouseEvent arg0) 
				{
					
					
				}

				@Override
				public void mouseReleased(MouseEvent arg0) 
				{
						
					
				}
		
			});
	}

	

}
