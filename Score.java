import greenfoot.*;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Counter counter;
    //int score;
    public Score(Counter ctr)
    {
        counter = ctr;
    }
    
    public void act() 
    {
        // Add your action code here.
        counter.add(1);
        Greenfoot.delay(1);
        
    }    
}
