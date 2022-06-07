import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author Henry
 * @version may 31
 */
public class TitleScreen extends World
{

    Label titelLabel = new Label("Hungry Elephant",60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titelLabel, getWidth()/2,getHeight()/2);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Myworld gameWorld = new Myworld();
            Greenfoot.setWorld(gameWorld);
        }
        
    }
}
