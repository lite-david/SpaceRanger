import greenfoot.*;

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Animal
{
    private Counter count;
    
    public rocket(Counter ctr)
    {
        count = ctr;
    }
    
    public void act() 
    {
        moveAround();
        fireLaser();
        shieldUp();
    }  
    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            
            turn(-90);
            move(10);
            turn(90);
        }
        
        if(Greenfoot.isKeyDown("down"))
        {
            
            turn(90);
            move(10);
            turn(-90);
           
        }
        
        if(Greenfoot.isKeyDown("left"))
        {
            move(-10);           
        }
       
        if(Greenfoot.isKeyDown("right"))
        {
            move(10);           
        }
    }
    
    public void fireLaser()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new laser(count),getX(),getY());
        }
    }
    
    public void shieldUp()
    {
        if(canSee(Shield.class))
        {
            eat(Shield.class);
            getWorld().addObject(new halo(this),getX(),getY());
        }  
    }
}
