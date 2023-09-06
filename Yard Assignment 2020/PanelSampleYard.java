import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelSampleYard extends JPanel
{
   // PRIVATE FIELDS
   private int y;
   private String x = " ";
   private CustomerSmallYard a;
   private CustomerMediumYard b;
   private CustomerLargeYard c;
   private DisplaySampleYard display;
   private JLabel title;
   private JButton next, quit;
   private Yard[] array;
   
   // CONSTRUCTOR
   public PanelSampleYard() throws Exception
   {
      setLayout(new BorderLayout());
      
      title = new JLabel("Green and Grow Mowing Company");
      title.setHorizontalAlignment(SwingConstants.CENTER);
      add(title, BorderLayout.NORTH);
      
      // display
      display = new DisplaySampleYard(array);
      add(display, BorderLayout.CENTER);
      
      // mini panel and components
      JPanel panel = new JPanel();
      panel.setLayout(new FlowLayout());
      add(panel, BorderLayout.SOUTH);
      
      next = new JButton("Next");
      next.addActionListener(new NextListener());
      panel.add(next);
   
      quit = new JButton("Quit");
      quit.addActionListener(new QuitListener());
      panel.add(quit);
      
      // input and sort of array
      Scanner infile = new Scanner(new File("greenGrow.txt"));
      
      int numitems = Integer.parseInt(infile.nextLine());
      array = new Yard[numitems];
      
      for(int k = 0; k < array.length; k++)
      {
         x = (infile.nextLine() + "-" + infile.nextLine() + ":" + infile.nextLine() + "");
         y = Integer.parseInt(x.substring(x.indexOf(":")+1));
         if(y <= 10000)
            array[k]= new CustomerSmallYard(x);
         else if (y <= 20000)
            array[k] = new CustomerMediumYard(x);
         else 
            array[k] = new CustomerLargeYard(x);
      }
      infile.close();
      
      for(int x = array.length-1; x >=0; x--)
         swap(array, findMaxPos(array, x), x);
   }
   
   // INSTANCE METHODS
   // Sorting Methods
   public int findMaxPos(Yard[] array, int x)
   {
      int maxPos = 0;
      for(int k = 1; k <= x; k++)
         if(array[k].compareTo(array[maxPos]) == 1)
            maxPos = k;
      return maxPos;
   }
   
   public void swap(Yard[] array, int a, int b)
   {
      Yard k = array[a];
      array[a] = array[b];
      array[b] = k;
   }
   
   // Button Listeners
   public class QuitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.quit();
      }
   }
   
   public class NextListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         display.next(array);
      }
   }
}