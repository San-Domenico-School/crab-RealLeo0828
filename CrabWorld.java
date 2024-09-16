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
        
        addObject(fruit, 200, 100);
        Fruit fruit2 = new Fruit( );
        addObject(fruit2, 300, 100);
        
        Fruit fruit3 = new Fruit("Strawberry");
        Fruit fruit4 = new Fruit("Banana");
        addObject(fruit3, 100, 200);
        addObject(fruit4, 200, 200);
        
        Fruit fruit5 = new Fruit("Cherry", 50, 10, 0);
        addObject(fruit5, 100, 500);




    }
}
