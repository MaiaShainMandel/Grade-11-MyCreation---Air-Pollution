/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the fifth
background for MyCreation - Ben's room*/

import java.awt.*;
import hsa.Console;

public class fifthBackground
{
    private Console c;

    public fifthBackground (Console con)
    {
	c = con;
	drawBackground ();
    }


    public void drawBackground ()
	{
	//colour declaration
	Color insideTextBox = new Color (255, 255, 255);
	Color bedFrame = new Color (159, 191, 244);
	Color outsideSky = new Color (203, 216, 237);
	Color textBox = new Color (0, 0, 153);
	Color paintWall = new Color (255, 247, 168);
	Color blanket = new Color (237, 237, 255);
	Color sun = new Color (255, 255, 51);
	Color grass = new Color (0, 255, 0);
	Color bark = new Color (102, 51, 0);
	Color clock = new Color (255, 0, 0);

	Color hat = new Color (0, 0, 153);
	Color legs = new Color (11, 114, 33);
	Color body = new Color (0, 255, 55);
	Color head = new Color (205, 209, 70);
	Color star = new Color (255, 255, 0);

	//text box border
	c.setColour (textBox);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 400, x, x - 540); //border
	}
	c.setColor (insideTextBox);
	//text box inside
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (10, 410, x - 20, x - 560); //inside
	}
	//paint on the wall
	c.setColor (paintWall);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, 400);
	}
	c.setColor (bedFrame);
	//bed
	for (int x = 0 ; x < 180 ; x++)
	{
	    c.drawRect (30, 170, x, 220);
	}
	c.setColor (blanket);
	//blanket
	for (int x = 0 ; x < 70 ; x++)
	{
	    c.drawRoundRect (40, 240 + x, 160, 70, 10, 10);
	}
	//pillow
	for (int x = 0 ; x < 25 ; x++)
	{
	    c.drawRoundRect (80, 180 + x, 80, 25, 10, 10);
	}
	c.setColor (outsideSky);
	//outside sky
	for (int x = 0 ; x < 175 ; x++)
	{
	    c.drawRect (425, 25, x, x);
	}
	c.setColor (sun);
	//outside sun
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.drawOval (570 - x / 2, 30, x, x); //layer 1
	    c.drawOval (571 - x / 2, 30, x, x); //layer 2
	    c.drawOval (569 - x / 2, 30, x, x); //layer 3
	}
	//outisde grass
	c.setColor (grass);
	for (int x = 0 ; x < 175 ; x++)
	{
	    c.drawRect (425, 150, x, 50);
	}
	//outisde tree trunk
	c.setColor (bark);
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.drawRect (463, 100, x, 50);
	}
	//outisde tree top
	c.setColor (grass);
	for (int x = 0 ; x < 25 ; x++)
	{
	    c.drawOval (472 - x / 2, 80, x, x); //bottom middle
	    c.drawOval (457 - x / 2, 80, x, x); //bottom left
	    c.drawOval (487 - x / 2, 80, x, x); //bottom right
	    c.drawOval (465 - x / 2, 70, x, x); //top left
	    c.drawOval (480 - x / 2, 70, x, x); //top right
	    c.drawOval (472 - x / 2, 65, x, x); //top middle
	}
	//window
	c.setColor (Color.white);
	c.drawRect (425, 25, 175, 175); //border
	c.drawLine (513, 25, 513, 200); //vertical line
	c.drawLine (425, 113, 600, 113); //horizontal line
	//shelves
	for (int x = 0 ; x < 180 ; x++)
	{
	    c.drawRect (30, 60, x, 3); //top shelf
	    c.drawRect (30, 130, x, 3); //bottom shelf
	}
	//books
	c.setColor (Color.magenta);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRoundRect (30, 19, x, 40, 4, 4); //book1
	}
	c.setColor (Color.cyan);
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.drawRoundRect (60, 9, x, 50, 4, 4); //book2
	}
	c.setColor (Color.orange);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRoundRect (80, 29, x, 30, 4, 4); //book3
	}
	c.setColor (Color.red);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRoundRect (110, 19, x, 40, 4, 4); //book4
	}
	c.setColor (Color.green);
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.drawLine (140 + x, 19, 165 + x, 59); //book5
	}
	c.setColor (Color.pink);
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.drawRoundRect (180, 19, x, 40, 4, 4); //book6
	}



	//Ben's body
	c.setColor (legs);
	c.drawLine (325, 250, 325, 330); //back
	//Ben's legs
	c.drawLine (325, 330, 300, 383); //left leg
	c.drawLine (325, 330, 350, 383); //right leg
	//Ben's arms
	c.drawLine (325, 300, 300, 270); //left arm
	c.drawLine (325, 300, 350, 270); //right arm

	//Ben's head
	c.setColor (head);
	for (int x = 0 ; x < 45 ; x++)
	{
	    c.drawOval (323 - x / 2, 204, x, 45); //head
	}
	c.setColor (Color.black);
	c.fillOval (313, 222, 4, 4); //left eye
	c.fillOval (332, 222, 4, 4); //right eye
	c.setColor (Color.red);
	c.drawArc (314, 228, 20, 10, 180, 180); //frown

	//Ben's hat
	c.setColor (hat);
	for (int x = 0 ; x < 45 ; x++)
	{
	    c.fillArc (323 - x / 2, 205, x, 30, 0, 180); //hat
	    c.fillArc (345 - x / 5, 213, 8, 7, 270, 230); //lid
	}
	c.setColor (star);
	for (int x = 0 ; x < 3 ; x++)
	{
	    c.drawStar (318 + x, 207, 9, 9); //star
	}
    }
}

