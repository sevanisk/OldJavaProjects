import javax.swing.JFrame;

public class GroceryDriver
{
   public static void main(String[] arg)
   {
      JFrame f = new JFrame("Grocery List");
      f.setSize(600, 800);
      f.setLocation(400, 0);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setContentPane(new GroceryPanel());
      f.setVisible(true);
   }
}