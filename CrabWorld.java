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
        Crab crab = new Crab( );
        // instantiate new objects
        addObject(crab, 150,100);
        // add them to the world
        // Fruit experiment
        Fruit fruit = new Fruit( );
        addObject(fruit, 100, 100);


    }
}
