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
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 800, 600, 1);
        
        GreenfootImage img = new GreenfootImage(800, 600);
        img.fill();
        setBackground(img);
        
        addStars(600);
        addObject(new rocket(), 100, getHeight()/2);
        addRocks(6);
       
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
            addObject(new rock(),y,x);
        }
    }
}
