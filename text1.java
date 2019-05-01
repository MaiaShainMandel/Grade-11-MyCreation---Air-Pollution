/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the first text
explaination for MyCreation*/

import java.awt.*;
import hsa.Console;

public class text1
{
    private Console c;

    public void drawText ()
    {
	//colour declaration
	Color text = new Color (0, 0, 153);
	Color erase = new Color (0, 0, 0);

	c.setColor (text);
	c.setFont (new Font ("Times New Roman", 1, 20));
	c.drawString ("Ben loves riding his skateboard through his beautiful city.", 80, 435);
	c.drawString ("But as he grows up, things change - he still loves riding his skateboard...", 20, 465);

    }


    public text1 (Console con)
    {
	c = con;
    }
    
    public void run ()
    {
    drawText ();
    }
}
