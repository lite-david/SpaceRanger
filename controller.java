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
    Counter counter;
    private int score;
    
    public controller(Counter cntr)
    {
        Greenfoot.setSpeed(speed);
        counter = cntr;
    }
    
    public void act() 
    {
        score = counter.getValue();
        if(score > 200)
        {
            if(score % 200 == 0)
            {
                getWorld().addObject(new Shield(),800,Greenfoot.getRandomNumber(800));
            }
            
        }
    }    
}
