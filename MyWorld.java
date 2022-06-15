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
    GreenfootSound Background = new GreenfootSound("BackgroundMusic.mp3");
    /**
     * Constructor for objects of class Myworld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        
        GreenfootImage bgImage = new GreenfootImage("images/download.jpeg");
        bgImage.scale(getWidth(), getHeight());
        setBackground(bgImage);
        
        Elephant elephant = new Elephant();
        addObject(elephant,100,300);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50,50);
        
        createApple();
        createAppleOne();
        createCar();
        createGreenApple();
        createSnake();
        
        Background.play();
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
            createBanana();
        }
    }
    
    public void decreaseScore()
    {
        score--;
        scoreLabel.setValue(score);
        if(score % 10 == 0)
        {
            level += 1;
            createBanana();
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
    
    public void createBanana()
    {
        Banana banana = new Banana();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        addObject(banana,x,y);
    }
    
    public void createGreenApple()
    {
        GreenApple greenApple = new GreenApple();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        addObject(greenApple,x,y);
    }
    
    public void createSnake()
    {
        Snake snake = new Snake();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        addObject(snake,x,y);
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
