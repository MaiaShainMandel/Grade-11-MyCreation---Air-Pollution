/* 2018.10.22
Maia Mandel
Ms. Krasteva
This program will run MyCreation - a story about Ben growing up
and watching his once beautiful city slowly become destroyed by
air pollution. this is shown with trucks, houses, and fish.
As a result, Ben learns about air pollution and its dangerous effects.
Fortunately, when he wakes up the next day, he realizes it was all just
a dream and there is still time to save ourselves from the dangerous
path we are headed towards. */

//MyCreation class
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c; // The output console

    public void intro ()
    {
	intro i = new intro (c);
    }



    public void firstBackground ()
    {
	firstBackground f = new firstBackground (c);
    }


    public void secondBackground ()
    {
	secondBackground s = new secondBackground (c);
    }


    public void thirdBackground ()
    {
	thirdBackground t = new thirdBackground (c);
    }


    public void fourthBackground ()
    {
	fourthBackground f = new fourthBackground (c);
    }


    public void fifthBackground ()
    {
	fifthBackground f = new fifthBackground (c);
    }


    public void youngBen ()
    {
	youngBen y = new youngBen (c);
	y.start ();
	try
	{
	    y.join ();
	}
	catch (Exception e)
	{
	}
    }


    public void fish ()
    {
	fish f = new fish (c);
	f.start ();
    }


    public void gas ()
    {
	gas g = new gas (c);
	g.start ();
    }


    public void text1 ()
    {
	text1 t = new text1 (c);
	t.run ();
    }


    public void text2 ()
    {
	text2 t = new text2 (c);
	t.run ();
    }


    public void text3 ()
    {
	text3 t = new text3 (c);
	t.run ();
    }


    public void text4 ()
    {
	text4 t = new text4 (c);
	t.run ();
    }


    public void text5 ()
    {
	text5 t = new text5 (c);
	t.run ();
    }


    public void skateboard2 ()
    {
	skateboard2 s = new skateboard2 (c);
	s.run ();
    }


    public void skateboard3 ()
    {
	skateboard3 s = new skateboard3 (c);
	s.run ();
    }


    public void skateboard4 ()
    {
	skateboard4 s = new skateboard4 (c);
	s.run ();
    }


    public void clock ()
    {
	clock t = new clock (c);
	t.run ();
    }


    //adds the movingTrucks thread to MyCreation
    public void movingTrucks ()
    {
	//comment out 2 of the 3 instances to see how the overloads work
	movingTrucks t = new movingTrucks (c);
	//starts the thread
	t.start ();
	try
	{
	    t.join ();
	}
	catch (Exception e)
	{
	}
	movingTrucks t1 = new movingTrucks (c, Color.cyan, Color.orange, 8);
	//starts the thread
	t1.start ();
	try
	{
	    t1.join ();
	}
	catch (Exception e)
	{
	}
	movingTrucks t2 = new movingTrucks (c, Color.magenta, Color.yellow, 12);
	//starts the thread
	t2.start ();
	try
	{
	    t2.join ();
	}
	catch (Exception e)
	{
	}
    }



    //adds the birds thread to MyCreation
    public void birds ()
    {
	//creates the cloud thread
	//comment out 2 of the 3 instances to see how the overloads work
	birds b = new birds (c);
	//starts the thread
	b.start ();
	birds b1 = new birds (c, Color.green, 13, 300);
	//starts the thread
	b1.start ();
	birds b2 = new birds (c, Color.red, 25, 200);
	//starts the thread
	b2.start ();
	try
	{
	    b2.join ();
	}
	catch (Exception e)
	{
	}
    }


    public void goodBye ()
    {
	goodBye g = new goodBye (c);
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Air Pollution Story");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.intro ();
	z.firstBackground ();
	z.text1 ();
	z.youngBen ();
	z.birds ();
	z.secondBackground ();
	z.text2 ();
	z.movingTrucks ();
	z.skateboard2 ();
	z.thirdBackground ();
	z.text3 ();
	z.gas ();
	z.skateboard3 ();
	z.fourthBackground ();
	z.text4 ();
	z.fish ();
	z.skateboard4 ();
	z.fifthBackground ();
	z.text5 ();
	z.clock ();
	z.goodBye ();
    }
} // MyCreation class


