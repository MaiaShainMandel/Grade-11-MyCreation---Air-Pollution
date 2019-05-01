/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the second text
for MyCreation*/

import java.awt.*;
import hsa.Console;

public class text2
{
    private Console c;

    public void drawText ()
    {
	//colour declaration
	Color text = new Color (0, 0, 153);
	Color erase = new Color (0, 0, 0);

	c.setColor (text);
	c.setFont (new Font ("Times New Roman", 1, 20));
	c.drawString ("...but his city is no longer beautiful. The park he used to play in as a boy", 20, 435);
	c.drawString ("was destroyed to build a road, which is always busy with traffic.", 55, 465);
    }


    public text2 (Console con)
    {
	c = con;
    }
    
    public void run ()
    {
    drawText ();
    }
}
