package conwayPackage;

public class DeadorAlive
{
  public DeadorAlive(Cell pCell, Cell[][] pcellGrid)
  {  
    cell = pCell;
    cellGrid = pcellGrid;
  }  
  
  public boolean getStatus()
  { 
    //Top-left corner
    if ((cell.getX() == (MIN_COORD_X)) && (cell.getY() == (MIN_COORD_Y)))
    {
      miniGrid[0] = cellGrid[(MAX_COORD_X - INTERVAL)][(MAX_COORD_Y - INTERVAL)];
      
      miniGrid[1] = cellGrid[(cell.getX())][(MAX_COORD_Y - INTERVAL)];
     
      miniGrid[2] = cellGrid[(cell.getX() + INTERVAL)][(MAX_COORD_Y - INTERVAL)];
      
      miniGrid[3] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY())];
      
      miniGrid[4] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY())];
      
      miniGrid[5] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY() + INTERVAL)];
      
      miniGrid[6] = cellGrid[(cell.getX())][(cell.getY() + INTERVAL)];
     
      miniGrid[7] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() + INTERVAL)];
      
    }

    // Top-right corner
    else if (cell.getX() == (MAX_COORD_X - INTERVAL) && cell.getY() == (MIN_COORD_Y))
    {
      miniGrid[0] = cellGrid[(cell.getX() - INTERVAL)][(MAX_COORD_Y - INTERVAL)];
     
      miniGrid[1] = cellGrid[(cell.getX())][(MAX_COORD_Y - INTERVAL)];

      miniGrid[2] = cellGrid[MIN_COORD_X][(MAX_COORD_Y - INTERVAL)];
      
      miniGrid[3] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY())];
      
      miniGrid[4] = cellGrid[0][(cell.getY())];
      
      miniGrid[5] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() + INTERVAL)];
     
      miniGrid[6] = cellGrid[(cell.getX())][(cell.getY() + INTERVAL)];
      
      miniGrid[7] = cellGrid[0][(cell.getY() + INTERVAL)];
      
    }       
      
    //Bottom-right corner
    else if (cell.getX() == (MAX_COORD_X - INTERVAL) && cell.getY() == (MAX_COORD_Y - INTERVAL))
    {
      miniGrid[0] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() - INTERVAL)];
     
      miniGrid[1] = cellGrid[(cell.getX())][(cell.getY() - INTERVAL)];
      
      miniGrid[2] = cellGrid[0][(cell.getY() - INTERVAL)];
      
      miniGrid[3] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY())];
      
      miniGrid[4] = cellGrid[0][(cell.getY())];
      
      miniGrid[5] = cellGrid[(cell.getX() - INTERVAL)][0];
     
      miniGrid[6] = cellGrid[(cell.getX())][0];
      
      miniGrid[7] = cellGrid[MIN_COORD_X][MIN_COORD_Y];
    }

    //Bottom-left corner 
    else if (cell.getX() == (MIN_COORD_X) && cell.getY() == (MAX_COORD_Y - INTERVAL))
    { 
      miniGrid[0] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY() - INTERVAL)];
      
      miniGrid[1] = cellGrid[(cell.getX())][(cell.getY() - INTERVAL)];
     
      miniGrid[2] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() - INTERVAL)];
      
      miniGrid[3] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY())];
      
      miniGrid[4] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY())];
      
      miniGrid[5] = cellGrid[(MAX_COORD_X - INTERVAL)][MIN_COORD_Y];
      
      miniGrid[6] = cellGrid[(cell.getX())][0];
     
      miniGrid[7] = cellGrid[(cell.getX() + INTERVAL)][0];
      
    }
    
    
    // Left edge.
    else if (cell.getX() == MIN_COORD_X)
    {
      miniGrid[0] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY() - INTERVAL)];
      
      miniGrid[1] = cellGrid[(cell.getX())][(cell.getY() - INTERVAL)];
     
      miniGrid[2] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() - INTERVAL)];
      
      miniGrid[3] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY())];
      
      miniGrid[4] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY())];
      
      miniGrid[5] = cellGrid[(MAX_COORD_X - INTERVAL)][(cell.getY() + INTERVAL)];
      
      miniGrid[6] = cellGrid[(cell.getX())][(cell.getY() + INTERVAL)];
     
      miniGrid[7] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() + INTERVAL)];
                                     
    }   
        
    //Right edge.
    else if (cell.getX() == (MAX_COORD_X - INTERVAL))
    { 
      miniGrid[0] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() - INTERVAL)];
     
      miniGrid[1] = cellGrid[(cell.getX())][(cell.getY() - INTERVAL)];
      
      miniGrid[2] = cellGrid[0][(cell.getY() - INTERVAL)];
      
      miniGrid[3] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY())];
     
      miniGrid[4] = cellGrid[0][(cell.getY())];
      
      miniGrid[5] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() + INTERVAL)];
     
      miniGrid[6] = cellGrid[(cell.getX())][(cell.getY() + INTERVAL)];
     
      miniGrid[7] = cellGrid[0][(cell.getY() + INTERVAL)];
    }
    
    //Top edge
    else if (cell.getY() == MIN_COORD_Y)
    {
      miniGrid[0] = cellGrid[(cell.getX() - INTERVAL)][(MAX_COORD_Y - INTERVAL)];
     
      miniGrid[1] = cellGrid[(cell.getX())][(MAX_COORD_Y - INTERVAL)];
     
      miniGrid[2] = cellGrid[(cell.getX() + INTERVAL)][(MAX_COORD_Y - INTERVAL)];
      
      miniGrid[3] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY())];
     
      miniGrid[4] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY())];
     
      miniGrid[5] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() + INTERVAL)];
     
      miniGrid[6] = cellGrid[(cell.getX())][(cell.getY() + INTERVAL)];
     
      miniGrid[7] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() + INTERVAL)];

    } 
      
    //Bottom edge
    else if (cell.getY() == (MAX_COORD_Y - INTERVAL))
    { 
      miniGrid[0] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() - INTERVAL)];
     
      miniGrid[1] = cellGrid[(cell.getX())][(cell.getY() - INTERVAL)];
     
      miniGrid[2] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() - INTERVAL)];
     
      miniGrid[3] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY())];
     
      miniGrid[4] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY())];
     
      miniGrid[5] = cellGrid[(cell.getX() - INTERVAL)][0];
     
      miniGrid[6] = cellGrid[(cell.getX())][0];
     
      miniGrid[7] = cellGrid[(cell.getX() + INTERVAL)][0];
    }  
    
    else
    {
      miniGrid[0] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() - INTERVAL)];
     
      miniGrid[1] = cellGrid[(cell.getX())][(cell.getY() - INTERVAL)];
     
      miniGrid[2] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() - INTERVAL)];
     
      miniGrid[3] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY())];
     
      miniGrid[4] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY())];
     
      miniGrid[5] = cellGrid[(cell.getX() - INTERVAL)][(cell.getY() + INTERVAL)];
     
      miniGrid[6] = cellGrid[(cell.getX())][(cell.getY() + INTERVAL)];
     
      miniGrid[7] = cellGrid[(cell.getX() + INTERVAL)][(cell.getY() + INTERVAL)];
    }  
    
    for (int arrayNumber = 0; arrayNumber < 8; arrayNumber++)
    {
      boolean miniAlive = miniGrid[arrayNumber].getAlive();
        
      if (miniAlive)
      {
        neighbors++;
      }
      
    }
    
    
    boolean lifeStatus = cell.getAlive();
    
    if (lifeStatus == false && neighbors == 3)
    {
        returnTo = true;
    }  
    
    else if (lifeStatus == true && neighbors < 2)
    {
      returnTo = false;
      
    }  
    
    else if (lifeStatus == true && neighbors > 3)
    {
      returnTo = false;
    }  
    
    else if (lifeStatus == true)
    {
      returnTo = true;
    }     
       
    return returnTo;
  }
  
  private Cell cell;
  private Cell[][] cellGrid;
 
  private int neighbors;
  private Cell[] miniGrid = new Cell[8];
  
  public static final int MIN_COORD_X = 0;
  public static final int MIN_COORD_Y = 0;
  
  public static final int MAX_COORD_X = MIN_COORD_X + 100;
  public static final int MAX_COORD_Y = MIN_COORD_Y + 80;
  public static final int INTERVAL = 1;
  
  public boolean returnTo;
 
}  