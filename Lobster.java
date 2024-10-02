import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Lobster extends Actor
{
    public void act()
    {
        move(5);           // Move forward
        randomTurn();      // Randomly turn left or right
        turnAtEdge();      // Turn if hitting the edge
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
            // Turn 120 degrees to move away from the edge
            turn(120);
        }
    }
}
