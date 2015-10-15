import kareltherobot.*;
/**
 * driver class MazeDrive - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class MazeDrive implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(1);
        World.readWorld("mazeSituations");
        World.setTrace(true);
        World.setVisible(true);
        // Sitation 1 should end at (7,2) facing West
        MazeWalker walk1 = new MazeWalker(7, 2, North, 0);
        walk1.followWallRight();
        System.out.println("*********** Should be at (7,2) facing West *********");
        // Sitation 2 should end at (3,2) facing North)
        MazeWalker walk2 = new MazeWalker(2, 2, North, 0);
        walk2.followWallRight();
        System.out.println("*********** Should be at (3,2) facing North *********");
        // Sitation 3 should end at (8,8) facing East)
        MazeWalker walk3 = new MazeWalker(7, 7, North, 0);
        // Sitation 4 should end at (2,8) facing South)
        MazeWalker walk4 = new MazeWalker(2, 7, North, 0);
        

    }
}
