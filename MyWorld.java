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
        //get the back ground
        GreenfootImage bgImage = new GreenfootImage("images/download.jpeg");
        bgImage.scale(getWidth(), getHeight());
        setBackground(bgImage);
        //create elephant class
        Elephant elephant = new Elephant();
        addObject(elephant,100,300);
        //print the score you get
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel,50,50);
        //create other class
        createApple();
        createAppleOne();
        createCar();
        createGreenApple();
        createSnake();
        //the background music
        Background.play();
    }
    //
    //let others know how to end the game
    //
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over(press space)",80);
        addObject(gameOverLabel,400,300);
        
    }
    //
    //add the score 
    //
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
    //
    //decrease the score 
    //
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
    //
    //create apple class 
    //
    public void createApple()
    {
        Apple apple = new Apple();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        apple.setSpeed(level);
        addObject(apple,x,y);
    }
    //
    //create another apple class 
    //
    public void createAppleOne()
    {
        appleOne appleOne = new appleOne();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        appleOne.setSpeed(level);
        addObject(appleOne,x,y);
    }
    //
    //create the car class
    //
    public void createCar()
    {
        Car car = new Car();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        car.setSpeed(level);
        addObject(car,x,y); 
    }
    //
    //create the banana class
    //
    public void createBanana()
    {
        Banana banana = new Banana();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        addObject(banana,x,y);
    }
    //
    //create the greenapple class
    //
    public void createGreenApple()
    {
        GreenApple greenApple = new GreenApple();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        addObject(greenApple,x,y);
    }
    //
    //create the snake class
    //
    public void createSnake()
    {
        Snake snake = new Snake();
        int y = Greenfoot.getRandomNumber(600);
        int x = (800);
        addObject(snake,x,y);
    }
    //this class to change the world
    public void act()
    {
        //to change the world
        if(score < 0)
        {
            GameOver world = new GameOver();
            Greenfoot.setWorld(world);
            Background.pause();
        }
        //to change the world
        if(Greenfoot.isKeyDown("f"))
        {
            GameOver world = new GameOver();
            Greenfoot.setWorld(world);
            Background.pause();
        }
        //to change the world
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            Background.pause();
        }
    }
}
