/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the main
background for MyCreation - a beautiful city park*/

import java.awt.*;
import hsa.Console;

public class goodBye
{
    private Console c;

    public goodBye (Console con)
    {
	c = con;
	draw ();
    }


    public void draw ()
    {
	//color declarations
	Color backGround = new Color (252, 136, 246);
	Color text = new Color (255, 252, 175);

	c.setColor (backGround);
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.drawRect (0, 0, x, 500);
	}
	c.setColor (text);
	c.setFont (new Font ("Times New Roman", 1, 100));
	c.drawString ("THE", 215, 250);
	c.drawString ("END", 222, 350);
	c.setFont (new Font ("Times New Roman", 1, 60));
	c.drawString ("BY: MAIA MANDEL :)", 10, 450);
	c.setFont (new Font ("Times New Roman", 1, 30));
	c.drawString ("Ben plays his part in keeping our Earth clean...", 28, 50);
	c.drawString ("you should too.", 225, 100);
    }
}

