/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the third 
background for MyCreation - lots of houses and dark skies*/

import java.awt.*;
import hsa.Console;

public class thirdBackground
{
    private Console c;

    public thirdBackground (Console con)
    {
	c = con;
	drawBackground ();
    }


    public void drawBackground ()
  {
	//colour declaration
	Color badSky = new Color (178, 190, 181);
	Color leftBuilding = new Color (94, 86, 107);
	Color leftBuildingDoor = new Color (12, 60, 0);
	Color buildingWindows = new Color (158, 184, 226);
	Color tallBuilding = new Color (0, 90, 184);
	Color tallBuildingDoor = new Color (23, 203, 3);
	Color middleBuilding = new Color (100, 90, 14);
	Color middleBuildingDoor = new Color (0, 209, 113);
	Color middleBuildingRoof = new Color (100, 30, 70);
	Color sideWalk = new Color (0, 255, 0);
	Color goodClouds = new Color (255, 255, 255);
	Color textBox = new Color (0, 0, 153);

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
	c.setColor (badSky);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, x - 270); // road
	}

	//side walk
	c.setColor (sideWalk);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 270, x, x - 510); // side walk
	}

	//left building
	c.setColor (leftBuilding);
	for (int x = 0 ; x < 200 ; x++) //building
	{
	    c.drawRect (0, 70, x, x);
	}
	c.setColor (leftBuildingDoor);
	for (int x = 0 ; x < 70 ; x++)         //door

	    {
		c.drawRect (75, 200, x - 20, x);
	    }
	c.setColor (leftBuilding);
	for (int x = 0 ; x < 8 ; x++) //door handle
	{
	    c.drawOval (110, 233, x, x); //first layer
	    c.drawOval (111, 233, x, x); //second layer
	    c.drawOval (109, 233, x, x); //third layer
	}
	c.setColor (buildingWindows);
	for (int x = 0 ; x < 60 ; x = x + 20) //windows across
	    for (int y = 0 ; y < 100 ; y = y + 25) //windows down
		for (int z = 0 ; z < 15 ; z++) //fill in windows
		{
		    {
			c.drawRect (10 + x, 90 + y, z, z);
			c.drawRect (130 + x, 90 + y, z, z);
		    }
		}

	//tall building
	c.setColor (tallBuilding);
	for (int x = 0 ; x < 270 ; x++) //building
	{
	    c.drawRect (470, 0, x - 100, x);
	}
	c.setColor (tallBuildingDoor);
	for (int x = 0 ; x < 70 ; x++)         //door

	    {
		c.drawRect (530, 200, x - 20, x);
	    }
	c.setColor (tallBuilding);
	for (int x = 0 ; x < 8 ; x++) //door handle
	{
	    c.drawOval (565, 233, x, x); //first layer
	    c.drawOval (566, 233, x, x); //second layer
	    c.drawOval (564, 233, x, x); //third layer
	}
	c.setColor (buildingWindows);
	for (int x = 0 ; x < 140 ; x = x + 20) //windows across
	    for (int y = 0 ; y < 175 ; y = y + 25) //windows down
		for (int z = 0 ; z < 15 ; z++) //fill in windows
		{
		    {
			c.drawRect (487 + x, 10 + y, z, z);
		    }
		}
	//middle building
	c.setColor (middleBuilding);
	for (int x = 0 ; x < 270 ; x++) //building
	{
	    c.drawRect (200, 180, x, 89);
	}
	c.setColor (middleBuildingDoor);
	for (int x = 0 ; x < 40 ; x++)         //door

	    {
		c.drawRect (315, 230, x, x);
	    }
	c.setColor (middleBuilding);
	for (int x = 0 ; x < 6 ; x++) //door handle
	{
	    c.drawOval (342, 250, x, x); //first layer
	    c.drawOval (343, 250, x, x); //second layer
	    c.drawOval (341, 250, x, x); //third layer
	}
	c.setColor (middleBuilding);
	for (int x = 0 ; x < 60 ; x++) //chimney
	{
	    c.drawRoundRect (280, 110 + x, 30, 60, 20, 20); //first layer
	}
	c.setColor (middleBuildingRoof);
	for (int x = 0 ; x < 50 ; x++) //roof
	{
	    int roofX[] = {200, 470, 335}; //x axis for roof
	    int roofY[] = {180, 180, 130 + x}; //y axis for roof

	    c.drawPolygon (roofX, roofY, 3); //draw roof using polygon
	}
    }
}

