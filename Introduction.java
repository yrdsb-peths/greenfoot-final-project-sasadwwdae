import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Introduction extends World
{

    /**
     * Constructor for objects of class Introduction.
     * 
     */
    public Introduction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false);
        //get the back ground
        GreenfootImage bgImage = new GreenfootImage("images/download.jpeg");
        bgImage.scale(getWidth(), getHeight());
        setBackground(bgImage);
        //print the scentence to intro the rules
        Label label = new Label("Instructions: use WASD to move", 50);
        addObject(label,400,60);
        Label label2 = new Label("try to catch the red apple", 30);
        addObject(label2,400,380);
        Label label3 = new Label("if you touch other charactor, there may have some strange things happened", 25);
        addObject(label3,400 ,200);
        Label label4 = new Label("do not touch car and the green apple will decrease your score", 30);
        addObject(label4,400 ,300);
        Label label5 = new Label("if your score drop blow to 0, the game will be finished",30);
        addObject(label5,400,120);
    }
    //to change the world
    public void act()
    {
    if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
