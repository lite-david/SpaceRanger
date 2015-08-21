import greenfoot.*;

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laser extends Animal
{
    private Counter count;
    
    public laser(Counter ctr)
    {
        count = ctr;
    }
    
    public void act() 
    {
        move(25);
        destroyRock();
        selfDestruct();  
    } 
    
    public void destroyRock()
    {
        if(canSee(rock.class))
        {
            eat(rock.class);
            getWorld().addObject(new Explosion(),getX() + 5,getY());
            getWorld().addObject(new rock(),800,Greenfoot.getRandomNumber(600));
            count.add(5);
            setLocation(getWorld().getHeight(),getWorld().getWidth());
        } 
    }
    
    public void selfDestruct()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
}
