import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */

public class Crab extends Actor
{
    private int speed = 1;       // Default speed
    private int turnSpeed = 1;   // Default turn speed

    public void act()
    {
        checkKeyPress();
        turnAtEdge();
        eatWorm();
        collisionWithLobster();
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
        if (isTouching(Worm.class))
            {
                removeTouching(Worm.class);
            }
    }
    
    public void collisionWithLobster()
    {
        if (isTouching(Lobster.class))
            {
                Greenfoot.stop();
                System.out.println("Game Over!");
                
            }
    }
    
    public void checkGameOver()
    {
        if (getWorld().getObjects(Worm.class).isEmpty())
        {
            Greenfoot.stop();
            System.out.println("You Win!");
        }
    }
}
