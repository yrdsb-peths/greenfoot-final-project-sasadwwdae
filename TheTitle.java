import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheTitle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheTitle extends World
{
    Label titelLabel = new Label("Catch Apple",60);
    Label introduction = new Label("introduction(press F)",40);
    
    /**
     * Constructor for objects of class TheTitle.
     * 
     */
    public TheTitle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(titelLabel, getWidth()/2,getHeight()/2);
        
        GreenfootImage bgImage = new GreenfootImage("images/download.jpeg");
        bgImage.scale(getWidth(), getHeight());
        setBackground(bgImage);
        
        addObject(introduction, getWidth()/2,getHeight()/4*3-60);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        if(Greenfoot.isKeyDown("f"))
        {
            Introduction introWorld = new Introduction();
            Greenfoot.setWorld(introWorld);
        }
        
    }
    
    
}
