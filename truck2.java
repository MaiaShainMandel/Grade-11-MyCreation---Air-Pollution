/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will create trucks for
the second scene of MyCreation*/


import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class truck2 extends Thread
{
    private Console c;
    private Color Truck;
    private Color Door;
    private int delay = 7;

    
    public void drawTruck ()
    {
	//colour declaration
	Color wheels = new Color (255, 128, 0);
	Color road = new Color (128, 128, 128);
	Color skateboard = new Color (204, 0, 0);
	Color hat = new Color (0, 0, 153);
	Color legs = new Color (11, 114, 33);
	Color body = new Color (0, 255, 55);
	Color head = new Color (255, 229, 204);
	Color back = new Color (255, 255, 0);
	Color grass = new Color (0, 255, 0);

	for (int x = 0 ; x < 641 ; x++)
	{
	    //erase commands
	    c.setColor (road);
	    c.fillRect (-1 + x, 0, 300, 160);

	    c.setColor (Truck);
	    c.fillRoundRect (0 + x, 5, 175, 125, 10, 10); //truck2 body
	    c.setColor (Color.black);
	    c.drawRoundRect (0 + x, 5, 175, 125, 10, 10); //truck2 body outline

	    c.setColor (Door);
	    c.fillRect (185 + x, 50, 60, 80); //left front
	    c.fillRect (245 + x, 80, 50, 50); //right front

	    c.setColor (back);
	    c.fillRect (275 + x, 85, 15, 5); //relflector
	    c.setColor (Color.black);
	    c.drawRect (275 + x, 85, 15, 5); //relflector outline

	    c.setColor (Color.black);
	    c.fillRect (175 + x, 80, 10, 50); //mid divider

	    c.setColor (Color.black);
	    c.drawArc (50 + x, 90, 70, 70, 0, 180); //left outline wheel
	    c.drawLine (0 + x, 125, 50 + x, 125); //left bottom line body of truck2
	    c.drawLine (120 + x, 125, 175 + x, 125); //right bottom line body of truck2
	    c.drawArc (220 + x, 95, 65, 65, 0, 180); //right outline wheel
	    c.drawLine (185 + x, 125, 220 + x, 125); //left bottom line front of truck2
	    c.drawLine (285 + x, 125, 295 + x, 125); //right bottom line front of truck2

	    c.setColor (road);
	    c.fillArc (55 + x, 95, 60, 60, 340, 220); //left background wheel
	    c.fillArc (225 + x, 100, 55, 55, 340, 220); //right background wheel

	    c.setColor (legs);
	    c.fillOval (60 + x, 100, 50, 50); //left wheel
	    c.fillOval (230 + x, 105, 45, 45); //right wheel

	    c.setColor (head);
	    c.fillArc (70 + x, 110, 30, 30, 0, 180); //left inside top wheel
	    c.fillArc (240 + x, 115, 25, 25, 0, 180); //right inside top wheel

	    c.setColor (hat);
	    c.fillArc (70 + x, 110, 30, 30, 180, 180); //left inside bottom wheel
	    c.fillArc (240 + x, 115, 25, 25, 180, 180); //right inside bottom wheel

	    c.setColor (Door);
	    int truck2X[] = {245 + x, 245 + x, 270 + x, 295 + x};  //x axis for front of truck2
	    int truck2Y[] = {80, 50, 75, 80};  //y axis for front of truck2

	    c.fillPolygon (truck2X, truck2Y, 4);


	    c.setColor (Color.blue);

	    int windowX[] = {190 + x, 240 + x, 260 + x, 190 + x};
	    int windowY[] = {55, 55, 75, 75};

	    c.fillPolygon (windowX, windowY, 4);
	    c.setColor (Color.black);
	    c.drawPolygon (windowX, windowY, 4);

	    //delay
	    try
	    {
		Thread.sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    //basic drawTruck
    public truck2 (Console con)
    {
	c = con;
	Truck = new Color (255, 255, 1);
	Door = new Color (255, 0, 0);
    }


    // drawTruck with a Color parameter
    public truck2 (Console con, Color n, Color n1)
    {
	c = con;
	Truck = n;
	Door = n1;
    }


    // drawTruck with a Color parameter, and a new delay time
    public truck2 (Console con, Color n, Color n1, int t)
    {
	c = con;
	Truck = n;
	Door = n1;
	delay = t;

    }


    public void run ()
    {
	drawTruck ();
    }
}


