/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the second text
for MyCreation*/

import java.awt.*;
import hsa.Console;

public class text5
{
    private Console c;

    public void drawText ()
    {
	//colour declaration
	Color text = new Color (0, 0, 153);
	Color erase = new Color (0, 0, 0);

	c.setColor (text);
	c.setFont (new Font ("Times New Roman", 1, 15));
	c.drawString ("Beep beep beep!! When Ben's alarm goes off the next day, he realizes it was all a dream!", 13, 430);
	c.drawString ("Air pollution didn't ruin our planet yet, but now that Ben understands the dangerous path we", 13, 455);
	c.drawString ("are headed toward, he's going to make a bigger effort to reduce his negative ecological impact.", 13, 480);

    }


    public text5 (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawText ();
    }
}
