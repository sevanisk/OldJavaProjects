
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.awt.*;

public class GroceryPanel extends JPanel
{
   private Graphics myBuffer;
   private BufferedImage myImage;
   private JPanel north, center, south, northEast, northWest;
   private JLabel gList;
   private JButton setR, addS, addI, findP;
   private GroceryList gL;
   
   public GroceryPanel()
   {
      gL = new GroceryList();
      setLayout(new BorderLayout());
   
      north = new JPanel();
      north.setBackground(Color.BLACK);
      north.setLayout(new BorderLayout());
   
   //myBuffer               
      myImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      
   //NORTH JPANEL
      northEast = new JPanel();
      northEast.setBackground(Color.BLACK);
      northEast.setLayout(new BorderLayout());
      setR = new JButton("Set Radius");
      setR.addActionListener(new Dist_Listener());
      northEast.add(setR, BorderLayout.NORTH);
      addI = new JButton("Add Item");
      addI.addActionListener(new Item_Listener());
      northEast.add(addI, BorderLayout.SOUTH);
      north.add(northEast, BorderLayout.EAST);
      
      northWest = new JPanel();
      northWest.setBackground(Color.BLACK);
      northWest.setLayout(new BorderLayout());
      addS = new JButton("Add Store");
      addS.addActionListener(new Store_Listener());
      northWest.add(addS, BorderLayout.NORTH);
      findP = new JButton("Find Prices");
      findP.addActionListener(new Price_Listener());
      northWest.add(findP, BorderLayout.SOUTH);
      north.add(northWest, BorderLayout.WEST);
      
      myBuffer.setColor(Color.WHITE);
      myBuffer.setFont(new Font("Serif", Font.BOLD, 60));
      gList = new JLabel("Grocery List");
      gList.setForeground(Color.WHITE);
      north.add(gList, BorderLayout.CENTER);
   
      add(north, BorderLayout.NORTH);
   
   }


   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   
   private class Dist_Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double dist = Double.parseDouble(JOptionPane.showInputDialog("Set Distance:"));
         gL.setDistance(dist);
      }
      
   }
      
   private class Item_Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String item = JOptionPane.showInputDialog("Add an Item:");
         gL.getItems().add(new GroceryItem (item));
      }
      
   }
   
   private class Store_Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String store = JOptionPane.showInputDialog("Add a Store:");
         gL.getStores().add(store);
      }
      
   }
   
   private class Price_Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
      
      }
      
   }
}

