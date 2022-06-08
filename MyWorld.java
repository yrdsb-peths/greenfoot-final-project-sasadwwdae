import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public int score; 
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        
        Elephant elephant = new Elephant();
        addObject(elephant,100,300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50,50);
        
        createApple();
        createAppleOne();
        createCar();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over:",100);
        addObject(gameOverLabel,300,200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        if(score % 10 == 0)
        {
            level += 1;
        }
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        apple.setSpeed(level);
        addObject(apple,x,y);
    }
    
    public void createAppleOne()
    {
        appleOne appleOne = new appleOne();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        appleOne.setSpeed(level);
        addObject(appleOne,x,y);
    }
    
    public void createCar()
    {
        Car car = new Car();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        car.setSpeed(level);
        addObject(car,x,y);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
