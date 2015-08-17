import greenfoot.*;

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Animal
{
    /**
     * Act - do whatever the rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
       move(-3);
         if(canSee(rocket.class)){
            eat(rocket.class);
            //GreenfootImage("GAME OVER",20,"black","white");
            getWorld().addObject(new Gameover(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
            
        }
        
        if(isAtEdge())
        {
            getWorld().addObject(new rock(),1000,Greenfoot.getRandomNumber(600) + 200);
            getWorld().removeObject(this);
        }
    }
    
    
}
