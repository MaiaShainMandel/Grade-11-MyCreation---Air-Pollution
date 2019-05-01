/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the main
character for MyCreation - a young boy named Ben*/

import java.awt.*;
import hsa.Console;

public class youngBen extends Thread
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
	Color goodSky = new Color (204, 255, 255);

	for (int x = 0 ; x < 500 ; x++)
	{
	    //erase commands
	    c.setColor (goodSky);
	    c.fillRect (700 - x, 205, 100, 95);

	    //skateboard wheels
	    c.setColor (wheels);
	    c.fillOval (720 - x, 290, 10, 10); //left
	    c.setColor (wheels);
	    c.fillOval (775 - x, 290, 10, 10); //right

	    //skateboard
	    c.setColor (skateboard);
	    c.fillOval (700 - x, 283, 100, 10); //board

	    //Ben's body
	    c.setColor (legs);
	    c.drawLine (750 - x, 240, 750 - x, 270); //back

	    //Ben's arms
	    c.drawLine (735 - x, 250, 765 - x, 250); //middle line
	    c.setColor (legs);
	    c.drawLine (735 - x, 250, 750 - x, 260); //left arm
	    c.setColor (legs);
	    c.drawLine (765 - x, 250, 750 - x, 260); //right arm

	    //Ben's legs
	    c.setColor (legs);
	    c.drawLine (745 - x, 270, 755 - x, 270); //waist
	    c.setColor (legs);
	    c.drawLine (745 - x, 270, 735 - x, 283); //left leg
	    c.setColor (legs);
	    c.drawLine (755 - x, 270, 765 - x, 283); //right leg

	    //Ben's head
	    c.setColor (head);
	    c.fillOval (735 - x, 210, 30, 30); //head
	    c.setColor (Color.black);
	    c.fillOval (743 - x, 220, 3, 3); //left eye
	    c.setColor (Color.black);
	    c.fillOval (755 - x, 220, 3, 3); //right eye
	    c.setColor (Color.red);
	    c.drawArc (743 - x, 223, 15, 10, 190, 180); //smile

	    //Ben's hat
	    c.setColor (hat);
	    c.fillArc (735 - x, 205, 30, 25, 0, 180); //hat
	    c.setColor (hat);
	    c.fillArc (755 - x, 210, 15, 7, 270, 230); //lid
	    c.setColor (star);
	    c.fillStar (748 - x, 208, 5, 5); //star

	    //delay
	    try
	    {
		Thread.sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public youngBen (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawBen ();
    }
}
