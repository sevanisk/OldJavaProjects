import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.awt.event.*;

public class DisplaySampleYard extends JPanel
{
   // PRIVATE FIELDS
   private Yard[] yards;
   private JLabel last, first, size, cost, running;
   private JTextField lastbox, firstbox, sizebox, costbox, runbox;
   
   // CONSTRUCTOR
   public DisplaySampleYard(Yard[] array)
   {
      setLayout(new GridLayout(5, 2));
      setFont(new Font("Serif", Font.BOLD, 40));
      
      last = new JLabel("Last Name:");
      add(last);
      lastbox = new JTextField("");
      lastbox.setHorizontalAlignment(SwingConstants.RIGHT);
      add(lastbox);
   
      first = new JLabel("First Name:");
      add(first);
      firstbox = new JTextField("");
      firstbox.setHorizontalAlignment(SwingConstants.RIGHT);
      add(firstbox);
   
      size = new JLabel("Size:");
      add(size);
      sizebox = new JTextField("");
      sizebox.setHorizontalAlignment(SwingConstants.RIGHT);
      add(sizebox);
      
      cost = new JLabel("Cost:");
      add(cost);
      costbox = new JTextField("");
      costbox.setHorizontalAlignment(SwingConstants.RIGHT);
      add(costbox);
   
      running = new JLabel("Running Total:");
      add(running);
      runbox = new JTextField("");
      runbox.setHorizontalAlignment(SwingConstants.RIGHT);
      add(runbox);
   }
   
   // INSTANCE METHODS
   public void quit()
   {
      System.exit(0);
   }
   
   private int count = 0;   // used in next to go through array
   private int tc = 0;  // total cost
   public void next(Yard[] array)
   {
      DecimalFormat d = new DecimalFormat("$0.00");
      
      yards = new Yard[array.length];
      for(int x = 0; x < array.length; x ++)
         yards[x] = array[x];
      
      if(count == yards.length)
         return;
      
      lastbox.setText(yards[count].getLastName() + "");
      firstbox.setText(yards[count].getFirstName() + "");
      sizebox.setText(yards[count].getSize() + "");
      costbox.setText(d.format(yards[count].getCost()));
      
      tc += yards[count].getCost();
      runbox.setText(d.format(tc));
      
      count++;
   }
}