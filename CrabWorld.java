import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
    private void prepareScene()
    {
       addPlayer();
       addFood();
       addEnemy();
        System.out.println(Greenfoot.getRandomNumber(10));
        System.out.println(Greenfoot.getRandomNumber(10)); 
        System.out.println(Greenfoot.getRandomNumber(10));
    }
    
    private void addPlayer()
    {
        
        
        Crab crab = new Crab( );
        
        // instantiate new objects
        addObject(crab, 470,100);
        // add them to the world
        
        crab.faceDown();
    }
    
    private void addFood()
    {
        System.out.println("Food added");
    }
    
    private void addEnemy()
    {
        System.out.println("Enemy added");
    }
}
