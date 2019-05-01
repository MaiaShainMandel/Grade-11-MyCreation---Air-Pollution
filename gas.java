/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the animation
for a gas cloud in the third scene
for MyCreation*/

import java.awt.*;
import hsa.Console;

public class gas extends Thread
{
    private Console c;

    public void drawGas ()
    {
	//colour declaration
	Color badSky = new Color (178, 190, 181);
	Color skull = new Color (255, 255, 255);
	Color star = new Color (255, 255, 0);
	Color gasCloud = new Color (1, 3, 4);
	//move up and left
	for (int x = 0 ; x < 20 ; x++)
	{
	    //erase
	    c.setColor (badSky);
	    c.fillRect (210 + (x * 5), 24 - x, 136, 87);
	    //gas cloud
	    c.setColor (gasCloud);
	    c.fillOval (215 + (x * 5), 45 - x, 65, 65); //left bottom
	    c.setColor (gasCloud);
	    c.fillOval (245 + (x * 5), 45 - x, 65, 65); //middle bottom
	    c.setColor (gasCloud);
	    c.fillOval (285 + (x * 5), 45 - x, 65, 65); //right bottom
	    c.setColor (gasCloud);
	    c.fillOval (230 + (x * 5), 25 - x, 65, 65); //top left
	    c.setColor (gasCloud);
	    c.fillOval (270 + (x * 5), 25 - x, 65, 65); //top right
	    c.setColor (Color.red);
	    c.fillOval (262 + (x * 5), 35 - x, 37, 37); //head
	    c.setColor (Color.red);
	    c.fillOval (265 + (x * 5), 65 - x, 30, 20); //neck
	    c.setColor (Color.red);
	    c.drawLine (260 + (x * 5), 80 - x, 300 + (x * 5), 100 - x); //left line for cross
	    c.setColor (Color.red);
	    c.drawLine (300 + (x * 5), 80 - x, 260 + (x * 5), 100 - x); //right line for cross
	    c.setColor (Color.white);
	    c.fillOval (267 + (x * 5), 42 - x, 10, 10); //left eye
	    c.setColor (Color.white);
	    c.fillOval (283 + (x * 5), 42 - x, 10, 10); //right eye
	    int noseX[] = {280 + (x * 5), 275 + (x * 5), 285 + (x * 5) }; //x axis for nose
	    int noseY[] = {55 - x, 65 - x, 65 - x}; //y axis for nose
	    c.setColor (Color.white);
	    c.fillPolygon (noseX, noseY, 3); //nose
	    c.setColor (star);
	    c.fillStar (240 + (x * 5), 50 - x, 10, 10); //left star
	    c.setColor (star);
	    c.fillStar (300 + (x * 5), 85 - x, 10, 10); //right star

	    //delay
	    try
	    {
		Thread.sleep (80);
	    }
	    catch (Exception e)
	    {
	    }
	}
	//move up and left
	for (int x = 0 ; x < 91 ; x++)
	{
	    //erase
	    c.setColor (badSky);
	    c.fillRect (310 - (x * 2), 4 - x, 145, 87);
	    c.setColor (gasCloud);
	    //gas cloud
	    c.fillOval (315 - (x * 2), 25 - x, 65, 65); //left bottom
	    c.setColor (gasCloud);
	    c.fillOval (345 - (x * 2), 25 - x, 65, 65); //middle bottom
	    c.setColor (gasCloud);
	    c.fillOval (385 - (x * 2), 25 - x, 65, 65); //right bottom
	    c.setColor (gasCloud);
	    c.fillOval (330 - (x * 2), 5 - x, 65, 65); //top left
	    c.setColor (gasCloud);
	    c.fillOval (370 - (x * 2), 5 - x, 65, 65); //top right
	    c.setColor (Color.red);
	    c.fillOval (362 - (x * 2), 15 - x, 37, 37); //head
	    c.setColor (Color.red);
	    c.fillOval (365 - (x * 2), 45 - x, 30, 20); //neck
	    c.setColor (Color.red);
	    c.drawLine (360 - (x * 2), 60 - x, 400 - (x * 2), 80 - x); //left line for cross
	    c.setColor (Color.red);
	    c.drawLine (400 - (x * 2), 60 - x, 360 - (x * 2), 80 - x); //right line for cross
	    c.setColor (Color.white);
	    c.fillOval (367 - (x * 2), 22 - x, 10, 10); //left eye
	    c.setColor (Color.white);
	    c.fillOval (383 - (x * 2), 22 - x, 10, 10); //right eye
	    int noseX[] = {380 - (x * 2), 375 - (x * 2), 385 - (x * 2) }; //x axis for nose
	    int noseY[] = {35 - x, 45 - x, 45 - x}; //y axis for nose
	    c.setColor (Color.white);
	    c.fillPolygon (noseX, noseY, 3); //nose
	    c.setColor (star);
	    c.fillStar (340 - (x * 2), 30 - x, 10, 10); //left star
	    c.setColor (star);
	    c.fillStar (400 - (x * 2), 65 - x, 10, 10); //right star

	    //delay
	    try
	    {
		Thread.sleep (80);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }



    public gas (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawGas ();
    }
}
