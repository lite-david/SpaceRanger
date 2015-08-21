import greenfoot.*;

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends Actor
{
    /**
     * Act - do whatever the Shield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public void act() 
    {
        move(-4);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    } 
    
  
}
