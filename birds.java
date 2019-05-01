/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create birds for
the first scene of MyCreation - overloaded constructor!!*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class birds extends Thread
{
    private Console c;
    private Color drawBird;
    private int delay = 7;
    private int loopVar = 400;

    public void drawBird ()
    {
	Color goodSky = new Color (204, 255, 255);
	for (int x = 0 ; x < loopVar ; x++)
	{
	    c.setColor (goodSky);
	    c.fillRect (590 - x, 109, 100, 68); //erase
	    c.setColor (drawBird);
	    c.fillOval (600 - x, 120, 40, 40); //head
	    c.setColor (drawBird);
	    c.fillOval (633 - x, 127, 50, 30); //body
	    c.setColor (drawBird);
	    c.fillArc (645 - x, 110, 30, 65, 90, 180); //wings
	    c.setColor (Color.orange);
	    int beakX[] = {601 - x, 601 - x, 591 - x};  //x axis for the beak
	    int beakY[] = {145, 135, 140};  //y axis for the beak
	    c.fillPolygon (beakX, beakY, 3); //beak
	    c.setColor (Color.orange);
	    c.drawLine (680 - x, 136, 688 - x, 138); //top leg middle foot
	    c.setColor (Color.orange);
	    c.drawLine (680 - x, 136, 688 - x, 134); //top leg top foot
	    c.setColor (Color.orange);
	    c.drawLine (680 - x, 136, 688 - x, 130); //top leg bottom foot
	    c.setColor (Color.orange);
	    c.drawLine (680 - x, 148, 688 - x, 148); //bottom leg middle foot
	    c.setColor (Color.orange);
	    c.drawLine (680 - x, 148, 688 - x, 144); //bottom leg top foot
	    c.setColor (Color.orange);
	    c.drawLine (680 - x, 148, 688 - x, 152); //bottom leg bottom foot

	    //delay
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }



    //basic drawBird
    public birds (Console con)
    {
	c = con;
	drawBird = new Color (255, 255, 0);
    }


    // drawBird with a Color parameter
    public birds (Console con, Color n, int t, int l)
    {
	c = con;
	drawBird = n;
	delay = t;
	loopVar = l;

    }


    public void run ()
    {
	drawBird ();
    }
}


