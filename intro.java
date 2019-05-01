/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the main
background for MyCreation - a beautiful city park*/

import java.awt.*;
import hsa.Console;

public class intro
{
    private Console c;

    public intro (Console con)
    {
	c = con;
	draw ();
    }


    public void draw ()
    {
	//color declarations
	Color backGround = new Color (252, 136, 246);
	Color textTitle = new Color (255, 252, 175);
	Color textAbout = new Color (239, 52, 52);

	c.setColor (backGround);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, 500);
	}
	c.setColor (textTitle);
	c.setFont (new Font ("Times New Roman", 1, 54));
	c.drawString ("MyCreation : Air Pollution", 10, 100);
	c.setFont (new Font ("Times New Roman", 1, 35));
	c.drawString ("A sequel to the 2017 #1 best selling", 50, 200);
	c.drawString ("moving pictue,", 215, 250);
	c.drawString ("MyCreation : Water Pollution", 100, 300);
	c.setColor (textAbout);
	c.drawString ("This short story shows the", 125, 400);
	c.drawString ("dangers of air pollition.", 147, 450);
	try
	    {
		Thread.sleep (8000);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }

