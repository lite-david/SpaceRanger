import greenfoot.*;
import java.awt.*;


/**
 * Write a description of class space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class space extends World
{

    /**
     * Constructor for objects of class space.
     * 
     */

    public static int rockSpeed;
    public static int rockNumber = 0;

    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 800, 600, 1);

        GreenfootImage img = new GreenfootImage(800, 600);
        img.fill();
        setBackground(img);

        
        Counter count = new Counter();
        addObject(count,50,50);  
        
        addStars(600);
        rocket rckt = new rocket(count);
        addObject(rckt, 100, getHeight()/2);
        addObject(new halo(rckt),100,getHeight()/2);
        addRocks(5);
        rockSpeed = 10;
        addObject(new controller(count),1,1);
        addObject(new laser(count),800,600);
        //addObject(new Score(count),1,1);
        

        prepare();
    }

    public void addStars(int howMany)
    {
        for(int s=0; s<howMany; s++)
        {
            int x = Greenfoot.getRandomNumber(getHeight());
            int y = Greenfoot.getRandomNumber(getWidth());
            addObject(new Star(),y,x);
        }
    }

    public void addRocks(int howMany)
    {
        for(int i = 0; i< howMany; i++ )
        {
            int x = Greenfoot.getRandomNumber(getHeight());
            int y = Greenfoot.getRandomNumber(getWidth());
            addObject(new rock(),y + 300,x);
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}
