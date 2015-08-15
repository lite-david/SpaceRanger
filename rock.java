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
    
    public rock(){
        
        turn(90);
        
    }
    public void act() 
    {
       move(3);
        if(isAtEdge()){
             getWorld().removeObject(this);
        }
         if(canSee(rocket.class)){
            eat(rocket.class);
        }
    }
    
    
}
