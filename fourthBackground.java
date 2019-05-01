/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the fourth
background for MyCreation - a beach*/

import java.awt.*;
import hsa.Console;

public class fourthBackground
{
    private Console c;

    public fourthBackground (Console con)
    {
	c = con;
	drawBackground ();
    }


    public void drawBackground ()
    {
	//colour declaration
	Color badSky = new Color (178, 190, 181);
	Color sand = new Color (229, 165, 45);
	Color darkSand = new Color (188, 124, 5);
	Color water = new Color (4, 153, 46);
	Color insideTextBox = new Color (255, 255, 255);
	Color textBox = new Color (0, 0, 153);
	Color fishBody1 = new Color (198, 159, 204);
	Color fishBody2 = new Color (226, 97, 125);

	//text box border
	c.setColour (textBox);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 400, x, x - 540); //border
	}

	//text box inside
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (insideTextBox);
	    c.drawRect (10, 410, x - 20, x - 560); //inside
	}

	//sky
	c.setColor (badSky);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, x - 270); // road
	}

	//sand
	c.setColor (sand);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 150, x, x - 500); //sand
	}
	c.setColor (darkSand);
	for (int x = 0 ; x < 640 ; x = x + 60)
	{
	    c.drawOval (10 + x, 160, 1, 1); //dots of sand
	    c.drawOval (120 + (x - 10), 190, 1, 1);
	    c.drawOval (50 + (x - 30), 180, 1, 1);
	    c.drawOval (0 + (x - 40), 210, 1, 1);
	}

	//lake
	c.setColor (water);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 220, x, x - 460); // lake water
	}
	c.setColor (water);
	for (int x = 0 ; x < 50 ; x++)
	    for (int y = 0 ; y < 700 ; y = y + 100)
	    {
		{
		    c.drawArc (-25 + y - x / 2, 210, x, 30, 0, 180); //waves
		}
	    }
	c.setColor (sand);
	for (int x = 0 ; x < 50 ; x++)
	    for (int y = 0 ; y < 700 ; y = y + 100)
	    {
		{
		    c.drawArc (25 + y - x / 2, 200, x + 20, 30, 180, 180); //upsidedown arcs
		}
	    }
	c.setColor (sand);
	for (int x = 0 ; x < 50 ; x++)
	    for (int y = 0 ; y < 700 ; y = y + 100)
	    {
		{
		    c.drawArc (50 + y - x / 2, 210, 2, 19, 180, 180); //cover up left over arc
		}
	    }
	//first fish
	c.setColor (fishBody1);
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.drawOval (100, 245, x, x); //layer 1
	    c.drawOval (101, 245, x, x); //layer 2
	    c.drawOval (99, 245, x, x); //layer 3

	}
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.drawLine (95 + x, 253 + (x - 17), 95 + x, 273 - (x - 17)); //tail
	}
	c.setColor (Color.black);
	c.drawLine (120, 252, 130, 262); //left cross for eye
	c.drawLine (120, 262, 130, 252); //right cross for eye
	c.drawArc (112, 270, 26, 10, 20, 140); //frown

	//second fish
	c.setColor (fishBody2);
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.drawOval (500, 345, x, x); //layer 1
	    c.drawOval (501, 345, x, x); //layer 2
	    c.drawOval (499, 345, x, x); //layer 3

	}
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.drawLine (495 + x, 353 + (x - 17), 495 + x, 373 - (x - 17)); //tail
	}
	c.setColor (Color.black);
	c.drawLine (520, 352, 530, 362); //left cross for eye
	c.drawLine (520, 362, 530, 352); //right cross for eye
	c.drawArc (512, 370, 26, 10, 20, 140); //frown
    }
}

