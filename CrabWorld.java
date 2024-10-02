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
       addworm();
       addlobster();
    }
    
    private void addPlayer()
    {
        
        
        Crab crab = new Crab( );
    
        // instantiate new objects
        addObject(crab, 470,100);
        // add them to the world
        
    
    }
    
    private void addworm()
    {
        Worm worm = new Worm();
        addObject(worm, 100,100);
        Worm worm1 = new Worm();
        addObject(worm, 100,100);
        Worm worm2 = new Worm();
        addObject(worm, 100,100);
        Worm worm3 = new Worm();
        addObject(worm, 100,100);
        addObject(worm1, 200,100);
        addObject(worm2, 200,200);
        addObject(worm3, 300,400);
        System.out.println("worms added");
    }
    
    private void addlobster()
    {
        Lobster lobster = new Lobster();
        System.out.println("lobster added");
        addObject(lobster, 550, 270);
    }
}
