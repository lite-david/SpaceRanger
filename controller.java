import greenfoot.*;

/**
 * Write a description of class controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class controller extends Actor
{
    /**
     * Act - do whatever the controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * 
     */
  
    private int speed = 45;
    private int factor = 50;
    
    public controller()
    {
        Greenfoot.setSpeed(speed);
    }
    
    public void act() 
    {
        if(space.rockNumber % factor == 0)
        {
            factor += 25;
            speed++;
            if(speed > 65){
                speed = 65;
            }
            Greenfoot.setSpeed(speed);
        }
    }    
}
