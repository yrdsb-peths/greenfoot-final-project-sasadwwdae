import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author Henry 
 * @version June 1st
 * this methos is used to let the elephant to dizzin for a while.
 */
public class Car extends Actor
{
    int speed = 3;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-speed,getY());
        
        if(getX() <= 0)
        {
            MyWorld world = (MyWorld) getWorld();
            world.createCar();
        }
        
        if(isTouching(appleOne.class))
        {
            
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
    
}
