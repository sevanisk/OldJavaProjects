import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DriverSampleYard 
{
   public static void main(String[] args) throws Exception
   {
      JFrame frame = new JFrame("Sample Final Exam");
      frame.setSize(400,400);
      frame.setLocation(0,0);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelSampleYard());
      frame.setVisible(true);
   }
}