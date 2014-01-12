package conwayPackage;
import java.awt.*;

/**
 * A Cell has a location on a Cartesian grid, a color, a number of neighbors, and is either dead or alive.
 */

public class Cell
{

  /*
   * Creates a Cell that is dead, and has a location.
   * @param x the x-coordinate of the cell
   * @param y the y-coordinate of the cell
   */
  public Cell(int x, int y)
  {
    alive = false;
    
    xCoordinate = x;
    
    yCoordinate = y;
    
  }
  
  /*
   * Returns whether or not the cell is alive (true or false).
   */
  public boolean getAlive()
  {
    return alive;
  }
  
  /*
   * Makes a cell alive.
   */
  public void setAliveTrue()
  {
    alive = true;
  }

  /*
   * Kills cell.
   */
  public void setAliveFalse()
  {
    alive = false;
  }
  
  public void changeAlive()
  {
    if (alive == true)
    {
      alive = false;
    }
    else
    {
      alive = true;
    }
    
  }
  
  public void setAlive(boolean setTo)
  {
    alive = setTo;
  }
  
  
  /*
   * Returns the x-coordinate of the cell.
   */
  public int getX()
  {
    return xCoordinate;
  }
  
  /*
   * Returns the y-coordinate of the cell.
   */
  public int getY()
  {
    return yCoordinate;
  }
  
  /*
   * Draws the cell at the beginning of the game, without calculating the number of neighbors, etc.
   */
  public void draw(Graphics2D g2)
  {
        
    if (alive == true)
    {
      cellColor = Color.YELLOW;
    }  
    
    else
    {  
      cellColor = Color.GRAY;
    }
    
    g2.setColor(cellColor);
    
    Rectangle rect = new Rectangle((xCoordinate * 7), (yCoordinate * 7), 7, 7);
    
    g2.fill(rect);
  }
  
 
  /*
   * Draws the cell during the game, accounting for the rules of Conway's Game of Life.
   * @param cellGrid the array containing all the cells on the board
   */
  

  private boolean alive;
  private int xCoordinate;
  private int yCoordinate;
  private Color cellColor;
}