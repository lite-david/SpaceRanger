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
    
    public rocket(){
        turn(-90);
    }
    
    
    
    public void act() 
    {
        // Add your acion code here.
       
        if(Greenfoot.isKeyDown("left")){
            
            turn(-90);
            move(10);
            turn(90);
        }
        if(Greenfoot.isKeyDown("right")){
            
             turn(90);
            move(10);
            turn(-90);
           
        }
       
        
    }    
}
