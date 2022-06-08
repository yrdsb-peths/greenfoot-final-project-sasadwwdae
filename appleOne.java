import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AppleOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class appleOne extends Actor
{
    int speed = 2;
    /**
     * Act - do whatever the appleOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-speed,getY());
        
        MyWorld world = (MyWorld) getWorld();
        if(getX() <= 0)
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
