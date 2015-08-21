import greenfoot.*;

/**
 * Write a description of class rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rock extends Animal
{
    private int speed;
    private int number;
    
    public void act() 
    {
        setRockSpeed();
        move(-(space.rockSpeed));
        if(canSee(rocket.class))
        {
            destroyRocket();
        } 
        moveAround();
        if(isAtEdge())
        {
            destruct();
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
    
    public void setRockSpeed()
    {
        speed = space.rockSpeed;
    }
    
    public void destroyRocket()
    {
        eat(rocket.class);
        getWorld().addObject(new Explosion(),getX() + 5,getY());
        getWorld().addObject(new Gameover(),getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
    }
    
    public void destruct()
    {
        space.rockNumber++;
        getWorld().addObject(new rock(),800,Greenfoot.getRandomNumber(600));
        getWorld().removeObject(this);
    }
}
