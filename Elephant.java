import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    int speed = 3;
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-speed);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+speed);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+speed,getY());
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-speed,getY());
        }
        eat();
        resetLocation();
    }
    
    public void eat()
        {
            MyWorld world = (MyWorld) getWorld();
            
            if(isTouching(Apple.class))
            {
                removeTouching(Apple.class);
                world.createApple();
                world.increaseScore();
            }
            
            if(isTouching(appleOne.class))
            {
                removeTouching(appleOne.class);
                world.createAppleOne();
                world.increaseScore();
            }
            
            if(isTouching(Banana.class))
            {
                removeTouching(Banana.class);
                speed+=1;
            }
            
            if(isTouching(GreenApple.class))
            {
                removeTouching(GreenApple.class);
                world.createGreenApple();
                world.decreaseScore();
            }
            
            if(isTouching(Snake.class))
            {
                removeTouching(Snake.class);
                speed-=1;
                world.createSnake();
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
