import kareltherobot.*;

/**
 * Write a description of class MazeWalker here.
 * 
 * @author Brent Gray
 * @version 2015-10-16-1423
 */
public class MazeWalker extends Robot implements Directions, MazeSolver
{
    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }

    public void followWallRight()
    {
        if (!frontIsClear() && rightIsBlocked())
        {
            turnLeft();
        } else if (rightIsBlocked())
        {
            
        }
    }
    
    public void solveMaze() 
    {
    }
    
    private boolean rightIsBlocked() {
         boolean result = true;
         turnRight();
         if (frontIsClear()) result = false;
         turnLeft();
         return result;
    }
    
    private void turnRight() {
        turnLeft(); turnLeft(); turnLeft();
    }
}
