/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the second
animation for Ben in MyCreation*/

import java.awt.*;
import hsa.Console;

public class skateboard2
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
	Color grass = new Color (0, 255, 0);

	for (int x = 0 ; x < 640 ; x++)
	{
	    //erase commands
	    c.setColor (grass);
	    c.fillRect (0 + x, 305, 100, 95);

	    //skateboard wheels
	    c.setColor (wheels);
	    c.fillOval (20 + x, 390, 10, 10); //left
	    c.setColor (wheels);
	    c.fillOval (75 + x, 390, 10, 10); //right

	    //skateboard
	    c.setColor (skateboard);
	    c.fillOval (0 + x, 383, 100, 10); //board
	    
	    //Ben's body
	    c.setColor (legs);
	    c.drawLine (50 + x, 340, 50 + x, 370); //back

	    //Ben's arms
	    c.setColor (legs);
	    c.drawLine (35 + x, 350, 65 + x, 350); //middle line
	    c.setColor (legs);
	    c.drawLine (35 + x, 350, 50 + x, 360); //left arm
	    c.setColor (legs);
	    c.drawLine (65 + x, 350, 50 + x, 360); //right arm

	    //Ben's legs
	    c.setColor (legs);
	    c.drawLine (45 + x, 370, 55 + x, 370); //waist
	    c.setColor (legs);
	    c.drawLine (45 + x, 370, 35 + x, 383); //left leg
	    c.setColor (legs);
	    c.drawLine (55 + x, 370, 65 + x, 383); //right leg

	    //Ben's head
	    c.setColor (head);
	    c.fillOval (35 + x, 310, 30, 30); //head
	    c.setColor (Color.black);
	    c.fillOval (43 + x, 320, 3, 3); //left eye
	    c.setColor (Color.black);
	    c.fillOval (55 + x, 320, 3, 3); //right eye
	    c.setColor (Color.red);
	    c.drawArc (43 + x, 328, 15, 10, 10, 190); //frown

	    //Ben's hat
	    c.setColor (hat);
	    c.fillArc (35 + x, 305, 30, 25, 0, 180); //hat
	    c.setColor (hat);
	    c.fillArc (55 + x, 310, 15, 7, 270, 230); //lid
	    c.setColor (star);
	    c.fillStar (48 + x, 308, 5, 5); //star

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


    public skateboard2 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawBen ();
    }
}
