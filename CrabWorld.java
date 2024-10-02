import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This class defines CrabWorld
 * @author Leo
 * @version 10/1/2024
 */
public class CrabWorld extends World
{
    private int numberOfWorms = 10;  // Set the number of worms you want to generate

    public CrabWorld()
    {    
        // Create a new world with 600x400 cells, each 1x1 pixels
        super(600, 600, 1);  

        // Add the crab at the center of the world
        Crab crab = new Crab();
        addObject(crab, getWidth()/2, getHeight()/2);

        // Add the lobster
        Lobster lobster = new Lobster();
        addObject(lobster, getWidth() - 50, getHeight()/2);  // Position the lobster somewhere on the right

        // Generate the worms at random positions
        generateWorms(numberOfWorms);
    }

    // Method to generate worms randomly in the world
    public void generateWorms(int count)
    {
        for (int i = 0; i < count; i++)
        {
            // Create a new worm
            Worm worm = new Worm();

            // Randomly position the worm in the world
            int x = Greenfoot.getRandomNumber(getWidth());  // Random x position
            int y = Greenfoot.getRandomNumber(getHeight()); // Random y position

            // Add the worm to the world at the random position
            addObject(worm, x, y);
        }
    }
}