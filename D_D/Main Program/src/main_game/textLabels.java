package main_game;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class textLabels extends JLabel 
{
	 Color yellow = new Color(210,200,0);
	 Color white = new Color(255,255,255);
	 
	textLabels()
	{
			addMouseListener(new MouseListener()
			{

				@Override
				public void mouseClicked(MouseEvent arg0) 
				{
					
					
				}

				@Override
				public void mouseEntered(MouseEvent arg0) 
				{
					setOpaque(true);
					setForeground(Color.black);
					
				}

				@Override
				public void mouseExited(MouseEvent arg0) 
				{
					setOpaque(false);
					setForeground(white);
					
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
