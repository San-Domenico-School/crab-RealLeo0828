import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This class defines a crab. Crabs live on the beach.
 * @author Leo
 * @version 10/1/2024
 */
public class Crab extends Actor
{
    private int speed = 5;       // Default speed
    private int turnSpeed = 5;   // Default turn speed
    private int wormsEaten = 0;  // Track the number of worms eaten

    public void act()
    {
        checkKeyPress();
        turnAtEdge();
        eatWorm();
        checkLobsterCollision();
        checkGameOver();
    }

    public void checkKeyPress()
    {
        // Move forward
        if (Greenfoot.isKeyDown("up"))
        {
            move(speed);
        }

        // Turn left
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-turnSpeed);
        }

        // Turn right
        if (Greenfoot.isKeyDown("right"))
        {
            turn(turnSpeed);
        }

        // Adjust speed
        if (Greenfoot.isKeyDown("w"))
        {
            speed++;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            speed--;
        }

        // Adjust turn speed
        if (Greenfoot.isKeyDown("a"))
        {
            turnSpeed++;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turnSpeed--;
        }
    }

    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(17);  // Turns a small amount to avoid sticking to the edge
        }
    }

    public void eatWorm()
    {
        // Detect collision with Worm
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);  // Remove the worm that the crab touched
            wormsEaten++;  // Increment the number of worms eaten
            Greenfoot.playSound("chime.wav");
            // Notify the lobster to increase speed
            Lobster lobster = (Lobster) getWorld().getObjects(Lobster.class).get(0);
            lobster.increaseSpeed();
        }
    }

    public void checkLobsterCollision()
    {
        // Detect collision with Lobster
        if (isTouching(Lobster.class))
        {
            // Display "Game Over!" on the screen
            getWorld().showText("You Lose!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.playSound("slurp.wav");
            // Stop the game
            Greenfoot.stop();
        }
    }

    public void checkGameOver()
    {
        // If no more worms are left in the world, display "You Win!" and stop the game
        if (getWorld().getObjects(Worm.class).isEmpty())
        {
            // Display "You Win!" on the screen
            getWorld().showText("You Win!", getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.playSound("fanfare.wav");
            // Stop the game
            Greenfoot.stop();
        }
    }
}