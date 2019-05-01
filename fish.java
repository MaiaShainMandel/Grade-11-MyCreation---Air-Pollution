/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create a fish
character for MyCreation*/

import java.awt.*;
import hsa.Console;

public class fish extends Thread
{
    private Console c;

    public void drawFish ()

    {
	//color declarations
	Color water = new Color (4, 153, 46);
	Color fishBody = new Color (255, 165, 0);
	Color fishEye = new Color (0, 250, 255);
	Color deadEye = new Color (0, 0, 0);
	Color fishMouth = new Color (224, 92, 92);
	Color gills = new Color (167, 92, 224);

	//fish move first
	for (int x = 0 ; x < 400 ; x++)
	{
	    c.setColor (water);
	    c.fillRect (-71 + x, 294, 72, 62); //erase
	    c.setColor (fishBody);
	    c.fillOval (-50 + x, 300, 50, 50); //body
	    int tailX[] = { - 35 + x, -35 + x, -70 + x, -70 + x}; // x axis of tail
	    int tailY[] = {315, 335, 295, 355}; //y axis of tail
	    c.setColor (fishBody);
	    c.fillPolygon (tailX, tailY, 4); //tail
	    c.setColor (fishEye);
	    c.fillOval (-15 + x, 315, 5, 5); //eye
	    c.setColor (fishMouth);
	    c.drawArc (-25 + x, 330, 21, 15, 0, 200); //mouth
	    c.setColor (gills);
	    c.drawLine (-67 + x, 305, -67 + x, 345); //left gill
	    c.setColor (gills);
	    c.drawLine (-64 + x, 310, -64 + x, 340); //middle gill
	    c.setColor (gills);
	    c.drawLine (-61 + x, 315, -61 + x, 335); //right gill
	    //delay
	    try
	    {
		Thread.sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//fish pause
	for (int x = 0 ; x < 1 ; x++)
	{
	    c.setColor (water);
	    c.fillRect (329 + x, 294, 72, 62); //erase
	    c.setColor (fishBody);
	    c.fillOval (350 + x, 300, 50, 50); //body
	    int tailX[] = {365 + x, 365 + x, 330 + x, 330 + x}; // x axis of tail
	    int tailY[] = {315, 335, 295, 355}; //y axis of tail
	    c.setColor (fishBody);
	    c.fillPolygon (tailX, tailY, 4); //tail
	    c.setColor (fishEye);
	    c.fillOval (385 + x, 315, 5, 5); //eye
	    c.setColor (fishMouth);
	    c.drawArc (375 + x, 330, 21, 15, 0, 200); //mouth
	    c.setColor (gills);
	    c.drawLine (333 + x, 305, 333 + x, 345); //left gill
	    c.setColor (gills);
	    c.drawLine (336 + x, 310, 336 + x, 340); //middle gill
	    c.setColor (gills);
	    c.drawLine (339 + x, 315, 339 + x, 335); //right gill
	    //delay
	    try
	    {
		Thread.sleep (2000);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//fish die
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (water);
	    c.fillRect (329, 294 + x, 72, 62); //erase
	    c.setColor (fishBody);
	    c.fillOval (350, 300 + x, 50, 50); //body
	    int tailX[] = {365, 365, 330, 330}; // x axis of tail
	    int tailY[] = {315 + x, 335 + x, 295 + x, 355 + x}; //y axis of tail
	    c.setColor (fishBody);
	    c.fillPolygon (tailX, tailY, 4); //tail
	    c.setColor (deadEye);
	    c.drawLine (380, 310 + x, 390, 320 + x); //left line for eye
	    c.setColor (deadEye);
	    c.drawLine (390, 310 + x, 380, 320 + x); //right line for eye
	    c.setColor (fishMouth);
	    c.drawArc (375, 330 + x, 21, 15, 0, 200); //mouth
	    c.setColor (gills);
	    c.drawLine (333, 305 + x, 333, 345 + x); //left gill
	    c.setColor (gills);
	    c.drawLine (336, 310 + x, 336, 340 + x); //middle gill
	    c.setColor (gills);
	    c.drawLine (339, 315 + x, 339, 335 + x); //right gill
	    //delay
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}

}
	public fish (Console con)
	{
	    c = con;
	}


	public void run ()
	{
	    drawFish ();
	}
    }


