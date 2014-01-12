package conwayPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


  

public class ConwayFrame
{
  
  public static void main(String[] args)
  {    
    // Initial loading of frame.
    JFrame frame = new JFrame();
    final int FRAME_WIDTH = 950;
    final int FRAME_HEIGHT = 675;
    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
    frame.setTitle("Conway's Game of Life");
    
                
    final ConwayComponent component = new ConwayComponent();
    
    component.setBounds(0, 0, 700, 560);
    
    
       // Listener for game area.  
       class MousePressListener implements MouseListener
       {       
         public void mousePressed(MouseEvent event)
         {
           int x = event.getX();
           int y = event.getY();
           if ((x <= 700) && (y <= 560))
           {
             double x1 = (x / 7);
             x = (int) x1;
           
             double y1 = (y / 7);
             y = (int) y1;
             
             
             component.changeCellState(x, y);
             component.repaint();
             
             
           }  
                           
         }
             
      public void mouseClicked(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
        
    }
    
    class TimerListener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        component.nextRound();             
      }  
        
    }   
       
    // Timer Listener
    ActionListener timelist = new TimerListener();
    
    final Timer time = new Timer(500, timelist);   
       
       
    class StartListener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        time.start();
      }  
        
    }
    
    class QuitListener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        System.exit(0);
      }
    }
    
    
    class ClearListener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        time.stop();
        component.ClearAll();
        component.repaint();
      }
    }
    
    class PauseListener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        //System.out.println("Pause button pushed!");
        if (paused == false)
        {
          time.stop();
          paused = true;
        }
        else if (paused == true)
        {
          time.start();
          paused = false;
        }
        
        
      }
      boolean paused = false;
    }
    
    class StepListener implements ActionListener
    {
      public void actionPerformed(ActionEvent event)
      {
        time.stop();
        component.nextRound();
      }
    }
    
    // Start Button
    JButton Start = new JButton("Start");
    
    // Pause Button
    JButton Pause = new JButton("Pause");
    
    // Clear Button
    JButton Clear = new JButton("Clear");
    
    // Step Button
    JButton Step = new JButton("Step");
    
    // Quit Button
    JButton Quit = new JButton("Quit");

    // ConwayComponent Listener
    MouseListener listener = new MousePressListener();
    component.addMouseListener(listener);

    
    // Clear Button Listener
    ActionListener clear = new ClearListener();
    Clear.addActionListener(clear);
    // Step Button Listener
    ActionListener step = new StepListener();
    Step.addActionListener(step);
    // Start Button Listener
    ActionListener start = new StartListener();
    Start.addActionListener(start);
    // Pause Button Listener
    ActionListener pause = new PauseListener();
    Pause.addActionListener(pause);
    // Quit Button Listener
    ActionListener quit = new QuitListener();
    Quit.addActionListener(quit);
 
    Dimension size = new Dimension();
    
    size = Step.getPreferredSize();
       Step.setBounds(775, 375, size.width, size.height);
    size = Start.getPreferredSize();
       Start.setBounds(775, 75, size.width, size.height);
    size = Pause.getPreferredSize();
       Pause.setBounds(775, 175, size.width, size.height);
    size = Clear.getPreferredSize();
       Clear.setBounds(775, 275, size.width, size.height);
    size = Quit.getPreferredSize();
       Quit.setBounds(775, 475, size.width, size.height);

    
    frame.add(Start);
    
    frame.add(Pause);
    
    frame.add(Clear);
    
    frame.add(Step);
    
    frame.add(Quit);
    
    frame.add(component);
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    
    frame.setVisible(true);
 
  }      

  
}  