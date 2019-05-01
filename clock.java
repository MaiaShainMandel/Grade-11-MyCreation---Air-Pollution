/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create the
animation for the clock in MyCreation*/

import java.awt.*;
import hsa.Console;

public class clock
{
    private Console c;

    public void drawClock ()
    {
	//colour declaration
	Color clock = new Color (255, 0, 0);
	Color paintWall = new Color (255, 247, 168);
	//clock moves up
	for (int x = 0 ; x < 20 ; x++)
	{
	    //erase
	    c.setColor (paintWall);
	    c.fillRect (104, 83 - x, 32, 47);
	    //clock
	    c.setColor (clock);
	    c.drawOval (105, 93 - x, 30, 30); //outline of clock
	    c.setColor (Color.black);
	    c.drawLine (120, 98 - x, 120, 93 - x); //12 o'clock
	    c.setColor (Color.black);
	    c.drawLine (120, 123 - x, 120, 117 - x); //6 o'clock
	    c.setColor (Color.black);
	    c.drawLine (105, 108 - x, 110, 108 - x); //9 o'clock
	    c.setColor (Color.black);
	    c.drawLine (135, 108 - x, 130, 108 - x); //3 o'clock
	    c.setColor (Color.black);
	    c.drawOval (120, 108 - x, 1, 1); //middle dot
	    c.setColor (Color.black);
	    c.drawLine (120, 108 - x, 128, 102 - x); //minutes hand (15 min)
	    c.setColor (Color.black);
	    c.drawLine (120, 108 - x, 116, 117 - x); //hours hand (7 hours)
	    c.setColor (Color.black);
	    c.drawLine (110, 121 - x, 105, 128 - x); //left stand
	    c.setColor (Color.black);
	    c.drawLine (130, 121 - x, 135, 128 - x); //right stand
	    c.setColor (Color.black);
	    c.drawOval (110, 88 - x, 20, 5); //top snooze
	    c.setColor (Color.black);
	    c.drawOval (118, 84 - x, 3, 3); //snooze button
	    //delay
	    try
	    {
		Thread.sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}
	//clock moves down
	for (int x = 0 ; x < 20 ; x++)
	{
	    //erase
	    c.setColor (paintWall);
	    c.fillRect (104, 63 + x, 32, 47);
	    //clock
	    c.setColor (clock);
	    c.drawOval (105, 73 + x, 30, 30); //outline of clock
	    c.setColor (Color.black);
	    c.drawLine (120, 78 + x, 120, 73 + x); //12 o'clock
	    c.setColor (Color.black);
	    c.drawLine (120, 103 + x, 120, 97 + x); //6 o'clock
	    c.setColor (Color.black);
	    c.drawLine (105, 88 + x, 110, 88 + x); //9 o'clock
	    c.setColor (Color.black);
	    c.drawLine (135, 88 + x, 130, 88 + x); //3 o'clock
	    c.setColor (Color.black);
	    c.drawOval (120, 88 + x, 1, 1); //middle dot
	    c.setColor (Color.black);
	    c.drawLine (120, 88 + x, 128, 82 + x); //minutes hand (15 min)
	    c.setColor (Color.black);
	    c.drawLine (120, 88 + x, 116, 97 + x); //hours hand (7 hours)
	    c.setColor (Color.black);
	    c.drawLine (110, 101 + x, 105, 108 + x); //left stand
	    c.setColor (Color.black);
	    c.drawLine (130, 101 + x, 135, 108 + x); //right stand
	    c.setColor (Color.black);
	    c.drawOval (110, 68 + x, 20, 5); //top snooze
	    c.setColor (Color.black);
	    c.drawOval (118, 64 + x, 3, 3); //snooze button
	    //delay
	    try
	    {
		Thread.sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}
	//clock moves up second time
	for (int x = 0 ; x < 20 ; x++)
	{
	    //erase
	    c.setColor (paintWall);
	    c.fillRect (104, 83 - x, 32, 47);
	    //clock
	    c.setColor (clock);
	    c.drawOval (105, 93 - x, 30, 30); //outline of clock
	    c.setColor (Color.black);
	    c.drawLine (120, 98 - x, 120, 93 - x); //12 o'clock
	    c.setColor (Color.black);
	    c.drawLine (120, 123 - x, 120, 117 - x); //6 o'clock
	    c.setColor (Color.black);
	    c.drawLine (105, 108 - x, 110, 108 - x); //9 o'clock
	    c.setColor (Color.black);
	    c.drawLine (135, 108 - x, 130, 108 - x); //3 o'clock
	    c.setColor (Color.black);
	    c.drawOval (120, 108 - x, 1, 1); //middle dot
	    c.setColor (Color.black);
	    c.drawLine (120, 108 - x, 128, 102 - x); //minutes hand (15 min)
	    c.setColor (Color.black);
	    c.drawLine (120, 108 - x, 116, 117 - x); //hours hand (7 hours)
	    c.setColor (Color.black);
	    c.drawLine (110, 121 - x, 105, 128 - x); //left stand
	    c.setColor (Color.black);
	    c.drawLine (130, 121 - x, 135, 128 - x); //right stand
	    c.setColor (Color.black);
	    c.drawOval (110, 88 - x, 20, 5); //top snooze
	    c.setColor (Color.black);
	    c.drawOval (118, 84 - x, 3, 3); //snooze button
	    //delay
	    try
	    {
		Thread.sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}
	//clock moves down second time
	for (int x = 0 ; x < 20 ; x++)
	{
	    //erase
	    c.setColor (paintWall);
	    c.fillRect (104, 63 + x, 32, 47);
	    //clock
	    c.setColor (clock);
	    c.drawOval (105, 73 + x, 30, 30); //outline of clock
	    c.setColor (Color.black);
	    c.drawLine (120, 78 + x, 120, 73 + x); //12 o'clock
	    c.setColor (Color.black);
	    c.drawLine (120, 103 + x, 120, 97 + x); //6 o'clock
	    c.setColor (Color.black);
	    c.drawLine (105, 88 + x, 110, 88 + x); //9 o'clock
	    c.setColor (Color.black);
	    c.drawLine (135, 88 + x, 130, 88 + x); //3 o'clock
	    c.setColor (Color.black);
	    c.drawOval (120, 88 + x, 1, 1); //middle dot
	    c.setColor (Color.black);
	    c.drawLine (120, 88 + x, 128, 82 + x); //minutes hand (15 min)
	    c.setColor (Color.black);
	    c.drawLine (120, 88 + x, 116, 97 + x); //hours hand (7 hours)
	    c.setColor (Color.black);
	    c.drawLine (110, 101 + x, 105, 108 + x); //left stand
	    c.setColor (Color.black);
	    c.drawLine (130, 101 + x, 135, 108 + x); //right stand
	    c.setColor (Color.black);
	    c.drawOval (110, 68 + x, 20, 5); //top snooze
	    c.setColor (Color.black);
	    c.drawOval (118, 64 + x, 3, 3); //snooze button
	    //delay
	    try
	    {
		Thread.sleep (7);
	    }
	    catch (Exception e)
	    {
	    }
	}
	
	//pausing to give the user time to read the text box
	 try
	    {
		Thread.sleep (15000);
	    }
	    catch (Exception e)
	    {
	    }
    }



    public clock (Console con)
    {
	c = con;
    }


    public void run ()
    {
	drawClock ();
    }
}
