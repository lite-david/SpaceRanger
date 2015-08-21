import greenfoot.*;

/**
 * Write a description of class halo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class halo extends Actor
{
    rocket ship;
    
    public halo(rocket rckt)
    {
        ship = rckt;
    }
    
    public void act() 
    {
        setLocation(ship.getX(),ship.getY());        
        if(isTouching(rock.class))
        {
            getWorld().removeObject(this);
        }
    }    
}
