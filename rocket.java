import greenfoot.*;

/**
 * Write a description of class rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rocket extends Animal
{
    /**
     * Act - do whatever the rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    private Counter count;
    
    public rocket(Counter ctr)
    {
        count = ctr;
    }
    
    
    
    public void act() 
    {
        // Add your acion code here.
       
       
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
       
        if(Greenfoot.isKeyDown("space"))
        {
            getWorld().addObject(new laser(count),getX(),getY());
        }
        
        if(canSee(Shield.class))
        {
            eat(Shield.class);
            getWorld().addObject(new halo(this),getX(),getY());
        }
       
        
    }    
}
