 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootSound elephantSound = new GreenfootSound("Elephant.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant1.png");
    
    public Elephant()
    {
        for(int i = 0; i < 2; i++)
        {
             idle = new GreenfootImage("Images/elephant" + i + ".png");
        }
        setImage(idle);
    }
    
    int imageIndex = 0;
    public void animateElephant()
    {
        
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            move(2);
        }
        
        eat();
        animateElephant();
    }
    
    public void eat()
        {
            if(isTouching(Apple.class))
            {
                removeTouching(Apple.class);
                Myworld world = (Myworld) getWorld();
                world.createApple();
                world.increaseScore();
                elephantSound.play();
            }
        }   
}
