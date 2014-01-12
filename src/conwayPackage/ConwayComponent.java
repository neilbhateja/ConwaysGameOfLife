package conwayPackage;

import java.awt.*;
import javax.swing.*;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class ConwayComponent extends JComponent
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paintComponent(Graphics g)
  { 
        
    Graphics2D g2 = (Graphics2D) g;        
      
    if (paintingFirstTime)
    {       
      for (int iXCoord = 0; iXCoord < 100; iXCoord++)
      {
        for (int jYCoord = 0; jYCoord < 80; jYCoord++)
        {
          cellArray[iXCoord][jYCoord] = new Cell(iXCoord, jYCoord);
        }
        
      }
     
    } 
      
    for (int iXCoord = 0; iXCoord < 100; iXCoord++)
    {
      for (int jYCoord = 0; jYCoord < 80; jYCoord++)
      {  
        cellArray[iXCoord][jYCoord].draw(g2);
      }   
    }
      
      paintingFirstTime = false;
      
    Color saveColor = g2.getColor();  
      
    g2.setColor(Color.RED);
    
    double xStart = DeadorAlive.MIN_COORD_X;
    double yStart = DeadorAlive.MIN_COORD_Y;
    double xEnd = DeadorAlive.MIN_COORD_X;
    double yEnd = DeadorAlive.MAX_COORD_Y;
    
    for (int vCount = 0; vCount <= 700; vCount += 7)
    {
      xStart = xEnd = vCount;

      Line2D.Double vert = new Line2D.Double(xStart, 0, xEnd, 560);
      g2.draw(vert);
    }
    
    
    
    xStart = 0.0;
    yStart = DeadorAlive.MIN_COORD_Y;
    xEnd = 100;
    yEnd =  DeadorAlive.MIN_COORD_Y;
      
    for (int hCount = 0; hCount <= 560; hCount += 7)
    {
      yStart = yEnd = hCount;
      
      Line2D.Double horiz = new Line2D.Double(0, yStart, 700, yEnd);
      g2.draw(horiz);
    }  
    
    g2.setColor(saveColor);
    
  }
    
  public void changeCellState(int x, int y)
  {
    (cellArray[x][y]).changeAlive();

  }
     
  public void nextRound()
  {
    for (int i = 0; i < 100; i++)
    {
      for (int j = 0; j < 80; j++)
      {
        DeadorAlive tester = new DeadorAlive(cellArray[i][j], cellArray);
        boolean life = tester.getStatus();
        cellArrayNext[i][j] = life;
        
      }
    }
    
    for (int i = 0; i < 100; i++)
    {
      for (int j = 0; j < 80; j++)
      {
        cellArray[i][j].setAlive((cellArrayNext[i][j]));
      }
      
    }
    
    repaint();
  }                                           
      
  public void ClearAll()
  {
    for (int iXCoord = 0; iXCoord < 100; iXCoord += 1)
      {
        for (int jYCoord = 0; jYCoord < 80; jYCoord += 1)
        {  
          cellArray[iXCoord][jYCoord].setAliveFalse();
        }
        
      }
   }  
  
   Cell[][] cellArray = new Cell[100][80];
   Boolean[][] cellArrayNext = new Boolean[100][80];
    
   boolean paintingFirstTime = true;
  
}