import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends Actor
{
    /**
     * Act - do whatever the Gameover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gameover() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("GAME OVER",20,Color.BLACK,Color.WHITE));
        //img.drawRect(0,0,99,99);
        //img.setColor("blue");
        //img.drawString("Game over",5,10);
    }    
}
