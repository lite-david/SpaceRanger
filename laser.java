import greenfoot.*;

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Animal
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private Counter count;
    
    public laser(Counter ctr)
    {
        count = ctr;
    }
    
    public void act() 
    {
        // Add your action code here
        
        move(25);
      
        if(canSee(rock.class))
        {
            eat(rock.class);
            getWorld().addObject(new Explosion(),getX() + 5,getY());
            getWorld().addObject(new rock(),800,Greenfoot.getRandomNumber(600));
            count.add(5);
            setLocation(getWorld().getHeight(),getWorld().getWidth());
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        
    }    
}
