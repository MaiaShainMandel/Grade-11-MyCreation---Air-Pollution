/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the 4th
animation of Ben on his skateboard*/

import java.awt.*;
import hsa.Console;

public class skateboard4
{
    private Console c;

    public void drawBen ()
    {
	//colour declaration
	Color wheels = new Color (255, 128, 0);
	Color skateboard = new Color (204, 0, 0);
	Color hat = new Color (0, 0, 153);
	Color legs = new Color (11, 114, 33);
	Color body = new Color (0, 255, 55);
	Color head = new Color (255, 229, 204);
	Color star = new Color (255, 255, 0);
	Color badSky = new Color (178, 190, 181);

	for (int x = 0 ; x < 640 ; x++)
	{
	    //erase commands
	    c.setColor (badSky);
	    c.fillRect (0 + x, 55, 100, 95);

	    //skateboard wheels
	    c.setColor (wheels);
	    c.fillOval (20 + x, 140, 10, 10); //left
	    c.setColor (wheels);
	    c.fillOval (75 + x, 140, 10, 10); //right

	    //skateboard
	    c.setColor (skateboard);
	    c.fillOval (0 + x, 133, 100, 10); //board
	    
	    //Ben's body
	    c.setColor (legs);
	    c.drawLine (50 + x, 90, 50 + x, 120); //back

	    //Ben's arms
	    c.setColor (legs);
	    c.drawLine (35 + x, 100, 65 + x, 100); //middle line
	    c.setColor (legs);
	    c.drawLine (35 + x, 100, 50 + x, 110); //left arm
	    c.setColor (legs);
	    c.drawLine (65 + x, 100, 50 + x, 110); //right arm

	    //Ben's legs
	    c.setColor (legs);
	    c.drawLine (45 + x, 120, 55 + x, 120); //waist
	    c.setColor (legs);
	    c.drawLine (45 + x, 120, 35 + x, 133); //left leg
	    c.setColor (legs);
	    c.drawLine (55 + x, 120, 65 + x, 133); //right leg

	    //Ben's head
	    c.setColor (head);
	    c.fillOval (35 + x, 60, 30, 30); //head
	    c.setColor (Color.black);
	    c.fillOval (43 + x, 70, 3, 3); //left eye
	    c.setColor (Color.black);
	    c.fillOval (55 + x, 70, 3, 3); //right eye
	    c.setColor (Color.red);
	    c.drawArc (43 + x, 78, 15, 10, 10, 190); //frown

	    //Ben's hat
	    c.setColor (hat);
	    c.fillArc (35 + x, 55, 30, 25, 0, 180); //hat
	    c.setColor (hat);
	    c.fillArc (55 + x, 60, 15, 7, 270, 230); //lid
	    c.setColor (star);
	    c.fillStar (48 + x, 58, 5, 5); //star

	    //delay
	    try
	    {
		Thread.sleep (15);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public skateboard4 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawBen ();
    }
}
