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
        //get the title
        addObject(titelLabel, getWidth()/2,getHeight()/2);
        //get the back ground
        GreenfootImage bgImage = new GreenfootImage("images/download.jpeg");
        bgImage.scale(getWidth(), getHeight());
        setBackground(bgImage);
        //print scentence in the world
        addObject(introduction, getWidth()/2,getHeight()/4*3-60);
        //print scentence in the world
        Label label = new Label("press space to start the game", 30);
        addObject(label,400,500);
    }
    //this class used to change the world
    public void act()
    {
        //to change the world
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        //to change the world
        if(Greenfoot.isKeyDown("f"))
        {
            Introduction introWorld = new Introduction();
            Greenfoot.setWorld(introWorld);
        }
    }
}
