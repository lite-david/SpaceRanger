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
    
    private int speed;
    private int number;
        
    public void setRockSpeed()
    {
        speed = space.rockSpeed;
    }
    
    
    public void act() 
    {
       setRockSpeed();
       move(-(space.rockSpeed));
         if(canSee(rocket.class)){
            eat(rocket.class);
            //GreenfootImage("GAME OVER",20,"black","white");
            getWorld().addObject(new Explosion(),getX() + 5,getY());
            getWorld().addObject(new Gameover(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            Greenfoot.stop();
            
        }
        
        moveAround();
        
        if(isAtEdge())
        {
           
            space.rockNumber++;
            getWorld().addObject(new rock(),800,Greenfoot.getRandomNumber(600));
   
            getWorld().removeObject(this);
        }
        

        
    }
    
    public void moveAround()
    {
        
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if(getX() <= 5 || getX() > getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if(getY() <= 5 || getY() > getWorld().getWidth() - 5)
        {
            turn(180);
        }
    }
    
        
}
