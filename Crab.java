import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */
public class Crab extends Actor
{
    public void act()
    {
        move(3);
    }// Always place fields first in the class.
    
    public void faceDown()
    {
        turn(90);
    }
}

