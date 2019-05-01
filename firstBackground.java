/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the main 
background for MyCreation - a beautiful city park*/

import java.awt.*;
import hsa.Console;

public class firstBackground
{
    private Console c;

    public firstBackground (Console con)
    {
	c = con;
	drawBackground ();
    }


    public void drawBackground ()
       {
	//colour declaration
	Color goodSky = new Color (204, 255, 255);
	Color treeBark = new Color (102, 51, 0);
	Color grass = new Color (0, 255, 0);
	Color sun = new Color (255, 255, 51);
	Color goodClouds = new Color (255, 255, 255);
	Color textBox = new Color (0, 0, 153);
	Color bugPink = new Color (241, 66, 244);
	Color bugYellow = new Color (255, 229, 0);
	Color bugBlue = new Color (66, 241, 244);
	Color bugRed = new Color (255, 93, 0);


	//sky
	c.setColour (goodSky);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, x - 340); //background
	}

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

	//sun
	c.setColour (sun);
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.drawOval (625 - (x / 2), -25, x, x); //sun first layer
	    c.drawOval (625 - (x / 2), -25, x + 1, x + 1); //sun second layer
	    c.drawOval (625 - (x / 2), -25, x - 1, x - 1); //sun third layer
	}

	//tree trunk
	c.setColour (treeBark);
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.drawRect (50, 171, x, x + 80); //tree truck
	}

	c.setColour (grass);
	//grass
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 300, x, x - 540);
	}

	//caterpillar
	c.setColor (Color.black);
	c.drawArc (77, 335, 17, 14, 0, 120); //antennae bottom
	c.drawArc (78, 332, 20, 18, 0, 110);  //antennae top
	c.setColor (bugRed);
	for (int x = 0 ; x < 17 ; x++)
	{
	    c.drawOval (92 + x / 2, 340, 9, 17); //head
	}
	c.setColor (bugPink);
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.drawOval (103 + x / 2, 341, 8, 15); //body 1
	}
	c.setColor (bugBlue);
	for (int x = 0 ; x < 13 ; x++)
	{
	    c.drawOval (113 + x / 2, 342, 7, 14); //body 2
	}
	c.setColor (bugYellow);
	for (int x = 0 ; x < 12 ; x++)
	{
	    c.drawOval (122 + x / 2, 343, 6, 13); //body 3
	}
	c.setColor (bugRed);
	for (int x = 0 ; x < 11 ; x++)
	{
	    c.drawOval (130 + x / 2, 345, 5, 10); //body 4
	}
	c.setColor (bugPink);
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.drawOval (137 + x / 2, 346, 4, 8); //body 5
	}
	c.setColor (grass);
	//tree tops
	for (int x = 0 ; x < 60 ; x++)
	{
	    //first layer
	    c.drawOval (35 - (x / 2), 130, x, x); //left bottom
	    c.drawOval (55 - (x / 2), 130, x, x); //middle bottom
	    c.drawOval (75 - (x / 2), 130, x, x); //middle bottom
	    c.drawOval (95 - (x / 2), 130, x, x); //middle bottom
	    c.drawOval (115 - (x / 2), 130, x, x); //right bottom
	    c.drawOval (75 - (x / 2), 100, x, x); //middle bottom
	    c.drawOval (45 - (x / 2), 100, x, x); //left bottom
	    c.drawOval (105 - (x / 2), 100, x, x); //right bottom
	    c.drawOval (60 - (x / 2), 70, x, x); //left top
	    c.drawOval (75 - (x / 2), 65, x, x); //middle top
	    c.drawOval (90 - (x / 2), 70, x, x); //right top

	    //second layer
	    c.drawOval (35 - (x / 2), 130, x + 1, x + 1); //left bottom
	    c.drawOval (55 - (x / 2), 130, x + 1, x + 1); //middle bottom
	    c.drawOval (75 - (x / 2), 130, x + 1, x + 1); //middle bottom
	    c.drawOval (95 - (x / 2), 130, x + 1, x + 1); //middle bottom
	    c.drawOval (115 - (x / 2), 130, x + 1, x + 1); //right bottom
	    c.drawOval (75 - (x / 2), 100, x + 1, x + 1); //middle bottom
	    c.drawOval (45 - (x / 2), 100, x + 1, x + 1); //left bottom
	    c.drawOval (105 - (x / 2), 100, x + 1, x + 1); //right bottom
	    c.drawOval (60 - (x / 2), 70, x + 1, x + 1); //left top
	    c.drawOval (75 - (x / 2), 65, x + 1, x + 1); //middle top
	    c.drawOval (90 - (x / 2), 70, x + 1, x + 1); //right top

	    //third layer
	    c.drawOval (35 - (x / 2), 130, x - 1, x - 1); //left bottom
	    c.drawOval (55 - (x / 2), 130, x - 1, x - 1); //middle bottom
	    c.drawOval (75 - (x / 2), 130, x - 1, x - 1); //middle bottom
	    c.drawOval (95 - (x / 2), 130, x - 1, x - 1); //middle bottom
	    c.drawOval (115 - (x / 2), 130, x - 1, x - 1); //right bottom
	    c.drawOval (75 - (x / 2), 100, x - 1, x - 1); //middle bottom
	    c.drawOval (45 - (x / 2), 100, x - 1, x - 1); //left bottom
	    c.drawOval (105 - (x / 2), 100, x - 1, x - 1); //right bottom
	    c.drawOval (60 - (x / 2), 70, x - 1, x - 1); //left top
	    c.drawOval (75 - (x / 2), 65, x - 1, x - 1); //middle top
	    c.drawOval (90 - (x / 2), 70, x - 1, x - 1); //right top
	}

	c.setColour (goodClouds);
	//left cloud first layer
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.drawOval (195 - (x / 2), 50, x, x); //left middle
	    c.drawOval (225 - (x / 2), 50, x, x); //bottom middle
	    c.drawOval (255 - (x / 2), 50, x, x); //right middle
	    c.drawOval (210 - (x / 2), 25, x, x); //top left
	    c.drawOval (240 - (x / 2), 25, x, x); //top right

	    c.drawOval (195 - (x / 2), 50, x + 1, x + 1); //left middle
	    c.drawOval (225 - (x / 2), 50, x + 1, x + 1); //bottom middle
	    c.drawOval (255 - (x / 2), 50, x + 1, x + 1); //right middle
	    c.drawOval (210 - (x / 2), 25, x + 1, x + 1); //top left
	    c.drawOval (240 - (x / 2), 25, x + 1, x + 1); //top right

	    c.drawOval (195 - (x / 2), 50, x - 1, x - 1); //left middle
	    c.drawOval (225 - (x / 2), 50, x - 1, x - 1); //bottom middle
	    c.drawOval (255 - (x / 2), 50, x - 1, x - 1); //right middle
	    c.drawOval (210 - (x / 2), 25, x - 1, x - 1); //top left
	    c.drawOval (240 - (x / 2), 25, x - 1, x - 1); //top right
	}

	//right cloud first layer
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.drawOval (345 - (x / 2), 30, x, x); //left middle
	    c.drawOval (375 - (x / 2), 30, x, x); //bottom middle
	    c.drawOval (405 - (x / 2), 30, x, x); //right middle
	    c.drawOval (360 - (x / 2), 10, x, x); //top left
	    c.drawOval (390 - (x / 2), 10, x, x); //top right

	    c.drawOval (345 - (x / 2), 30, x + 1, x + 1); //left middle
	    c.drawOval (375 - (x / 2), 30, x + 1, x + 1); //bottom middle
	    c.drawOval (405 - (x / 2), 30, x + 1, x + 1); //right middle
	    c.drawOval (360 - (x / 2), 10, x + 1, x + 1); //top left
	    c.drawOval (390 - (x / 2), 10, x + 1, x + 1); //top right

	    c.drawOval (345 - (x / 2), 30, x - 1, x - 1); //left middle
	    c.drawOval (375 - (x / 2), 30, x - 1, x - 1); //bottom middle
	    c.drawOval (405 - (x / 2), 30, x - 1, x - 1); //right middle
	    c.drawOval (360 - (x / 2), 10, x - 1, x - 1); //top left
	    c.drawOval (390 - (x / 2), 10, x - 1, x - 1); //top right
	}
    }
}

