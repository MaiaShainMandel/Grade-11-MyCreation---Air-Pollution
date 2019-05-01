/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the second
background for MyCreation - a road with bad nature*/

import java.awt.*;
import hsa.Console;

public class secondBackground
{
    private Console c;

    public secondBackground (Console con)
    {
	c = con;
	drawBackground ();
    }


    public void drawBackground ()
  {
	//colour declaration
	Color road = new Color (128, 128, 128);
	Color lines = new Color (255, 128, 0);
	Color sideWalk = new Color (0, 255, 0);
	Color goodClouds = new Color (255, 255, 255);
	Color textBox = new Color (0, 0, 153);
	Color carWindow = new Color (221, 253, 255);
	Color doorHandle = new Color (255, 255, 0);
	Color car3 = new Color (217, 217, 219);
	Color car2 = new Color (84, 66, 163);

	//text box border
	c.setColour (textBox);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 400, x, x - 540); //border
	}

	//text box inside
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (goodClouds);
	    c.drawRect (10, 410, x - 20, x - 560); //inside
	}

	//road
	c.setColor (road);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, x - 330); // road
	}

	c.setColor (lines);
	for (int x = 0 ; x <= 640 ; x = x + 50)
	{
	    c.drawRect (7 + x, 160, 25, 6); // draws lines in the road
	}


	//side walk
	c.setColor (sideWalk);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 300, x, x - 540); // side walk
	}

	//car 1
	c.setColor (Color.red);
	for (int x = 0 ; x < 200 ; x++)
	{
	    c.drawArc (435 + x / 2, 190, 100, 150, 0, 180); //base
	}
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.drawArc (420 + x / 2, 215, 50, 50, 90, 180); //front bumper
	}
	c.setColor (carWindow);
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawArc (470 + x / 2, 200, 50, 35, 100, 90); //left window
	}
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawArc (500 + x / 2, 200, 50, 38, 0, 90); //right window
	}
	c.setColor (Color.red);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRect (520, 195, x, 35); //window erase
	}
	c.setColor (Color.black);
	c.drawLine (535, 190, 535, 265); // door
	for (int x = 0 ; x < 45 ; x++)
	{
	    c.drawArc (455 + x / 2, 242, 45, 45, 180, 180); //left wheel
	    c.drawArc (555 + x / 2, 242, 45, 45, 180, 180); //left wheel
	}
	c.setColor (doorHandle);
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.drawRect (500, 232, x, 4); //door handle
	}

	//car 2
	c.setColor (car2);
	for (int x = 0 ; x < 200 ; x++)
	{
	    c.drawArc (200 + x / 2, 190, 100, 150, 0, 180); //base
	}
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.drawArc (185 + x / 2, 215, 50, 50, 90, 180); //front bumper
	}
	c.setColor (carWindow);
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawArc (235 + x / 2, 200, 50, 35, 100, 90); //left window
	}
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawArc (265 + x / 2, 200, 50, 38, 0, 90); //right window
	}
	c.setColor (car2);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRect (285, 195, x, 35); //window erase
	}
	c.setColor (Color.black);
	c.drawLine (300, 190, 300, 265); // door
	for (int x = 0 ; x < 45 ; x++)
	{
	    c.drawArc (220 + x / 2, 242, 45, 45, 180, 180); //left wheel
	    c.drawArc (320 + x / 2, 242, 45, 45, 180, 180); //left wheel
	}
	c.setColor (doorHandle);
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.drawRect (265, 232, x, 4); //door handle
	}

	//car 3
	c.setColor (car3);
	for (int x = 0 ; x < 200 ; x++)
	{
	    c.drawArc (-35 + x / 2, 190, 100, 150, 0, 180); //base
	}
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.drawArc (-50 + x / 2, 215, 50, 50, 90, 180); //front bumper
	}
	c.setColor (carWindow);
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawArc (0 + x / 2, 200, 50, 35, 100, 90); //left window
	}
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawArc (30 + x / 2, 200, 50, 38, 0, 90); //right window
	}
	c.setColor (car3);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRect (50, 195, x, 35); //window erase
	}
	c.setColor (Color.black);
	c.drawLine (65, 190, 65, 265); // door
	for (int x = 0 ; x < 45 ; x++)
	{
	    c.drawArc (-15 + x / 2, 242, 45, 45, 180, 180); //left wheel
	    c.drawArc (85 + x / 2, 242, 45, 45, 180, 180); //left wheel
	}
	c.setColor (doorHandle);
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.drawRect (30, 232, x, 4); //door handle
	}

    }
}



