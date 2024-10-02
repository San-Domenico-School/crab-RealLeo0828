import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Lobster extends Actor
{
    private int speed = 7;  // Default speed of the lobster

    public void act()
    {
        move(speed);         // Move forward at current speed
        randomTurn();        // Randomly turn left or right
        turnAtEdge();        // Turn if hitting the edge
    }

    public void randomTurn()
    {
        // Randomly turn the lobster slightly
        if (Greenfoot.getRandomNumber(100) < 10)  // 10% chance each frame
        {
            // Randomly choose a direction to turn: left or right
            int turnAmount = Greenfoot.getRandomNumber(20) - 10;  // Turn between -10 and 10 degrees
            turn(turnAmount);
        }
    }

    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            // Turn 180 degrees to move away from the edge
            turn(180);
        }
    }

    // Method to increase the speed of the lobster when a worm is eaten
    public void increaseSpeed()
    {
        speed++;  // Increase the speed by 1 each time a worm is eaten
        System.out.println("Lobster speed increased to: " + speed);  // Print the new speed for debugging
    }
}