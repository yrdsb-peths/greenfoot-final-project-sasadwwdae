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
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-3);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+3);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3,getY());
        }
        eat();
        resetLocation();
    }
    
    public void eat()
        {
            if(isTouching(Apple.class))
            {
                removeTouching(Apple.class);
                MyWorld world = (MyWorld) getWorld();
                world.createApple();
                world.increaseScore();
            }
            if(isTouching(appleOne.class))
            {
                removeTouching(appleOne.class);
                MyWorld world = (MyWorld) getWorld();
                world.createAppleOne();
                world.increaseScore();
            }
            
            MyWorld world = (MyWorld) getWorld();
            
            if(isTouching(Car.class))
            {
                world.gameOver();
                world.removeObject(this);
            }
        }
    
    public void resetLocation()
    {
        if(getX() <= 0)
        {
            setLocation(getX()+10,getY());
        }
        
        if(getX() >= 800)
        {
            setLocation(getX()-10,getY());
        }
        
        if(getY() >= 600)
        {
            setLocation(getX(),getY()-10);
        }
        
        if(getY() <= 0)
        {
            setLocation(getX(),getY()+10);
        }
    }
}
