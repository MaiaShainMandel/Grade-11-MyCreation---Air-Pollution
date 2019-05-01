/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the second text
for MyCreation*/

import java.awt.*;
import hsa.Console;

public class text4
{
    private Console c;

    public void drawText ()
    {
	//colour declaration
	Color text = new Color (0, 0, 153);
	Color erase = new Color (0, 0, 0);

	c.setColor (text);
	c.setFont (new Font ("Times New Roman", 1, 20));
	c.drawString ("The beach Ben used to swim in is now awfully dirty.", 110, 435);
	c.drawString ("Fish can't even survive in the polluted water!", 130, 470);

    }


    public text4 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawText ();
    }
}
