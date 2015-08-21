import greenfoot.*;

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Animal
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public enemy()
    {
        turn(-90);
    }
    
    public void act() 
    {
        // Add your action code here.
        move(-10);
        
        
    }    
}
