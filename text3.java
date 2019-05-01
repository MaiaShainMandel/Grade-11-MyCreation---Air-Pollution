/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the second text
for MyCreation*/

import java.awt.*;
import hsa.Console;

public class text3
{
    private Console c;

    public void drawText ()
    {
	//colour declaration
	Color text = new Color (0, 0, 153);
	Color erase = new Color (0, 0, 0);

	c.setColor (text);
	c.setFont (new Font ("Times New Roman", 1, 18));
	c.drawString ("Lots of new buildings are being put up too.", 20, 435);
	c.drawString ("Sure the buildings are bright and colourful, but the deadly gas they release", 20, 460);
	c.drawString ("makes the skies dark and hueless.", 20, 485);

    }


    public text3 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawText ();
    }
}
