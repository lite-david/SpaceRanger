import greenfoot.*;

/**
 * Write a description of class halo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class halo extends Actor
{
    /**
     * Act - do whatever the halo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    rocket ship;
    
    public halo(rocket rckt){
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
